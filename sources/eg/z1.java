package eg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import jh.d3;
import jh.ia;
import jh.y9;
import lh.f7;
import lh.p3;
import lh.s6;
import nh.bb;
import nh.e9;
import nh.g9;
import nh.gb;
import nh.kb;
import nh.qb;
import nh.ta;
import nh.xa;
import nh.y8;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.di;
import org.telegram.ui.fy;
import org.telegram.ui.lb0;
import org.telegram.ui.r50;
import org.telegram.ui.t91;
import org.telegram.ui.tm;
import org.telegram.ui.tn;
import org.telegram.ui.x6;
import org.telegram.ui.z3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(long j10, vc[] vcVarArr) {
        this.a = 12;
        this.b = j10;
        this.c = vcVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c6 c6Var;
        int i10 = this.a;
        int i11 = 5;
        c6 c6Var2 = null;
        r7 = 0;
        int i12 = 0;
        long j10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                g2 g2Var = (g2) obj;
                HashSet hashSet = g2Var.a0;
                hashSet.remove(Long.valueOf(j10));
                g2Var.U.b(true, hashSet, new y1(g2Var, 5), null);
                g2Var.b0(true, false);
                break;
            case 1:
                tc.a0((ia) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 2:
                tc.a0((t91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 3:
                l3.o oVar = ((l3.n) obj).b;
                int i13 = f5.d0.a;
                k3.f fVar = ((j3.h0) oVar).a.r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1010, new d3(k9, j10));
                break;
            case 4:
                ((lh.p) obj).s.e0(j10, false);
                break;
            case 5:
                ((lh.o2) obj).a.k0(j10 <= 0);
                break;
            case 6:
                AndroidUtilities.runOnUIThread((p3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 7:
                org.telegram.ui.ActionBar.o2 d02 = t91.d0(MessagesController.getInstance(((s6) obj).a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    gb gbVar = gb.B2;
                    if (gbVar != null && gbVar.d) {
                        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                        m2Var.a = true;
                        R.showAsSheet(d02, m2Var);
                        break;
                    } else {
                        R.presentFragment(d02);
                        break;
                    }
                }
                break;
            case 8:
                MessagesStorage messagesStorage = ((f7) obj).b;
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
                y8 y8Var = (y8) obj;
                Context context = y8Var.getContext();
                e9 e9Var = y8Var.S;
                org.telegram.ui.ActionBar.o2 o2Var = e9Var.attachedFragment;
                c6Var = ((f3) e9Var).resourcesProvider;
                c5.S(context, o2Var, c6Var, new f3.e(y8Var, j10, 2));
                break;
            case 10:
                gb gbVar2 = (gb) obj;
                bb bbVar = gbVar2.B;
                if (bbVar != null) {
                    bbVar.f(true);
                    gbVar2.B = null;
                }
                xa xaVar = gbVar2.x;
                bb a2 = xaVar != null ? xaVar.a(j10) : null;
                gbVar2.B = a2;
                if (a2 != null) {
                    gbVar2.F = a2.a;
                    gbVar2.r.c();
                    ta taVar = gbVar2.d0;
                    int i14 = gbVar2.F;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    taVar.setBackgroundColor(i12);
                    gbVar2.D.set(gbVar2.B.c);
                    bb bbVar2 = gbVar2.B;
                    gbVar2.C = bbVar2.b;
                    bbVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                gbVar2.x = null;
                Activity activity = gbVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    gbVar2.q(true);
                    break;
                } else {
                    ((LaunchActivity) activity).v0.post(new g9(gbVar2, i11));
                    break;
                }
            case 11:
                kb kbVar = ((qb) obj).a;
                if (kbVar != null) {
                    kbVar.I(j10, false);
                    break;
                }
                break;
            case 12:
                AndroidUtilities.lambda$showProxyAlert$17(j10, (vc[]) obj);
                break;
            case 13:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                break;
            case 14:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j10);
                break;
            case 15:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                break;
            case 16:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                break;
            case 17:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                break;
            case 18:
                z3 z3Var = (z3) obj;
                if (z3Var != null) {
                    z3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new tn(j7.l1.g(j10, "user_id")));
                    break;
                }
                break;
            case 19:
                mc Q = tc.a0((x6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.r = false;
                Q.j();
                break;
            case 20:
                wf wfVar = (wf) obj;
                wfVar.getClass();
                wfVar.presentFragment(tn.R9(j10));
                break;
            case 21:
                mf0 mf0Var = (mf0) obj;
                mf0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new hf0(mf0Var, 1), 100L);
                break;
            case 22:
                ug0 ug0Var = (ug0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().Q1() || (U2 != null && U2.hasShownSheet())) {
                    c6Var2 = new lh.b();
                } else if (U2 != null) {
                    c6Var2 = U2.getResourceProvider();
                }
                new y9(activity2, c6Var2, this.b, 15, "", new rg0(ug0Var, 0), 0L).show();
                break;
            case 23:
                fy fyVar = (fy) obj;
                fyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                fyVar.y2.v(fyVar, arrayList, null, false, fyVar.F2, fyVar.G2, fyVar.H2, null);
                break;
            case 24:
                ((r50) obj).m1(j10, false);
                break;
            case 25:
                lb0 lb0Var = (lb0) obj;
                lb0Var.getClass();
                lb0Var.presentFragment(tn.R9(j10));
                break;
            case 26:
                tn tnVar = ((di) obj).e;
                tnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == tnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                tnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 27:
                ((tm) obj).run(Long.valueOf(j10));
                break;
            case 28:
                org.telegram.ui.web.d0 d0Var = (org.telegram.ui.web.d0) obj;
                d0Var.getClass();
                d0Var.presentFragment(tn.R9(j10));
                break;
            default:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j10, r11.e, new qh.r((qh.i0) obj, 1));
                break;
        }
    }

    public /* synthetic */ z1(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }
}
