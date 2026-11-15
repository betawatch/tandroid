package org.telegram.messenger;

import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.jv0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ as(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        TLRPC.Message message;
        boolean z10;
        switch (this.a) {
            case 0:
                try {
                    t0.b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                ns.f(((bt) this.b).a).k(42, new Object[0]);
                return;
            case 2:
                nt ntVar = (nt) this.b;
                ntVar.a = true;
                int i7 = m10.t0;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = gz.z1;
                    if (i10 >= arrayList.size()) {
                        if (z11) {
                            return;
                        }
                        ntVar.a = false;
                        ntVar.a();
                        return;
                    }
                    fz fzVar = (fz) arrayList.get(i10);
                    if (!fzVar.c && SystemClock.elapsedRealtime() - fzVar.e >= 120000) {
                        fzVar.c = true;
                        ConnectionsManager.getInstance(i7).checkProxy(fzVar.a, new j1(fzVar, 14));
                        z11 = true;
                    }
                    i10++;
                }
                break;
            case 3:
                qt qtVar = (qt) this.b;
                try {
                    gz.i = SystemClock.elapsedRealtime();
                    o9.g.f(t0.b);
                    ob.c cVar = FirebaseMessaging.m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(o9.g.c());
                    }
                    if (firebaseMessaging.d.t()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.g.execute(new a1.e(6, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new fd(qtVar, 12));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                xt xtVar = (xt) this.b;
                iv ivVar = xtVar.e;
                if (ivVar == null || !ivVar.H()) {
                    xtVar.w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((eu) this.b).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((fu) this.b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l1 l1Var = ((iv) this.b).F;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 8:
                hv hvVar = (hv) this.b;
                hvVar.K = null;
                if (hvVar.R == null) {
                    if (hvVar.N == null) {
                        return;
                    }
                    hvVar.L = true;
                    View view3 = hvVar.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    hvVar.l(hvVar.N, true);
                    n2.o0 o0Var = hvVar.J;
                    if (o0Var != null) {
                        o0Var.f(true);
                        return;
                    }
                    return;
                }
                hvVar.L = true;
                View view4 = hvVar.T;
                if (view4 != null) {
                    try {
                        view4.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                }
                fu fuVar = hvVar.R;
                iv ivVar2 = hvVar.a;
                org.telegram.ui.Cells.q1 q1Var = ivVar2.E;
                org.telegram.ui.Cells.l1 l1Var2 = ivVar2.F;
                TL_iv.textButton textbutton = fuVar.b;
                if (q1Var == null || l1Var2 == null) {
                    return;
                }
                l1Var2.I1(q1Var, textbutton);
                return;
            case 9:
                bw bwVar = (bw) this.b;
                ArrayList arrayList2 = bwVar.f;
                if (arrayList2.isEmpty()) {
                    return;
                }
                bwVar.getMessagesController().N3(arrayList2, null, null, false, 0);
                arrayList2.clear();
                return;
            case 10:
                ((jv0) this.b).a(null);
                return;
            case 11:
                g0.h3((bx) this.b);
                return;
            case 12:
                ez ezVar = (ez) this.b;
                ezVar.getNotificationCenter().b(ezVar, ns.U1);
                ezVar.getNotificationCenter().b(ezVar, ns.W1);
                ezVar.getNotificationCenter().b(ezVar, ns.V1);
                ezVar.getNotificationCenter().b(ezVar, ns.a2);
                ezVar.getNotificationCenter().b(ezVar, ns.b2);
                ezVar.getNotificationCenter().b(ezVar, ns.c2);
                ezVar.getNotificationCenter().b(ezVar, ns.S1);
                ezVar.getNotificationCenter().b(ezVar, ns.R1);
                ezVar.getNotificationCenter().b(ezVar, ns.Y1);
                ezVar.getNotificationCenter().b(ezVar, ns.Z1);
                return;
            case 13:
                gj gjVar = (gj) this.b;
                if (gjVar == null || (message = gjVar.k) == null) {
                    return;
                }
                message.reqId = 0;
                return;
            case 14:
                a8.b8 b8Var = (a8.b8) this.b;
                az azVar = (az) b8Var.a;
                Location location = (Location) b8Var.f;
                if (location != null) {
                    azVar.f(location);
                } else {
                    azVar.c();
                }
                b8Var.d();
                return;
            case 15:
                uz uzVar = (uz) this.b;
                android.support.v4.media.session.a0 a0Var = uzVar.b;
                int i11 = m10.t0;
                uzVar.c = i11;
                uzVar.d = g0.b1(np.s1(i11).e7, "auto_lastSelectedDialog", 0L);
                uzVar.e = false;
                uzVar.f = false;
                uzVar.g.clear();
                uzVar.h.b();
                uzVar.i.b();
                uzVar.j.b();
                uzVar.k.b();
                uzVar.l.b();
                try {
                    a0Var.u(null);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                ns.f(((tz) this.b).g.c).k(ns.g2, 0);
                return;
            default:
                c10 c10Var = (c10) this.b;
                np npVar = c10Var.n;
                String string = npVar.f7.getString("translating_dialog_languages2", null);
                if (string == null) {
                    return;
                }
                for (String str : string.split(";")) {
                    String[] split = str.split("=");
                    if (split.length >= 2) {
                        long parseLong = Long.parseLong(split[0]);
                        String[] split2 = split[1].split(">");
                        if (split2.length == 2) {
                            String str2 = split2[0];
                            String str3 = split2[1];
                            if (str3.length() <= 0 || str3.charAt(str3.length() - 1) != '!') {
                                z10 = false;
                            } else {
                                str3 = com.google.android.gms.internal.vision.e2.k(str3, 1, 0);
                                z10 = true;
                            }
                            if ("null".equals(str2)) {
                                str2 = null;
                            }
                            if ("null".equals(str3)) {
                                str3 = null;
                            }
                            if (str2 != null) {
                                c10Var.e.put(Long.valueOf(parseLong), str2);
                                if (!c10Var.w(str2)) {
                                    c10Var.a.put(parseLong, Boolean.valueOf(!z10));
                                    c10Var.b.add(Long.valueOf(parseLong));
                                }
                                if (str3 != null) {
                                    c10Var.d.put(Long.valueOf(parseLong), str3);
                                }
                            }
                        }
                    }
                }
                Set<String> stringSet = npVar.f7.getStringSet("hidden_translation_at", null);
                if (stringSet != null) {
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        try {
                            c10Var.h.add(Long.valueOf(Long.parseLong(it.next())));
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ as(ez ezVar, gj gjVar) {
        this.a = 13;
        this.b = gjVar;
    }
}
