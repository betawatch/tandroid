package org.telegram.messenger;

import android.location.Location;
import android.os.CancellationSignal;
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
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.he0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vs(Object obj, int i3) {
        this.a = i3;
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
                hs.f(((ws) this.b).a).k(42, new Object[0]);
                return;
            case 1:
                ((CancellationSignal) this.b).cancel();
                return;
            case 2:
                ht htVar = (ht) this.b;
                htVar.a = true;
                int i3 = h10.t0;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = az.z1;
                    if (i10 >= arrayList.size()) {
                        if (z11) {
                            return;
                        }
                        htVar.a = false;
                        htVar.a();
                        return;
                    }
                    zy zyVar = (zy) arrayList.get(i10);
                    if (!zyVar.c && SystemClock.elapsedRealtime() - zyVar.e >= 120000) {
                        zyVar.c = true;
                        ConnectionsManager.getInstance(i3).checkProxy(zyVar.a, new p1(zyVar, 13));
                        z11 = true;
                    }
                    i10++;
                }
                break;
            case 3:
                lt ltVar = (lt) this.b;
                try {
                    az.i = SystemClock.elapsedRealtime();
                    n9.h.f(t0.b);
                    he0 he0Var = FirebaseMessaging.m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(n9.h.c());
                    }
                    int i11 = 5;
                    if (firebaseMessaging.d.s()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.g.execute(new xh.i(i11, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new go(ltVar, i11));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                st stVar = (st) this.b;
                cv cvVar = stVar.e;
                if (cvVar == null || !cvVar.H()) {
                    stVar.w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((zt) this.b).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((au) this.b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l1 l1Var = ((cv) this.b).F;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 8:
                bv bvVar = (bv) this.b;
                bvVar.K = null;
                if (bvVar.R == null) {
                    if (bvVar.N == null) {
                        return;
                    }
                    bvVar.L = true;
                    View view3 = bvVar.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    bvVar.l(bvVar.N, true);
                    m2.p0 p0Var = bvVar.J;
                    if (p0Var != null) {
                        p0Var.f(true);
                        return;
                    }
                    return;
                }
                bvVar.L = true;
                View view4 = bvVar.T;
                if (view4 != null) {
                    try {
                        view4.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                }
                au auVar = bvVar.R;
                cv cvVar2 = bvVar.a;
                org.telegram.ui.Cells.q1 q1Var = cvVar2.E;
                org.telegram.ui.Cells.l1 l1Var2 = cvVar2.F;
                TL_iv.textButton textbutton = auVar.b;
                if (q1Var == null || l1Var2 == null) {
                    return;
                }
                l1Var2.x1(q1Var, textbutton);
                return;
            case 9:
                vv vvVar = (vv) this.b;
                ArrayList arrayList2 = vvVar.f;
                if (arrayList2.isEmpty()) {
                    return;
                }
                vvVar.getMessagesController().N3(arrayList2, null, null, false, 0);
                arrayList2.clear();
                return;
            case 10:
                ((gv0) this.b).a(null);
                return;
            case 11:
                g0.h3((ww) this.b);
                return;
            case 12:
                yy yyVar = (yy) this.b;
                yyVar.getNotificationCenter().b(yyVar, hs.U1);
                yyVar.getNotificationCenter().b(yyVar, hs.W1);
                yyVar.getNotificationCenter().b(yyVar, hs.V1);
                yyVar.getNotificationCenter().b(yyVar, hs.a2);
                yyVar.getNotificationCenter().b(yyVar, hs.b2);
                yyVar.getNotificationCenter().b(yyVar, hs.c2);
                yyVar.getNotificationCenter().b(yyVar, hs.S1);
                yyVar.getNotificationCenter().b(yyVar, hs.R1);
                yyVar.getNotificationCenter().b(yyVar, hs.Y1);
                yyVar.getNotificationCenter().b(yyVar, hs.Z1);
                return;
            case 13:
                zi ziVar = (zi) this.b;
                if (ziVar == null || (message = ziVar.k) == null) {
                    return;
                }
                message.reqId = 0;
                return;
            case 14:
                l2.e eVar = (l2.e) this.b;
                uy uyVar = (uy) eVar.a;
                Location location = (Location) eVar.f;
                if (location != null) {
                    uyVar.B(location);
                } else {
                    uyVar.y();
                }
                eVar.d();
                return;
            case 15:
                oz ozVar = (oz) this.b;
                android.support.v4.media.session.a0 a0Var = ozVar.b;
                int i12 = h10.t0;
                ozVar.c = i12;
                ozVar.d = g0.b1(hp.s1(i12).d7, "auto_lastSelectedDialog", 0L);
                ozVar.e = false;
                ozVar.f = false;
                ozVar.g.clear();
                ozVar.h.b();
                ozVar.i.b();
                ozVar.j.b();
                ozVar.k.b();
                ozVar.l.b();
                try {
                    a0Var.u(null);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                hs.f(((nz) this.b).g.c).k(hs.g2, 0);
                return;
            default:
                x00 x00Var = (x00) this.b;
                hp hpVar = x00Var.n;
                String string = hpVar.e7.getString("translating_dialog_languages2", null);
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
                                str3 = com.google.android.recaptcha.internal.a.j(str3, 1, 0);
                                z10 = true;
                            }
                            if ("null".equals(str2)) {
                                str2 = null;
                            }
                            if ("null".equals(str3)) {
                                str3 = null;
                            }
                            if (str2 != null) {
                                x00Var.e.put(Long.valueOf(parseLong), str2);
                                if (!x00Var.w(str2)) {
                                    x00Var.a.put(parseLong, Boolean.valueOf(!z10));
                                    x00Var.b.add(Long.valueOf(parseLong));
                                }
                                if (str3 != null) {
                                    x00Var.d.put(Long.valueOf(parseLong), str3);
                                }
                            }
                        }
                    }
                }
                Set<String> stringSet = hpVar.e7.getStringSet("hidden_translation_at", null);
                if (stringSet != null) {
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        try {
                            x00Var.h.add(Long.valueOf(Long.parseLong(it.next())));
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ vs(yy yyVar, zi ziVar) {
        this.a = 13;
        this.b = ziVar;
    }
}
