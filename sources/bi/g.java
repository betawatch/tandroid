package bi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import di.bc;
import di.gc;
import di.kc;
import di.pc;
import di.tc;
import di.zc;
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
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.co;
import org.telegram.ui.ec0;
import org.telegram.ui.j60;
import org.telegram.ui.mi;
import org.telegram.ui.nf;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10 = this.a;
        int i11 = 5;
        org.telegram.ui.ActionBar.f6 f6Var2 = null;
        r7 = 0;
        int i12 = 0;
        int i13 = 1;
        long j3 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ((v) obj).s.e0(j3, false);
                break;
            case 1:
                ((o3) obj).a.k0(j3 <= 0);
                break;
            case 2:
                AndroidUtilities.runOnUIThread((x4) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(MessagesController.getInstance(((u8) obj).a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    pc pcVar = pc.F2;
                    if (pcVar != null && pcVar.d) {
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
                MessagesStorage messagesStorage = ((h9) obj).b;
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
                di.ba baVar = (di.ba) obj;
                Context context = baVar.getContext();
                di.ia iaVar = baVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = iaVar.attachedFragment;
                f6Var = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
                org.telegram.ui.Components.e5.S(context, n2Var, f6Var, new p1(baVar, j3, i13));
                break;
            case 6:
                pc pcVar2 = (pc) obj;
                kc kcVar = pcVar2.F;
                if (kcVar != null) {
                    kcVar.f(true);
                    pcVar2.F = null;
                }
                gc gcVar = pcVar2.x;
                kc a2 = gcVar != null ? gcVar.a(j3) : null;
                pcVar2.F = a2;
                if (a2 != null) {
                    pcVar2.J = a2.a;
                    pcVar2.r.c();
                    bc bcVar = pcVar2.h0;
                    int i14 = pcVar2.J;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    bcVar.setBackgroundColor(i12);
                    pcVar2.H.set(pcVar2.F.c);
                    kc kcVar2 = pcVar2.F;
                    pcVar2.G = kcVar2.b;
                    kcVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                pcVar2.x = null;
                Activity activity = pcVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    pcVar2.q(true);
                    break;
                } else {
                    ((LaunchActivity) activity).z0.post(new di.ka(pcVar2, i11));
                    break;
                }
            case 7:
                tc tcVar = ((zc) obj).a;
                if (tcVar != null) {
                    tcVar.m(j3, false);
                    break;
                }
                break;
            case 8:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j3, r11.e, new gi.t((gi.k0) obj, 1));
                break;
            case 9:
                gi.t0 t0Var = (gi.t0) obj;
                t0Var.i = null;
                t0Var.g.l(j3);
                t0Var.l++;
                t0Var.a();
                gi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.l();
                    break;
                }
                break;
            case 10:
                ji.r rVar = (ji.r) obj;
                org.telegram.ui.Components.e5.M(rVar.b.f0.getParentActivity(), j3, new xa.c(rVar, 22), rVar.a);
                break;
            case 11:
                ji.c2 c2Var = (ji.c2) obj;
                org.telegram.ui.Components.e5.M(c2Var.getParentActivity(), j3, new a6.i(c2Var, 28), c2Var.getResourceProvider());
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
                    U.presentFragment(new co(w.f.e(j3, "user_id")));
                    break;
                }
                break;
            case 19:
                qc Q = yc.a0((org.telegram.ui.z6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.r = false;
                Q.j();
                break;
            case 20:
                dg dgVar = (dg) obj;
                dgVar.getClass();
                dgVar.presentFragment(co.R9(j3));
                break;
            case 21:
                qf0 qf0Var = (qf0) obj;
                qf0Var.h("seekTo(" + Math.round(j3 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new mf0(qf0Var, 1), 100L);
                break;
            case 22:
                yg0 yg0Var = (yg0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().Q1() || (U2 != null && U2.hasShownSheet())) {
                    f6Var2 = new b();
                } else if (U2 != null) {
                    f6Var2 = U2.getResourceProvider();
                }
                new zh.k7(activity2, f6Var2, this.b, 15, "", new vg0(yg0Var, 0), 0L).show();
                break;
            case 23:
                uy uyVar = (uy) obj;
                uyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                break;
            case 24:
                ((j60) obj).m1(j3, false);
                break;
            case 25:
                ec0 ec0Var = (ec0) obj;
                ec0Var.getClass();
                ec0Var.presentFragment(co.R9(j3));
                break;
            case 26:
                co coVar = ((mi) obj).e;
                coVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == coVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                coVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 27:
                ((nf) obj).run(Long.valueOf(j3));
                break;
            case 28:
                org.telegram.ui.web.g0 g0Var = (org.telegram.ui.web.g0) obj;
                g0Var.getClass();
                g0Var.presentFragment(co.R9(j3));
                break;
            default:
                ug.a1 a1Var = (ug.a1) obj;
                HashSet hashSet = a1Var.e0;
                hashSet.remove(Long.valueOf(j3));
                a1Var.Y.b(true, hashSet, new ug.u0(a1Var, 5), null);
                a1Var.b0(true, false);
                break;
        }
    }
}
