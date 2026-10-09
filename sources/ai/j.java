package ai;

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
import ci.wc;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.di0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fl;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.dc0;
import org.telegram.ui.g60;
import org.telegram.ui.mi;
import org.telegram.ui.ty;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10 = this.a;
        int i11 = 25;
        org.telegram.ui.ActionBar.e6 e6Var2 = null;
        r8 = 0;
        int i12 = 0;
        int i13 = 1;
        long j3 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ((b0) obj).s.e0(j3, false);
                break;
            case 1:
                ((c4) obj).a.k0(j3 <= 0);
                break;
            case 2:
                AndroidUtilities.runOnUIThread((n5) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(MessagesController.getInstance(((m9) obj).a).getChat(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    ci.lc lcVar = ci.lc.F2;
                    if (lcVar != null && lcVar.d) {
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
                MessagesStorage messagesStorage = ((z9) obj).b;
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
                ci.y9 y9Var = (ci.y9) obj;
                Context context = y9Var.getContext();
                ci.fa faVar = y9Var.W;
                org.telegram.ui.ActionBar.n2 n2Var = faVar.attachedFragment;
                e6Var = ((org.telegram.ui.ActionBar.f3) faVar).resourcesProvider;
                org.telegram.ui.Components.g5.R(context, n2Var, e6Var, new z1(y9Var, j3, i13));
                break;
            case 6:
                ci.lc lcVar2 = (ci.lc) obj;
                ci.gc gcVar = lcVar2.F;
                if (gcVar != null) {
                    gcVar.f(true);
                    lcVar2.F = null;
                }
                ci.cc ccVar = lcVar2.x;
                ci.gc a2 = ccVar != null ? ccVar.a(j3) : null;
                lcVar2.F = a2;
                if (a2 != null) {
                    lcVar2.J = a2.a;
                    lcVar2.r.c();
                    ci.xb xbVar = lcVar2.h0;
                    int i14 = lcVar2.J;
                    if (i14 != 1 && i14 != 0) {
                        i12 = -14737633;
                    }
                    xbVar.setBackgroundColor(i12);
                    lcVar2.H.set(lcVar2.F.c);
                    ci.gc gcVar2 = lcVar2.F;
                    lcVar2.G = gcVar2.b;
                    gcVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                lcVar2.x = null;
                Activity activity = lcVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    lcVar2.p(true);
                    break;
                } else {
                    ((LaunchActivity) activity).z0.post(new ci.ha(lcVar2, 5));
                    break;
                }
            case 7:
                ci.pc pcVar = ((wc) obj).a;
                if (pcVar != null) {
                    pcVar.h(j3, false);
                    break;
                }
                break;
            case 8:
                MessagesController.getInstance(r12.currentAccount).unlinkCommunity(j3, r12.e, new fi.t((fi.k0) obj, 1));
                break;
            case 9:
                fi.t0 t0Var = (fi.t0) obj;
                t0Var.i = null;
                t0Var.g.l(j3);
                t0Var.l++;
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.n();
                    break;
                }
                break;
            case 10:
                gg.h0 h0Var = (gg.h0) obj;
                h0Var.getClass();
                try {
                    MessagesStorage.getInstance(h0Var.s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 11:
                ii.r rVar = (ii.r) obj;
                org.telegram.ui.Components.g5.L(rVar.b.f0.getParentActivity(), j3, new xa.d(rVar, 24), rVar.a);
                break;
            case 12:
                ii.e2 e2Var = (ii.e2) obj;
                org.telegram.ui.Components.g5.L(e2Var.getParentActivity(), j3, new xa.d(e2Var, i11), e2Var.getResourceProvider());
                break;
            case 13:
                k2.j jVar = (k2.j) ((n4.x) obj).c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) jVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1010, new j2.c(p5, j3));
                break;
            case 14:
                ((LocationController) obj).lambda$removeSharingLocation$21(j3);
                break;
            case 15:
                ((NotificationsController) obj).lambda$processIgnoreStories$20(j3);
                break;
            case 16:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j3);
                break;
            case 17:
                ((VideoCapturerDevice) obj).lambda$init$3(j3);
                break;
            case 18:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j3);
                break;
            case 19:
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new zn(sc.v.f(j3, "user_id")));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.tc Q = ad.a0((org.telegram.ui.y6) obj).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j3)));
                Q.r = false;
                Q.j();
                break;
            case 21:
                fg fgVar = (fg) obj;
                fgVar.getClass();
                fgVar.presentFragment(zn.W9(j3));
                break;
            case 22:
                gl glVar = (gl) obj;
                yi yiVar = glVar.b;
                if (glVar.H || !glVar.I0 || !glVar.isShown()) {
                    glVar.L0 = null;
                    break;
                } else {
                    oi oiVar = yiVar.u1;
                    org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f0;
                    if ((oiVar.R() > AndroidUtilities.dp(20.0f) && !glVar.y0 && !glVar.H0) || SystemClock.uptimeMillis() >= j3) {
                        glVar.L0 = null;
                        org.telegram.ui.ActionBar.e6 e6Var3 = glVar.a;
                        Context context2 = (n2Var2 == null || n2Var2.getParentActivity() == null) ? glVar.getContext() : n2Var2.getParentActivity();
                        if (context2 != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, e6Var3);
                            String string = LocaleController.getString(R.string.WalletAddComment);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.R = string;
                            hg.b1 b1Var = new hg.b1(glVar, context2);
                            b1Var.setTextSize(1, 18.0f);
                            b1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var3));
                            b1Var.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.t5, e6Var3));
                            b1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                            b1Var.setText(glVar.p0);
                            b1Var.setSelection(b1Var.length());
                            b1Var.setInputType(147457);
                            b1Var.setMaxLines(5);
                            b1Var.setImeOptions(6);
                            b1Var.setLineColors(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.k6, e6Var3), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.l6, e6Var3), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.p7, e6Var3));
                            b1Var.setBackground(null);
                            b1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context2, 1, e6Var3);
                            a2Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var3), 7, AndroidUtilities.dp(12.0f)));
                            a2Var.e(LocaleController.getString(R.string.WalletMakeCommentPublic), "", !glVar.q0 || glVar.getPublicKey() == null, false, false);
                            a2Var.setMultiline(true);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
                            layoutParams.topMargin = 0;
                            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
                            a2Var.getCheckBoxView().setLayoutParams(layoutParams);
                            a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
                            a2Var.setEnabled(glVar.getPublicKey() != null);
                            a2Var.setOnClickListener(new org.telegram.ui.Components.i1(a2Var, 1));
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(1);
                            linearLayout.addView(b1Var, w7.x5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(a2Var, w7.x5.t(-1, -2, 83, 8, 0, 8, 0));
                            b2Var.G = 6;
                            alertDialog$Builder.n(linearLayout);
                            b2Var.a = AndroidUtilities.dp(292.0f);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.f2(18));
                            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new r5(glVar, b1Var, a2Var, i11));
                            glVar.Q0 = b2Var;
                            b2Var.h0 = false;
                            b2Var.setOnShowListener(new org.telegram.ui.Components.j2(i13, b1Var));
                            b2Var.setOnDismissListener(new org.telegram.ui.Components.b1(glVar, 5));
                            b2Var.create();
                            Window window = b2Var.getWindow();
                            Rect rect = new Rect();
                            yiVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                            if ((d instanceof TextView) && !TextUtils.isEmpty(glVar.p0)) {
                                b1Var.addTextChangedListener(new fl(b1Var, (TextView) d));
                                break;
                            }
                        }
                    } else {
                        glVar.postDelayed(glVar.L0, 32L);
                        break;
                    }
                }
                break;
            case 23:
                sg0 sg0Var = (sg0) obj;
                sg0Var.h("seekTo(" + Math.round(j3 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new ng0(sg0Var, 1), 100L);
                break;
            case 24:
                di0 di0Var = (di0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (PhotoViewer.t1().R1() || (U2 != null && U2.hasShownSheet())) {
                    e6Var2 = new d();
                } else if (U2 != null) {
                    e6Var2 = U2.getResourceProvider();
                }
                new yh.e7(activity2, e6Var2, this.b, 15, "", new zh0(di0Var, 0), 0L).show();
                break;
            case 25:
                ty tyVar = (ty) obj;
                tyVar.x4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j3, 0L));
                tyVar.C2.w(tyVar, arrayList, null, false, tyVar.J2, tyVar.K2, tyVar.L2, null);
                break;
            case 26:
                ((g60) obj).n1(j3, false);
                break;
            case 27:
                dc0 dc0Var = (dc0) obj;
                dc0Var.getClass();
                dc0Var.presentFragment(zn.W9(j3));
                break;
            case 28:
                zn znVar = ((mi) obj).e;
                znVar.D7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == znVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                ((org.telegram.ui.pc) obj).run(Long.valueOf(j3));
                break;
        }
    }
}
