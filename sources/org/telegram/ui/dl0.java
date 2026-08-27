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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl0 implements Utilities.Callback5, org.telegram.ui.Cells.u5, org.telegram.ui.Components.z51, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.x4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.rk0, rf.e, pf.i1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // pf.i1
    public /* synthetic */ boolean D0(int i10) {
        return true;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        View fragmentView;
        switch (this.a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.k0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.k0.d);
                org.telegram.ui.Components.zk0 zk0Var = premiumPreviewFragment.a;
                i0.c cVar = premiumPreviewFragment.k0;
                AndroidUtilities.setViewLayoutMargins(zk0Var, cVar.a, 0, cVar.c, 0);
                fw0 fw0Var = premiumPreviewFragment.Q;
                i0.c cVar2 = premiumPreviewFragment.k0;
                fw0Var.setPadding(cVar2.a, 0, cVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.F;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.k0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.k0;
                    frameLayout.setPadding(i10, dp, cVar3.c, cVar3.d);
                }
                break;
            default:
                qg0 qg0Var = (qg0) ((sg1) this.b);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i11 = defaultWindowInsets2.a;
                qg0Var.I = i11;
                int i12 = defaultWindowInsets2.c;
                qg0Var.J = i12;
                qg0Var.H = defaultWindowInsets2.d;
                View view2 = qg0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                qg0Var.y.setPadding(0, 0, 0, qg0Var.H);
                int dp3 = AndroidUtilities.dp(72.0f) + qg0Var.H + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qg0Var.D.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    qg0Var.D.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? qg0Var.H + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) qg0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    qg0Var.c.setLayoutParams(marginLayoutParams2);
                }
                qg0Var.A.setPadding(i11, 0, i12, qg0Var.H);
                if (z10) {
                    m1Var = m1Var.a.m(0, 0, 0, qg0Var.H);
                }
                qg0Var.i0();
                qg0Var.h0();
                SparseArray sparseArray = qg0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    qg1 qg1Var = (qg1) sparseArray.valueAt(i14);
                    if (qg1Var != null && (fragmentView = qg1Var.a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                break;
        }
        return r0.m1.b;
    }

    @Override // pf.i1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 17:
                return ((n61) this.b).Q(i10, view);
            case 18:
                final q91 q91Var = (q91) this.b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = q91Var.d0;
                v81 v81Var = q91Var.T;
                int i11 = v81Var.E;
                if (i10 < i11 || i10 > v81Var.F) {
                    int i12 = v81Var.Q;
                    if (i10 < i12 || i10 > v81Var.R) {
                        int i13 = v81Var.N;
                        if (i10 < i13 || i10 > v81Var.O) {
                            int i14 = v81Var.T;
                            if (i10 < i14 || i10 > v81Var.U) {
                                return false;
                            }
                            ((j91) q91Var.L.get(i10 - i14)).c(q91Var.a, q91Var, b2VarArr, true);
                        } else {
                            ((j91) q91Var.K.get(i10 - i13)).c(q91Var.a, q91Var, b2VarArr, true);
                        }
                    } else {
                        ((j91) q91Var.M.get(i10 - i12)).c(q91Var.a, q91Var, b2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((n91) q91Var.r0.get(i10 - i11)).b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.b70 H = org.telegram.ui.Components.b70.H(q91Var, view);
                    final int i15 = 0;
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.l81
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    q91 q91Var2 = q91Var;
                                    q91Var2.getClass();
                                    q91Var2.presentFragment(new vi0(messageObject));
                                    break;
                                default:
                                    q91 q91Var3 = q91Var;
                                    q91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", q91Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    q91Var3.presentFragment(new rn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.l81
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    q91 q91Var2 = q91Var;
                                    q91Var2.getClass();
                                    q91Var2.presentFragment(new vi0(messageObject));
                                    break;
                                default:
                                    q91 q91Var3 = q91Var;
                                    q91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", q91Var3.b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    q91Var3.presentFragment(new rn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    H.W(q91Var.O.V0(view, false));
                    H.Z();
                }
                return true;
            default:
                ((ld1) this.b).F.a(i10, view);
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void b() {
        switch (this.a) {
            case 6:
                ((jv0) this.b).e();
                break;
            default:
                ((dd1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.z51
    public void c(org.telegram.ui.Components.jz jzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.P8;
        jzVar.f(new org.telegram.ui.Components.kz(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.x4
    public boolean d(org.telegram.ui.Cells.y4 y4Var, boolean z10) {
        bx0 bx0Var = (bx0) this.b;
        if (!z10) {
            return true;
        }
        bx0Var.d.U((Long) y4Var.getTag(), y4Var);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 3:
                PhotoViewer photoViewer = ((os0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.P4, photoViewer.y, photoViewer.r2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 4:
                ((yu0) this.b).finishFragment();
                break;
            case 5:
                ((su0) this.b).a.N.s();
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                int i15 = PopupNotificationActivity.X;
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
                ((org.telegram.messenger.hk) this.b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((b11) this.b).b;
                ArrayList arrayList = proxyListActivity.D;
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
                c11 c11Var = proxyListActivity.a;
                if (c11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        c11Var.n(i11, 0);
                        c11 c11Var2 = proxyListActivity.a;
                        i12 = proxyListActivity.callsRow;
                        c11Var2.n(i12, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((ka1) this.b).a;
                boolean k02 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    va1 va1Var = themeActivity.a;
                    i13 = themeActivity.textSizeRow;
                    va1Var.n(i13, new Object());
                    va1 va1Var2 = themeActivity.a;
                    i14 = themeActivity.bubbleRadiusRow;
                    va1Var2.n(i14, new Object());
                }
                if (themeActivity.c != null) {
                    org.telegram.ui.ActionBar.f6 N0 = org.telegram.ui.ActionBar.g6.N0("Blue");
                    org.telegram.ui.ActionBar.f6 A0 = org.telegram.ui.ActionBar.g6.A0();
                    SparseArray sparseArray = N0.W;
                    int i18 = org.telegram.ui.ActionBar.g6.n;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(i18);
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.c = "d";
                        z5Var.a = "Blue_99_wp.jpg";
                        z5Var.b = "Blue_99_wp.jpg";
                        e6Var.y = z5Var;
                        N0.v(z5Var);
                    }
                    if (N0 == A0) {
                        if (N0.U == i18) {
                            org.telegram.ui.ActionBar.g6.o1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i18));
                            themeActivity.a.m(themeActivity.m0);
                            break;
                        }
                    } else {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.g6.t1(N0, true, false, true, false, false);
                        themeActivity.c.y1(N0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 21:
                nc1 nc1Var = ((pb1) this.b).a;
                org.telegram.ui.ActionBar.g6.j0(nc1Var.a0, nc1Var.s, true);
                org.telegram.ui.ActionBar.g6.o();
                org.telegram.ui.ActionBar.g6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, nc1Var.a0, Boolean.valueOf(nc1Var.b0), null, -1);
                nc1Var.finishFragment();
                break;
            default:
                ((xf1) this.b).a.E0(true);
                break;
        }
    }

    @Override // pf.i1
    public /* synthetic */ a0.h h0() {
        return null;
    }

    @Override // pf.i1
    public void i(int i10) {
        og1 og1Var = (og1) this.b;
        if (og1Var.h == null && !og1Var.f.e()) {
            og1Var.v.f.e(false, true);
        }
        og1Var.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.n41) obj, (View) obj2);
                break;
            default:
                w21 w21Var = (w21) this.b;
                org.telegram.ui.Components.n41 n41Var = (org.telegram.ui.Components.n41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                x21 x21Var = w21Var.v;
                if (n41Var.a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = w21Var.b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = w21Var.c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = w21Var.d;
                            if (tL_reportResultAddComment == null) {
                                x21.H(x21Var, n41Var.l, null, null);
                                break;
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    x21.H(x21Var, null, bArr, null);
                                    break;
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(n41Var.d);
                            if (tL_messageReportOption != null) {
                                x21.H(x21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(n41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            x21.H(x21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.nh((SharedConfig.ProxyInfo) this.b, j10, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((uw0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.v0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_mini_lock3, 0);
                    cqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(cqVar, 0, 1, 33);
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

    @Override // pf.i1
    public /* synthetic */ void V0(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        gh.p2 p2Var = (gh.p2) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        p2Var.run();
    }
}
