package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ci.wc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f60;
import org.telegram.ui.ji;
import org.telegram.ui.ra1;
import org.telegram.ui.ry;
import org.telegram.ui.xn;
import org.telegram.ui.zb0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10 = this.a;
        int i11 = 5;
        org.telegram.ui.ActionBar.d6 d6Var2 = null;
        r7 = 0;
        int i12 = 0;
        int i13 = 1;
        long j3 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ((b0) obj).s.e0(j3, false);
                break;
            case 1:
                ((b4) obj).a.k0(j3 <= 0);
                break;
            case 2:
                AndroidUtilities.runOnUIThread((m5) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 d02 = ra1.d0(MessagesController.getInstance(((l9) obj).a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    ci.lc lcVar = ci.lc.F2;
                    if (lcVar != null && lcVar.d) {
                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                        l2Var.a = true;
                        R.showAsSheet(d02, l2Var);
                        break;
                    } else {
                        R.presentFragment(d02);
                        break;
                    }
                }
                break;
            case 4:
                MessagesStorage messagesStorage = ((y9) obj).b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 5:
                ci.y9 y9Var = (ci.y9) obj;
                Context context = y9Var.getContext();
                ci.fa faVar = y9Var.W;
                org.telegram.ui.ActionBar.n2 n2Var = faVar.attachedFragment;
                d6Var = ((org.telegram.ui.ActionBar.f3) faVar).resourcesProvider;
                org.telegram.ui.Components.e5.S(context, n2Var, d6Var, new z1(y9Var, j3, i13));
                break;
            case 6:
                ci.lc lcVar2 = (ci.lc) obj;
                ci.gc gcVar = lcVar2.F;
                if (gcVar != null) {
                    gcVar.f(true);
                    lcVar2.F = null;
                }
                ci.cc ccVar = lcVar2.x;
                ci.gc a2 = ccVar != null ? ccVar.a(j3) : null;
                lcVar2.F = a2;
                if (a2 != null) {
                    lcVar2.J = a2.a;
                    lcVar2.r.c();
                    ci.xb xbVar = lcVar2.h0;
                    int i14 = lcVar2.J;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    xbVar.setBackgroundColor(i12);
                    lcVar2.H.set(lcVar2.F.c);
                    ci.gc gcVar2 = lcVar2.F;
                    lcVar2.G = gcVar2.b;
                    gcVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                lcVar2.x = null;
                Activity activity = lcVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    lcVar2.q(true);
                    break;
                } else {
                    ((LaunchActivity) activity).z0.post(new ci.ha(lcVar2, i11));
                    break;
                }
            case 7:
                ci.pc pcVar = ((wc) obj).a;
                if (pcVar != null) {
                    pcVar.o(j3, false);
                    break;
                }
                break;
            case 8:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j3, r11.e, new fi.t((fi.k0) obj, 1));
                break;
            case 9:
                fi.t0 t0Var = (fi.t0) obj;
                t0Var.i = null;
                t0Var.g.l(j3);
                t0Var.l++;
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.e();
                    break;
                }
                break;
            case 10:
                ii.r rVar = (ii.r) obj;
                org.telegram.ui.Components.e5.M(rVar.b.f0.getParentActivity(), j3, new a6.m(rVar, 26), rVar.a);
                break;
            case 11:
                ii.e2 e2Var = (ii.e2) obj;
                org.telegram.ui.Components.e5.M(e2Var.getParentActivity(), j3, new xa.c(e2Var, 27), e2Var.getResourceProvider());
                break;
            case 12:
                k2.j jVar = (k2.j) ((n4.y) obj).c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) jVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1010, new j2.c(p5, j3));
                break;
            case 13:
                ((LocationController) obj).lambda$removeSharingLocation$21(j3);
                break;
            case 14:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j3);
                break;
            case 15:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j3);
                break;
            case 16:
                ((VideoCapturerDevice) obj).lambda$init$3(j3);
                break;
            case 17:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j3);
                break;
            case 18:
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new xn(w.c.e(j3, "user_id")));
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.qc Q = xc.a0((org.telegram.ui.z6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.r = false;
                Q.j();
                break;
            case 20:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                cgVar.presentFragment(xn.R9(j3));
                break;
            case 21:
                qf0 qf0Var = (qf0) obj;
                qf0Var.h("seekTo(" + Math.round(j3 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new mf0(qf0Var, 1), 100L);
                break;
            case 22:
                zg0 zg0Var = (zg0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().Q1() || (U2 != null && U2.hasShownSheet())) {
                    d6Var2 = new d();
                } else if (U2 != null) {
                    d6Var2 = U2.getResourceProvider();
                }
                new yh.l7(activity2, d6Var2, this.b, 15, "", new wg0(zg0Var, 0), 0L).show();
                break;
            case 23:
                ry ryVar = (ry) obj;
                ryVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                ryVar.C2.u(ryVar, arrayList, null, false, ryVar.J2, ryVar.K2, ryVar.L2, null);
                break;
            case 24:
                ((f60) obj).m1(j3, false);
                break;
            case 25:
                zb0 zb0Var = (zb0) obj;
                zb0Var.getClass();
                zb0Var.presentFragment(xn.R9(j3));
                break;
            case 26:
                xn xnVar = ((ji) obj).e;
                xnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == xnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 27:
                ((org.telegram.ui.oc) obj).run(Long.valueOf(j3));
                break;
            case 28:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) obj;
                e0Var.getClass();
                e0Var.presentFragment(xn.R9(j3));
                break;
            default:
                tg.a1 a1Var = (tg.a1) obj;
                HashSet hashSet = a1Var.e0;
                hashSet.remove(Long.valueOf(j3));
                a1Var.Y.b(true, hashSet, new tg.u0(a1Var, 5), null);
                a1Var.b0(true, false);
                break;
        }
    }
}
