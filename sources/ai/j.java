package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ci.zc;
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
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.gc0;
import org.telegram.ui.i60;
import org.telegram.ui.mi;
import org.telegram.ui.of;
import org.telegram.ui.uy;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                ((b0) obj).s.e0(j3, false);
                break;
            case 1:
                ((b4) obj).a.k0(j3 <= 0);
                break;
            case 2:
                AndroidUtilities.runOnUIThread((n5) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(MessagesController.getInstance(((l9) obj).a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    ci.oc ocVar = ci.oc.F2;
                    if (ocVar != null && ocVar.d) {
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
                ci.ba baVar = (ci.ba) obj;
                Context context = baVar.getContext();
                ci.ia iaVar = baVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = iaVar.attachedFragment;
                f6Var = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
                org.telegram.ui.Components.d5.S(context, n2Var, f6Var, new z1(baVar, j3, i13));
                break;
            case 6:
                ci.oc ocVar2 = (ci.oc) obj;
                ci.jc jcVar = ocVar2.F;
                if (jcVar != null) {
                    jcVar.f(true);
                    ocVar2.F = null;
                }
                ci.fc fcVar = ocVar2.x;
                ci.jc a2 = fcVar != null ? fcVar.a(j3) : null;
                ocVar2.F = a2;
                if (a2 != null) {
                    ocVar2.J = a2.a;
                    ocVar2.r.c();
                    ci.ac acVar = ocVar2.h0;
                    int i14 = ocVar2.J;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    acVar.setBackgroundColor(i12);
                    ocVar2.H.set(ocVar2.F.c);
                    ci.jc jcVar2 = ocVar2.F;
                    ocVar2.G = jcVar2.b;
                    jcVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                ocVar2.x = null;
                Activity activity = ocVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    ocVar2.q(true);
                    break;
                } else {
                    ((LaunchActivity) activity).z0.post(new ci.ka(ocVar2, i11));
                    break;
                }
            case 7:
                ci.sc scVar = ((zc) obj).a;
                if (scVar != null) {
                    scVar.m(j3, false);
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
                org.telegram.ui.Components.d5.M(rVar.b.f0.getParentActivity(), j3, new pb.c(rVar, 27), rVar.a);
                break;
            case 11:
                ii.d2 d2Var = (ii.d2) obj;
                org.telegram.ui.Components.d5.M(d2Var.getParentActivity(), j3, new xa.c(d2Var, 26), d2Var.getResourceProvider());
                break;
            case 12:
                k2.k kVar = (k2.k) ((n4.y) obj).b;
                String str = e2.d0.a;
                j2.f fVar = ((i2.b0) kVar).a.s;
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
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj;
                if (u3Var != null) {
                    u3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new zn(v7.j0.e(j3, "user_id")));
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.pc Q = xc.a0((org.telegram.ui.z6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.r = false;
                Q.j();
                break;
            case 20:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                cgVar.presentFragment(zn.R9(j3));
                break;
            case 21:
                bg0 bg0Var = (bg0) obj;
                bg0Var.h("seekTo(" + Math.round(j3 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new xf0(bg0Var, 1), 100L);
                break;
            case 22:
                lh0 lh0Var = (lh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().Q1() || (U2 != null && U2.hasShownSheet())) {
                    f6Var2 = new d();
                } else if (U2 != null) {
                    f6Var2 = U2.getResourceProvider();
                }
                new yh.l7(activity2, f6Var2, this.b, 15, "", new ih0(lh0Var, 0), 0L).show();
                break;
            case 23:
                uy uyVar = (uy) obj;
                uyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                uyVar.C2.u(uyVar, arrayList, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                break;
            case 24:
                ((i60) obj).m1(j3, false);
                break;
            case 25:
                gc0 gc0Var = (gc0) obj;
                gc0Var.getClass();
                gc0Var.presentFragment(zn.R9(j3));
                break;
            case 26:
                zn znVar = ((mi) obj).e;
                znVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == znVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 27:
                ((of) obj).run(Long.valueOf(j3));
                break;
            case 28:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) obj;
                f0Var.getClass();
                f0Var.presentFragment(zn.R9(j3));
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
