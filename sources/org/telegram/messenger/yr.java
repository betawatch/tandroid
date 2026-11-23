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
import org.telegram.ui.Components.uv0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class yr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yr(Object obj, int i7) {
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
                ls.f(((zs) this.b).a).k(42, new Object[0]);
                return;
            case 2:
                lt ltVar = (lt) this.b;
                ltVar.a = true;
                int i7 = k10.t0;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = cz.z1;
                    if (i10 >= arrayList.size()) {
                        if (z11) {
                            return;
                        }
                        ltVar.a = false;
                        ltVar.a();
                        return;
                    }
                    bz bzVar = (bz) arrayList.get(i10);
                    if (!bzVar.c && SystemClock.elapsedRealtime() - bzVar.e >= 120000) {
                        bzVar.c = true;
                        ConnectionsManager.getInstance(i7).checkProxy(bzVar.a, new j1(bzVar, 15));
                        z11 = true;
                    }
                    i10++;
                }
                break;
            case 3:
                ot otVar = (ot) this.b;
                try {
                    cz.i = SystemClock.elapsedRealtime();
                    o9.g.f(t0.b);
                    ob.c cVar = FirebaseMessaging.m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(o9.g.c());
                    }
                    if (firebaseMessaging.d.v()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.g.execute(new a1.e(6, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new fd(otVar, 13));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                vt vtVar = (vt) this.b;
                fv fvVar = vtVar.e;
                if (fvVar == null || !fvVar.H()) {
                    vtVar.w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((cu) this.b).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((du) this.b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.m1 m1Var = ((fv) this.b).F;
                if (m1Var != null) {
                    m1Var.m();
                    return;
                }
                return;
            case 8:
                ev evVar = (ev) this.b;
                evVar.K = null;
                if (evVar.R == null) {
                    if (evVar.N == null) {
                        return;
                    }
                    evVar.L = true;
                    View view3 = evVar.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    evVar.l(evVar.N, true);
                    n2.o0 o0Var = evVar.J;
                    if (o0Var != null) {
                        o0Var.f(true);
                        return;
                    }
                    return;
                }
                evVar.L = true;
                View view4 = evVar.T;
                if (view4 != null) {
                    try {
                        view4.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                }
                du duVar = evVar.R;
                fv fvVar2 = evVar.a;
                org.telegram.ui.Cells.r1 r1Var = fvVar2.E;
                org.telegram.ui.Cells.m1 m1Var2 = fvVar2.F;
                TL_iv.textButton textbutton = duVar.b;
                if (r1Var == null || m1Var2 == null) {
                    return;
                }
                m1Var2.I1(r1Var, textbutton);
                return;
            case 9:
                yv yvVar = (yv) this.b;
                ArrayList arrayList2 = yvVar.f;
                if (arrayList2.isEmpty()) {
                    return;
                }
                yvVar.getMessagesController().U3(arrayList2, null, null, false, 0);
                arrayList2.clear();
                return;
            case 10:
                ((uv0) this.b).a(null);
                return;
            case 11:
                g0.g3((xw) this.b);
                return;
            case 12:
                az azVar = (az) this.b;
                azVar.getNotificationCenter().b(azVar, ls.U1);
                azVar.getNotificationCenter().b(azVar, ls.W1);
                azVar.getNotificationCenter().b(azVar, ls.V1);
                azVar.getNotificationCenter().b(azVar, ls.a2);
                azVar.getNotificationCenter().b(azVar, ls.b2);
                azVar.getNotificationCenter().b(azVar, ls.c2);
                azVar.getNotificationCenter().b(azVar, ls.S1);
                azVar.getNotificationCenter().b(azVar, ls.R1);
                azVar.getNotificationCenter().b(azVar, ls.Y1);
                azVar.getNotificationCenter().b(azVar, ls.Z1);
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
                wy wyVar = (wy) b8Var.a;
                Location location = (Location) b8Var.f;
                if (location != null) {
                    wyVar.f(location);
                } else {
                    wyVar.b();
                }
                b8Var.d();
                return;
            case 15:
                rz rzVar = (rz) this.b;
                android.support.v4.media.session.a0 a0Var = rzVar.b;
                int i11 = k10.t0;
                rzVar.c = i11;
                rzVar.d = g0.b1(np.u1(i11).g7, "auto_lastSelectedDialog", 0L);
                rzVar.e = false;
                rzVar.f = false;
                rzVar.g.clear();
                rzVar.h.b();
                rzVar.i.b();
                rzVar.j.b();
                rzVar.k.b();
                rzVar.l.b();
                try {
                    a0Var.v(null);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                ls.f(((qz) this.b).g.c).k(ls.g2, 0);
                return;
            default:
                a10 a10Var = (a10) this.b;
                np npVar = a10Var.n;
                String string = npVar.h7.getString("translating_dialog_languages2", null);
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
                                a10Var.e.put(Long.valueOf(parseLong), str2);
                                if (!a10Var.w(str2)) {
                                    a10Var.a.put(parseLong, Boolean.valueOf(!z10));
                                    a10Var.b.add(Long.valueOf(parseLong));
                                }
                                if (str3 != null) {
                                    a10Var.d.put(Long.valueOf(parseLong), str3);
                                }
                            }
                        }
                    }
                }
                Set<String> stringSet = npVar.h7.getStringSet("hidden_translation_at", null);
                if (stringSet != null) {
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        try {
                            a10Var.h.add(Long.valueOf(Long.parseLong(it.next())));
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ yr(az azVar, gj gjVar) {
        this.a = 13;
        this.b = gjVar;
    }
}
