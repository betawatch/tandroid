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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq0 implements org.telegram.ui.Cells.x5, org.telegram.ui.Components.y71, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.gm0, ig.e, gg.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hq0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        View fragmentView;
        switch (this.a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.o0 = defaultWindowInsets;
                premiumPreviewFragment.a.setPadding(0, defaultWindowInsets.b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.o0.d);
                org.telegram.ui.Components.qm0 qm0Var = premiumPreviewFragment.a;
                i0.b bVar = premiumPreviewFragment.o0;
                AndroidUtilities.setViewLayoutMargins(qm0Var, bVar.a, 0, bVar.c, 0);
                jx0 jx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.o0;
                jx0Var.setPadding(bVar2.a, 0, bVar2.c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.o0.a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.o0;
                    frameLayout.setPadding(i10, dp, bVar3.c, bVar3.d);
                }
                break;
            default:
                fh0 fh0Var = (fh0) ((ci1) this.b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i11 = defaultWindowInsets2.a;
                fh0Var.M = i11;
                int i12 = defaultWindowInsets2.c;
                fh0Var.N = i12;
                fh0Var.L = defaultWindowInsets2.d;
                View view2 = fh0Var.y.b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int dp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                fh0Var.y.setPadding(0, 0, 0, fh0Var.L);
                int dp3 = AndroidUtilities.dp(72.0f) + fh0Var.L + dp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp3) {
                    marginLayoutParams.height = dp3;
                    fh0Var.H.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? fh0Var.L + dp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fh0Var.c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    fh0Var.c.setLayoutParams(marginLayoutParams2);
                }
                fh0Var.E.setPadding(i11, 0, i12, fh0Var.L);
                if (z10) {
                    k1Var = k1Var.a.m(0, 0, 0, fh0Var.L);
                }
                fh0Var.i0();
                fh0Var.h0();
                SparseArray sparseArray = fh0Var.a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ai1 ai1Var = (ai1) sparseArray.valueAt(i14);
                    if (ai1Var != null && (fragmentView = ai1Var.a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                break;
        }
        return r0.k1.b;
    }

    @Override // gg.a2
    public /* synthetic */ a0.i V() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void a() {
        switch (this.a) {
            case 5:
                ((mw0) this.b).e();
                break;
            default:
                ((me1) this.b).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.y71
    public void b(org.telegram.ui.Components.l00 l00Var) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.b;
        Drawable[] drawableArr = PhotoViewer.U8;
        l00Var.f(new org.telegram.ui.Components.m00(savedFilterState));
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        fy0 fy0Var = (fy0) this.b;
        if (!z10) {
            return true;
        }
        fy0Var.d.U((Long) b5Var.getTag(), b5Var);
        return true;
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 16:
                break;
            case 17:
                final bb1 bb1Var = (bb1) this.b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = bb1Var.h0;
                ga1 ga1Var = bb1Var.X;
                int i11 = ga1Var.I;
                if (i10 < i11 || i10 > ga1Var.J) {
                    int i12 = ga1Var.U;
                    if (i10 < i12 || i10 > ga1Var.V) {
                        int i13 = ga1Var.R;
                        if (i10 < i13 || i10 > ga1Var.S) {
                            int i14 = ga1Var.X;
                            if (i10 >= i14 && i10 <= ga1Var.Y) {
                                ((ua1) bb1Var.P.get(i10 - i14)).c(bb1Var.a, bb1Var, b2VarArr, true);
                            }
                        } else {
                            ((ua1) bb1Var.O.get(i10 - i13)).c(bb1Var.a, bb1Var, b2VarArr, true);
                        }
                    } else {
                        ((ua1) bb1Var.Q.get(i10 - i12)).c(bb1Var.a, bb1Var, b2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((ya1) bb1Var.v0.get(i10 - i11)).b;
                    if (!messageObject.isStory()) {
                        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(bb1Var, view);
                        final int i15 = 0;
                        H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() { // from class: org.telegram.ui.w91
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        bb1 bb1Var2 = bb1Var;
                                        bb1Var2.getClass();
                                        bb1Var2.presentFragment(new lj0(messageObject));
                                        break;
                                    default:
                                        bb1 bb1Var3 = bb1Var;
                                        bb1Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", bb1Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        bb1Var3.presentFragment(new zn(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        final int i16 = 1;
                        H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() { // from class: org.telegram.ui.w91
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i16) {
                                    case 0:
                                        bb1 bb1Var2 = bb1Var;
                                        bb1Var2.getClass();
                                        bb1Var2.presentFragment(new lj0(messageObject));
                                        break;
                                    default:
                                        bb1 bb1Var3 = bb1Var;
                                        bb1Var3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", bb1Var3.b);
                                        bundle.putInt("message_id", messageObject.getId());
                                        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                        bb1Var3.presentFragment(new zn(bundle), false);
                                        break;
                                }
                            }
                        }, false);
                        H.W(bb1Var.S.V0(view, false));
                        H.Z();
                    }
                }
                break;
            default:
                ((ue1) this.b).J.d(i10, view);
                break;
        }
        return true;
    }

    @Override // gg.a2
    public /* synthetic */ a0.i d0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 2:
                PhotoViewer photoViewer = ((qt0) this.b).b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.y, photoViewer.v2, true);
                    photoViewer.G0(false, false);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 3:
                ((aw0) this.b).finishFragment();
                break;
            case 4:
                ((uv0) this.b).a.R.s();
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                ((org.telegram.messenger.jk) this.b).run(1);
                break;
            case 13:
                ProxyListActivity proxyListActivity = ((d21) this.b).b;
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
                e21 e21Var = proxyListActivity.a;
                if (e21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        i11 = proxyListActivity.useProxyRow;
                        e21Var.n(i11, 0);
                    }
                    proxyListActivity.a.F();
                    break;
                }
                break;
            case 19:
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
                    org.telegram.ui.ActionBar.h6 O0 = org.telegram.ui.ActionBar.i6.O0("Blue");
                    org.telegram.ui.ActionBar.h6 B0 = org.telegram.ui.ActionBar.i6.B0();
                    SparseArray sparseArray = O0.a0;
                    int i17 = org.telegram.ui.ActionBar.i6.n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i17);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.c = "d";
                        b6Var.a = "Blue_99_wp.jpg";
                        b6Var.b = "Blue_99_wp.jpg";
                        g6Var.y = b6Var;
                        O0.v(b6Var);
                    }
                    if (O0 == B0) {
                        if (O0.Y == i17) {
                            org.telegram.ui.ActionBar.i6.p1(true);
                            break;
                        } else {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, B0, Boolean.valueOf(themeActivity.f == 1), null, Integer.valueOf(i17));
                            themeActivity.a.m(themeActivity.q0);
                            break;
                        }
                    } else {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.i6.u1(O0, true, false, true, false, false);
                        themeActivity.c.z1(O0);
                        themeActivity.c.x0(0);
                        break;
                    }
                }
                break;
            case 20:
                xd1 xd1Var = ((ad1) this.b).a;
                org.telegram.ui.ActionBar.i6.k0(xd1Var.e0, xd1Var.s, true);
                org.telegram.ui.ActionBar.i6.o();
                org.telegram.ui.ActionBar.i6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, xd1Var.e0, Boolean.valueOf(xd1Var.f0), null, -1);
                xd1Var.finishFragment();
                break;
            default:
                ((gh1) this.b).a.E0(true);
                break;
        }
    }

    @Override // gg.a2
    public void h(int i10) {
        yh1 yh1Var = (yh1) this.b;
        if (yh1Var.h == null && !yh1Var.f.e()) {
            yh1Var.v.f.e(false, true);
        }
        yh1Var.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b41 b41Var = (b41) this.b;
        org.telegram.ui.Components.p61 p61Var = (org.telegram.ui.Components.p61) obj;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        c41 c41Var = b41Var.v;
        if (p61Var.a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b41Var.b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(p61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    c41.I(c41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b41Var.c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(p61Var.d);
                if (tL_messageReportOption != null) {
                    c41.I(c41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = b41Var.d;
            if (tL_reportResultAddComment == null) {
                c41.I(c41Var, p61Var.l, null, null);
                return;
            }
            byte[] bArr = tL_reportResultAddComment.option;
            if (bArr != null) {
                c41.I(c41Var, null, bArr, null);
            }
        }
    }

    @Override // gg.a2
    public /* synthetic */ boolean s0(int i10) {
        return true;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.b, j3, 1));
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((yx0) this.b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.msg_mini_lock3, 0);
                    erVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(erVar, 0, 1, 33);
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

    @Override // gg.a2
    public /* synthetic */ void x0(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        gg.d1 d1Var = (gg.d1) this.b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        d1Var.run();
    }
}
