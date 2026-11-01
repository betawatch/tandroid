package org.telegram.messenger;

import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.mw0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ns(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        TLRPC.Message message;
        boolean z10;
        switch (this.a) {
            case 0:
                try {
                    w0.b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.b);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                at.f(((qt) this.b).a).k(42, new Object[0]);
                return;
            case 2:
                ((CancellationSignal) this.b).cancel();
                return;
            case 3:
                cu cuVar = (cu) this.b;
                cuVar.a = true;
                int i10 = e20.s0;
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = uz.z1;
                    if (i11 >= arrayList.size()) {
                        if (z11) {
                            return;
                        }
                        cuVar.a = false;
                        cuVar.a();
                        return;
                    }
                    tz tzVar = (tz) arrayList.get(i11);
                    if (!tzVar.c && SystemClock.elapsedRealtime() - tzVar.e >= 120000) {
                        tzVar.c = true;
                        ConnectionsManager.getInstance(i10).checkProxy(tzVar.a, new s1(tzVar, 13));
                        z11 = true;
                    }
                    i11++;
                }
                break;
            case 4:
                fu fuVar = (fu) this.b;
                try {
                    uz.i = SystemClock.elapsedRealtime();
                    l9.h.f(w0.b);
                    vh.w3 w3Var = FirebaseMessaging.l;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(l9.h.c());
                    }
                    firebaseMessaging.getClass();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    firebaseMessaging.f.execute(new vh.r0(21, firebaseMessaging, taskCompletionSource));
                    taskCompletionSource.getTask().addOnCompleteListener(new e9(fuVar));
                    return;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    return;
                }
            case 5:
                mu muVar = (mu) this.b;
                wv wvVar = muVar.e;
                if (wvVar == null || !wvVar.H()) {
                    muVar.w.l0();
                    return;
                }
                return;
            case 6:
                View view = ((tu) this.b).V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                View view2 = ((uu) this.b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Cells.l1 l1Var = ((wv) this.b).F;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 9:
                vv vvVar = (vv) this.b;
                vvVar.J = null;
                if (vvVar.Q == null) {
                    if (vvVar.M == null) {
                        return;
                    }
                    vvVar.K = true;
                    View view3 = vvVar.S;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    vvVar.l(vvVar.M, true);
                    ji.a aVar = vvVar.I;
                    if (aVar != null) {
                        aVar.f(true);
                        return;
                    }
                    return;
                }
                vvVar.K = true;
                View view4 = vvVar.S;
                if (view4 != null) {
                    try {
                        view4.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                }
                uu uuVar = vvVar.Q;
                wv wvVar2 = vvVar.a;
                org.telegram.ui.Cells.q1 q1Var = wvVar2.E;
                org.telegram.ui.Cells.l1 l1Var2 = wvVar2.F;
                TL_iv.textButton textbutton = uuVar.b;
                if (q1Var == null || l1Var2 == null) {
                    return;
                }
                l1Var2.q1(q1Var, textbutton);
                return;
            case 10:
                pw pwVar = (pw) this.b;
                ArrayList arrayList2 = pwVar.f;
                if (arrayList2.isEmpty()) {
                    return;
                }
                pwVar.getMessagesController().K3(arrayList2, null, null, false, 0);
                arrayList2.clear();
                return;
            case 11:
                ((mw0) this.b).a(null);
                return;
            case 12:
                i0.g3((qx) this.b);
                return;
            case 13:
                rz rzVar = (rz) this.b;
                rzVar.getNotificationCenter().b(rzVar, at.U1);
                rzVar.getNotificationCenter().b(rzVar, at.W1);
                rzVar.getNotificationCenter().b(rzVar, at.V1);
                rzVar.getNotificationCenter().b(rzVar, at.a2);
                rzVar.getNotificationCenter().b(rzVar, at.b2);
                rzVar.getNotificationCenter().b(rzVar, at.c2);
                rzVar.getNotificationCenter().b(rzVar, at.S1);
                rzVar.getNotificationCenter().b(rzVar, at.R1);
                rzVar.getNotificationCenter().b(rzVar, at.Y1);
                rzVar.getNotificationCenter().b(rzVar, at.Z1);
                return;
            case 14:
                kj kjVar = (kj) this.b;
                if (kjVar == null || (message = kjVar.k) == null) {
                    return;
                }
                message.reqId = 0;
                return;
            case 15:
                j2.f fVar = (j2.f) this.b;
                nz nzVar = (nz) fVar.a;
                Location location = (Location) fVar.f;
                if (location != null) {
                    nzVar.F(location);
                } else {
                    nzVar.E();
                }
                fVar.j();
                return;
            case 16:
                i00 i00Var = (i00) this.b;
                android.support.v4.media.session.a0 a0Var = i00Var.b;
                int i12 = e20.s0;
                i00Var.c = i12;
                i00Var.d = i0.b1(wp.r1(i12).e7, "auto_lastSelectedDialog", 0L);
                i00Var.e = false;
                i00Var.f = false;
                i00Var.g.clear();
                i00Var.h.b();
                i00Var.i.b();
                i00Var.j.b();
                i00Var.k.b();
                i00Var.l.b();
                try {
                    a0Var.D(null);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 17:
                at.f(((h00) this.b).g.c).k(at.g2, 0);
                return;
            default:
                u10 u10Var = (u10) this.b;
                wp wpVar = u10Var.n;
                String string = wpVar.f7.getString("translating_dialog_languages2", null);
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
                                str3 = c3.i0.m(1, 0, str3);
                                z10 = true;
                            }
                            if ("null".equals(str2)) {
                                str2 = null;
                            }
                            if ("null".equals(str3)) {
                                str3 = null;
                            }
                            if (str2 != null) {
                                u10Var.e.put(Long.valueOf(parseLong), str2);
                                if (!u10Var.w(str2)) {
                                    u10Var.a.put(parseLong, Boolean.valueOf(!z10));
                                    u10Var.b.add(Long.valueOf(parseLong));
                                }
                                if (str3 != null) {
                                    u10Var.d.put(Long.valueOf(parseLong), str3);
                                }
                            }
                        }
                    }
                }
                Set<String> stringSet = wpVar.f7.getStringSet("hidden_translation_at", null);
                if (stringSet != null) {
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        try {
                            u10Var.h.add(Long.valueOf(Long.parseLong(it.next())));
                        } catch (Exception e7) {
                            f8.g(e7, true);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ns(rz rzVar, kj kjVar) {
        this.a = 14;
        this.b = kjVar;
    }
}
