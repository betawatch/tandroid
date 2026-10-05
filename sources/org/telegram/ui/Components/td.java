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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rf rfVar;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
                if (ynVar != null) {
                    ynVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 1:
                int i13 = ChatActivityEnterView.n5;
                AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 4));
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
                ei.d0 d0Var = chatActivityEnterView.l0;
                if (d0Var != null) {
                    d0Var.setOpened(false);
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
                if (!chatActivityEnterView.j2 && i11 != 0 && (rfVar = chatActivityEnterView.E0) != null) {
                    try {
                        rfVar.requestFocus();
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            case 6:
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView.d5 == null) {
                        fgVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    break;
                }
                break;
            case 7:
                of ofVar = chatActivityEnterView.L0;
                if (ofVar != null) {
                    ofVar.h(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.yn ynVar2 = chatActivityEnterView.P2;
                if (ynVar2 == null || ynVar2.isLastFragment()) {
                    chatActivityEnterView.N();
                }
                chatActivityEnterView.N4 = null;
                break;
            case 9:
                int i14 = ChatActivityEnterView.n5;
                chatActivityEnterView.S1();
                break;
            case 10:
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.y(0.0f);
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
                chatActivityEnterView.L0();
                break;
            case 14:
                yc.a0(chatActivityEnterView.P2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                break;
            case 15:
                rf rfVar2 = chatActivityEnterView.E0;
                if (rfVar2 != null) {
                    rfVar2.setText("");
                    break;
                }
                break;
            case 16:
                rf rfVar3 = chatActivityEnterView.E0;
                if (rfVar3 != null) {
                    rfVar3.setText("");
                }
                chatActivityEnterView.I(true);
                break;
            case 17:
                of ofVar2 = chatActivityEnterView.L0;
                if (ofVar2 != null) {
                    ofVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ke(chatActivityEnterView, i12), 600L);
                break;
            case 18:
                e5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new se(chatActivityEnterView, i11), chatActivityEnterView.W3);
                break;
            case 19:
                int i16 = ChatActivityEnterView.n5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                of ofVar3 = chatActivityEnterView2.L0;
                if (ofVar3 != null) {
                    ofVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.yn ynVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && ynVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.e5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                            if (z5VarArr != null) {
                                int length = z5VarArr.length;
                                while (i12 < length) {
                                    z5VarArr[i12].applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), q5.g());
                                    i12++;
                                }
                            }
                            fj0.a(spannableStringBuilder);
                            chatActivityEnterView.M();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            break;
                        }
                    } else {
                        ii.e2 e2Var = new ii.e2(richMessage);
                        e2Var.e = true;
                        e2Var.setResourceProvider(chatActivityEnterView.W3);
                        e2Var.J = ynVar3;
                        e2Var.s = ynVar3.Q;
                        e2Var.v = ynVar3.W;
                        e2Var.L = new td(chatActivityEnterView, 24);
                        e2Var.K = new td(chatActivityEnterView, 25);
                        ynVar3.presentFragment(e2Var);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.yn ynVar4 = chatActivityEnterView.P2;
                if (ynVar4 != null) {
                    ynVar4.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar4, 43, true));
                    break;
                }
                break;
            case 22:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.I0();
                break;
            case 23:
                int i17 = ChatActivityEnterView.n5;
                chatActivityEnterView.w1(true, true);
                chatActivityEnterView.V = null;
                break;
            case 24:
                rf rfVar4 = chatActivityEnterView.E0;
                if (rfVar4 != null) {
                    rfVar4.setText("");
                    break;
                }
                break;
            case 25:
                rf rfVar5 = chatActivityEnterView.E0;
                if (rfVar5 != null) {
                    rfVar5.setText("");
                }
                chatActivityEnterView.I(true);
                break;
            case 26:
                int i18 = ChatActivityEnterView.n5;
                chatActivityEnterView.V0();
                break;
            case 27:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.I0();
                break;
            case 28:
                int i19 = ChatActivityEnterView.n5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i20 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.i0;
                String str2 = chatActivityEnterView.j0;
                org.telegram.ui.yn ynVar5 = chatActivityEnterView.P2;
                ei.f5 b10 = ei.f5.b(i20, j3, j3, str, str2, 2, 0, ynVar5 == null ? 0L : ynVar5.O8(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.d0 d0Var2 = chatActivityEnterView.l0;
                    if (d0Var2 != null) {
                        d0Var2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.dc0.l(chatActivityEnterView.j0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.Q).getUser(Long.valueOf(chatActivityEnterView.Q2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.Q);
                        MessagesController.showCantOpenAlert(ynVar5, restrictionReason);
                        break;
                    } else {
                        ei.l3 l3Var = new ei.l3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                        l3Var.w(false);
                        l3Var.A0 = true;
                        l3Var.k0 = chatActivityEnterView.O2;
                        l3Var.s(ynVar5, b10);
                        l3Var.show();
                        ei.d0 d0Var3 = chatActivityEnterView.l0;
                        if (d0Var3 != null) {
                            d0Var3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    nf.e eVar = new nf.e();
                    eVar.c = new td(chatActivityEnterView, i11);
                    nf.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.j0, false, false, eVar);
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
