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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.x61, org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.o1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.ll0, wf.e, uf.j1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // uf.j1
    public /* synthetic */ a0.h K() {
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
                org.telegram.ui.Components.tl0 tl0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.l0;
                AndroidUtilities.setViewLayoutMargins(tl0Var, bVar.a, 0, bVar.c, 0);
                qw0 qw0Var = premiumPreviewFragment.R;
                i0.b bVar2 = premiumPreviewFragment.l0;
                qw0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.G;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.l0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.l0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                wg0 wg0Var = (wg0) ((jh1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i11 = defaultWindowInsets2.a;
                wg0Var.J = i11;
                int i12 = defaultWindowInsets2.c;
                wg0Var.K = i12;
                wg0Var.I = defaultWindowInsets2.d;
                View view2 = wg0Var.y.b;
                boolean z4 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z4 ? AndroidUtilities.dp(44.0f) : 0;
                wg0Var.y.setPadding(0, 0, 0, wg0Var.I);
                int dp3 = AndroidUtilities.dp(72.0f) + wg0Var.I + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wg0Var.E.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    wg0Var.E.setLayoutParams(marginLayoutParams);
                }
                int i13 = z4 ? wg0Var.I + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) wg0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    wg0Var.c.setLayoutParams(marginLayoutParams2);
                }
                wg0Var.B.setPadding(i11, 0, i12, wg0Var.I);
                if (z4) {
                    m1Var = m1Var.a.m(0, 0, 0, wg0Var.I);
                }
                wg0Var.i0();
                wg0Var.h0();
                SparseArray sparseArray = wg0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    hh1 hh1Var = (hh1) sparseArray.valueAt(i14);
                    if (hh1Var != null && (fragmentView = hh1Var.a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                break;
        }
        return r0.m1.b;
    }

    @Override // uf.j1
    public /* synthetic */ boolean R(int i10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public void a() {
        switch (this.a) {
            case 6:
                ((tv0) this.b).e();
                break;
            default:
                ((ud1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.x61
    public void b(org.telegram.ui.Components.xz xzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.Q8;
        xzVar.f(new org.telegram.ui.Components.yz(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        nx0 nx0Var = (nx0) this.b;
        if (!z4) {
            return true;
        }
        nx0Var.d.U((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((f71) this.b).Q(i10, view);
            case 18:
                final ha1 ha1Var = (ha1) this.b;
                org.telegram.ui.ActionBar.d2[] d2VarArr = ha1Var.e0;
                m91 m91Var = ha1Var.U;
                int i11 = m91Var.F;
                if (i10 < i11 || i10 > m91Var.G) {
                    int i12 = m91Var.R;
                    if (i10 < i12 || i10 > m91Var.S) {
                        int i13 = m91Var.O;
                        if (i10 < i13 || i10 > m91Var.P) {
                            int i14 = m91Var.U;
                            if (i10 < i14 || i10 > m91Var.V) {
                                return false;
                            }
                            ((aa1) ha1Var.M.get(i10 - i14)).c(ha1Var.a, ha1Var, d2VarArr, true);
                        } else {
                            ((aa1) ha1Var.L.get(i10 - i13)).c(ha1Var.a, ha1Var, d2VarArr, true);
                        }
                    } else {
                        ((aa1) ha1Var.N.get(i10 - i12)).c(ha1Var.a, ha1Var, d2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((ea1) ha1Var.s0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(ha1Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.c91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ha1 ha1Var2 = ha1Var;
                                    ha1Var2.getClass();
                                    ha1Var2.presentFragment(new bj0(messageObject));
                                    break;
                                default:
                                    ha1 ha1Var3 = ha1Var;
                                    ha1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ha1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ha1Var3.presentFragment(new xn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.c91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    ha1 ha1Var2 = ha1Var;
                                    ha1Var2.getClass();
                                    ha1Var2.presentFragment(new bj0(messageObject));
                                    break;
                                default:
                                    ha1 ha1Var3 = ha1Var;
                                    ha1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ha1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ha1Var3.presentFragment(new xn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(ha1Var.P.V0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((be1) this.b).G.f(i10, view);
                return true;
        }
    }

    @Override // uf.j1
    public void g(int i10) {
        fh1 fh1Var = (fh1) this.b;
        if (fh1Var.h == null && !fh1Var.f.e()) {
            fh1Var.v.f.e(false, true);
        }
        fh1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((xs0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.Q4, photoViewer.y, photoViewer.s2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                ((hv0) this.b).finishFragment();
                break;
            case 5:
                ((bv0) this.b).a.O.r();
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 11:
                ((org.telegram.messenger.ok) this.b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((p11) this.b).b;
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
                q11 q11Var = proxyListActivity.a;
                if (q11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        q11Var.n(i11, 0);
                        q11 q11Var2 = proxyListActivity.a;
                        i12 = proxyListActivity.callsRow;
                        q11Var2.n(i12, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((bb1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    mb1 mb1Var = themeActivity.a;
                    i13 = themeActivity.textSizeRow;
                    mb1Var.n(i13, new Object());
                    mb1 mb1Var2 = themeActivity.a;
                    i14 = themeActivity.bubbleRadiusRow;
                    mb1Var2.n(i14, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.j6 N0 = org.telegram.ui.ActionBar.k6.N0("Blue");
                    org.telegram.ui.ActionBar.j6 A0 = org.telegram.ui.ActionBar.k6.A0();
                    SparseArray sparseArray = N0.X;
                    int i18 = org.telegram.ui.ActionBar.k6.n;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) sparseArray.get(i18);
                    if (i6Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.c = "d";
                        d6Var.a = "Blue_99_wp.jpg";
                        d6Var.b = "Blue_99_wp.jpg";
                        i6Var.y = d6Var;
                        N0.v(d6Var);
                    }
                    if (N0 == A0) {
                        if (N0.V == i18) {
                            org.telegram.ui.ActionBar.k6.o1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i18));
                            themeActivity.a.m(themeActivity.n0);
                            break;
                        }
                    } else {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.k6.t1(N0, true, false, true, false, false);
                        themeActivity.c.y1(N0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 21:
                ed1 ed1Var = ((gc1) this.b).a;
                org.telegram.ui.ActionBar.k6.j0(ed1Var.b0, ed1Var.s, true);
                org.telegram.ui.ActionBar.k6.o();
                org.telegram.ui.ActionBar.k6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ed1Var.b0, Boolean.valueOf(ed1Var.c0), null, -1);
                ed1Var.finishFragment();
                break;
            default:
                ((og1) this.b).a.E0(true);
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
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.j51) obj, (View) obj2);
                break;
            default:
                l31 l31Var = (l31) this.b;
                org.telegram.ui.Components.j51 j51Var = (org.telegram.ui.Components.j51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                m31 m31Var = l31Var.v;
                if (j51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = l31Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = l31Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = l31Var.d;
                            if (tL_reportResultAddComment == null) {
                                m31.G(m31Var, j51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    m31.G(m31Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(j51Var.d);
                            if (tL_messageReportOption != null) {
                                m31.G(m31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(j51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            m31.G(m31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // uf.j1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((gx0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.w0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
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

    @Override // uf.j1
    public /* synthetic */ void V(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        lh.l2 l2Var = (lh.l2) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        l2Var.run();
    }
}
