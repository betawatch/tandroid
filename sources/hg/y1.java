package hg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import mh.ja;
import mh.z9;
import oh.g7;
import oh.r3;
import oh.t6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b7;
import org.telegram.ui.d60;
import org.telegram.ui.ii;
import org.telegram.ui.na1;
import org.telegram.ui.py;
import org.telegram.ui.wb0;
import org.telegram.ui.xn;
import org.telegram.ui.y3;
import qh.ba;
import qh.c8;
import qh.f8;
import qh.fa;
import qh.la;
import qh.m9;
import qh.r9;
import qh.w7;
import qh.w9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        g6 g6Var;
        int i10 = this.a;
        int i11 = 5;
        g6 g6Var2 = null;
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
                qc.a0((na1) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 4:
                ((oh.p) obj).s.e0(j10, false);
                break;
            case 5:
                ((oh.q2) obj).a.k0(j10 <= 0);
                break;
            case 6:
                AndroidUtilities.runOnUIThread((r3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 7:
                org.telegram.ui.ActionBar.p2 d02 = na1.d0(MessagesController.getInstance(((t6) obj).a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    ba baVar = ba.C2;
                    if (baVar != null && baVar.d) {
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
                y3 y3Var = (y3) obj;
                if (y3Var != null) {
                    y3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new xn(l.d.g(j10, "user_id")));
                    break;
                }
                break;
            case 15:
                ic Q = qc.a0((b7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.r = false;
                Q.j();
                break;
            case 16:
                tf tfVar = (tf) obj;
                tfVar.getClass();
                tfVar.presentFragment(xn.R9(j10));
                break;
            case 17:
                xf0 xf0Var = (xf0) obj;
                xf0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new sf0(xf0Var, 1), 100L);
                break;
            case 18:
                gh0 gh0Var = (gh0) obj;
                Activity activity = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().Q1() || (U2 != null && U2.hasShownSheet())) {
                    g6Var2 = new oh.b();
                } else if (U2 != null) {
                    g6Var2 = U2.getResourceProvider();
                }
                new z9(activity, g6Var2, this.b, 15, "", new dh0(gh0Var, 0), 0L).show();
                break;
            case 19:
                py pyVar = (py) obj;
                pyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                pyVar.z2.v(pyVar, arrayList, null, false, pyVar.G2, pyVar.H2, pyVar.I2, null);
                break;
            case 20:
                ((d60) obj).m1(j10, false);
                break;
            case 21:
                wb0 wb0Var = (wb0) obj;
                wb0Var.getClass();
                wb0Var.presentFragment(xn.R9(j10));
                break;
            case 22:
                xn xnVar = ((ii) obj).e;
                xnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == xnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 23:
                ((lh.a1) obj).run(Long.valueOf(j10));
                break;
            case 24:
                org.telegram.ui.web.c0 c0Var = (org.telegram.ui.web.c0) obj;
                c0Var.getClass();
                c0Var.presentFragment(xn.R9(j10));
                break;
            case 25:
                w7 w7Var = (w7) obj;
                Context context = w7Var.getContext();
                c8 c8Var = w7Var.T;
                org.telegram.ui.ActionBar.p2 p2Var = c8Var.attachedFragment;
                g6Var = ((h3) c8Var).resourcesProvider;
                z4.S(context, p2Var, g6Var, new f3.e(w7Var, j10, 11));
                break;
            case 26:
                ba baVar2 = (ba) obj;
                w9 w9Var = baVar2.C;
                if (w9Var != null) {
                    w9Var.f(true);
                    baVar2.C = null;
                }
                r9 r9Var = baVar2.x;
                w9 a2 = r9Var != null ? r9Var.a(j10) : null;
                baVar2.C = a2;
                if (a2 != null) {
                    baVar2.G = a2.a;
                    baVar2.r.c();
                    m9 m9Var = baVar2.e0;
                    int i14 = baVar2.G;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    m9Var.setBackgroundColor(i12);
                    baVar2.E.set(baVar2.C.c);
                    w9 w9Var2 = baVar2.C;
                    baVar2.D = w9Var2.b;
                    w9Var2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                baVar2.x = null;
                Activity activity2 = baVar2.b;
                if (!(activity2 instanceof LaunchActivity)) {
                    baVar2.q(true);
                    break;
                } else {
                    ((LaunchActivity) activity2).w0.post(new f8(baVar2, i11));
                    break;
                }
            case 27:
                fa faVar = ((la) obj).a;
                if (faVar != null) {
                    faVar.B(j10, false);
                    break;
                }
                break;
            case 28:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j10, r11.e, new th.r((th.i0) obj, 1));
                break;
            default:
                th.n0 n0Var = (th.n0) obj;
                n0Var.i = null;
                n0Var.g.l(j10);
                n0Var.l++;
                n0Var.a();
                th.m0 m0Var = n0Var.h;
                if (m0Var != null) {
                    m0Var.e();
                    break;
                }
                break;
        }
    }
}
