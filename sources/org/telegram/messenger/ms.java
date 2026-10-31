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
import org.telegram.ui.Components.lw0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ms implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ms(Object obj, int i10) {
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
                zs.f(((pt) this.b).a).k(42, new Object[0]);
                return;
            case 2:
                ((CancellationSignal) this.b).cancel();
                return;
            case 3:
                bu buVar = (bu) this.b;
                buVar.a = true;
                int i10 = d20.s0;
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = tz.z1;
                    if (i11 >= arrayList.size()) {
                        if (z11) {
                            return;
                        }
                        buVar.a = false;
                        buVar.a();
                        return;
                    }
                    sz szVar = (sz) arrayList.get(i11);
                    if (!szVar.c && SystemClock.elapsedRealtime() - szVar.e >= 120000) {
                        szVar.c = true;
                        ConnectionsManager.getInstance(i10).checkProxy(szVar.a, new s1(szVar, 13));
                        z11 = true;
                    }
                    i11++;
                }
                break;
            case 4:
                eu euVar = (eu) this.b;
                try {
                    tz.i = SystemClock.elapsedRealtime();
                    l9.h.f(w0.b);
                    vh.w3 w3Var = FirebaseMessaging.l;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(l9.h.c());
                    }
                    firebaseMessaging.getClass();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    firebaseMessaging.f.execute(new vh.d1(20, firebaseMessaging, taskCompletionSource));
                    taskCompletionSource.getTask().addOnCompleteListener(new e9(euVar));
                    return;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    return;
                }
            case 5:
                lu luVar = (lu) this.b;
                vv vvVar = luVar.e;
                if (vvVar == null || !vvVar.H()) {
                    luVar.w.l0();
                    return;
                }
                return;
            case 6:
                View view = ((su) this.b).V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                View view2 = ((tu) this.b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Cells.l1 l1Var = ((vv) this.b).F;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 9:
                uv uvVar = (uv) this.b;
                uvVar.J = null;
                if (uvVar.Q == null) {
                    if (uvVar.M == null) {
                        return;
                    }
                    uvVar.K = true;
                    View view3 = uvVar.S;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    uvVar.l(uvVar.M, true);
                    ji.a aVar = uvVar.I;
                    if (aVar != null) {
                        aVar.f(true);
                        return;
                    }
                    return;
                }
                uvVar.K = true;
                View view4 = uvVar.S;
                if (view4 != null) {
                    try {
                        view4.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                }
                tu tuVar = uvVar.Q;
                vv vvVar2 = uvVar.a;
                org.telegram.ui.Cells.q1 q1Var = vvVar2.E;
                org.telegram.ui.Cells.l1 l1Var2 = vvVar2.F;
                TL_iv.textButton textbutton = tuVar.b;
                if (q1Var == null || l1Var2 == null) {
                    return;
                }
                l1Var2.q1(q1Var, textbutton);
                return;
            case 10:
                ow owVar = (ow) this.b;
                ArrayList arrayList2 = owVar.f;
                if (arrayList2.isEmpty()) {
                    return;
                }
                owVar.getMessagesController().K3(arrayList2, null, null, false, 0);
                arrayList2.clear();
                return;
            case 11:
                ((lw0) this.b).a(null);
                return;
            case 12:
                i0.g3((px) this.b);
                return;
            case 13:
                qz qzVar = (qz) this.b;
                qzVar.getNotificationCenter().b(qzVar, zs.U1);
                qzVar.getNotificationCenter().b(qzVar, zs.W1);
                qzVar.getNotificationCenter().b(qzVar, zs.V1);
                qzVar.getNotificationCenter().b(qzVar, zs.a2);
                qzVar.getNotificationCenter().b(qzVar, zs.b2);
                qzVar.getNotificationCenter().b(qzVar, zs.c2);
                qzVar.getNotificationCenter().b(qzVar, zs.S1);
                qzVar.getNotificationCenter().b(qzVar, zs.R1);
                qzVar.getNotificationCenter().b(qzVar, zs.Y1);
                qzVar.getNotificationCenter().b(qzVar, zs.Z1);
                return;
            case 14:
                jj jjVar = (jj) this.b;
                if (jjVar == null || (message = jjVar.k) == null) {
                    return;
                }
                message.reqId = 0;
                return;
            case 15:
                j2.f fVar = (j2.f) this.b;
                mz mzVar = (mz) fVar.a;
                Location location = (Location) fVar.f;
                if (location != null) {
                    mzVar.F(location);
                } else {
                    mzVar.E();
                }
                fVar.j();
                return;
            case 16:
                h00 h00Var = (h00) this.b;
                android.support.v4.media.session.a0 a0Var = h00Var.b;
                int i12 = d20.s0;
                h00Var.c = i12;
                h00Var.d = i0.b1(vp.r1(i12).e7, "auto_lastSelectedDialog", 0L);
                h00Var.e = false;
                h00Var.f = false;
                h00Var.g.clear();
                h00Var.h.b();
                h00Var.i.b();
                h00Var.j.b();
                h00Var.k.b();
                h00Var.l.b();
                try {
                    a0Var.D(null);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 17:
                zs.f(((g00) this.b).g.c).k(zs.g2, 0);
                return;
            default:
                t10 t10Var = (t10) this.b;
                vp vpVar = t10Var.n;
                String string = vpVar.f7.getString("translating_dialog_languages2", null);
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
                                t10Var.e.put(Long.valueOf(parseLong), str2);
                                if (!t10Var.w(str2)) {
                                    t10Var.a.put(parseLong, Boolean.valueOf(!z10));
                                    t10Var.b.add(Long.valueOf(parseLong));
                                }
                                if (str3 != null) {
                                    t10Var.d.put(Long.valueOf(parseLong), str3);
                                }
                            }
                        }
                    }
                }
                Set<String> stringSet = vpVar.f7.getStringSet("hidden_translation_at", null);
                if (stringSet != null) {
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        try {
                            t10Var.h.add(Long.valueOf(Long.parseLong(it.next())));
                        } catch (Exception e7) {
                            f8.g(e7, true);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ms(qz qzVar, jj jjVar) {
        this.a = 14;
        this.b = jjVar;
    }
}
