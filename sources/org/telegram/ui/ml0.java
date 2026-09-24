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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.h71, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.l2, org.telegram.ui.Components.ml0, ig.e, gg.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ml0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
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
                org.telegram.ui.Components.wl0 wl0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(wl0Var, bVar.a, 0, bVar.c, 0);
                ax0 ax0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                ax0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                yg0 yg0Var = (yg0) ((th1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i11 = defaultWindowInsets2.a;
                yg0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                yg0Var.N = i12;
                yg0Var.L = defaultWindowInsets2.d;
                View view2 = yg0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                yg0Var.y.setPadding(0, 0, 0, yg0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + yg0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yg0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    yg0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? yg0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) yg0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    yg0Var.c.setLayoutParams(marginLayoutParams2);
                }
                yg0Var.E.setPadding(i11, 0, i12, yg0Var.L);
                if (z10) {
                    l1Var = l1Var.a.m(0, 0, 0, yg0Var.L);
                }
                yg0Var.i0();
                yg0Var.h0();
                SparseArray sparseArray = yg0Var.a;
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

    @Override // gg.b2
    public void a(int i10) {
        ph1 ph1Var = (ph1) this.b;
        if (ph1Var.h == null && !ph1Var.f.e()) {
            ph1Var.v.f.e(false, true);
        }
        ph1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void b() {
        switch (this.a) {
            case 6:
                ((dw0) this.b).e();
                break;
            default:
                ((de1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.h71
    public void c(org.telegram.ui.Components.wz wzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        wzVar.f(new org.telegram.ui.Components.xz(savedFilterState));
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((n71) this.b).Q(i10, view);
            case 18:
                final sa1 sa1Var = (sa1) this.b;
                org.telegram.ui.ActionBar.a2[] a2VarArr = sa1Var.h0;
                x91 x91Var = sa1Var.X;
                int i11 = x91Var.I;
                if (i10 < i11 || i10 > x91Var.J) {
                    int i12 = x91Var.U;
                    if (i10 < i12 || i10 > x91Var.V) {
                        int i13 = x91Var.R;
                        if (i10 < i13 || i10 > x91Var.S) {
                            int i14 = x91Var.X;
                            if (i10 < i14 || i10 > x91Var.Y) {
                                return false;
                            }
                            ((la1) sa1Var.P.get(i10 - i14)).c(sa1Var.a, sa1Var, a2VarArr, true);
                        } else {
                            ((la1) sa1Var.O.get(i10 - i13)).c(sa1Var.a, sa1Var, a2VarArr, true);
                        }
                    } else {
                        ((la1) sa1Var.Q.get(i10 - i12)).c(sa1Var.a, sa1Var, a2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((pa1) sa1Var.v0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(sa1Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.n91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    sa1 sa1Var2 = sa1Var;
                                    sa1Var2.getClass();
                                    sa1Var2.presentFragment(new ej0(messageObject));
                                    break;
                                default:
                                    sa1 sa1Var3 = sa1Var;
                                    sa1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", sa1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    sa1Var3.presentFragment(new wn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.n91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    sa1 sa1Var2 = sa1Var;
                                    sa1Var2.getClass();
                                    sa1Var2.presentFragment(new ej0(messageObject));
                                    break;
                                default:
                                    sa1 sa1Var3 = sa1Var;
                                    sa1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", sa1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    sa1Var3.presentFragment(new wn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(sa1Var.S.V0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((le1) this.b).J.d(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        xx0 xx0Var = (xx0) this.b;
        if (!z10) {
            return true;
        }
        xx0Var.d.U((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((it0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((rv0) this.b).finishFragment();
                break;
            case 5:
                ((lv0) this.b).a.R.r();
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
                ((org.telegram.messenger.lk) this.b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((v11) this.b).b;
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
                w11 w11Var = proxyListActivity.a;
                if (w11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        w11Var.n(i11, 0);
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
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.c = "d";
                        z5Var.a = "Blue_99_wp.jpg";
                        z5Var.b = "Blue_99_wp.jpg";
                        f6Var.y = z5Var;
                        N0.v(z5Var);
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
    public /* synthetic */ a0.i i() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i o() {
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.v51) obj, (View) obj2);
                break;
            default:
                s31 s31Var = (s31) this.b;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                t31 t31Var = s31Var.v;
                if (v51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = s31Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = s31Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = s31Var.d;
                            if (tL_reportResultAddComment == null) {
                                t31.H(t31Var, v51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    t31.H(t31Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(v51Var.d);
                            if (tL_messageReportOption != null) {
                                t31.H(t31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(v51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            t31.H(t31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // gg.b2
    public /* synthetic */ boolean s(int i10) {
        return true;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.b, j3, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((qx0) this.b).d;
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
    public /* synthetic */ void F(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        gg.e1 e1Var = (gg.e1) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        e1Var.run();
    }
}
