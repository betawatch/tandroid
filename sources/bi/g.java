package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.fc;
import di.kc;
import di.oc;
import di.uc;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.hb1;
import org.telegram.ui.hc0;
import org.telegram.ui.n60;
import org.telegram.ui.qi;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10 = this.a;
        int i11 = 25;
        org.telegram.ui.ActionBar.c6 c6Var2 = null;
        r8 = 0;
        int i12 = 0;
        int i13 = 1;
        long j10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ((v) obj).s.e0(j10, false);
                break;
            case 1:
                ((r3) obj).a.k0(j10 <= 0);
                break;
            case 2:
                AndroidUtilities.runOnUIThread((z4) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 3:
                org.telegram.ui.ActionBar.m2 d02 = hb1.d0(MessagesController.getInstance(((x8) obj).a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    kc kcVar = kc.F2;
                    if (kcVar != null && kcVar.d) {
                        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                        k2Var.a = true;
                        R.showAsSheet(d02, k2Var);
                        break;
                    } else {
                        R.presentFragment(d02);
                        break;
                    }
                }
                break;
            case 4:
                MessagesStorage messagesStorage = ((k9) obj).b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 5:
                di.x9 x9Var = (di.x9) obj;
                Context context = x9Var.getContext();
                di.ea eaVar = x9Var.W;
                org.telegram.ui.ActionBar.m2 m2Var = eaVar.attachedFragment;
                c6Var = ((org.telegram.ui.ActionBar.e3) eaVar).resourcesProvider;
                org.telegram.ui.Components.g5.R(context, m2Var, c6Var, new p1(x9Var, j10, i13));
                break;
            case 6:
                kc kcVar2 = (kc) obj;
                fc fcVar = kcVar2.F;
                if (fcVar != null) {
                    fcVar.f(true);
                    kcVar2.F = null;
                }
                di.bc bcVar = kcVar2.x;
                fc a2 = bcVar != null ? bcVar.a(j10) : null;
                kcVar2.F = a2;
                if (a2 != null) {
                    kcVar2.J = a2.a;
                    kcVar2.r.c();
                    di.wb wbVar = kcVar2.h0;
                    int i14 = kcVar2.J;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    wbVar.setBackgroundColor(i12);
                    kcVar2.H.set(kcVar2.F.c);
                    fc fcVar2 = kcVar2.F;
                    kcVar2.G = fcVar2.b;
                    fcVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                kcVar2.x = null;
                Activity activity = kcVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    kcVar2.p(true);
                    break;
                } else {
                    ((LaunchActivity) activity).z0.post(new di.ga(kcVar2, 5));
                    break;
                }
            case 7:
                oc ocVar = ((uc) obj).a;
                if (ocVar != null) {
                    ocVar.n(j10, false);
                    break;
                }
                break;
            case 8:
                MessagesController.getInstance(r12.currentAccount).unlinkCommunity(j10, r12.e, new gi.t((gi.k0) obj, 1));
                break;
            case 9:
                gi.t0 t0Var = (gi.t0) obj;
                t0Var.i = null;
                t0Var.g.l(j10);
                t0Var.l++;
                t0Var.a();
                gi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.p();
                    break;
                }
                break;
            case 10:
                hg.h0 h0Var = (hg.h0) obj;
                h0Var.getClass();
                try {
                    MessagesStorage.getInstance(h0Var.s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                ji.r rVar = (ji.r) obj;
                org.telegram.ui.Components.g5.L(rVar.b.f0.getParentActivity(), j10, new a6.m(rVar, i11), rVar.a);
                break;
            case 12:
                ji.d2 d2Var = (ji.d2) obj;
                org.telegram.ui.Components.g5.L(d2Var.getParentActivity(), j10, new a6.m(d2Var, 26), d2Var.getResourceProvider());
                break;
            case 13:
                k2.u uVar = (k2.u) ((qf.b) obj).c;
                String str = e2.m0.a;
                j2.f fVar = ((i2.b0) uVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1010, new j2.e(p5, j10));
                break;
            case 14:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                break;
            case 15:
                ((NotificationsController) obj).lambda$processIgnoreStories$20(j10);
                break;
            case 16:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                break;
            case 17:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                break;
            case 18:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                break;
            case 19:
                org.telegram.ui.x3 x3Var = (org.telegram.ui.x3) obj;
                if (x3Var != null) {
                    x3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new fo(t8.b.e(j10, "user_id")));
                    break;
                }
                break;
            case 20:
                sc Q = zc.a0((org.telegram.ui.d7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.r = false;
                Q.j();
                break;
            case 21:
                eg egVar = (eg) obj;
                egVar.getClass();
                egVar.presentFragment(fo.W9(j10));
                break;
            case 22:
                cl clVar = (cl) obj;
                vi viVar = clVar.b;
                if (clVar.H || !clVar.I0 || !clVar.isShown()) {
                    clVar.L0 = null;
                    break;
                } else {
                    li liVar = viVar.u1;
                    org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f0;
                    if ((liVar.R() > AndroidUtilities.dp(20.0f) && !clVar.y0 && !clVar.H0) || SystemClock.uptimeMillis() >= j10) {
                        clVar.L0 = null;
                        org.telegram.ui.ActionBar.c6 c6Var3 = clVar.a;
                        Context context2 = (m2Var2 == null || m2Var2.getParentActivity() == null) ? clVar.getContext() : m2Var2.getParentActivity();
                        if (context2 != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, c6Var3);
                            String string = LocaleController.getString(R.string.WalletAddComment);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            a2Var.R = string;
                            ig.b1 b1Var = new ig.b1(clVar, context2);
                            b1Var.setTextSize(1, 18.0f);
                            b1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, c6Var3));
                            b1Var.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.t5, c6Var3));
                            b1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                            b1Var.setText(clVar.p0);
                            b1Var.setSelection(b1Var.length());
                            b1Var.setInputType(147457);
                            b1Var.setMaxLines(5);
                            b1Var.setImeOptions(6);
                            b1Var.setLineColors(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.k6, c6Var3), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.l6, c6Var3), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.p7, c6Var3));
                            b1Var.setBackground(null);
                            b1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context2, 1, c6Var3);
                            a2Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var3), 7, AndroidUtilities.dp(12.0f)));
                            a2Var2.e(LocaleController.getString(R.string.WalletMakeCommentPublic), "", !clVar.q0 || clVar.getPublicKey() == null, false, false);
                            a2Var2.setMultiline(true);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var2.getCheckBoxView().getLayoutParams();
                            layoutParams.topMargin = 0;
                            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
                            a2Var2.getCheckBoxView().setLayoutParams(layoutParams);
                            a2Var2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
                            a2Var2.setEnabled(clVar.getPublicKey() != null);
                            a2Var2.setOnClickListener(new org.telegram.ui.Components.i1(a2Var2, 1));
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(1);
                            linearLayout.addView(b1Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(a2Var2, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
                            a2Var.G = 6;
                            alertDialog$Builder.n(linearLayout);
                            a2Var.a = AndroidUtilities.dp(292.0f);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.n2(11));
                            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new androidx.car.app.utils.a(clVar, b1Var, a2Var2, i11));
                            clVar.Q0 = a2Var;
                            a2Var.h0 = false;
                            a2Var.setOnShowListener(new org.telegram.ui.Components.i2(i13, b1Var));
                            a2Var.setOnDismissListener(new org.telegram.ui.Components.b1(clVar, 5));
                            a2Var.create();
                            Window window = a2Var.getWindow();
                            Rect rect = new Rect();
                            viVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                            if (window != null && rect.height() > 0) {
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                View decorView = window.getDecorView();
                                int i15 = attributes.width;
                                if (i15 <= 0) {
                                    i15 = rect.width();
                                }
                                decorView.measure(View.MeasureSpec.makeMeasureSpec(i15, attributes.width > 0 ? TLObject.FLAG_30 : Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(rect.height(), TLObject.FLAG_31));
                                attributes.gravity = 49;
                                attributes.y = Math.max(0, (rect.height() - decorView.getMeasuredHeight()) / 2);
                                window.setAttributes(attributes);
                            }
                            a2Var.show();
                            View d = a2Var.d(-1);
                            if ((d instanceof TextView) && !TextUtils.isEmpty(clVar.p0)) {
                                b1Var.addTextChangedListener(new bl(b1Var, (TextView) d));
                                break;
                            }
                        }
                    } else {
                        clVar.postDelayed(clVar.L0, 32L);
                        break;
                    }
                }
                break;
            case 23:
                rg0 rg0Var = (rg0) obj;
                rg0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new mg0(rg0Var, 1), 100L);
                break;
            case 24:
                zh0 zh0Var = (zh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().R1() || (U2 != null && U2.hasShownSheet())) {
                    c6Var2 = new b();
                } else if (U2 != null) {
                    c6Var2 = U2.getResourceProvider();
                }
                new zh.e7(activity2, c6Var2, this.b, 15, "", new wh0(zh0Var, 0), 0L).show();
                break;
            case 25:
                yy yyVar = (yy) obj;
                yyVar.y4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                yyVar.C2.w(yyVar, arrayList, null, false, yyVar.J2, yyVar.K2, yyVar.L2, null);
                break;
            case 26:
                ((n60) obj).n1(j10, false);
                break;
            case 27:
                hc0 hc0Var = (hc0) obj;
                hc0Var.getClass();
                hc0Var.presentFragment(fo.W9(j10));
                break;
            case 28:
                fo foVar = ((qi) obj).e;
                foVar.D7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == foVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                foVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                ((org.telegram.ui.uc) obj).run(Long.valueOf(j10));
                break;
        }
    }
}
