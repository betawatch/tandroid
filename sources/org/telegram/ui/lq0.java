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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq0 implements org.telegram.ui.Cells.x5, org.telegram.ui.Components.x71, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.l2, org.telegram.ui.Components.cm0, jg.e, hg.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // hg.z1
    public /* synthetic */ boolean E0(int i10) {
        return true;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        View fragmentView;
        switch (this.a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.o0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(mm0Var, bVar.a, 0, bVar.c, 0);
                px0 px0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                px0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                jh0 jh0Var = (jh0) ((ji1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i11 = defaultWindowInsets2.a;
                jh0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                jh0Var.N = i12;
                jh0Var.L = defaultWindowInsets2.d;
                View view2 = jh0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                jh0Var.y.setPadding(0, 0, 0, jh0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + jh0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    jh0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? jh0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) jh0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    jh0Var.c.setLayoutParams(marginLayoutParams2);
                }
                jh0Var.E.setPadding(i11, 0, i12, jh0Var.L);
                if (z10) {
                    l1Var = l1Var.a.m(0, 0, 0, jh0Var.L);
                }
                jh0Var.i0();
                jh0Var.h0();
                SparseArray sparseArray = jh0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    hi1 hi1Var = (hi1) sparseArray.valueAt(i14);
                    if (hi1Var != null && (fragmentView = hi1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 16:
                break;
            case 17:
                final hb1 hb1Var = (hb1) this.b;
                org.telegram.ui.ActionBar.a2[] a2VarArr = hb1Var.h0;
                ma1 ma1Var = hb1Var.X;
                int i11 = ma1Var.I;
                if (i10 < i11 || i10 > ma1Var.J) {
                    int i12 = ma1Var.U;
                    if (i10 < i12 || i10 > ma1Var.V) {
                        int i13 = ma1Var.R;
                        if (i10 < i13 || i10 > ma1Var.S) {
                            int i14 = ma1Var.X;
                            if (i10 >= i14 && i10 <= ma1Var.Y) {
                                ((ab1) hb1Var.P.get(i10 - i14)).c(hb1Var.a, hb1Var, a2VarArr, true);
                            }
                        } else {
                            ((ab1) hb1Var.O.get(i10 - i13)).c(hb1Var.a, hb1Var, a2VarArr, true);
                        }
                    } else {
                        ((ab1) hb1Var.Q.get(i10 - i12)).c(hb1Var.a, hb1Var, a2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((eb1) hb1Var.v0.get(i10 - i11)).b;
                    if (!messageObject.isStory()) {
                        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(hb1Var, view);
                        final int i15 = 0;
                        H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.ca1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        hb1 hb1Var2 = hb1Var;
                                        hb1Var2.getClass();
                                        hb1Var2.presentFragment(new pj0(messageObject));
                                        break;
                                    default:
                                        hb1 hb1Var3 = hb1Var;
                                        hb1Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", hb1Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        hb1Var3.presentFragment(new fo(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        final int i16 = 1;
                        H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.ca1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i16) {
                                    case 0:
                                        hb1 hb1Var2 = hb1Var;
                                        hb1Var2.getClass();
                                        hb1Var2.presentFragment(new pj0(messageObject));
                                        break;
                                    default:
                                        hb1 hb1Var3 = hb1Var;
                                        hb1Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", hb1Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        hb1Var3.presentFragment(new fo(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        H.W(hb1Var.S.V0(view, false));
                        H.Z();
                    }
                }
                break;
            default:
                ((ze1) this.b).J.a(i10, view);
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void b() {
        switch (this.a) {
            case 5:
                ((rw0) this.b).e();
                break;
            default:
                ((re1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void c(org.telegram.ui.Components.h00 h00Var) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        h00Var.f(new org.telegram.ui.Components.i00(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        ly0 ly0Var = (ly0) this.b;
        if (!z10) {
            return true;
        }
        ly0Var.d.U((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // hg.z1
    public void f(int i10) {
        ei1 ei1Var = (ei1) this.b;
        if (ei1Var.h == null && !ei1Var.f.e()) {
            ei1Var.v.f.e(false, true);
        }
        ei1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 2:
                PhotoViewer photoViewer = ((wt0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ((fw0) this.b).finishFragment();
                break;
            case 4:
                ((zv0) this.b).a.R.s();
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
                ((org.telegram.messenger.mk) this.b).run(1);
                break;
            case 13:
                ProxyListActivity proxyListActivity = ((l21) this.b).b;
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
                m21 m21Var = proxyListActivity.a;
                if (m21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        m21Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 19:
                ThemeActivity themeActivity = ((bc1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    mc1 mc1Var = themeActivity.a;
                    i12 = themeActivity.textSizeRow;
                    mc1Var.n(i12, new Object());
                    mc1 mc1Var2 = themeActivity.a;
                    i13 = themeActivity.bubbleRadiusRow;
                    mc1Var2.n(i13, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.f6 O0 = org.telegram.ui.ActionBar.g6.O0("Blue");
                    org.telegram.ui.ActionBar.f6 B0 = org.telegram.ui.ActionBar.g6.B0();
                    SparseArray sparseArray = O0.a0;
                    int i17 = org.telegram.ui.ActionBar.g6.n;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(i17);
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.c = "d";
                        z5Var.a = "Blue_99_wp.jpg";
                        z5Var.b = "Blue_99_wp.jpg";
                        e6Var.y = z5Var;
                        O0.v(z5Var);
                    }
                    if (O0 == B0) {
                        if (O0.Y == i17) {
                            org.telegram.ui.ActionBar.g6.p1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, B0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i17));
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.g6.u1(O0, true, false, true, false, false);
                        themeActivity.c.z1(O0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 20:
                ce1 ce1Var = ((fd1) this.b).a;
                org.telegram.ui.ActionBar.g6.k0(ce1Var.e0, ce1Var.s, true);
                org.telegram.ui.ActionBar.g6.o();
                org.telegram.ui.ActionBar.g6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ce1Var.e0, Boolean.valueOf(ce1Var.f0), null, -1);
                ce1Var.finishFragment();
                break;
            default:
                ((mh1) this.b).a.E0(true);
                break;
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h k0() {
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h41 h41Var = (h41) this.b;
        org.telegram.ui.Components.m61 m61Var = (org.telegram.ui.Components.m61) obj;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        i41 i41Var = h41Var.v;
        if (m61Var.a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = h41Var.b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(m61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    i41.I(i41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = h41Var.c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(m61Var.d);
                if (tL_messageReportOption != null) {
                    i41.I(i41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = h41Var.d;
            if (tL_reportResultAddComment == null) {
                i41.I(i41Var, m61Var.l, null, null);
                return;
            }
            byte[] bArr = tL_reportResultAddComment.option;
            if (bArr != null) {
                i41.I(i41Var, null, bArr, null);
            }
        }
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ey0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.msg_mini_lock3, 0);
                    brVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(brVar, 0, 1, 33);
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
    public /* synthetic */ void O0(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        hg.d1 d1Var = (hg.d1) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        d1Var.run();
    }
}
