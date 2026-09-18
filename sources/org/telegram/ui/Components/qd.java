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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ qd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        of ofVar;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.bo boVar = chatActivityEnterView.O2;
                if (boVar != null) {
                    boVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 1:
                int i13 = ChatActivityEnterView.n5;
                AndroidUtilities.runOnUIThread(new qd(chatActivityEnterView, 4));
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
                ei.c0 c0Var = chatActivityEnterView.l0;
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
                if (!chatActivityEnterView.i2 && i11 != 0 && (ofVar = chatActivityEnterView.E0) != null) {
                    try {
                        ofVar.requestFocus();
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 6:
                cg cgVar = chatActivityEnterView.U0;
                if (cgVar != null) {
                    if (chatActivityEnterView.d5 == null) {
                        cgVar.getLayoutParams().height = chatActivityEnterView.C3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    break;
                }
                break;
            case 7:
                kf kfVar = chatActivityEnterView.L0;
                if (kfVar != null) {
                    kfVar.h(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.bo boVar2 = chatActivityEnterView.O2;
                if (boVar2 == null || boVar2.isLastFragment()) {
                    chatActivityEnterView.Q();
                }
                chatActivityEnterView.N4 = null;
                break;
            case 9:
                int i14 = ChatActivityEnterView.n5;
                chatActivityEnterView.T1();
                break;
            case 10:
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.y(0.0f);
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
                chatActivityEnterView.M0();
                break;
            case 14:
                vc.a0(chatActivityEnterView.O2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                break;
            case 15:
                of ofVar2 = chatActivityEnterView.E0;
                if (ofVar2 != null) {
                    ofVar2.setText("");
                    break;
                }
                break;
            case 16:
                of ofVar3 = chatActivityEnterView.E0;
                if (ofVar3 != null) {
                    ofVar3.setText("");
                }
                chatActivityEnterView.L(true);
                break;
            case 17:
                kf kfVar2 = chatActivityEnterView.L0;
                if (kfVar2 != null) {
                    kfVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ge(chatActivityEnterView, i12), 600L);
                break;
            case 18:
                c5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new oe(chatActivityEnterView, i11), chatActivityEnterView.V3);
                break;
            case 19:
                int i16 = ChatActivityEnterView.n5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.U0(2147483646, true, 0, true, 0L);
                kf kfVar3 = chatActivityEnterView2.L0;
                if (kfVar3 != null) {
                    kfVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.bo boVar3 = chatActivityEnterView.O2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.D1;
                if (richMessage != null && chatActivityEnterView.E0 != null && boVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.D1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.c5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class);
                            if (x5VarArr != null) {
                                int length = x5VarArr.length;
                                while (i12 < length) {
                                    x5VarArr[i12].applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), o5.g());
                                    i12++;
                                }
                            }
                            ti0.a(spannableStringBuilder);
                            chatActivityEnterView.P();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.T0();
                            break;
                        }
                    } else {
                        ii.d2 d2Var = new ii.d2(richMessage);
                        d2Var.e = true;
                        d2Var.setResourceProvider(chatActivityEnterView.V3);
                        d2Var.J = boVar3;
                        d2Var.s = boVar3.S;
                        d2Var.v = boVar3.Y;
                        d2Var.L = new qd(chatActivityEnterView, 24);
                        d2Var.K = new qd(chatActivityEnterView, 25);
                        boVar3.presentFragment(d2Var);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.bo boVar4 = chatActivityEnterView.O2;
                if (boVar4 != null) {
                    boVar4.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar4, 43, true));
                    break;
                }
                break;
            case 22:
                chatActivityEnterView.k3 = false;
                chatActivityEnterView.J0();
                break;
            case 23:
                int i17 = ChatActivityEnterView.n5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.V = null;
                break;
            case 24:
                of ofVar4 = chatActivityEnterView.E0;
                if (ofVar4 != null) {
                    ofVar4.setText("");
                    break;
                }
                break;
            case 25:
                of ofVar5 = chatActivityEnterView.E0;
                if (ofVar5 != null) {
                    ofVar5.setText("");
                }
                chatActivityEnterView.L(true);
                break;
            case 26:
                int i18 = ChatActivityEnterView.n5;
                chatActivityEnterView.W0();
                break;
            case 27:
                chatActivityEnterView.k3 = false;
                chatActivityEnterView.J0();
                break;
            case 28:
                int i19 = ChatActivityEnterView.n5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i20 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.P2;
                String str = chatActivityEnterView.i0;
                String str2 = chatActivityEnterView.j0;
                org.telegram.ui.bo boVar5 = chatActivityEnterView.O2;
                ei.f5 b10 = ei.f5.b(i20, j3, j3, str, str2, 2, 0, boVar5 == null ? 0L : boVar5.N8(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var2 = chatActivityEnterView.l0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.hc0.l(chatActivityEnterView.j0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.Q).getUser(Long.valueOf(chatActivityEnterView.P2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.Q);
                        MessagesController.showCantOpenAlert(boVar5, restrictionReason);
                        break;
                    } else {
                        ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
                        k3Var.w(false);
                        k3Var.A0 = true;
                        k3Var.k0 = chatActivityEnterView.N2;
                        k3Var.s(boVar5, b10);
                        k3Var.show();
                        ei.c0 c0Var3 = chatActivityEnterView.l0;
                        if (c0Var3 != null) {
                            c0Var3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    nf.e eVar = new nf.e();
                    eVar.c = new qd(chatActivityEnterView, i11);
                    nf.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.j0, false, false, eVar);
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
