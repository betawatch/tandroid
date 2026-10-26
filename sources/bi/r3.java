package bi;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cy;
import org.telegram.ui.kb0;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r3(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10 = this.a;
        org.telegram.ui.ActionBar.u6 u6Var2 = null;
        r6 = 0;
        int i11 = 0;
        int i12 = 1;
        long j10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.wc.b0((dd) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 1:
                org.telegram.ui.Components.wc.b0((w91) obj).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j10), R.raw.stars_topup).k(true);
                break;
            case 2:
                ((di.r) obj).s.e0(j10, false);
                break;
            case 3:
                ((di.v2) obj).a.i0(j10 <= 0);
                break;
            case 4:
                AndroidUtilities.runOnUIThread((di.z3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 5:
                org.telegram.ui.ActionBar.r2 c02 = w91.c0(MessagesController.getInstance(((di.h7) obj).a).getChat(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    fi.sb sbVar = fi.sb.F2;
                    if (sbVar != null && sbVar.d) {
                        org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                        p2Var.a = true;
                        R.showAsSheet(c02, p2Var);
                        break;
                    } else {
                        R.presentFragment(c02);
                        break;
                    }
                }
                break;
            case 6:
                MessagesStorage messagesStorage = ((di.u7) obj).b;
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
                fi.g9 g9Var = (fi.g9) obj;
                Context context = g9Var.getContext();
                fi.n9 n9Var = g9Var.W;
                org.telegram.ui.ActionBar.r2 r2Var = n9Var.attachedFragment;
                u6Var = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
                org.telegram.ui.Components.g5.R(context, r2Var, u6Var, new di.d1(g9Var, j10, i12));
                break;
            case 8:
                fi.sb sbVar2 = (fi.sb) obj;
                fi.nb nbVar = sbVar2.F;
                if (nbVar != null) {
                    nbVar.f(true);
                    sbVar2.F = null;
                }
                fi.jb jbVar = sbVar2.x;
                fi.nb b10 = jbVar != null ? jbVar.b(j10) : null;
                sbVar2.F = b10;
                if (b10 != null) {
                    sbVar2.J = b10.a;
                    sbVar2.r.c();
                    fi.eb ebVar = sbVar2.h0;
                    int i13 = sbVar2.J;
                    if (i13 != 1 && i13 != 0) {
                        i11 = -14737633;
                    }
                    ebVar.setBackgroundColor(i11);
                    sbVar2.H.set(sbVar2.F.c);
                    fi.nb nbVar2 = sbVar2.F;
                    sbVar2.G = nbVar2.b;
                    nbVar2.e();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    }
                }
                sbVar2.x = null;
                Activity activity = sbVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    sbVar2.p(true);
                    break;
                } else {
                    ((LaunchActivity) activity).z0.post(new fi.p9(sbVar2, 5));
                    break;
                }
            case 9:
                fi.wb wbVar = ((fi.cc) obj).a;
                if (wbVar != null) {
                    wbVar.h(j10, false);
                    break;
                }
                break;
            case 10:
                ig.i0 i0Var = (ig.i0) obj;
                i0Var.getClass();
                try {
                    MessagesStorage.getInstance(i0Var.s0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                MessagesController.getInstance(r10.currentAccount).unlinkCommunity(j10, r10.e, new ii.s((ii.j0) obj, 1));
                break;
            case 12:
                ii.r0 r0Var = (ii.r0) obj;
                r0Var.i = null;
                r0Var.g.l(j10);
                r0Var.l++;
                r0Var.a();
                ii.q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.c();
                    break;
                }
                break;
            case 13:
                k2.v vVar = (k2.v) ((rf.b) obj).c;
                String str = e2.n0.a;
                j2.e eVar = ((i2.d0) vVar).a.s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1010, new j2.d(p10, j10));
                break;
            case 14:
                li.q qVar = (li.q) obj;
                org.telegram.ui.Components.g5.L(qVar.b.f0.getParentActivity(), j10, new a4.l(qVar, 28), qVar.a);
                break;
            case 15:
                li.b2 b2Var = (li.b2) obj;
                org.telegram.ui.Components.g5.L(b2Var.getParentActivity(), j10, new jg.i(b2Var), b2Var.getResourceProvider());
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
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new un(a1.g.h(j10, "user_id")));
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.qc R2 = org.telegram.ui.Components.wc.b0((org.telegram.ui.c7) obj).R(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j10)));
                R2.s = false;
                R2.j();
                break;
            case 23:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                cgVar.presentFragment(un.ba(j10));
                break;
            case 24:
                al alVar = (al) obj;
                ti tiVar = alVar.b;
                if (alVar.K || !alVar.L0 || !alVar.isShown()) {
                    alVar.O0 = null;
                    break;
                } else {
                    gi giVar = tiVar.u1;
                    org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
                    if ((giVar.Q() > AndroidUtilities.dp(20.0f) && !alVar.B0 && !alVar.K0) || SystemClock.uptimeMillis() >= j10) {
                        alVar.O0 = null;
                        org.telegram.ui.ActionBar.u6 u6Var3 = alVar.a;
                        Context context2 = (r2Var2 == null || r2Var2.getParentActivity() == null) ? alVar.getContext() : r2Var2.getParentActivity();
                        if (context2 != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, u6Var3);
                            String string = LocaleController.getString(R.string.WalletAddComment);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            e2Var.R = string;
                            jg.a1 a1Var = new jg.a1(alVar, context2);
                            a1Var.setTextSize(1, 18.0f);
                            org.telegram.ui.ActionBar.f7.V(a1Var, org.telegram.ui.ActionBar.y6.j5, u6Var3);
                            org.telegram.ui.ActionBar.f7.E(a1Var, org.telegram.ui.ActionBar.y6.t5, u6Var3);
                            a1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
                            a1Var.setText(alVar.s0);
                            a1Var.setSelection(a1Var.length());
                            a1Var.setInputType(147457);
                            a1Var.setMaxLines(5);
                            a1Var.setImeOptions(6);
                            org.telegram.ui.ActionBar.f7.G(a1Var, org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, u6Var3);
                            a1Var.setBackground(null);
                            a1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context2, 1, u6Var3);
                            int i14 = org.telegram.ui.ActionBar.y6.i6;
                            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i14, u6Var3), 7, AndroidUtilities.dp(12.0f));
                            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
                            y1Var.setBackground(g02);
                            org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, u6Var3);
                            y1Var.e(LocaleController.getString(R.string.WalletMakeCommentPublic), "", !alVar.t0 || alVar.getPublicKey() == null, false, false);
                            y1Var.setMultiline(true);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var.getCheckBoxView().getLayoutParams();
                            layoutParams.topMargin = 0;
                            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
                            y1Var.getCheckBoxView().setLayoutParams(layoutParams);
                            y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
                            y1Var.setEnabled(alVar.getPublicKey() != null);
                            y1Var.setOnClickListener(new org.telegram.ui.Components.i1(y1Var, 1));
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(1);
                            linearLayout.addView(a1Var, gb1.o(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(y1Var, gb1.x(-1, -2, 83, 8, 0, 8, 0));
                            e2Var.G = 6;
                            alertDialog$Builder.o(linearLayout);
                            e2Var.a = AndroidUtilities.dp(292.0f);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.f2(23));
                            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new androidx.car.app.utils.a(alVar, a1Var, y1Var, 26));
                            alVar.T0 = e2Var;
                            e2Var.j0 = false;
                            e2Var.setOnShowListener(new org.telegram.ui.Components.l2(a1Var, i12));
                            e2Var.setOnDismissListener(new org.telegram.ui.Components.z0(alVar, 5));
                            e2Var.create();
                            Window window = e2Var.getWindow();
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
                            e2Var.show();
                            View d = e2Var.d(-1);
                            if ((d instanceof TextView) && !TextUtils.isEmpty(alVar.s0)) {
                                a1Var.addTextChangedListener(new zk(a1Var, (TextView) d));
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
                mg0 mg0Var = (mg0) obj;
                mg0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new hg0(mg0Var, 1), 100L);
                break;
            case 26:
                wh0 wh0Var = (wh0) obj;
                Activity activity2 = AndroidUtilities.getActivity();
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (PhotoViewer.u1().T1() || (U2 != null && U2.hasShownSheet())) {
                    u6Var2 = new di.b();
                } else if (U2 != null) {
                    u6Var2 = U2.getResourceProvider();
                }
                new tc(activity2, u6Var2, this.b, 15, "", new th0(wh0Var, 0), 0L).show();
                break;
            case 27:
                cy cyVar = (cy) obj;
                cyVar.I4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j10, 0L));
                cyVar.C2.v(cyVar, arrayList, null, false, cyVar.J2, cyVar.K2, cyVar.L2, null);
                break;
            case 28:
                ((v50) obj).m1(j10, false);
                break;
            default:
                kb0 kb0Var = (kb0) obj;
                kb0Var.getClass();
                kb0Var.presentFragment(un.ba(j10));
                break;
        }
    }
}
