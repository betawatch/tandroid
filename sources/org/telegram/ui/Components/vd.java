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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sf sfVar;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 1:
                int i13 = ChatActivityEnterView.n5;
                AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 4));
                break;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    break;
                }
                break;
            case 4:
                ei.c0 c0Var = chatActivityEnterView.l0;
                if (c0Var != null) {
                    c0Var.setOpened(false);
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.S1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.O2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).r0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null && view.getVisibility() == 0) {
                            i11 = 0;
                        }
                    }
                }
                if (!chatActivityEnterView.j2 && i11 != 0 && (sfVar = chatActivityEnterView.E0) != null) {
                    try {
                        sfVar.requestFocus();
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            case 6:
                gg ggVar = chatActivityEnterView.U0;
                if (ggVar != null) {
                    if (chatActivityEnterView.d5 == null) {
                        ggVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    break;
                }
                break;
            case 7:
                pf pfVar = chatActivityEnterView.L0;
                if (pfVar != null) {
                    pfVar.h(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.zn znVar2 = chatActivityEnterView.P2;
                if (znVar2 == null || znVar2.isLastFragment()) {
                    chatActivityEnterView.N();
                }
                chatActivityEnterView.N4 = null;
                break;
            case 9:
                int i14 = ChatActivityEnterView.n5;
                chatActivityEnterView.R1();
                break;
            case 10:
                qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.z(0.0f);
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
                int i15 = ChatActivityEnterView.n5;
                chatActivityEnterView.J0();
                break;
            case 14:
                ad.a0(chatActivityEnterView.P2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                break;
            case 15:
                sf sfVar2 = chatActivityEnterView.E0;
                if (sfVar2 != null) {
                    sfVar2.setText("");
                    break;
                }
                break;
            case 16:
                sf sfVar3 = chatActivityEnterView.E0;
                if (sfVar3 != null) {
                    sfVar3.setText("");
                }
                chatActivityEnterView.I(true);
                break;
            case 17:
                pf pfVar2 = chatActivityEnterView.L0;
                if (pfVar2 != null) {
                    pfVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new le(chatActivityEnterView, i12), 600L);
                break;
            case 18:
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new te(chatActivityEnterView, i11), chatActivityEnterView.W3);
                break;
            case 19:
                int i16 = ChatActivityEnterView.n5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                pf pfVar3 = chatActivityEnterView2.L0;
                if (pfVar3 != null) {
                    pfVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.zn znVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && znVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.e5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class);
                            if (b6VarArr != null) {
                                int length = b6VarArr.length;
                                while (i12 < length) {
                                    b6VarArr[i12].applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), s5.g());
                                    i12++;
                                }
                            }
                            xj0.a(spannableStringBuilder);
                            chatActivityEnterView.M();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.Q0();
                            break;
                        }
                    } else {
                        ii.e2 e2Var = new ii.e2(richMessage);
                        e2Var.e = true;
                        e2Var.setResourceProvider(chatActivityEnterView.W3);
                        e2Var.J = znVar3;
                        e2Var.s = znVar3.S;
                        e2Var.v = znVar3.Y;
                        e2Var.L = new vd(chatActivityEnterView, 24);
                        e2Var.K = new vd(chatActivityEnterView, 25);
                        znVar3.presentFragment(e2Var);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.zn znVar4 = chatActivityEnterView.P2;
                if (znVar4 != null) {
                    znVar4.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar4, 43, true));
                    break;
                }
                break;
            case 22:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.G0();
                break;
            case 23:
                int i17 = ChatActivityEnterView.n5;
                chatActivityEnterView.v1(true, true);
                chatActivityEnterView.V = null;
                break;
            case 24:
                sf sfVar4 = chatActivityEnterView.E0;
                if (sfVar4 != null) {
                    sfVar4.setText("");
                    break;
                }
                break;
            case 25:
                sf sfVar5 = chatActivityEnterView.E0;
                if (sfVar5 != null) {
                    sfVar5.setText("");
                }
                chatActivityEnterView.I(true);
                break;
            case 26:
                int i18 = ChatActivityEnterView.n5;
                chatActivityEnterView.U0();
                break;
            case 27:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.G0();
                break;
            case 28:
                int i19 = ChatActivityEnterView.n5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i20 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.i0;
                String str2 = chatActivityEnterView.j0;
                org.telegram.ui.zn znVar5 = chatActivityEnterView.P2;
                ei.e5 b10 = ei.e5.b(i20, j3, j3, str, str2, 2, 0, znVar5 == null ? 0L : znVar5.S8(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var2 = chatActivityEnterView.l0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.ec0.q(chatActivityEnterView.j0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.Q).getUser(Long.valueOf(chatActivityEnterView.Q2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.Q);
                        MessagesController.showCantOpenAlert(znVar5, restrictionReason);
                        break;
                    } else {
                        ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                        k3Var.x(false);
                        k3Var.A0 = true;
                        k3Var.k0 = chatActivityEnterView.O2;
                        k3Var.t(znVar5, b10);
                        k3Var.show();
                        ei.c0 c0Var3 = chatActivityEnterView.l0;
                        if (c0Var3 != null) {
                            c0Var3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    of.e eVar = new of.e();
                    eVar.c = new vd(chatActivityEnterView, i11);
                    of.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.j0, false, false, eVar);
                    break;
                }
                break;
            default:
                if (chatActivityEnterView.l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.l0.setOpened(false);
                    break;
                }
                break;
        }
    }
}
