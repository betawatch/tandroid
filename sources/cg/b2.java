package cg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import hh.ea;
import hh.oa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import jh.f7;
import jh.r3;
import jh.s6;
import lh.cc;
import lh.fb;
import lh.jb;
import lh.k9;
import lh.nb;
import lh.q9;
import lh.s9;
import lh.sb;
import lh.wb;
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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ci;
import org.telegram.ui.df;
import org.telegram.ui.gy;
import org.telegram.ui.nb0;
import org.telegram.ui.q91;
import org.telegram.ui.rn;
import org.telegram.ui.s50;
import org.telegram.ui.z3;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b2(long j10, oc[] ocVarArr) {
        this.a = 14;
        this.b = j10;
        this.c = ocVarArr;
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
                i2 i2Var = (i2) obj;
                HashSet hashSet = i2Var.a0;
                hashSet.remove(Long.valueOf(j10));
                i2Var.U.b(true, hashSet, new a2(i2Var, 5), null);
                i2Var.b0(true, false);
                break;
            case 1:
                mc.a0((oa) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 2:
                mc.a0((q91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 3:
                j3.o oVar = ((j3.n) obj).b;
                int i13 = d5.g0.a;
                i3.f fVar = ((h3.h0) oVar).a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1010, new i3.d(k10, j10));
                break;
            case 4:
                ((jh.p) obj).s.e0(j10, false);
                break;
            case 5:
                ((jh.p2) obj).a.k0(j10 <= 0);
                break;
            case 6:
                AndroidUtilities.runOnUIThread((r3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 7:
                org.telegram.ui.ActionBar.n2 d02 = q91.d0(MessagesController.getInstance(((s6) obj).a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    sb sbVar = sb.B2;
                    if (sbVar != null && sbVar.d) {
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
            case 8:
                MessagesStorage messagesStorage = ((f7) obj).b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    break;
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
            case 9:
                k9 k9Var = (k9) obj;
                Context context = k9Var.getContext();
                q9 q9Var = k9Var.S;
                org.telegram.ui.ActionBar.n2 n2Var = q9Var.attachedFragment;
                c6Var = ((e3) q9Var).resourcesProvider;
                y4.S(context, n2Var, c6Var, new d3.e(k9Var, j10, 2));
                break;
            case 10:
                sb sbVar2 = (sb) obj;
                nb nbVar = sbVar2.B;
                if (nbVar != null) {
                    nbVar.f(true);
                    sbVar2.B = null;
                }
                jb jbVar = sbVar2.x;
                nb a2 = jbVar != null ? jbVar.a(j10) : null;
                sbVar2.B = a2;
                if (a2 != null) {
                    sbVar2.F = a2.a;
                    sbVar2.r.c();
                    fb fbVar = sbVar2.d0;
                    int i14 = sbVar2.F;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    fbVar.setBackgroundColor(i12);
                    sbVar2.D.set(sbVar2.B.c);
                    nb nbVar2 = sbVar2.B;
                    sbVar2.C = nbVar2.b;
                    nbVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                sbVar2.x = null;
                Activity activity = sbVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    sbVar2.q(true);
                    break;
                } else {
                    ((LaunchActivity) activity).v0.post(new s9(sbVar2, i11));
                    break;
                }
            case 11:
                wb wbVar = ((cc) obj).a;
                if (wbVar != null) {
                    wbVar.P(j10, false);
                    break;
                }
                break;
            case 12:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j10, r11.e, new oh.s((oh.j0) obj, 1));
                break;
            case 13:
                oh.q0 q0Var = (oh.q0) obj;
                q0Var.i = null;
                q0Var.g.l(j10);
                q0Var.l++;
                q0Var.a();
                oh.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.i();
                    break;
                }
                break;
            case 14:
                AndroidUtilities.lambda$showProxyAlert$17(j10, (oc[]) obj);
                break;
            case 15:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                break;
            case 16:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j10);
                break;
            case 17:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                break;
            case 18:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                break;
            case 19:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                break;
            case 20:
                z3 z3Var = (z3) obj;
                if (z3Var != null) {
                    z3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new rn(com.google.android.recaptcha.internal.a.h(j10, "user_id")));
                    break;
                }
                break;
            case 21:
                ec Q = mc.a0((z6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.r = false;
                Q.j();
                break;
            case 22:
                pf pfVar = (pf) obj;
                pfVar.getClass();
                pfVar.presentFragment(rn.R9(j10));
                break;
            case 23:
                df0 df0Var = (df0) obj;
                df0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new ye0(df0Var, 1), 100L);
                break;
            case 24:
                mg0 mg0Var = (mg0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().Q1() || (U2 != null && U2.hasShownSheet())) {
                    c6Var2 = new jh.b();
                } else if (U2 != null) {
                    c6Var2 = U2.getResourceProvider();
                }
                new ea(activity2, c6Var2, this.b, 15, "", new ig0(mg0Var, 0), 0L).show();
                break;
            case 25:
                gy gyVar = (gy) obj;
                gyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                gyVar.y2.w(gyVar, arrayList, null, false, gyVar.F2, gyVar.G2, gyVar.H2, null);
                break;
            case 26:
                ((s50) obj).m1(j10, false);
                break;
            case 27:
                nb0 nb0Var = (nb0) obj;
                nb0Var.getClass();
                nb0Var.presentFragment(rn.R9(j10));
                break;
            case 28:
                rn rnVar = ((ci) obj).e;
                rnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == rnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                rnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                ((df) obj).run(Long.valueOf(j10));
                break;
        }
    }

    public /* synthetic */ b2(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }
}
