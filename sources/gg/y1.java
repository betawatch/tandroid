package gg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import lh.ja;
import lh.z9;
import nh.g7;
import nh.q3;
import nh.t6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b7;
import org.telegram.ui.c60;
import org.telegram.ui.ga1;
import org.telegram.ui.ii;
import org.telegram.ui.oy;
import org.telegram.ui.vb0;
import org.telegram.ui.xn;
import org.telegram.ui.y3;
import ph.da;
import ph.f8;
import ph.h8;
import ph.ia;
import ph.oa;
import ph.p9;
import ph.u9;
import ph.y9;
import ph.z7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y1(long j10, sc[] scVarArr) {
        this.a = 9;
        this.b = j10;
        this.c = scVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f6 f6Var;
        int i10 = this.a;
        int i11 = 5;
        f6 f6Var2 = null;
        r7 = 0;
        int i12 = 0;
        long j10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                f2 f2Var = (f2) obj;
                HashSet hashSet = f2Var.b0;
                hashSet.remove(Long.valueOf(j10));
                f2Var.V.b(true, hashSet, new x1(f2Var, 5), null);
                f2Var.b0(true, false);
                break;
            case 1:
                l3.q qVar = (l3.q) ((f7.b) obj).c;
                int i13 = h5.d0.a;
                k3.f fVar = ((j3.c0) qVar).a.q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1010, new k3.c(p10, j10));
                break;
            case 2:
                qc.a0((ja) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 3:
                qc.a0((ga1) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 4:
                ((nh.q) obj).s.e0(j10, false);
                break;
            case 5:
                ((nh.p2) obj).a.k0(j10 <= 0);
                break;
            case 6:
                AndroidUtilities.runOnUIThread((q3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 7:
                org.telegram.ui.ActionBar.p2 d02 = ga1.d0(MessagesController.getInstance(((t6) obj).a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    da daVar = da.C2;
                    if (daVar != null && daVar.d) {
                        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                        n2Var.a = true;
                        R.showAsSheet(d02, n2Var);
                        break;
                    } else {
                        R.presentFragment(d02);
                        break;
                    }
                }
                break;
            case 8:
                MessagesStorage messagesStorage = ((g7) obj).b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 9:
                AndroidUtilities.lambda$showProxyAlert$17(j10, (sc[]) obj);
                break;
            case 10:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                break;
            case 11:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j10);
                break;
            case 12:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                break;
            case 13:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                break;
            case 14:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                break;
            case 15:
                y3 y3Var = (y3) obj;
                if (y3Var != null) {
                    y3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new xn(kh.a2.g(j10, "user_id")));
                    break;
                }
                break;
            case 16:
                ic Q = qc.a0((b7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.r = false;
                Q.j();
                break;
            case 17:
                tf tfVar = (tf) obj;
                tfVar.getClass();
                tfVar.presentFragment(xn.R9(j10));
                break;
            case 18:
                vf0 vf0Var = (vf0) obj;
                vf0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new qf0(vf0Var, 1), 100L);
                break;
            case 19:
                eh0 eh0Var = (eh0) obj;
                Activity activity = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().Q1() || (U2 != null && U2.hasShownSheet())) {
                    f6Var2 = new nh.b();
                } else if (U2 != null) {
                    f6Var2 = U2.getResourceProvider();
                }
                new z9(activity, f6Var2, this.b, 15, "", new bh0(eh0Var, 0), 0L).show();
                break;
            case 20:
                oy oyVar = (oy) obj;
                oyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                oyVar.z2.w(oyVar, arrayList, null, false, oyVar.G2, oyVar.H2, oyVar.I2, null);
                break;
            case 21:
                ((c60) obj).m1(j10, false);
                break;
            case 22:
                vb0 vb0Var = (vb0) obj;
                vb0Var.getClass();
                vb0Var.presentFragment(xn.R9(j10));
                break;
            case 23:
                xn xnVar = ((ii) obj).e;
                xnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == xnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 24:
                ((kh.a1) obj).run(Long.valueOf(j10));
                break;
            case 25:
                org.telegram.ui.web.c0 c0Var = (org.telegram.ui.web.c0) obj;
                c0Var.getClass();
                c0Var.presentFragment(xn.R9(j10));
                break;
            case 26:
                z7 z7Var = (z7) obj;
                Context context = z7Var.getContext();
                f8 f8Var = z7Var.T;
                org.telegram.ui.ActionBar.p2 p2Var = f8Var.attachedFragment;
                f6Var = ((g3) f8Var).resourcesProvider;
                z4.S(context, p2Var, f6Var, new f3.e(z7Var, j10, 11));
                break;
            case 27:
                da daVar2 = (da) obj;
                y9 y9Var = daVar2.C;
                if (y9Var != null) {
                    y9Var.f(true);
                    daVar2.C = null;
                }
                u9 u9Var = daVar2.x;
                y9 a2 = u9Var != null ? u9Var.a(j10) : null;
                daVar2.C = a2;
                if (a2 != null) {
                    daVar2.G = a2.a;
                    daVar2.r.c();
                    p9 p9Var = daVar2.e0;
                    int i14 = daVar2.G;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    p9Var.setBackgroundColor(i12);
                    daVar2.E.set(daVar2.C.c);
                    y9 y9Var2 = daVar2.C;
                    daVar2.D = y9Var2.b;
                    y9Var2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                daVar2.x = null;
                Activity activity2 = daVar2.b;
                if (!(activity2 instanceof LaunchActivity)) {
                    daVar2.q(true);
                    break;
                } else {
                    ((LaunchActivity) activity2).w0.post(new h8(daVar2, i11));
                    break;
                }
            case 28:
                ia iaVar = ((oa) obj).a;
                if (iaVar != null) {
                    iaVar.C(j10, false);
                    break;
                }
                break;
            default:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j10, r11.e, new sh.r((sh.i0) obj, 1));
                break;
        }
    }

    public /* synthetic */ y1(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }
}
