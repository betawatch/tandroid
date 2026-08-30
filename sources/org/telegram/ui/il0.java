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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.v61, org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.o1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.kl0, vf.e, tf.j1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ il0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // tf.j1
    public /* synthetic */ a0.h I() {
        return null;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.l0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.l0.d);
                org.telegram.ui.Components.sl0 sl0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.l0;
                AndroidUtilities.setViewLayoutMargins(sl0Var, bVar.a, 0, bVar.c, 0);
                ow0 ow0Var = premiumPreviewFragment.R;
                i0.b bVar2 = premiumPreviewFragment.l0;
                ow0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.G;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.l0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.l0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                vg0 vg0Var = (vg0) ((hh1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i11 = defaultWindowInsets2.a;
                vg0Var.J = i11;
                int i12 = defaultWindowInsets2.c;
                vg0Var.K = i12;
                vg0Var.I = defaultWindowInsets2.d;
                View view2 = vg0Var.y.b;
                boolean z4 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z4 ? AndroidUtilities.dp(44.0f) : 0;
                vg0Var.y.setPadding(0, 0, 0, vg0Var.I);
                int dp3 = AndroidUtilities.dp(72.0f) + vg0Var.I + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vg0Var.E.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    vg0Var.E.setLayoutParams(marginLayoutParams);
                }
                int i13 = z4 ? vg0Var.I + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) vg0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    vg0Var.c.setLayoutParams(marginLayoutParams2);
                }
                vg0Var.B.setPadding(i11, 0, i12, vg0Var.I);
                if (z4) {
                    m1Var = m1Var.a.m(0, 0, 0, vg0Var.I);
                }
                vg0Var.i0();
                vg0Var.h0();
                SparseArray sparseArray = vg0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    fh1 fh1Var = (fh1) sparseArray.valueAt(i14);
                    if (fh1Var != null && (fragmentView = fh1Var.a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                break;
        }
        return r0.m1.b;
    }

    @Override // tf.j1
    public /* synthetic */ boolean Q(int i10) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public void a() {
        switch (this.a) {
            case 6:
                ((rv0) this.b).e();
                break;
            default:
                ((rd1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void b(org.telegram.ui.Components.vz vzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.Q8;
        vzVar.f(new org.telegram.ui.Components.wz(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        lx0 lx0Var = (lx0) this.b;
        if (!z4) {
            return true;
        }
        lx0Var.d.U((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((e71) this.b).Q(i10, view);
            case 18:
                final ga1 ga1Var = (ga1) this.b;
                org.telegram.ui.ActionBar.d2[] d2VarArr = ga1Var.e0;
                l91 l91Var = ga1Var.U;
                int i11 = l91Var.F;
                if (i10 < i11 || i10 > l91Var.G) {
                    int i12 = l91Var.R;
                    if (i10 < i12 || i10 > l91Var.S) {
                        int i13 = l91Var.O;
                        if (i10 < i13 || i10 > l91Var.P) {
                            int i14 = l91Var.U;
                            if (i10 < i14 || i10 > l91Var.V) {
                                return false;
                            }
                            ((z91) ga1Var.M.get(i10 - i14)).c(ga1Var.a, ga1Var, d2VarArr, true);
                        } else {
                            ((z91) ga1Var.L.get(i10 - i13)).c(ga1Var.a, ga1Var, d2VarArr, true);
                        }
                    } else {
                        ((z91) ga1Var.N.get(i10 - i12)).c(ga1Var.a, ga1Var, d2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((da1) ga1Var.s0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(ga1Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.b91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ga1 ga1Var2 = ga1Var;
                                    ga1Var2.getClass();
                                    ga1Var2.presentFragment(new aj0(messageObject));
                                    break;
                                default:
                                    ga1 ga1Var3 = ga1Var;
                                    ga1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ga1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ga1Var3.presentFragment(new xn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.b91
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    ga1 ga1Var2 = ga1Var;
                                    ga1Var2.getClass();
                                    ga1Var2.presentFragment(new aj0(messageObject));
                                    break;
                                default:
                                    ga1 ga1Var3 = ga1Var;
                                    ga1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ga1Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ga1Var3.presentFragment(new xn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(ga1Var.P.V0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((yd1) this.b).G.f(i10, view);
                return true;
        }
    }

    @Override // tf.j1
    public void g(int i10) {
        dh1 dh1Var = (dh1) this.b;
        if (dh1Var.h == null && !dh1Var.f.e()) {
            dh1Var.v.f.e(false, true);
        }
        dh1Var.l();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((vs0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.Q4, photoViewer.y, photoViewer.s2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((fv0) this.b).finishFragment();
                break;
            case 5:
                ((zu0) this.b).a.O.r();
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
                ProxyListActivity proxyListActivity = ((m11) this.b).b;
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
                n11 n11Var = proxyListActivity.a;
                if (n11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        n11Var.n(i11, 0);
                        n11 n11Var2 = proxyListActivity.a;
                        i12 = proxyListActivity.callsRow;
                        n11Var2.n(i12, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((ab1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    lb1 lb1Var = themeActivity.a;
                    i13 = themeActivity.textSizeRow;
                    lb1Var.n(i13, new Object());
                    lb1 lb1Var2 = themeActivity.a;
                    i14 = themeActivity.bubbleRadiusRow;
                    lb1Var2.n(i14, new Object());
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
                        themeActivity.c.y1(N0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 21:
                cd1 cd1Var = ((fc1) this.b).a;
                org.telegram.ui.ActionBar.j6.j0(cd1Var.b0, cd1Var.s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, cd1Var.b0, Boolean.valueOf(cd1Var.c0), null, -1);
                cd1Var.finishFragment();
                break;
            default:
                ((mg1) this.b).a.E0(true);
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
                j31 j31Var = (j31) this.b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                k31 k31Var = j31Var.v;
                if (i51Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = j31Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = j31Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = j31Var.d;
                            if (tL_reportResultAddComment == null) {
                                k31.G(k31Var, i51Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    k31.G(k31Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(i51Var.d);
                            if (tL_messageReportOption != null) {
                                k31.G(k31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(i51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            k31.G(k31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // tf.j1
    public /* synthetic */ a0.h t() {
        return null;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ex0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.w0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.msg_mini_lock3, 0);
                    mqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(mqVar, 0, 1, 33);
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

    @Override // tf.j1
    public /* synthetic */ void T(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        kh.m2 m2Var = (kh.m2) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        m2Var.run();
    }
}
