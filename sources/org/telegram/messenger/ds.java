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
import org.telegram.ui.Components.hv0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ds implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ds(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        TLRPC.Message message;
        boolean z9;
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
                qs.f(((et) this.b).a).k(42, new Object[0]);
                return;
            case 2:
                qt qtVar = (qt) this.b;
                qtVar.a = true;
                int i7 = p10.s0;
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    ArrayList arrayList = iz.z1;
                    if (i10 >= arrayList.size()) {
                        if (z10) {
                            return;
                        }
                        qtVar.a = false;
                        qtVar.a();
                        return;
                    }
                    hz hzVar = (hz) arrayList.get(i10);
                    if (!hzVar.c && SystemClock.elapsedRealtime() - hzVar.e >= 120000) {
                        hzVar.c = true;
                        ConnectionsManager.getInstance(i7).checkProxy(hzVar.a, new j1(hzVar, 14));
                        z10 = true;
                    }
                    i10++;
                }
                break;
            case 3:
                tt ttVar = (tt) this.b;
                try {
                    iz.i = SystemClock.elapsedRealtime();
                    o9.g.f(t0.b);
                    ab.d0 d0Var = FirebaseMessaging.m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(o9.g.c());
                    }
                    if (firebaseMessaging.d.r()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.g.execute(new a1.e(6, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new ch(ttVar, 8));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                au auVar = (au) this.b;
                kv kvVar = auVar.e;
                if (kvVar == null || !kvVar.H()) {
                    auVar.w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((hu) this.b).V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((iu) this.b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l1 l1Var = ((kv) this.b).F;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 8:
                jv jvVar = (jv) this.b;
                jvVar.J = null;
                if (jvVar.Q == null) {
                    if (jvVar.M == null) {
                        return;
                    }
                    jvVar.K = true;
                    View view3 = jvVar.S;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    jvVar.l(jvVar.M, true);
                    n2.n0 n0Var = jvVar.I;
                    if (n0Var != null) {
                        n0Var.f(true);
                        return;
                    }
                    return;
                }
                jvVar.K = true;
                View view4 = jvVar.S;
                if (view4 != null) {
                    try {
                        view4.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                }
                iu iuVar = jvVar.Q;
                kv kvVar2 = jvVar.a;
                org.telegram.ui.Cells.q1 q1Var = kvVar2.E;
                org.telegram.ui.Cells.l1 l1Var2 = kvVar2.F;
                TL_iv.textButton textbutton = iuVar.b;
                if (q1Var == null || l1Var2 == null) {
                    return;
                }
                l1Var2.v1(q1Var, textbutton);
                return;
            case 9:
                dw dwVar = (dw) this.b;
                ArrayList arrayList2 = dwVar.f;
                if (arrayList2.isEmpty()) {
                    return;
                }
                dwVar.getMessagesController().N3(arrayList2, null, null, false, 0);
                arrayList2.clear();
                return;
            case 10:
                ((hv0) this.b).a(null);
                return;
            case 11:
                g0.h3((dx) this.b);
                return;
            case 12:
                gz gzVar = (gz) this.b;
                gzVar.getNotificationCenter().b(gzVar, qs.U1);
                gzVar.getNotificationCenter().b(gzVar, qs.W1);
                gzVar.getNotificationCenter().b(gzVar, qs.V1);
                gzVar.getNotificationCenter().b(gzVar, qs.a2);
                gzVar.getNotificationCenter().b(gzVar, qs.b2);
                gzVar.getNotificationCenter().b(gzVar, qs.c2);
                gzVar.getNotificationCenter().b(gzVar, qs.S1);
                gzVar.getNotificationCenter().b(gzVar, qs.R1);
                gzVar.getNotificationCenter().b(gzVar, qs.Y1);
                gzVar.getNotificationCenter().b(gzVar, qs.Z1);
                return;
            case 13:
                ij ijVar = (ij) this.b;
                if (ijVar == null || (message = ijVar.k) == null) {
                    return;
                }
                message.reqId = 0;
                return;
            case 14:
                a8.b8 b8Var = (a8.b8) this.b;
                cz czVar = (cz) b8Var.a;
                Location location = (Location) b8Var.f;
                if (location != null) {
                    czVar.K(location);
                } else {
                    czVar.C();
                }
                b8Var.d();
                return;
            case 15:
                wz wzVar = (wz) this.b;
                android.support.v4.media.session.a0 a0Var = wzVar.b;
                int i11 = p10.s0;
                wzVar.c = i11;
                wzVar.d = g0.b1(qp.s1(i11).d7, "auto_lastSelectedDialog", 0L);
                wzVar.e = false;
                wzVar.f = false;
                wzVar.g.clear();
                wzVar.h.b();
                wzVar.i.b();
                wzVar.j.b();
                wzVar.k.b();
                wzVar.l.b();
                try {
                    a0Var.v(null);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                qs.f(((vz) this.b).g.c).k(qs.g2, 0);
                return;
            default:
                f10 f10Var = (f10) this.b;
                qp qpVar = f10Var.n;
                String string = qpVar.e7.getString("translating_dialog_languages2", null);
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
                                z9 = false;
                            } else {
                                str3 = com.google.android.recaptcha.internal.a.k(str3, 1, 0);
                                z9 = true;
                            }
                            if ("null".equals(str2)) {
                                str2 = null;
                            }
                            if ("null".equals(str3)) {
                                str3 = null;
                            }
                            if (str2 != null) {
                                f10Var.e.put(Long.valueOf(parseLong), str2);
                                if (!f10Var.w(str2)) {
                                    f10Var.a.put(parseLong, Boolean.valueOf(!z9));
                                    f10Var.b.add(Long.valueOf(parseLong));
                                }
                                if (str3 != null) {
                                    f10Var.d.put(Long.valueOf(parseLong), str3);
                                }
                            }
                        }
                    }
                }
                Set<String> stringSet = qpVar.e7.getStringSet("hidden_translation_at", null);
                if (stringSet != null) {
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        try {
                            f10Var.h.add(Long.valueOf(Long.parseLong(it.next())));
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ds(gz gzVar, ij ijVar) {
        this.a = 13;
        this.b = ijVar;
    }
}
