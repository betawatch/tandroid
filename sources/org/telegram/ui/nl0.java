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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, org.telegram.ui.Cells.w5, org.telegram.ui.Components.u61, org.telegram.ui.ActionBar.n1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.cl0, ig.e, gg.b2 {
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
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.o0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.ml0 ml0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(ml0Var, bVar.a, 0, bVar.c, 0);
                lx0 lx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                lx0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                gh0 gh0Var = (gh0) ((ai1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i11 = defaultWindowInsets2.a;
                gh0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                gh0Var.N = i12;
                gh0Var.L = defaultWindowInsets2.d;
                View view2 = gh0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                gh0Var.y.setPadding(0, 0, 0, gh0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + gh0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    gh0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? gh0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) gh0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    gh0Var.c.setLayoutParams(marginLayoutParams2);
                }
                gh0Var.E.setPadding(i11, 0, i12, gh0Var.L);
                if (z10) {
                    l1Var = l1Var.a.m(0, 0, 0, gh0Var.L);
                }
                gh0Var.i0();
                gh0Var.h0();
                SparseArray sparseArray = gh0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    yh1 yh1Var = (yh1) sparseArray.valueAt(i14);
                    if (yh1Var != null && (fragmentView = yh1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void a() {
        switch (this.a) {
            case 7:
                ((ow0) this.b).e();
                break;
            default:
                ((me1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.u61
    public void b(org.telegram.ui.Components.vz vzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        vzVar.f(new org.telegram.ui.Components.wz(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        hy0 hy0Var = (hy0) this.b;
        if (!z10) {
            return true;
        }
        hy0Var.d.U((Long) a5Var.getTag(), a5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 18:
                return ((v71) this.b).Q(i10, view);
            case 19:
                final ab1 ab1Var = (ab1) this.b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = ab1Var.h0;
                fa1 fa1Var = ab1Var.X;
                int i11 = fa1Var.I;
                if (i10 < i11 || i10 > fa1Var.J) {
                    int i12 = fa1Var.U;
                    if (i10 < i12 || i10 > fa1Var.V) {
                        int i13 = fa1Var.R;
                        if (i10 < i13 || i10 > fa1Var.S) {
                            int i14 = fa1Var.X;
                            if (i10 < i14 || i10 > fa1Var.Y) {
                                return false;
                            }
                            ((ta1) ab1Var.P.get(i10 - i14)).c(ab1Var.a, ab1Var, c2VarArr, true);
                        } else {
                            ((ta1) ab1Var.O.get(i10 - i13)).c(ab1Var.a, ab1Var, c2VarArr, true);
                        }
                    } else {
                        ((ta1) ab1Var.Q.get(i10 - i12)).c(ab1Var.a, ab1Var, c2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((xa1) ab1Var.v0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(ab1Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.v91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ab1 ab1Var2 = ab1Var;
                                    ab1Var2.getClass();
                                    ab1Var2.presentFragment(new lj0(messageObject));
                                    break;
                                default:
                                    ab1 ab1Var3 = ab1Var;
                                    ab1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ab1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ab1Var3.presentFragment(new bo(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.v91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    ab1 ab1Var2 = ab1Var;
                                    ab1Var2.getClass();
                                    ab1Var2.presentFragment(new lj0(messageObject));
                                    break;
                                default:
                                    ab1 ab1Var3 = ab1Var;
                                    ab1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ab1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ab1Var3.presentFragment(new bo(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(ab1Var.S.W0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((ue1) this.b).J.d(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
                        if (childAt instanceof org.telegram.ui.Cells.ea) {
                            ((org.telegram.ui.Cells.ea) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
                        } else {
                            i14++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                break;
            case 4:
                PhotoViewer photoViewer = ((st0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((cw0) this.b).finishFragment();
                break;
            case 6:
                ((wv0) this.b).a.R.r();
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 12:
                ((org.telegram.messenger.nk) this.b).run(1);
                break;
            case 15:
                ProxyListActivity proxyListActivity = ((f21) this.b).b;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i17 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i17);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i17, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i17);
                proxyListActivity.b0(true);
                g21 g21Var = proxyListActivity.a;
                if (g21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        g21Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 21:
                ThemeActivity themeActivity = ((wb1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    hc1 hc1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    hc1Var.n(i12, new Object());
                    hc1 hc1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    hc1Var2.n(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.a0;
                    int i18 = org.telegram.ui.ActionBar.j6.n;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(i18);
                    if (h6Var != null) {
                        org.telegram.ui.ActionBar.c6 c6Var = new org.telegram.ui.ActionBar.c6();
                        c6Var.c = "d";
                        c6Var.a = "Blue_99_wp.jpg";
                        c6Var.b = "Blue_99_wp.jpg";
                        h6Var.y = c6Var;
                        N0.v(c6Var);
                    }
                    if (N0 == A0) {
                        if (N0.Y == i18) {
                            org.telegram.ui.ActionBar.j6.o1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i18));
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.c.z1(N0);
                        themeActivity.c.y0(0);
                        break;
                    }
                }
                break;
            case 22:
                xd1 xd1Var = ((ad1) this.b).a;
                org.telegram.ui.ActionBar.j6.j0(xd1Var.e0, xd1Var.s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, xd1Var.e0, Boolean.valueOf(xd1Var.f0), null, -1);
                xd1Var.finishFragment();
                break;
            default:
                ((gh1) this.b).a.E0(true);
                break;
        }
    }

    @Override // gg.b2
    public void h(int i10) {
        wh1 wh1Var = (wh1) this.b;
        if (wh1Var.h == null && !wh1Var.f.e()) {
            wh1Var.v.f.e(false, true);
        }
        wh1Var.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 1:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.j51) obj, (View) obj2);
                break;
            default:
                c41 c41Var = (c41) this.b;
                org.telegram.ui.Components.j51 j51Var = (org.telegram.ui.Components.j51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                d41 d41Var = c41Var.v;
                if (j51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = c41Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = c41Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = c41Var.d;
                            if (tL_reportResultAddComment == null) {
                                d41.H(d41Var, j51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    d41.H(d41Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(j51Var.d);
                            if (tL_messageReportOption != null) {
                                d41.H(d41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(j51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            d41.H(d41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.b, j3, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ay0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
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
