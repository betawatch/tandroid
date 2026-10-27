package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, org.telegram.ui.Cells.b6, org.telegram.ui.Components.h81, org.telegram.ui.ActionBar.n1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.e5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.q2, org.telegram.ui.Components.cm0, kg.f, ig.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        View fragmentView;
        switch (this.a) {
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.o0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.nm0 nm0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(nm0Var, bVar.a, 0, bVar.c, 0);
                xw0 xw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                xw0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                rg0 rg0Var = (rg0) ((wg1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i11 = defaultWindowInsets2.a;
                rg0Var.L = i11;
                int i12 = defaultWindowInsets2.c;
                rg0Var.M = i12;
                rg0Var.K = defaultWindowInsets2.d;
                View view2 = rg0Var.x.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                rg0Var.x.setPadding(0, 0, 0, rg0Var.K);
                int dp3 = AndroidUtilities.dp(72.0f) + rg0Var.K + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rg0Var.G.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    rg0Var.G.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? rg0Var.K + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) rg0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    rg0Var.c.setLayoutParams(marginLayoutParams2);
                }
                rg0Var.y.setPadding(i11, 0, i12, rg0Var.K);
                if (z10) {
                    k1Var = k1Var.a.m(0, 0, 0, rg0Var.K);
                }
                rg0Var.f0();
                rg0Var.e0();
                SparseArray sparseArray = rg0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ug1 ug1Var = (ug1) sparseArray.valueAt(i14);
                    if (ug1Var != null && (fragmentView = ug1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                break;
        }
        return r0.k1.b;
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void a() {
        switch (this.a) {
            case 7:
                ((zv0) this.b).e();
                break;
            default:
                ((kd1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.e5
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        tx0 tx0Var = (tx0) this.b;
        if (!z10) {
            return true;
        }
        tx0Var.d.V((Long) f5Var.getTag(), f5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        switch (this.a) {
            case 18:
                return ((s61) this.b).Q(i10, view);
            default:
                ((rd1) this.b).J.c(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.h81
    public void d(org.telegram.ui.Components.e00 e00Var) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00(savedFilterState));
    }

    public void e(String str) {
        WidgetConformanceActivity widgetConformanceActivity = (WidgetConformanceActivity) this.b;
        widgetConformanceActivity.a.append(str + "\n");
        widgetConformanceActivity.b.post(new xh1(widgetConformanceActivity, 3));
    }

    @Override // ig.z1
    public void f(int i10) {
        sg1 sg1Var = (sg1) this.b;
        if (sg1Var.h == null && !sg1Var.f.e()) {
            sg1Var.v.f.e(false, true);
        }
        sg1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.c.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.ga) {
                            org.telegram.ui.ActionBar.f7.V(((org.telegram.ui.Cells.ga) childAt).getTextView(), org.telegram.ui.ActionBar.y6.E6, null);
                        } else {
                            i14++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                break;
            case 4:
                PhotoViewer photoViewer = ((ft0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.H0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((ov0) this.b).finishFragment();
                break;
            case 6:
                ((iv0) this.b).a.R.r();
                break;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i15 = PopupNotificationActivity.b0;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 12:
                org.telegram.messenger.lk lkVar = (org.telegram.messenger.lk) this.b;
                int i16 = ProfileActivity.R6;
                lkVar.run(1);
                break;
            case 15:
                ProxyListActivity proxyListActivity = ((s11) this.b).b;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj = arrayList.get(i17);
                    i17++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i18 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i18);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i18, new Object[0]);
                NotificationCenter.getGlobalInstance().addWeakObserver(proxyListActivity, i18);
                proxyListActivity.d0(true);
                t11 t11Var = proxyListActivity.a;
                if (t11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        t11Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((sa1) this.b).a;
                boolean l02 = ThemeActivity.l0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Z(themeActivity, 17, true)) {
                    l02 = true;
                }
                if (l02) {
                    db1 db1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    db1Var.n(i12, new Object());
                    db1 db1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    db1Var2.n(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0("Blue");
                    org.telegram.ui.ActionBar.x6 C0 = org.telegram.ui.ActionBar.y6.C0();
                    SparseArray sparseArray = P0.a0;
                    int i19 = org.telegram.ui.ActionBar.y6.n;
                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) sparseArray.get(i19);
                    if (w6Var != null) {
                        org.telegram.ui.ActionBar.r6 r6Var = new org.telegram.ui.ActionBar.r6();
                        r6Var.c = "d";
                        r6Var.a = "Blue_99_wp.jpg";
                        r6Var.b = "Blue_99_wp.jpg";
                        w6Var.y = r6Var;
                        P0.v(r6Var);
                    }
                    if (P0 == C0) {
                        if (P0.Y == i19) {
                            org.telegram.ui.ActionBar.y6.r1(true);
                            break;
                        } else {
                            org.telegram.ui.ActionBar.y6.H1(C0, themeActivity.f == 1, i19, null);
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        P0.u(i19);
                        org.telegram.ui.ActionBar.y6.w1(P0, true, false, true, false, false);
                        themeActivity.c.E1(P0, null);
                        themeActivity.c.y0(0);
                        break;
                    }
                }
                break;
            case 21:
                vc1 vc1Var = ((xb1) this.b).a;
                org.telegram.ui.ActionBar.y6.k0(vc1Var.f0, vc1Var.v, true);
                org.telegram.ui.ActionBar.y6.o();
                org.telegram.ui.ActionBar.y6.q1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, vc1Var.f0, Boolean.valueOf(vc1Var.g0), null, -1);
                vc1Var.finishFragment();
                break;
            default:
                ((dg1) this.b).a.F0(true);
                break;
        }
    }

    @Override // ig.z1
    public /* synthetic */ boolean k0(int i10) {
        return true;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 1:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.X((PasskeysActivity) this.b, (org.telegram.ui.Components.u61) obj, (View) obj2);
                break;
            default:
                w21 w21Var = (w21) this.b;
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                x21 x21Var = w21Var.v;
                if (u61Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = w21Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = w21Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = w21Var.d;
                            if (tL_reportResultAddComment == null) {
                                x21.J(x21Var, u61Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    x21.J(x21Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(u61Var.d);
                            if (tL_messageReportOption != null) {
                                x21.J(x21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(u61Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            x21.J(x21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((mx0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.y0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.msg_mini_lock3, 0);
                    zqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(zqVar, 0, 1, 33);
                    privacyControlActivity.y0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.y0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override // ig.z1
    public /* synthetic */ void p0(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        ig.d1 d1Var = (ig.d1) this.b;
        int i10 = ProfileActivity.R6;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        d1Var.run();
    }
}
