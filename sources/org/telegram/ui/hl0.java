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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, org.telegram.ui.Cells.b6, org.telegram.ui.Components.g81, org.telegram.ui.ActionBar.n1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.e5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.q2, org.telegram.ui.Components.bm0, kg.f, ig.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hl0(Object obj, int i10) {
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
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(mm0Var, bVar.a, 0, bVar.c, 0);
                vw0 vw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                vw0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                pg0 pg0Var = (pg0) ((ug1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i11 = defaultWindowInsets2.a;
                pg0Var.L = i11;
                int i12 = defaultWindowInsets2.c;
                pg0Var.M = i12;
                pg0Var.K = defaultWindowInsets2.d;
                View view2 = pg0Var.x.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                pg0Var.x.setPadding(0, 0, 0, pg0Var.K);
                int dp3 = AndroidUtilities.dp(72.0f) + pg0Var.K + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pg0Var.G.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    pg0Var.G.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? pg0Var.K + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) pg0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    pg0Var.c.setLayoutParams(marginLayoutParams2);
                }
                pg0Var.y.setPadding(i11, 0, i12, pg0Var.K);
                if (z10) {
                    k1Var = k1Var.a.m(0, 0, 0, pg0Var.K);
                }
                pg0Var.f0();
                pg0Var.e0();
                SparseArray sparseArray = pg0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    sg1 sg1Var = (sg1) sparseArray.valueAt(i14);
                    if (sg1Var != null && (fragmentView = sg1Var.a.getFragmentView()) != null) {
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
                ((xv0) this.b).e();
                break;
            default:
                ((id1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.e5
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        rx0 rx0Var = (rx0) this.b;
        if (!z10) {
            return true;
        }
        rx0Var.d.V((Long) f5Var.getTag(), f5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        switch (this.a) {
            case 18:
                return ((p61) this.b).Q(i10, view);
            default:
                ((pd1) this.b).J.c(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.g81
    public void d(org.telegram.ui.Components.e00 e00Var) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00(savedFilterState));
    }

    public void e(String str) {
        WidgetConformanceActivity widgetConformanceActivity = (WidgetConformanceActivity) this.b;
        widgetConformanceActivity.a.append(str + "\n");
        widgetConformanceActivity.b.post(new vh1(widgetConformanceActivity, 3));
    }

    @Override // ig.z1
    public void f(int i10) {
        qg1 qg1Var = (qg1) this.b;
        if (qg1Var.h == null && !qg1Var.f.e()) {
            qg1Var.v.f.e(false, true);
        }
        qg1Var.l();
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
                PhotoViewer photoViewer = ((dt0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.H0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((mv0) this.b).finishFragment();
                break;
            case 6:
                ((gv0) this.b).a.R.r();
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
                org.telegram.messenger.kk kkVar = (org.telegram.messenger.kk) this.b;
                int i16 = ProfileActivity.R6;
                kkVar.run(1);
                break;
            case 15:
                ProxyListActivity proxyListActivity = ((q11) this.b).b;
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
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i18);
                proxyListActivity.d0(true);
                r11 r11Var = proxyListActivity.a;
                if (r11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        r11Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((qa1) this.b).a;
                boolean l02 = ThemeActivity.l0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Z(themeActivity, 17, true)) {
                    l02 = true;
                }
                if (l02) {
                    bb1 bb1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    bb1Var.n(i12, new Object());
                    bb1 bb1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    bb1Var2.n(i13, new Object());
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
                tc1 tc1Var = ((vb1) this.b).a;
                org.telegram.ui.ActionBar.y6.k0(tc1Var.f0, tc1Var.v, true);
                org.telegram.ui.ActionBar.y6.o();
                org.telegram.ui.ActionBar.y6.q1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, tc1Var.f0, Boolean.valueOf(tc1Var.g0), null, -1);
                tc1Var.finishFragment();
                break;
            default:
                ((bg1) this.b).a.F0(true);
                break;
        }
    }

    @Override // ig.z1
    public /* synthetic */ boolean k0(int i10) {
        return true;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.b, j10, 1));
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
                PasskeysActivity.X((PasskeysActivity) this.b, (org.telegram.ui.Components.t61) obj, (View) obj2);
                break;
            default:
                u21 u21Var = (u21) this.b;
                org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                v21 v21Var = u21Var.v;
                if (t61Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = u21Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = u21Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = u21Var.d;
                            if (tL_reportResultAddComment == null) {
                                v21.J(v21Var, t61Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    v21.J(v21Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(t61Var.d);
                            if (tL_messageReportOption != null) {
                                v21.J(v21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(t61Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            v21.J(v21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
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
        PrivacyControlActivity privacyControlActivity = ((kx0) this.b).d;
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
