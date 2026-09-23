package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.s61, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.cl0, ig.e, gg.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i F() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.o0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.ml0 ml0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(ml0Var, bVar.a, 0, bVar.c, 0);
                cx0 cx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                cx0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                zg0 zg0Var = (zg0) ((th1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i11 = defaultWindowInsets2.a;
                zg0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                zg0Var.N = i12;
                zg0Var.L = defaultWindowInsets2.d;
                View view2 = zg0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                zg0Var.y.setPadding(0, 0, 0, zg0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + zg0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zg0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    zg0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? zg0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) zg0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    zg0Var.c.setLayoutParams(marginLayoutParams2);
                }
                zg0Var.E.setPadding(i11, 0, i12, zg0Var.L);
                if (z10) {
                    l1Var = l1Var.a.m(0, 0, 0, zg0Var.L);
                }
                zg0Var.i0();
                zg0Var.h0();
                SparseArray sparseArray = zg0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    rh1 rh1Var = (rh1) sparseArray.valueAt(i14);
                    if (rh1Var != null && (fragmentView = rh1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void a() {
        switch (this.a) {
            case 6:
                ((fw0) this.b).e();
                break;
            default:
                ((de1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.s61
    public void b(org.telegram.ui.Components.wz wzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        wzVar.f(new org.telegram.ui.Components.xz(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        yx0 yx0Var = (yx0) this.b;
        if (!z10) {
            return true;
        }
        yx0Var.d.U((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((m71) this.b).Q(i10, view);
            case 18:
                final ra1 ra1Var = (ra1) this.b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = ra1Var.h0;
                w91 w91Var = ra1Var.X;
                int i11 = w91Var.I;
                if (i10 < i11 || i10 > w91Var.J) {
                    int i12 = w91Var.U;
                    if (i10 < i12 || i10 > w91Var.V) {
                        int i13 = w91Var.R;
                        if (i10 < i13 || i10 > w91Var.S) {
                            int i14 = w91Var.X;
                            if (i10 < i14 || i10 > w91Var.Y) {
                                return false;
                            }
                            ((ka1) ra1Var.P.get(i10 - i14)).c(ra1Var.a, ra1Var, b2VarArr, true);
                        } else {
                            ((ka1) ra1Var.O.get(i10 - i13)).c(ra1Var.a, ra1Var, b2VarArr, true);
                        }
                    } else {
                        ((ka1) ra1Var.Q.get(i10 - i12)).c(ra1Var.a, ra1Var, b2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((oa1) ra1Var.v0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(ra1Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.m91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ra1 ra1Var2 = ra1Var;
                                    ra1Var2.getClass();
                                    ra1Var2.presentFragment(new ej0(messageObject));
                                    break;
                                default:
                                    ra1 ra1Var3 = ra1Var;
                                    ra1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ra1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ra1Var3.presentFragment(new xn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.m91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    ra1 ra1Var2 = ra1Var;
                                    ra1Var2.getClass();
                                    ra1Var2.presentFragment(new ej0(messageObject));
                                    break;
                                default:
                                    ra1 ra1Var3 = ra1Var;
                                    ra1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ra1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ra1Var3.presentFragment(new xn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(ra1Var.S.V0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((le1) this.b).J.d(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((jt0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((tv0) this.b).finishFragment();
                break;
            case 5:
                ((nv0) this.b).a.R.r();
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i14 = PopupNotificationActivity.b0;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 11:
                ((org.telegram.messenger.mk) this.b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((x11) this.b).b;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.b0(true);
                y11 y11Var = proxyListActivity.a;
                if (y11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        y11Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((nb1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    yb1 yb1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    yb1Var.n(i12, new Object());
                    yb1 yb1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    yb1Var2.n(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.g6 N0 = org.telegram.ui.ActionBar.h6.N0("Blue");
                    org.telegram.ui.ActionBar.g6 A0 = org.telegram.ui.ActionBar.h6.A0();
                    SparseArray sparseArray = N0.a0;
                    int i17 = org.telegram.ui.ActionBar.h6.n;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(i17);
                    if (f6Var != null) {
                        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6();
                        a6Var.c = "d";
                        a6Var.a = "Blue_99_wp.jpg";
                        a6Var.b = "Blue_99_wp.jpg";
                        f6Var.y = a6Var;
                        N0.v(a6Var);
                    }
                    if (N0 == A0) {
                        if (N0.Y == i17) {
                            org.telegram.ui.ActionBar.h6.o1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i17));
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.h6.t1(N0, true, false, true, false, false);
                        themeActivity.c.y1(N0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 21:
                od1 od1Var = ((rc1) this.b).a;
                org.telegram.ui.ActionBar.h6.j0(od1Var.e0, od1Var.s, true);
                org.telegram.ui.ActionBar.h6.o();
                org.telegram.ui.ActionBar.h6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, od1Var.e0, Boolean.valueOf(od1Var.f0), null, -1);
                od1Var.finishFragment();
                break;
            default:
                ((xg1) this.b).a.E0(true);
                break;
        }
    }

    @Override // gg.b2
    public void h(int i10) {
        ph1 ph1Var = (ph1) this.b;
        if (ph1Var.h == null && !ph1Var.f.e()) {
            ph1Var.v.f.e(false, true);
        }
        ph1Var.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.h51) obj, (View) obj2);
                break;
            default:
                t31 t31Var = (t31) this.b;
                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                u31 u31Var = t31Var.v;
                if (h51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = t31Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = t31Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = t31Var.d;
                            if (tL_reportResultAddComment == null) {
                                u31.H(u31Var, h51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    u31.H(u31Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(h51Var.d);
                            if (tL_messageReportOption != null) {
                                u31.H(u31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(h51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            u31.H(u31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.b, j3, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((rx0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(R.drawable.msg_mini_lock3, 0);
                    pqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(pqVar, 0, 1, 33);
                    privacyControlActivity.z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override // gg.b2
    public /* synthetic */ void Q(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        gg.e1 e1Var = (gg.e1) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        e1Var.run();
    }
}
