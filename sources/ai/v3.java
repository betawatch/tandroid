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
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ey;
import org.telegram.ui.nb0;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
import org.telegram.ui.u91;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10 = this.a;
        org.telegram.ui.ActionBar.g6 g6Var2 = null;
        r6 = 0;
        int i11 = 0;
        int i12 = 1;
        long j10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xc.a0((nd) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 1:
                org.telegram.ui.Components.xc.a0((u91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 2:
                ((ci.r) obj).s.e0(j10, false);
                break;
            case 3:
                ((ci.v2) obj).a.j0(j10 <= 0);
                break;
            case 4:
                AndroidUtilities.runOnUIThread((ci.z3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 5:
                org.telegram.ui.ActionBar.o2 d02 = u91.d0(MessagesController.getInstance(((ci.h7) obj).a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    ei.vb vbVar = ei.vb.F2;
                    if (vbVar != null && vbVar.d) {
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
            case 6:
                MessagesStorage messagesStorage = ((ci.v7) obj).b;
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
                org.telegram.ui.ActionBar.o2 o2Var = r9Var.attachedFragment;
                g6Var = ((org.telegram.ui.ActionBar.h3) r9Var).resourcesProvider;
                org.telegram.ui.Components.f5.S(context, o2Var, g6Var, new ci.d1(k9Var, j10, i12));
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
                    int i13 = vbVar2.J;
                    if (i13 != 1 && i13 != 0) {
                        i11 = -14737633;
                    }
                    hbVar.setBackgroundColor(i11);
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
                    ((LaunchActivity) activity).z0.post(new ei.t9(vbVar2, 5));
                    break;
                }
            case 9:
                ei.zb zbVar = ((ei.gc) obj).a;
                if (zbVar != null) {
                    zbVar.i(j10, false);
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
                    r0Var.q();
                    break;
                }
                break;
            case 13:
                k2.v vVar = (k2.v) ((qf.b) obj).c;
                String str = e2.m0.a;
                j2.e eVar = ((i2.b0) vVar).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1010, new j2.d(p5, j10));
                break;
            case 14:
                ki.q qVar = (ki.q) obj;
                org.telegram.ui.Components.f5.M(qVar.b.f0.getParentActivity(), j10, new ya.c(qVar, 27), qVar.a);
                break;
            case 15:
                ki.d2 d2Var = (ki.d2) obj;
                org.telegram.ui.Components.f5.M(d2Var.getParentActivity(), j10, new ki.t1(d2Var, r6 ? 1 : 0), d2Var.getResourceProvider());
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
                org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) obj;
                if (w3Var != null) {
                    w3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new sn(si.o0.e(j10, "user_id")));
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
                cgVar.presentFragment(sn.W9(j10));
                break;
            case 24:
                al alVar = (al) obj;
                ti tiVar = alVar.b;
                if (alVar.K || !alVar.L0 || !alVar.isShown()) {
                    alVar.O0 = null;
                    break;
                } else {
                    ji jiVar = tiVar.u1;
                    org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f0;
                    if ((jiVar.Q() > AndroidUtilities.dp(20.0f) && !alVar.B0 && !alVar.K0) || SystemClock.uptimeMillis() >= j10) {
                        alVar.O0 = null;
                        org.telegram.ui.ActionBar.g6 g6Var3 = alVar.a;
                        Context context2 = (o2Var2 == null || o2Var2.getParentActivity() == null) ? alVar.getContext() : o2Var2.getParentActivity();
                        if (context2 != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, g6Var3);
                            String string = LocaleController.getString(R.string.WalletAddComment);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.R = string;
                            ig.z0 z0Var = new ig.z0(alVar, context2);
                            z0Var.setTextSize(1, 18.0f);
                            org.telegram.ui.ActionBar.r6.W(z0Var, org.telegram.ui.ActionBar.k6.j5, g6Var3);
                            org.telegram.ui.ActionBar.r6.F(z0Var, org.telegram.ui.ActionBar.k6.t5, g6Var3);
                            z0Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                            z0Var.setText(alVar.s0);
                            z0Var.setSelection(z0Var.length());
                            z0Var.setInputType(147457);
                            z0Var.setMaxLines(5);
                            z0Var.setImeOptions(6);
                            org.telegram.ui.ActionBar.r6.H(z0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, g6Var3);
                            z0Var.setBackground(null);
                            z0Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context2, 1, g6Var3);
                            int i14 = org.telegram.ui.ActionBar.k6.i6;
                            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i14, g6Var3), 7, AndroidUtilities.dp(12.0f));
                            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
                            z1Var.setBackground(g02);
                            org.telegram.ui.ActionBar.r6.k(z1Var, g02, null, O, g6Var3);
                            z1Var.e(LocaleController.getString(R.string.WalletMakeCommentPublic), "", !alVar.t0 || alVar.getPublicKey() == null, false, false);
                            z1Var.setMultiline(true);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var.getCheckBoxView().getLayoutParams();
                            layoutParams.topMargin = 0;
                            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
                            z1Var.getCheckBoxView().setLayoutParams(layoutParams);
                            z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
                            z1Var.setEnabled(alVar.getPublicKey() != null);
                            z1Var.setOnClickListener(new org.telegram.ui.Components.h1(z1Var, 1));
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(1);
                            linearLayout.addView(z0Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(z1Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
                            c2Var.G = 6;
                            alertDialog$Builder.o(linearLayout);
                            c2Var.a = AndroidUtilities.dp(292.0f);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.e2(19));
                            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new u2(alVar, z0Var, z1Var, 26));
                            alVar.T0 = c2Var;
                            c2Var.j0 = false;
                            c2Var.setOnShowListener(new org.telegram.ui.Components.i2(z0Var, i12));
                            c2Var.setOnDismissListener(new org.telegram.ui.Components.a1(alVar, 5));
                            c2Var.create();
                            Window window = c2Var.getWindow();
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
                            c2Var.show();
                            View d = c2Var.d(-1);
                            if ((d instanceof TextView) && !TextUtils.isEmpty(alVar.s0)) {
                                z0Var.addTextChangedListener(new zk(z0Var, (TextView) d));
                                break;
                            }
                        }
                    } else {
                        alVar.postDelayed(alVar.O0, 32L);
                        break;
                    }
                }
                break;
            case 25:
                pg0 pg0Var = (pg0) obj;
                pg0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new kg0(pg0Var, 1), 100L);
                break;
            case 26:
                xh0 xh0Var = (xh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (PhotoViewer.u1().T1() || (U2 != null && U2.hasShownSheet())) {
                    g6Var2 = new ci.b();
                } else if (U2 != null) {
                    g6Var2 = U2.getResourceProvider();
                }
                new dd(activity2, g6Var2, this.b, 15, "", new uh0(xh0Var, 0), 0L).show();
                break;
            case 27:
                ey eyVar = (ey) obj;
                eyVar.y4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                eyVar.C2.w(eyVar, arrayList, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
                break;
            case 28:
                ((u50) obj).m1(j10, false);
                break;
            default:
                nb0 nb0Var = (nb0) obj;
                nb0Var.getClass();
                nb0Var.presentFragment(sn.W9(j10));
                break;
        }
    }
}
