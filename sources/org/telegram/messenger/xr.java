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
import org.telegram.ui.Components.rv0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class xr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xr(Object obj, int i7) {
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
                ks.f(((ys) this.b).a).k(42, new Object[0]);
                return;
            case 2:
                kt ktVar = (kt) this.b;
                ktVar.a = true;
                int i7 = j10.t0;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = bz.z1;
                    if (i10 >= arrayList.size()) {
                        if (z11) {
                            return;
                        }
                        ktVar.a = false;
                        ktVar.a();
                        return;
                    }
                    az azVar = (az) arrayList.get(i10);
                    if (!azVar.c && SystemClock.elapsedRealtime() - azVar.e >= 120000) {
                        azVar.c = true;
                        ConnectionsManager.getInstance(i7).checkProxy(azVar.a, new j1(azVar, 15));
                        z11 = true;
                    }
                    i10++;
                }
                break;
            case 3:
                nt ntVar = (nt) this.b;
                try {
                    bz.i = SystemClock.elapsedRealtime();
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
                    task.addOnCompleteListener(new ed(ntVar, 13));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                ut utVar = (ut) this.b;
                ev evVar = utVar.e;
                if (evVar == null || !evVar.H()) {
                    utVar.w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((bu) this.b).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((cu) this.b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l1 l1Var = ((ev) this.b).F;
                if (l1Var != null) {
                    l1Var.m();
                    return;
                }
                return;
            case 8:
                dv dvVar = (dv) this.b;
                dvVar.K = null;
                if (dvVar.R == null) {
                    if (dvVar.N == null) {
                        return;
                    }
                    dvVar.L = true;
                    View view3 = dvVar.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    dvVar.l(dvVar.N, true);
                    n2.o0 o0Var = dvVar.J;
                    if (o0Var != null) {
                        o0Var.f(true);
                        return;
                    }
                    return;
                }
                dvVar.L = true;
                View view4 = dvVar.T;
                if (view4 != null) {
                    try {
                        view4.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                }
                cu cuVar = dvVar.R;
                ev evVar2 = dvVar.a;
                org.telegram.ui.Cells.q1 q1Var = evVar2.E;
                org.telegram.ui.Cells.l1 l1Var2 = evVar2.F;
                TL_iv.textButton textbutton = cuVar.b;
                if (q1Var == null || l1Var2 == null) {
                    return;
                }
                l1Var2.I1(q1Var, textbutton);
                return;
            case 9:
                xv xvVar = (xv) this.b;
                ArrayList arrayList2 = xvVar.f;
                if (arrayList2.isEmpty()) {
                    return;
                }
                xvVar.getMessagesController().U3(arrayList2, null, null, false, 0);
                arrayList2.clear();
                return;
            case 10:
                ((rv0) this.b).a(null);
                return;
            case 11:
                g0.g3((ww) this.b);
                return;
            case 12:
                zy zyVar = (zy) this.b;
                zyVar.getNotificationCenter().b(zyVar, ks.U1);
                zyVar.getNotificationCenter().b(zyVar, ks.W1);
                zyVar.getNotificationCenter().b(zyVar, ks.V1);
                zyVar.getNotificationCenter().b(zyVar, ks.a2);
                zyVar.getNotificationCenter().b(zyVar, ks.b2);
                zyVar.getNotificationCenter().b(zyVar, ks.c2);
                zyVar.getNotificationCenter().b(zyVar, ks.S1);
                zyVar.getNotificationCenter().b(zyVar, ks.R1);
                zyVar.getNotificationCenter().b(zyVar, ks.Y1);
                zyVar.getNotificationCenter().b(zyVar, ks.Z1);
                return;
            case 13:
                fj fjVar = (fj) this.b;
                if (fjVar == null || (message = fjVar.k) == null) {
                    return;
                }
                message.reqId = 0;
                return;
            case 14:
                a8.b8 b8Var = (a8.b8) this.b;
                vy vyVar = (vy) b8Var.a;
                Location location = (Location) b8Var.f;
                if (location != null) {
                    vyVar.f(location);
                } else {
                    vyVar.b();
                }
                b8Var.d();
                return;
            case 15:
                qz qzVar = (qz) this.b;
                android.support.v4.media.session.a0 a0Var = qzVar.b;
                int i11 = j10.t0;
                qzVar.c = i11;
                qzVar.d = g0.b1(mp.u1(i11).g7, "auto_lastSelectedDialog", 0L);
                qzVar.e = false;
                qzVar.f = false;
                qzVar.g.clear();
                qzVar.h.b();
                qzVar.i.b();
                qzVar.j.b();
                qzVar.k.b();
                qzVar.l.b();
                try {
                    a0Var.v(null);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                ks.f(((pz) this.b).g.c).k(ks.g2, 0);
                return;
            default:
                z00 z00Var = (z00) this.b;
                mp mpVar = z00Var.n;
                String string = mpVar.h7.getString("translating_dialog_languages2", null);
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
                                z00Var.e.put(Long.valueOf(parseLong), str2);
                                if (!z00Var.w(str2)) {
                                    z00Var.a.put(parseLong, Boolean.valueOf(!z10));
                                    z00Var.b.add(Long.valueOf(parseLong));
                                }
                                if (str3 != null) {
                                    z00Var.d.put(Long.valueOf(parseLong), str3);
                                }
                            }
                        }
                    }
                }
                Set<String> stringSet = mpVar.h7.getStringSet("hidden_translation_at", null);
                if (stringSet != null) {
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        try {
                            z00Var.h.add(Long.valueOf(Long.parseLong(it.next())));
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ xr(zy zyVar, fj fjVar) {
        this.a = 13;
        this.b = fjVar;
    }
}
