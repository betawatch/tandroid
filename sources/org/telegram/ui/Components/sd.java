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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ sd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qf qfVar;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.co coVar = chatActivityEnterView.O2;
                if (coVar != null) {
                    coVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 1:
                int i13 = ChatActivityEnterView.m5;
                AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 4));
                break;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                if (recordCircle != null) {
                    recordCircle.d();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.M1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    break;
                }
                break;
            case 4:
                fi.c0 c0Var = chatActivityEnterView.l0;
                if (c0Var != null) {
                    c0Var.setOpened(false);
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.R1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.N2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).r0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null && view.getVisibility() == 0) {
                            i11 = 0;
                        }
                    }
                }
                if (!chatActivityEnterView.i2 && i11 != 0 && (qfVar = chatActivityEnterView.E0) != null) {
                    try {
                        qfVar.requestFocus();
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            case 6:
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    if (chatActivityEnterView.c5 == null) {
                        egVar.getLayoutParams().height = chatActivityEnterView.C3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    break;
                }
                break;
            case 7:
                nf nfVar = chatActivityEnterView.L0;
                if (nfVar != null) {
                    nfVar.h(chatActivityEnterView.D4);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.co coVar2 = chatActivityEnterView.O2;
                if (coVar2 == null || coVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.M4 = null;
                break;
            case 9:
                int i14 = ChatActivityEnterView.m5;
                chatActivityEnterView.S1();
                break;
            case 10:
                og ogVar = chatActivityEnterView.Y2;
                if (ogVar != null) {
                    ogVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 11:
                AndroidUtilities.removeFromParent(chatActivityEnterView.N);
                break;
            case 12:
                chatActivityEnterView.removeView(chatActivityEnterView.L);
                break;
            case 13:
                int i15 = ChatActivityEnterView.m5;
                chatActivityEnterView.L0();
                break;
            case 14:
                yc.a0(chatActivityEnterView.O2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                break;
            case 15:
                qf qfVar2 = chatActivityEnterView.E0;
                if (qfVar2 != null) {
                    qfVar2.setText("");
                    break;
                }
                break;
            case 16:
                qf qfVar3 = chatActivityEnterView.E0;
                if (qfVar3 != null) {
                    qfVar3.setText("");
                }
                chatActivityEnterView.K(true);
                break;
            case 17:
                nf nfVar2 = chatActivityEnterView.L0;
                if (nfVar2 != null) {
                    nfVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ie(chatActivityEnterView, i12), 600L);
                break;
            case 18:
                e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new qe(chatActivityEnterView, i11), chatActivityEnterView.V3);
                break;
            case 19:
                int i16 = ChatActivityEnterView.m5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                nf nfVar3 = chatActivityEnterView2.L0;
                if (nfVar3 != null) {
                    nfVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.co coVar3 = chatActivityEnterView.O2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.D1;
                if (richMessage != null && chatActivityEnterView.E0 != null && coVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.D1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ji.f5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                            if (z5VarArr != null) {
                                int length = z5VarArr.length;
                                while (i12 < length) {
                                    z5VarArr[i12].applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), q5.g());
                                    i12++;
                                }
                            }
                            si0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            break;
                        }
                    } else {
                        ji.c2 c2Var = new ji.c2(richMessage);
                        c2Var.e = true;
                        c2Var.setResourceProvider(chatActivityEnterView.V3);
                        c2Var.J = coVar3;
                        c2Var.s = coVar3.S;
                        c2Var.v = coVar3.Y;
                        c2Var.L = new sd(chatActivityEnterView, 24);
                        c2Var.K = new sd(chatActivityEnterView, 25);
                        coVar3.presentFragment(c2Var);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.co coVar4 = chatActivityEnterView.O2;
                if (coVar4 != null) {
                    coVar4.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar4, 43, true));
                    break;
                }
                break;
            case 22:
                chatActivityEnterView.k3 = false;
                chatActivityEnterView.I0();
                break;
            case 23:
                int i17 = ChatActivityEnterView.m5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.V = null;
                break;
            case 24:
                qf qfVar4 = chatActivityEnterView.E0;
                if (qfVar4 != null) {
                    qfVar4.setText("");
                    break;
                }
                break;
            case 25:
                qf qfVar5 = chatActivityEnterView.E0;
                if (qfVar5 != null) {
                    qfVar5.setText("");
                }
                chatActivityEnterView.K(true);
                break;
            case 26:
                int i18 = ChatActivityEnterView.m5;
                chatActivityEnterView.W0();
                break;
            case 27:
                chatActivityEnterView.k3 = false;
                chatActivityEnterView.I0();
                break;
            case 28:
                int i19 = ChatActivityEnterView.m5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i20 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.P2;
                String str = chatActivityEnterView.i0;
                String str2 = chatActivityEnterView.j0;
                org.telegram.ui.co coVar5 = chatActivityEnterView.O2;
                fi.f5 b10 = fi.f5.b(i20, j3, j3, str, str2, 2, 0, coVar5 == null ? 0L : coVar5.N8(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    fi.c0 c0Var2 = chatActivityEnterView.l0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.fc0.l(chatActivityEnterView.j0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.Q).getUser(Long.valueOf(chatActivityEnterView.P2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.Q);
                        MessagesController.showCantOpenAlert(coVar5, restrictionReason);
                        break;
                    } else {
                        fi.k3 k3Var = new fi.k3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
                        k3Var.w(false);
                        k3Var.A0 = true;
                        k3Var.k0 = chatActivityEnterView.N2;
                        k3Var.s(coVar5, b10);
                        k3Var.show();
                        fi.c0 c0Var3 = chatActivityEnterView.l0;
                        if (c0Var3 != null) {
                            c0Var3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    of.e eVar = new of.e();
                    eVar.c = new sd(chatActivityEnterView, i11);
                    of.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.j0, false, false, eVar);
                    break;
                }
                break;
            default:
                if (chatActivityEnterView.l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                    chatActivityEnterView.l0.setOpened(false);
                    break;
                }
                break;
        }
    }
}
