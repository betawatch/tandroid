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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a4;
import org.telegram.ui.d7;
import org.telegram.ui.e60;
import org.telegram.ui.ki;
import org.telegram.ui.oa1;
import org.telegram.ui.qy;
import org.telegram.ui.xb0;
import org.telegram.ui.zn;
import ph.da;
import ph.e8;
import ph.g8;
import ph.ia;
import ph.oa;
import ph.p9;
import ph.u9;
import ph.y7;
import ph.y9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y1(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
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
                qc.a0((oa1) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
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
                org.telegram.ui.ActionBar.p2 d02 = oa1.d0(MessagesController.getInstance(((t6) obj).a).getChat(Long.valueOf(-j10)), true);
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
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                break;
            case 10:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j10);
                break;
            case 11:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                break;
            case 12:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                break;
            case 13:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                break;
            case 14:
                a4 a4Var = (a4) obj;
                if (a4Var != null) {
                    a4Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new zn(kf.k0.g(j10, "user_id")));
                    break;
                }
                break;
            case 15:
                ic Q = qc.a0((d7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.r = false;
                Q.j();
                break;
            case 16:
                tf tfVar = (tf) obj;
                tfVar.getClass();
                tfVar.presentFragment(zn.R9(j10));
                break;
            case 17:
                wf0 wf0Var = (wf0) obj;
                wf0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new rf0(wf0Var, 1), 100L);
                break;
            case 18:
                fh0 fh0Var = (fh0) obj;
                Activity activity = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().Q1() || (U2 != null && U2.hasShownSheet())) {
                    f6Var2 = new nh.b();
                } else if (U2 != null) {
                    f6Var2 = U2.getResourceProvider();
                }
                new z9(activity, f6Var2, this.b, 15, "", new ch0(fh0Var, 0), 0L).show();
                break;
            case 19:
                qy qyVar = (qy) obj;
                qyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                qyVar.z2.w(qyVar, arrayList, null, false, qyVar.G2, qyVar.H2, qyVar.I2, null);
                break;
            case 20:
                ((e60) obj).m1(j10, false);
                break;
            case 21:
                xb0 xb0Var = (xb0) obj;
                xb0Var.getClass();
                xb0Var.presentFragment(zn.R9(j10));
                break;
            case 22:
                zn znVar = ((ki) obj).e;
                znVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == znVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 23:
                ((kh.a1) obj).run(Long.valueOf(j10));
                break;
            case 24:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) obj;
                e0Var.getClass();
                e0Var.presentFragment(zn.R9(j10));
                break;
            case 25:
                y7 y7Var = (y7) obj;
                Context context = y7Var.getContext();
                e8 e8Var = y7Var.T;
                org.telegram.ui.ActionBar.p2 p2Var = e8Var.attachedFragment;
                f6Var = ((g3) e8Var).resourcesProvider;
                z4.S(context, p2Var, f6Var, new f3.e(y7Var, j10, 11));
                break;
            case 26:
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
                    ((LaunchActivity) activity2).w0.post(new g8(daVar2, i11));
                    break;
                }
            case 27:
                ia iaVar = ((oa) obj).a;
                if (iaVar != null) {
                    iaVar.C(j10, false);
                    break;
                }
                break;
            case 28:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j10, r11.e, new sh.r((sh.i0) obj, 1));
                break;
            default:
                sh.n0 n0Var = (sh.n0) obj;
                n0Var.i = null;
                n0Var.g.l(j10);
                n0Var.l++;
                n0Var.a();
                sh.m0 m0Var = n0Var.h;
                if (m0Var != null) {
                    m0Var.f();
                    break;
                }
                break;
        }
    }
}
