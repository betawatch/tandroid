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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements Utilities.Callback5, org.telegram.ui.Cells.w5, org.telegram.ui.Components.v61, org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.o1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.jl0, vf.e, tf.i1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h H0() {
        return null;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.l0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.l0.d);
                org.telegram.ui.Components.rl0 rl0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.l0;
                AndroidUtilities.setViewLayoutMargins(rl0Var, bVar.a, 0, bVar.c, 0);
                vw0 vw0Var = premiumPreviewFragment.R;
                i0.b bVar2 = premiumPreviewFragment.l0;
                vw0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.G;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.l0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.l0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                xg0 xg0Var = (xg0) ((ph1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i11 = defaultWindowInsets2.a;
                xg0Var.J = i11;
                int i12 = defaultWindowInsets2.c;
                xg0Var.K = i12;
                xg0Var.I = defaultWindowInsets2.d;
                View view2 = xg0Var.y.b;
                boolean z4 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z4 ? AndroidUtilities.dp(44.0f) : 0;
                xg0Var.y.setPadding(0, 0, 0, xg0Var.I);
                int dp3 = AndroidUtilities.dp(72.0f) + xg0Var.I + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xg0Var.E.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    xg0Var.E.setLayoutParams(marginLayoutParams);
                }
                int i13 = z4 ? xg0Var.I + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) xg0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    xg0Var.c.setLayoutParams(marginLayoutParams2);
                }
                xg0Var.B.setPadding(i11, 0, i12, xg0Var.I);
                if (z4) {
                    m1Var = m1Var.a.m(0, 0, 0, xg0Var.I);
                }
                xg0Var.i0();
                xg0Var.h0();
                SparseArray sparseArray = xg0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    nh1 nh1Var = (nh1) sparseArray.valueAt(i14);
                    if (nh1Var != null && (fragmentView = nh1Var.a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                break;
        }
        return r0.m1.b;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public void a() {
        switch (this.a) {
            case 6:
                ((yv0) this.b).e();
                break;
            default:
                ((yd1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void b(org.telegram.ui.Components.vz vzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.Q8;
        vzVar.f(new org.telegram.ui.Components.wz(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z4) {
        sx0 sx0Var = (sx0) this.b;
        if (!z4) {
            return true;
        }
        sx0Var.d.U((Long) a5Var.getTag(), a5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((l71) this.b).Q(i10, view);
            case 18:
                final oa1 oa1Var = (oa1) this.b;
                org.telegram.ui.ActionBar.d2[] d2VarArr = oa1Var.e0;
                t91 t91Var = oa1Var.U;
                int i11 = t91Var.F;
                if (i10 < i11 || i10 > t91Var.G) {
                    int i12 = t91Var.R;
                    if (i10 < i12 || i10 > t91Var.S) {
                        int i13 = t91Var.O;
                        if (i10 < i13 || i10 > t91Var.P) {
                            int i14 = t91Var.U;
                            if (i10 < i14 || i10 > t91Var.V) {
                                return false;
                            }
                            ((ha1) oa1Var.M.get(i10 - i14)).c(oa1Var.a, oa1Var, d2VarArr, true);
                        } else {
                            ((ha1) oa1Var.L.get(i10 - i13)).c(oa1Var.a, oa1Var, d2VarArr, true);
                        }
                    } else {
                        ((ha1) oa1Var.N.get(i10 - i12)).c(oa1Var.a, oa1Var, d2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((la1) oa1Var.s0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(oa1Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.j91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    oa1 oa1Var2 = oa1Var;
                                    oa1Var2.getClass();
                                    oa1Var2.presentFragment(new cj0(messageObject));
                                    break;
                                default:
                                    oa1 oa1Var3 = oa1Var;
                                    oa1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", oa1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    oa1Var3.presentFragment(new zn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.j91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    oa1 oa1Var2 = oa1Var;
                                    oa1Var2.getClass();
                                    oa1Var2.presentFragment(new cj0(messageObject));
                                    break;
                                default:
                                    oa1 oa1Var3 = oa1Var;
                                    oa1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", oa1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    oa1Var3.presentFragment(new zn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(oa1Var.P.U0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((ge1) this.b).G.d(i10, view);
                return true;
        }
    }

    @Override // tf.i1
    public void k(int i10) {
        lh1 lh1Var = (lh1) this.b;
        if (lh1Var.h == null && !lh1Var.f.e()) {
            lh1Var.v.f.e(false, true);
        }
        lh1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((ct0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.Q4, photoViewer.y, photoViewer.s2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((mv0) this.b).finishFragment();
                break;
            case 5:
                ((gv0) this.b).a.O.r();
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i15 = PopupNotificationActivity.Y;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 11:
                ((org.telegram.messenger.ok) this.b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((t11) this.b).b;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i17 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i17);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i17, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i17);
                proxyListActivity.c0(true);
                u11 u11Var = proxyListActivity.a;
                if (u11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        u11Var.n(i11, 0);
                        u11 u11Var2 = proxyListActivity.a;
                        i12 = proxyListActivity.callsRow;
                        u11Var2.n(i12, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((ib1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    tb1 tb1Var = themeActivity.a;
                    i13 = themeActivity.textSizeRow;
                    tb1Var.n(i13, new Object());
                    tb1 tb1Var2 = themeActivity.a;
                    i14 = themeActivity.bubbleRadiusRow;
                    tb1Var2.n(i14, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.X;
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
                        if (N0.V == i18) {
                            org.telegram.ui.ActionBar.j6.o1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i18));
                            themeActivity.a.m(themeActivity.n0);
                            break;
                        }
                    } else {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.c.x1(N0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 21:
                jd1 jd1Var = ((mc1) this.b).a;
                org.telegram.ui.ActionBar.j6.j0(jd1Var.b0, jd1Var.s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, jd1Var.b0, Boolean.valueOf(jd1Var.c0), null, -1);
                jd1Var.finishFragment();
                break;
            default:
                ((ug1) this.b).a.E0(true);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.i51) obj, (View) obj2);
                break;
            default:
                p31 p31Var = (p31) this.b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                q31 q31Var = p31Var.v;
                if (i51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p31Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p31Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = p31Var.d;
                            if (tL_reportResultAddComment == null) {
                                q31.G(q31Var, i51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    q31.G(q31Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(i51Var.d);
                            if (tL_messageReportOption != null) {
                                q31.G(q31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(i51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            q31.G(q31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // tf.i1
    public /* synthetic */ boolean t1(int i10) {
        return true;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((lx0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.w0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.msg_mini_lock3, 0);
                    lqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(lqVar, 0, 1, 33);
                    privacyControlActivity.w0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.w0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override // tf.i1
    public /* synthetic */ void J1(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        kh.l2 l2Var = (kh.l2) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        l2Var.run();
    }
}
