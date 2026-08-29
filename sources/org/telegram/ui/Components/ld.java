package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ld(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jf jfVar;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                if (tnVar != null) {
                    tnVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 1:
                int i13 = ChatActivityEnterView.i5;
                AndroidUtilities.runOnUIThread(new ld(chatActivityEnterView, 4));
                break;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                if (recordCircle != null) {
                    recordCircle.d();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    break;
                }
                break;
            case 4:
                ph.z zVar = chatActivityEnterView.h0;
                if (zVar != null) {
                    zVar.setOpened(false);
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.N1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.J2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).n0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null && view.getVisibility() == 0) {
                            i11 = 0;
                        }
                    }
                }
                if (!chatActivityEnterView.e2 && i11 != 0 && (jfVar = chatActivityEnterView.A0) != null) {
                    try {
                        jfVar.requestFocus();
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 6:
                xf xfVar = chatActivityEnterView.Q0;
                if (xfVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        xfVar.getLayoutParams().height = chatActivityEnterView.y3;
                    }
                    chatActivityEnterView.Q0.setLayerType(0, null);
                    break;
                }
                break;
            case 7:
                ff ffVar = chatActivityEnterView.H0;
                if (ffVar != null) {
                    ffVar.h(chatActivityEnterView.z4);
                    chatActivityEnterView.H0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.tn tnVar2 = chatActivityEnterView.K2;
                if (tnVar2 == null || tnVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.I4 = null;
                break;
            case 9:
                int i14 = ChatActivityEnterView.i5;
                chatActivityEnterView.S1();
                break;
            case 10:
                hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    hgVar.v(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 11:
                AndroidUtilities.removeFromParent(chatActivityEnterView.J);
                break;
            case 12:
                chatActivityEnterView.removeView(chatActivityEnterView.H);
                break;
            case 13:
                int i15 = ChatActivityEnterView.i5;
                chatActivityEnterView.L0();
                break;
            case 14:
                tc.a0(chatActivityEnterView.K2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                break;
            case 15:
                jf jfVar2 = chatActivityEnterView.A0;
                if (jfVar2 != null) {
                    jfVar2.setText("");
                    break;
                }
                break;
            case 16:
                jf jfVar3 = chatActivityEnterView.A0;
                if (jfVar3 != null) {
                    jfVar3.setText("");
                }
                chatActivityEnterView.J(true);
                break;
            case 17:
                ff ffVar2 = chatActivityEnterView.H0;
                if (ffVar2 != null) {
                    ffVar2.h(false);
                    chatActivityEnterView.H0 = null;
                }
                AndroidUtilities.runOnUIThread(new be(chatActivityEnterView, i12), 600L);
                break;
            case 18:
                c5.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new ke(chatActivityEnterView, i11), chatActivityEnterView.R3);
                break;
            case 19:
                int i16 = ChatActivityEnterView.i5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                ff ffVar3 = chatActivityEnterView2.H0;
                if (ffVar3 != null) {
                    ffVar3.h(false);
                    chatActivityEnterView2.H0 = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.tn tnVar3 = chatActivityEnterView.K2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.z1;
                if (richMessage != null && chatActivityEnterView.A0 != null && tnVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.M).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.z1;
                        if (richMessage2 != null && chatActivityEnterView.A0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(th.u4.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                            if (y5VarArr != null) {
                                int length = y5VarArr.length;
                                while (i12 < length) {
                                    y5VarArr[i12].applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), p5.g());
                                    i12++;
                                }
                            }
                            qi0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            break;
                        }
                    } else {
                        th.x1 x1Var = new th.x1(richMessage);
                        x1Var.e = true;
                        x1Var.setResourceProvider(chatActivityEnterView.R3);
                        x1Var.F = tnVar3;
                        x1Var.s = tnVar3.O;
                        x1Var.v = tnVar3.U;
                        x1Var.H = new ld(chatActivityEnterView, 24);
                        x1Var.G = new ld(chatActivityEnterView, 25);
                        tnVar3.presentFragment(x1Var);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.tn tnVar4 = chatActivityEnterView.K2;
                if (tnVar4 != null) {
                    tnVar4.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar4, 43, true));
                    break;
                }
                break;
            case 22:
                chatActivityEnterView.g3 = false;
                chatActivityEnterView.I0();
                break;
            case 23:
                int i17 = ChatActivityEnterView.i5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.R = null;
                break;
            case 24:
                jf jfVar4 = chatActivityEnterView.A0;
                if (jfVar4 != null) {
                    jfVar4.setText("");
                    break;
                }
                break;
            case 25:
                jf jfVar5 = chatActivityEnterView.A0;
                if (jfVar5 != null) {
                    jfVar5.setText("");
                }
                chatActivityEnterView.J(true);
                break;
            case 26:
                int i18 = ChatActivityEnterView.i5;
                chatActivityEnterView.W0();
                break;
            case 27:
                chatActivityEnterView.g3 = false;
                chatActivityEnterView.I0();
                break;
            case 28:
                int i19 = ChatActivityEnterView.i5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i20 = chatActivityEnterView.M;
                long j10 = chatActivityEnterView.L2;
                String str = chatActivityEnterView.e0;
                String str2 = chatActivityEnterView.f0;
                org.telegram.ui.tn tnVar5 = chatActivityEnterView.K2;
                ph.y3 b10 = ph.y3.b(i20, j10, j10, str, str2, 2, 0, tnVar5 == null ? 0L : tnVar5.N8(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().m(b10) != null) {
                    ph.z zVar2 = chatActivityEnterView.h0;
                    if (zVar2 != null) {
                        zVar2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.mb0.l(chatActivityEnterView.f0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.M).getUser(Long.valueOf(chatActivityEnterView.L2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.M).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.M);
                        MessagesController.showCantOpenAlert(tnVar5, restrictionReason);
                        break;
                    } else {
                        ph.p2 p2Var = new ph.p2(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
                        p2Var.w(false);
                        p2Var.w0 = true;
                        p2Var.g0 = chatActivityEnterView.J2;
                        p2Var.s(tnVar5, b10);
                        p2Var.show();
                        ph.z zVar3 = chatActivityEnterView.h0;
                        if (zVar3 != null) {
                            zVar3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    ye.c cVar = new ye.c();
                    cVar.c = new ld(chatActivityEnterView, i11);
                    ye.d.k(chatActivityEnterView.getContext(), chatActivityEnterView.f0, false, false, cVar);
                    break;
                }
                break;
            default:
                if (chatActivityEnterView.h0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                    chatActivityEnterView.h0.setOpened(false);
                    break;
                }
                break;
        }
    }
}
