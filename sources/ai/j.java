package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ci.vc;
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
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cc0;
import org.telegram.ui.h60;
import org.telegram.ui.ki;
import org.telegram.ui.ta1;
import org.telegram.ui.uy;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                org.telegram.ui.ActionBar.n2 b02 = ta1.b0(MessagesController.getInstance(((l9) obj).a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    ci.kc kcVar = ci.kc.F2;
                    if (kcVar != null && kcVar.d) {
                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                        l2Var.a = true;
                        R.showAsSheet(b02, l2Var);
                        break;
                    } else {
                        R.presentFragment(b02);
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
                ci.x9 x9Var = (ci.x9) obj;
                Context context = x9Var.getContext();
                ci.ea eaVar = x9Var.W;
                org.telegram.ui.ActionBar.n2 n2Var = eaVar.attachedFragment;
                d6Var = ((org.telegram.ui.ActionBar.f3) eaVar).resourcesProvider;
                org.telegram.ui.Components.e5.S(context, n2Var, d6Var, new z1(x9Var, j3, i13));
                break;
            case 6:
                ci.kc kcVar2 = (ci.kc) obj;
                ci.fc fcVar = kcVar2.F;
                if (fcVar != null) {
                    fcVar.f(true);
                    kcVar2.F = null;
                }
                ci.bc bcVar = kcVar2.x;
                ci.fc a2 = bcVar != null ? bcVar.a(j3) : null;
                kcVar2.F = a2;
                if (a2 != null) {
                    kcVar2.J = a2.a;
                    kcVar2.r.c();
                    ci.wb wbVar = kcVar2.h0;
                    int i14 = kcVar2.J;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    wbVar.setBackgroundColor(i12);
                    kcVar2.H.set(kcVar2.F.c);
                    ci.fc fcVar2 = kcVar2.F;
                    kcVar2.G = fcVar2.b;
                    fcVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                kcVar2.x = null;
                Activity activity = kcVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    kcVar2.q(true);
                    break;
                } else {
                    ((LaunchActivity) activity).z0.post(new ci.ga(kcVar2, i11));
                    break;
                }
            case 7:
                ci.oc ocVar = ((vc) obj).a;
                if (ocVar != null) {
                    ocVar.l(j3, false);
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
                    s0Var.l();
                    break;
                }
                break;
            case 10:
                ii.r rVar = (ii.r) obj;
                org.telegram.ui.Components.e5.M(rVar.b.f0.getParentActivity(), j3, new xa.c(rVar, 27), rVar.a);
                break;
            case 11:
                ii.e2 e2Var = (ii.e2) obj;
                org.telegram.ui.Components.e5.M(e2Var.getParentActivity(), j3, new a6.i(e2Var, 29), e2Var.getResourceProvider());
                break;
            case 12:
                k2.k kVar = (k2.k) ((n4.y) obj).c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) kVar).a.s;
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
                    U.presentFragment(new yn(sa.e.f(j3, "user_id")));
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.rc Q = yc.a0((org.telegram.ui.a7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.r = false;
                Q.j();
                break;
            case 20:
                eg egVar = (eg) obj;
                egVar.getClass();
                egVar.presentFragment(yn.Q9(j3));
                break;
            case 21:
                dg0 dg0Var = (dg0) obj;
                dg0Var.h("seekTo(" + Math.round(j3 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new yf0(dg0Var, 1), 100L);
                break;
            case 22:
                lh0 lh0Var = (lh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().R1() || (U2 != null && U2.hasShownSheet())) {
                    d6Var2 = new d();
                } else if (U2 != null) {
                    d6Var2 = U2.getResourceProvider();
                }
                new yh.n7(activity2, d6Var2, this.b, 15, "", new ih0(lh0Var, 0), 0L).show();
                break;
            case 23:
                uy uyVar = (uy) obj;
                uyVar.J4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                break;
            case 24:
                ((h60) obj).m1(j3, false);
                break;
            case 25:
                cc0 cc0Var = (cc0) obj;
                cc0Var.getClass();
                cc0Var.presentFragment(yn.Q9(j3));
                break;
            case 26:
                yn ynVar = ((ki) obj).e;
                ynVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == ynVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                ynVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 27:
                ((org.telegram.ui.qc) obj).run(Long.valueOf(j3));
                break;
            case 28:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) obj;
                f0Var.getClass();
                f0Var.presentFragment(yn.Q9(j3));
                break;
            default:
                tg.z0 z0Var = (tg.z0) obj;
                HashSet hashSet = z0Var.e0;
                hashSet.remove(Long.valueOf(j3));
                z0Var.Y.b(true, hashSet, new tg.t0(z0Var, 5), null);
                z0Var.b0(true, false);
                break;
        }
    }
}
