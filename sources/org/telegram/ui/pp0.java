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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp0 implements org.telegram.ui.Cells.w5, org.telegram.ui.Components.q71, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.zl0, jg.e, hg.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pp0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        View fragmentView;
        switch (this.a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.o0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.jm0 jm0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(jm0Var, bVar.a, 0, bVar.c, 0);
                nw0 nw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                nw0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                ng0 ng0Var = (ng0) ((og1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i11 = defaultWindowInsets2.a;
                ng0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                ng0Var.N = i12;
                ng0Var.L = defaultWindowInsets2.d;
                View view2 = ng0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                ng0Var.y.setPadding(0, 0, 0, ng0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + ng0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ng0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    ng0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? ng0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ng0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    ng0Var.c.setLayoutParams(marginLayoutParams2);
                }
                ng0Var.E.setPadding(i11, 0, i12, ng0Var.L);
                if (z10) {
                    k1Var = k1Var.a.m(0, 0, 0, ng0Var.L);
                }
                ng0Var.i0();
                ng0Var.h0();
                SparseArray sparseArray = ng0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    mg1 mg1Var = (mg1) sparseArray.valueAt(i14);
                    if (mg1Var != null && (fragmentView = mg1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                break;
        }
        return r0.k1.b;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h G() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 16:
                break;
            case 17:
                final p91 p91Var = (p91) this.b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = p91Var.h0;
                u81 u81Var = p91Var.X;
                int i11 = u81Var.I;
                if (i10 < i11 || i10 > u81Var.J) {
                    int i12 = u81Var.U;
                    if (i10 < i12 || i10 > u81Var.V) {
                        int i13 = u81Var.R;
                        if (i10 < i13 || i10 > u81Var.S) {
                            int i14 = u81Var.X;
                            if (i10 >= i14 && i10 <= u81Var.Y) {
                                ((i91) p91Var.P.get(i10 - i14)).c(p91Var.a, p91Var, b2VarArr, true);
                            }
                        } else {
                            ((i91) p91Var.O.get(i10 - i13)).c(p91Var.a, p91Var, b2VarArr, true);
                        }
                    } else {
                        ((i91) p91Var.Q.get(i10 - i12)).c(p91Var.a, p91Var, b2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((m91) p91Var.v0.get(i10 - i11)).b;
                    if (!messageObject.isStory()) {
                        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(p91Var, view);
                        final int i15 = 0;
                        H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.k81
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        p91 p91Var2 = p91Var;
                                        p91Var2.getClass();
                                        p91Var2.presentFragment(new ui0(messageObject));
                                        break;
                                    default:
                                        p91 p91Var3 = p91Var;
                                        p91Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", p91Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        p91Var3.presentFragment(new qn(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        final int i16 = 1;
                        H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.k81
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i16) {
                                    case 0:
                                        p91 p91Var2 = p91Var;
                                        p91Var2.getClass();
                                        p91Var2.presentFragment(new ui0(messageObject));
                                        break;
                                    default:
                                        p91 p91Var3 = p91Var;
                                        p91Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", p91Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        p91Var3.presentFragment(new qn(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        H.W(p91Var.S.V0(view, false));
                        H.Z();
                    }
                }
                break;
            default:
                ((gd1) this.b).J.a(i10, view);
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void b() {
        switch (this.a) {
            case 5:
                ((qv0) this.b).e();
                break;
            default:
                ((yc1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.q71
    public void c(org.telegram.ui.Components.e00 e00Var) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        jx0 jx0Var = (jx0) this.b;
        if (!z10) {
            return true;
        }
        jx0Var.d.U((Long) a5Var.getTag(), a5Var);
        return true;
    }

    @Override // hg.z1
    public void f(int i10) {
        kg1 kg1Var = (kg1) this.b;
        if (kg1Var.h == null && !kg1Var.f.e()) {
            kg1Var.v.f.e(false, true);
        }
        kg1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 2:
                PhotoViewer photoViewer = ((ws0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.H0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ((fv0) this.b).finishFragment();
                break;
            case 4:
                ((zu0) this.b).a.R.s();
                break;
            case 6:
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
            case 10:
                ((org.telegram.messenger.gk) this.b).run(1);
                break;
            case 13:
                ProxyListActivity proxyListActivity = ((i11) this.b).b;
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
                j11 j11Var = proxyListActivity.a;
                if (j11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        j11Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 19:
                ThemeActivity themeActivity = ((ja1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    ua1 ua1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    ua1Var.n(i12, new Object());
                    ua1 ua1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    ua1Var2.n(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0("Blue");
                    org.telegram.ui.ActionBar.g6 B0 = org.telegram.ui.ActionBar.h6.B0();
                    SparseArray sparseArray = O0.a0;
                    int i17 = org.telegram.ui.ActionBar.h6.n;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(i17);
                    if (f6Var != null) {
                        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6();
                        a6Var.c = "d";
                        a6Var.a = "Blue_99_wp.jpg";
                        a6Var.b = "Blue_99_wp.jpg";
                        f6Var.y = a6Var;
                        O0.v(a6Var);
                    }
                    if (O0 == B0) {
                        if (O0.Y == i17) {
                            org.telegram.ui.ActionBar.h6.p1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, B0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i17));
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.h6.u1(O0, true, false, true, false, false);
                        themeActivity.c.z1(O0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 20:
                kc1 kc1Var = ((nb1) this.b).a;
                org.telegram.ui.ActionBar.h6.k0(kc1Var.e0, kc1Var.s, true);
                org.telegram.ui.ActionBar.h6.o();
                org.telegram.ui.ActionBar.h6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, kc1Var.e0, Boolean.valueOf(kc1Var.f0), null, -1);
                kc1Var.finishFragment();
                break;
            default:
                ((sf1) this.b).a.E0(true);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n21 n21Var = (n21) this.b;
        org.telegram.ui.Components.h61 h61Var = (org.telegram.ui.Components.h61) obj;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        o21 o21Var = n21Var.v;
        if (h61Var.a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = n21Var.b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(h61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    o21.I(o21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = n21Var.c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(h61Var.d);
                if (tL_messageReportOption != null) {
                    o21.I(o21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = n21Var.d;
            if (tL_reportResultAddComment == null) {
                o21.I(o21Var, h61Var.l, null, null);
                return;
            }
            byte[] bArr = tL_reportResultAddComment.option;
            if (bArr != null) {
                o21.I(o21Var, null, bArr, null);
            }
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.nh((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((cx0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.msg_mini_lock3, 0);
                    yqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(yqVar, 0, 1, 33);
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

    @Override // hg.z1
    public /* synthetic */ void S(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        hg.d1 d1Var = (hg.d1) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        d1Var.run();
    }
}
