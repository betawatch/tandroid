package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cy;
import org.telegram.ui.hb0;
import org.telegram.ui.p91;
import org.telegram.ui.q50;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v3(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10 = this.a;
        int i11 = 5;
        org.telegram.ui.ActionBar.d6 d6Var2 = null;
        r6 = 0;
        int i12 = 0;
        int i13 = 1;
        long j10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xc.a0((md) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 1:
                org.telegram.ui.Components.xc.a0((p91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 2:
                ((ci.r) obj).s.e0(j10, false);
                break;
            case 3:
                ((ci.w2) obj).a.k0(j10 <= 0);
                break;
            case 4:
                AndroidUtilities.runOnUIThread((ci.a4) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 5:
                org.telegram.ui.ActionBar.n2 d02 = p91.d0(MessagesController.getInstance(((ci.i7) obj).a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    ei.vb vbVar = ei.vb.F2;
                    if (vbVar != null && vbVar.d) {
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
            case 6:
                MessagesStorage messagesStorage = ((ci.w7) obj).b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 7:
                ei.k9 k9Var = (ei.k9) obj;
                Context context = k9Var.getContext();
                ei.r9 r9Var = k9Var.W;
                org.telegram.ui.ActionBar.n2 n2Var = r9Var.attachedFragment;
                d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
                org.telegram.ui.Components.f5.R(context, n2Var, d6Var, new ci.d1(k9Var, j10, i13));
                break;
            case 8:
                ei.vb vbVar2 = (ei.vb) obj;
                ei.qb qbVar = vbVar2.F;
                if (qbVar != null) {
                    qbVar.f(true);
                    vbVar2.F = null;
                }
                ei.mb mbVar = vbVar2.x;
                ei.qb a2 = mbVar != null ? mbVar.a(j10) : null;
                vbVar2.F = a2;
                if (a2 != null) {
                    vbVar2.J = a2.a;
                    vbVar2.r.c();
                    ei.hb hbVar = vbVar2.h0;
                    int i14 = vbVar2.J;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    hbVar.setBackgroundColor(i12);
                    vbVar2.H.set(vbVar2.F.c);
                    ei.qb qbVar2 = vbVar2.F;
                    vbVar2.G = qbVar2.b;
                    qbVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                vbVar2.x = null;
                Activity activity = vbVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    vbVar2.p(true);
                    break;
                } else {
                    ((LaunchActivity) activity).z0.post(new ei.t9(vbVar2, i11));
                    break;
                }
            case 9:
                ei.zb zbVar = ((ei.gc) obj).a;
                if (zbVar != null) {
                    zbVar.o(j10, false);
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
                MessagesController.getInstance(r10.currentAccount).unlinkCommunity(j10, r10.e, new hi.s((hi.k0) obj, 1));
                break;
            case 12:
                hi.s0 s0Var = (hi.s0) obj;
                s0Var.i = null;
                s0Var.g.l(j10);
                s0Var.l++;
                s0Var.a();
                hi.r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.l();
                    break;
                }
                break;
            case 13:
                k2.u uVar = (k2.u) ((qf.b) obj).c;
                String str = e2.m0.a;
                j2.f fVar = ((i2.c0) uVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1010, new j2.e(p5, j10));
                break;
            case 14:
                ki.q qVar = (ki.q) obj;
                org.telegram.ui.Components.f5.L(qVar.b.f0.getParentActivity(), j10, new ya.d(qVar, 27), qVar.a);
                break;
            case 15:
                ki.d2 d2Var = (ki.d2) obj;
                org.telegram.ui.Components.f5.L(d2Var.getParentActivity(), j10, new ki.t1(d2Var, r6 ? 1 : 0), d2Var.getResourceProvider());
                break;
            case 16:
                ((LocationController) obj).lambda$removeSharingLocation$21(j10);
                break;
            case 17:
                ((NotificationsController) obj).lambda$processIgnoreStories$20(j10);
                break;
            case 18:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                break;
            case 19:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                break;
            case 20:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                break;
            case 21:
                org.telegram.ui.x3 x3Var = (org.telegram.ui.x3) obj;
                if (x3Var != null) {
                    x3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new qn(zf.d0.b(j10, "user_id")));
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0((org.telegram.ui.c7) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                Q.r = false;
                Q.j();
                break;
            case 23:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                cgVar.presentFragment(qn.W9(j10));
                break;
            case 24:
                al alVar = (al) obj;
                ti tiVar = alVar.b;
                if (alVar.H || !alVar.I0 || !alVar.isShown()) {
                    alVar.L0 = null;
                    break;
                } else {
                    ji jiVar = tiVar.u1;
                    org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f0;
                    if ((jiVar.R() > AndroidUtilities.dp(20.0f) && !alVar.y0 && !alVar.H0) || SystemClock.uptimeMillis() >= j10) {
                        alVar.L0 = null;
                        org.telegram.ui.ActionBar.d6 d6Var3 = alVar.a;
                        Context context2 = (n2Var2 == null || n2Var2.getParentActivity() == null) ? alVar.getContext() : n2Var2.getParentActivity();
                        if (context2 != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, d6Var3);
                            String string = LocaleController.getString(R.string.WalletAddComment);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.R = string;
                            ig.a1 a1Var = new ig.a1(alVar, context2);
                            a1Var.setTextSize(1, 18.0f);
                            a1Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var3));
                            a1Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.t5, d6Var3));
                            a1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                            a1Var.setText(alVar.p0);
                            a1Var.setSelection(a1Var.length());
                            a1Var.setInputType(147457);
                            a1Var.setMaxLines(5);
                            a1Var.setImeOptions(6);
                            a1Var.setLineColors(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.k6, d6Var3), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.l6, d6Var3), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.p7, d6Var3));
                            a1Var.setBackground(null);
                            a1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context2, 1, d6Var3);
                            a2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var3), 7, AndroidUtilities.dp(12.0f)));
                            a2Var.e(LocaleController.getString(R.string.WalletMakeCommentPublic), "", !alVar.q0 || alVar.getPublicKey() == null, false, false);
                            a2Var.setMultiline(true);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
                            layoutParams.topMargin = 0;
                            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
                            a2Var.getCheckBoxView().setLayoutParams(layoutParams);
                            a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
                            a2Var.setEnabled(alVar.getPublicKey() != null);
                            a2Var.setOnClickListener(new org.telegram.ui.Components.i1(a2Var, 1));
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(1);
                            linearLayout.addView(a1Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(a2Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
                            b2Var.G = 6;
                            alertDialog$Builder.n(linearLayout);
                            b2Var.a = AndroidUtilities.dp(292.0f);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.k2(13));
                            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new u2(alVar, a1Var, a2Var, 26));
                            alVar.Q0 = b2Var;
                            b2Var.h0 = false;
                            b2Var.setOnShowListener(new org.telegram.ui.Components.i2(i13, a1Var));
                            b2Var.setOnDismissListener(new org.telegram.ui.Components.b1(alVar, i11));
                            b2Var.create();
                            Window window = b2Var.getWindow();
                            Rect rect = new Rect();
                            tiVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                            b2Var.show();
                            View d = b2Var.d(-1);
                            if ((d instanceof TextView) && !TextUtils.isEmpty(alVar.p0)) {
                                a1Var.addTextChangedListener(new zk(a1Var, (TextView) d));
                                break;
                            }
                        }
                    } else {
                        alVar.postDelayed(alVar.L0, 32L);
                        break;
                    }
                }
                break;
            case 25:
                lg0 lg0Var = (lg0) obj;
                lg0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new gg0(lg0Var, 1), 100L);
                break;
            case 26:
                uh0 uh0Var = (uh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (PhotoViewer.u1().T1() || (U2 != null && U2.hasShownSheet())) {
                    d6Var2 = new ci.b();
                } else if (U2 != null) {
                    d6Var2 = U2.getResourceProvider();
                }
                new cd(activity2, d6Var2, this.b, 15, "", new rh0(uh0Var, 0), 0L).show();
                break;
            case 27:
                cy cyVar = (cy) obj;
                cyVar.y4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                cyVar.C2.w(cyVar, arrayList, null, false, cyVar.J2, cyVar.K2, cyVar.L2, null);
                break;
            case 28:
                ((q50) obj).n1(j10, false);
                break;
            default:
                hb0 hb0Var = (hb0) obj;
                hb0Var.getClass();
                hb0Var.presentFragment(qn.W9(j10));
                break;
        }
    }
}
