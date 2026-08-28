package bg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import gh.ea;
import gh.oa;
import ih.i7;
import ih.u3;
import ih.v6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import kh.ac;
import kh.gc;
import kh.ib;
import kh.n9;
import kh.nb;
import kh.rb;
import kh.t9;
import kh.v9;
import kh.wb;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai;
import org.telegram.ui.df;
import org.telegram.ui.dy;
import org.telegram.ui.jb0;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
import org.telegram.ui.y3;
import org.telegram.ui.y6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i2(long j10, qc[] qcVarArr) {
        this.a = 14;
        this.b = j10;
        this.c = qcVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b6 b6Var;
        int i9 = this.a;
        int i10 = 5;
        b6 b6Var2 = null;
        r7 = 0;
        int i11 = 0;
        long j10 = this.b;
        Object obj = this.c;
        switch (i9) {
            case 0:
                q2 q2Var = (q2) obj;
                HashSet hashSet = q2Var.a0;
                hashSet.remove(Long.valueOf(j10));
                q2Var.U.b(true, hashSet, new h2(q2Var, 5), null);
                q2Var.a0(true, false);
                break;
            case 1:
                oc.a0((oa) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 2:
                oc.a0((s91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 3:
                ((ih.r) obj).s.e0(j10, false);
                break;
            case 4:
                ((ih.q2) obj).a.k0(j10 <= 0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread((u3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 6:
                org.telegram.ui.ActionBar.o2 c02 = s91.c0(MessagesController.getInstance(((v6) obj).a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    wb wbVar = wb.B2;
                    if (wbVar != null && wbVar.d) {
                        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                        m2Var.a = true;
                        R.showAsSheet(c02, m2Var);
                        break;
                    } else {
                        R.presentFragment(c02);
                        break;
                    }
                }
                break;
            case 7:
                MessagesStorage messagesStorage = ((i7) obj).b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    break;
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
            case 8:
                j3.n nVar = ((j3.m) obj).b;
                int i12 = d5.f0.a;
                i3.f fVar = ((h3.h0) nVar).a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1010, new i3.d(k10, j10));
                break;
            case 9:
                n9 n9Var = (n9) obj;
                Context context = n9Var.getContext();
                t9 t9Var = n9Var.S;
                org.telegram.ui.ActionBar.o2 o2Var = t9Var.attachedFragment;
                b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                y4.S(context, o2Var, b6Var, new d3.e(n9Var, j10, 2));
                break;
            case 10:
                wb wbVar2 = (wb) obj;
                rb rbVar = wbVar2.B;
                if (rbVar != null) {
                    rbVar.f(true);
                    wbVar2.B = null;
                }
                nb nbVar = wbVar2.x;
                rb a2 = nbVar != null ? nbVar.a(j10) : null;
                wbVar2.B = a2;
                if (a2 != null) {
                    wbVar2.F = a2.a;
                    wbVar2.r.c();
                    ib ibVar = wbVar2.d0;
                    int i13 = wbVar2.F;
                    if (i13 != 1 && i13 != 0) {
                        i11 = -14737633;
                    }
                    ibVar.setBackgroundColor(i11);
                    wbVar2.D.set(wbVar2.B.c);
                    rb rbVar2 = wbVar2.B;
                    wbVar2.C = rbVar2.b;
                    rbVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                wbVar2.x = null;
                Activity activity = wbVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    wbVar2.q(true);
                    break;
                } else {
                    ((LaunchActivity) activity).v0.post(new v9(wbVar2, i10));
                    break;
                }
            case 11:
                ac acVar = ((gc) obj).a;
                if (acVar != null) {
                    acVar.Q(j10, false);
                    break;
                }
                break;
            case 12:
                MessagesController.getInstance(r11.currentAccount).unlinkCommunity(j10, r11.e, new nh.s((nh.j0) obj, 1));
                break;
            case 13:
                nh.q0 q0Var = (nh.q0) obj;
                q0Var.i = null;
                q0Var.g.l(j10);
                q0Var.l++;
                q0Var.a();
                nh.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.c();
                    break;
                }
                break;
            case 14:
                AndroidUtilities.lambda$showProxyAlert$17(j10, (qc[]) obj);
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
                y3 y3Var = (y3) obj;
                if (y3Var != null) {
                    y3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new qn(e2.c.g(j10, "user_id")));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.gc Q = oc.a0((y6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.r = false;
                Q.j();
                break;
            case 22:
                tf tfVar = (tf) obj;
                tfVar.getClass();
                tfVar.presentFragment(qn.R9(j10));
                break;
            case 23:
                ze0 ze0Var = (ze0) obj;
                ze0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new te0(ze0Var, 1), 100L);
                break;
            case 24:
                kg0 kg0Var = (kg0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().Q1() || (U2 != null && U2.hasShownSheet())) {
                    b6Var2 = new ih.b();
                } else if (U2 != null) {
                    b6Var2 = U2.getResourceProvider();
                }
                new ea(activity2, b6Var2, this.b, 15, "", new gg0(kg0Var, 0), 0L).show();
                break;
            case 25:
                dy dyVar = (dy) obj;
                dyVar.A4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                dyVar.y2.v(dyVar, arrayList, null, false, dyVar.F2, dyVar.G2, dyVar.H2, null);
                break;
            case 26:
                ((o50) obj).m1(j10, false);
                break;
            case 27:
                jb0 jb0Var = (jb0) obj;
                jb0Var.getClass();
                jb0Var.presentFragment(qn.R9(j10));
                break;
            case 28:
                qn qnVar = ((ai) obj).e;
                qnVar.A7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == qnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                ((df) obj).run(Long.valueOf(j10));
                break;
        }
    }

    public /* synthetic */ i2(Object obj, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = j10;
    }
}
