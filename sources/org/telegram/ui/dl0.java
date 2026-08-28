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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.x51, org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.n1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.ok0, qf.e, of.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.k0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.k0.d);
                org.telegram.ui.Components.wk0 wk0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.k0;
                AndroidUtilities.setViewLayoutMargins(wk0Var, bVar.a, 0, bVar.c, 0);
                fw0 fw0Var = premiumPreviewFragment.Q;
                i0.b bVar2 = premiumPreviewFragment.k0;
                fw0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.F;
                if (frameLayout != null) {
                    int i9 = premiumPreviewFragment.k0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.k0;
                    frameLayout.setPadding(i9, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                ng0 ng0Var = (ng0) ((tg1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i10 = defaultWindowInsets2.a;
                ng0Var.I = i10;
                int i11 = defaultWindowInsets2.c;
                ng0Var.J = i11;
                ng0Var.H = defaultWindowInsets2.d;
                View view2 = ng0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                ng0Var.y.setPadding(0, 0, 0, ng0Var.H);
                int dp3 = AndroidUtilities.dp(72.0f) + ng0Var.H + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ng0Var.D.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    ng0Var.D.setLayoutParams(marginLayoutParams);
                }
                int i12 = z10 ? ng0Var.H + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ng0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i12 || marginLayoutParams2.leftMargin != i10 || marginLayoutParams2.rightMargin != i11) {
                    marginLayoutParams2.leftMargin = i10;
                    marginLayoutParams2.rightMargin = i11;
                    marginLayoutParams2.bottomMargin = i12;
                    ng0Var.c.setLayoutParams(marginLayoutParams2);
                }
                ng0Var.A.setPadding(i10, 0, i11, ng0Var.H);
                if (z10) {
                    m1Var = m1Var.a.m(0, 0, 0, ng0Var.H);
                }
                ng0Var.h0();
                ng0Var.g0();
                SparseArray sparseArray = ng0Var.a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    rg1 rg1Var = (rg1) sparseArray.valueAt(i13);
                    if (rg1Var != null && (fragmentView = rg1Var.a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                break;
        }
        return r0.m1.b;
    }

    @Override // of.u1
    public /* synthetic */ a0.h O() {
        return null;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        switch (this.a) {
            case 17:
                return ((o61) this.b).P(i9, view);
            case 18:
                final s91 s91Var = (s91) this.b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = s91Var.d0;
                x81 x81Var = s91Var.T;
                int i10 = x81Var.E;
                if (i9 < i10 || i9 > x81Var.F) {
                    int i11 = x81Var.Q;
                    if (i9 < i11 || i9 > x81Var.R) {
                        int i12 = x81Var.N;
                        if (i9 < i12 || i9 > x81Var.O) {
                            int i13 = x81Var.T;
                            if (i9 < i13 || i9 > x81Var.U) {
                                return false;
                            }
                            ((l91) s91Var.L.get(i9 - i13)).c(s91Var.a, s91Var, c2VarArr, true);
                        } else {
                            ((l91) s91Var.K.get(i9 - i12)).c(s91Var.a, s91Var, c2VarArr, true);
                        }
                    } else {
                        ((l91) s91Var.M.get(i9 - i11)).c(s91Var.a, s91Var, c2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((p91) s91Var.r0.get(i9 - i10)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(s91Var, view);
                    final int i14 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.n81
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    s91 s91Var2 = s91Var;
                                    s91Var2.getClass();
                                    s91Var2.presentFragment(new ti0(messageObject));
                                    break;
                                default:
                                    s91 s91Var3 = s91Var;
                                    s91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", s91Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    s91Var3.presentFragment(new qn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i15 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.n81
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    s91 s91Var2 = s91Var;
                                    s91Var2.getClass();
                                    s91Var2.presentFragment(new ti0(messageObject));
                                    break;
                                default:
                                    s91 s91Var3 = s91Var;
                                    s91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", s91Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    s91Var3.presentFragment(new qn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(s91Var.O.V0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((kd1) this.b).F.a(i9, view);
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void b() {
        switch (this.a) {
            case 6:
                ((iv0) this.b).e();
                break;
            default:
                ((dd1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.x51
    public void c(org.telegram.ui.Components.hz hzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.P8;
        hzVar.f(new org.telegram.ui.Components.iz(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        bx0 bx0Var = (bx0) this.b;
        if (!z10) {
            return true;
        }
        bx0Var.d.T((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // of.u1
    public void e(int i9) {
        pg1 pg1Var = (pg1) this.b;
        if (pg1Var.h == null && !pg1Var.f.e()) {
            pg1Var.v.f.e(false, true);
        }
        pg1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((ns0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.P4, photoViewer.y, photoViewer.r2, true);
                    photoViewer.F0(false, false);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
                ((xu0) this.b).finishFragment();
                break;
            case 5:
                ((ru0) this.b).a.N.r();
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i14 = PopupNotificationActivity.X;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 11:
                ((org.telegram.messenger.dk) this.b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((a11) this.b).b;
                ArrayList arrayList = proxyListActivity.D;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.b0(true);
                b11 b11Var = proxyListActivity.a;
                if (b11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i10 = proxyListActivity.useProxyRow;
                        b11Var.n(i10, 0);
                        b11 b11Var2 = proxyListActivity.a;
                        i11 = proxyListActivity.callsRow;
                        b11Var2.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((ma1) this.b).a;
                boolean j02 = ThemeActivity.j0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.X(themeActivity, 17, true)) {
                    j02 = true;
                }
                if (j02) {
                    xa1 xa1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    xa1Var.n(i12, new Object());
                    xa1 xa1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    xa1Var2.n(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.e6 N0 = org.telegram.ui.ActionBar.f6.N0("Blue");
                    org.telegram.ui.ActionBar.e6 A0 = org.telegram.ui.ActionBar.f6.A0();
                    SparseArray sparseArray = N0.W;
                    int i17 = org.telegram.ui.ActionBar.f6.n;
                    org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) sparseArray.get(i17);
                    if (d6Var != null) {
                        org.telegram.ui.ActionBar.y5 y5Var = new org.telegram.ui.ActionBar.y5();
                        y5Var.c = "d";
                        y5Var.a = "Blue_99_wp.jpg";
                        y5Var.b = "Blue_99_wp.jpg";
                        d6Var.y = y5Var;
                        N0.v(y5Var);
                    }
                    if (N0 == A0) {
                        if (N0.U == i17) {
                            org.telegram.ui.ActionBar.f6.o1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i17));
                            themeActivity.a.m(themeActivity.m0);
                            break;
                        }
                    } else {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.f6.t1(N0, true, false, true, false, false);
                        themeActivity.c.y1(N0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 21:
                oc1 oc1Var = ((rb1) this.b).a;
                org.telegram.ui.ActionBar.f6.j0(oc1Var.a0, oc1Var.s, true);
                org.telegram.ui.ActionBar.f6.o();
                org.telegram.ui.ActionBar.f6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, oc1Var.a0, Boolean.valueOf(oc1Var.b0), null, -1);
                oc1Var.finishFragment();
                break;
            default:
                ((yf1) this.b).a.D0(true);
                break;
        }
    }

    @Override // of.u1
    public /* synthetic */ boolean p0(int i9) {
        return true;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.V((PasskeysActivity) this.b, (org.telegram.ui.Components.l41) obj, (View) obj2);
                break;
            default:
                x21 x21Var = (x21) this.b;
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                y21 y21Var = x21Var.v;
                if (l41Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = x21Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = x21Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = x21Var.d;
                            if (tL_reportResultAddComment == null) {
                                y21.G(y21Var, l41Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    y21.G(y21Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(l41Var.d);
                            if (tL_messageReportOption != null) {
                                y21.G(y21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(l41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            y21.G(y21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // of.u1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.jh((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((uw0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.v0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_mini_lock3, 0);
                    eqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(eqVar, 0, 1, 33);
                    privacyControlActivity.v0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.v0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override // of.u1
    public /* synthetic */ void H0(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        fh.u2 u2Var = (fh.u2) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        u2Var.run();
    }
}
