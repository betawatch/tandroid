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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ id(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ff ffVar;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
                if (xnVar != null) {
                    xnVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 1:
                int i13 = ChatActivityEnterView.j5;
                AndroidUtilities.runOnUIThread(new id(chatActivityEnterView, 4));
                break;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
                if (recordCircle != null) {
                    recordCircle.d();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.J1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    break;
                }
                break;
            case 4:
                rh.a0 a0Var = chatActivityEnterView.i0;
                if (a0Var != null) {
                    a0Var.setOpened(false);
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.O1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.K2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).o0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null && view.getVisibility() == 0) {
                            i11 = 0;
                        }
                    }
                }
                if (!chatActivityEnterView.f2 && i11 != 0 && (ffVar = chatActivityEnterView.B0) != null) {
                    try {
                        ffVar.requestFocus();
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 6:
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null) {
                    if (chatActivityEnterView.Z4 == null) {
                        ufVar.getLayoutParams().height = chatActivityEnterView.z3;
                    }
                    chatActivityEnterView.R0.setLayerType(0, null);
                    break;
                }
                break;
            case 7:
                cf cfVar = chatActivityEnterView.I0;
                if (cfVar != null) {
                    cfVar.h(chatActivityEnterView.A4);
                    chatActivityEnterView.I0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.xn xnVar2 = chatActivityEnterView.L2;
                if (xnVar2 == null || xnVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.J4 = null;
                break;
            case 9:
                int i14 = ChatActivityEnterView.j5;
                chatActivityEnterView.S1();
                break;
            case 10:
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 11:
                AndroidUtilities.removeFromParent(chatActivityEnterView.K);
                break;
            case 12:
                chatActivityEnterView.removeView(chatActivityEnterView.I);
                break;
            case 13:
                int i15 = ChatActivityEnterView.j5;
                chatActivityEnterView.L0();
                break;
            case 14:
                qc.a0(chatActivityEnterView.L2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                break;
            case 15:
                ff ffVar2 = chatActivityEnterView.B0;
                if (ffVar2 != null) {
                    ffVar2.setText("");
                    break;
                }
                break;
            case 16:
                ff ffVar3 = chatActivityEnterView.B0;
                if (ffVar3 != null) {
                    ffVar3.setText("");
                }
                chatActivityEnterView.J(true);
                break;
            case 17:
                cf cfVar2 = chatActivityEnterView.I0;
                if (cfVar2 != null) {
                    cfVar2.h(false);
                    chatActivityEnterView.I0 = null;
                }
                AndroidUtilities.runOnUIThread(new yd(chatActivityEnterView, i12), 600L);
                break;
            case 18:
                z4.M(chatActivityEnterView.K2, chatActivityEnterView.L2.a(), new he(chatActivityEnterView, i11), chatActivityEnterView.S3);
                break;
            case 19:
                int i16 = ChatActivityEnterView.j5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                cf cfVar3 = chatActivityEnterView2.I0;
                if (cfVar3 != null) {
                    cfVar3.h(false);
                    chatActivityEnterView2.I0 = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.xn xnVar3 = chatActivityEnterView.L2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.A1;
                if (richMessage != null && chatActivityEnterView.B0 != null && xnVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.N).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.A1;
                        if (richMessage2 != null && chatActivityEnterView.B0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vh.w4.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            u5[] u5VarArr = (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class);
                            if (u5VarArr != null) {
                                int length = u5VarArr.length;
                                while (i12 < length) {
                                    u5VarArr[i12].applyFontMetrics(chatActivityEnterView.B0.getPaint().getFontMetricsInt(), l5.g());
                                    i12++;
                                }
                            }
                            zi0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            break;
                        }
                    } else {
                        vh.y1 y1Var = new vh.y1(richMessage);
                        y1Var.e = true;
                        y1Var.setResourceProvider(chatActivityEnterView.S3);
                        y1Var.G = xnVar3;
                        y1Var.s = xnVar3.P;
                        y1Var.v = xnVar3.V;
                        y1Var.I = new id(chatActivityEnterView, 24);
                        y1Var.H = new id(chatActivityEnterView, 25);
                        xnVar3.presentFragment(y1Var);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.xn xnVar4 = chatActivityEnterView.L2;
                if (xnVar4 != null) {
                    xnVar4.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) xnVar4, 43, true));
                    break;
                }
                break;
            case 22:
                chatActivityEnterView.h3 = false;
                chatActivityEnterView.I0();
                break;
            case 23:
                int i17 = ChatActivityEnterView.j5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.S = null;
                break;
            case 24:
                ff ffVar4 = chatActivityEnterView.B0;
                if (ffVar4 != null) {
                    ffVar4.setText("");
                    break;
                }
                break;
            case 25:
                ff ffVar5 = chatActivityEnterView.B0;
                if (ffVar5 != null) {
                    ffVar5.setText("");
                }
                chatActivityEnterView.J(true);
                break;
            case 26:
                int i18 = ChatActivityEnterView.j5;
                chatActivityEnterView.W0();
                break;
            case 27:
                chatActivityEnterView.h3 = false;
                chatActivityEnterView.I0();
                break;
            case 28:
                int i19 = ChatActivityEnterView.j5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i20 = chatActivityEnterView.N;
                long j10 = chatActivityEnterView.M2;
                String str = chatActivityEnterView.f0;
                String str2 = chatActivityEnterView.g0;
                org.telegram.ui.xn xnVar5 = chatActivityEnterView.L2;
                rh.z3 b10 = rh.z3.b(i20, j10, j10, str, str2, 2, 0, xnVar5 == null ? 0L : xnVar5.N8(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.D1.P().m(b10) != null) {
                    rh.a0 a0Var2 = chatActivityEnterView.i0;
                    if (a0Var2 != null) {
                        a0Var2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.wb0.l(chatActivityEnterView.g0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.N).getUser(Long.valueOf(chatActivityEnterView.M2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.N).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.N);
                        MessagesController.showCantOpenAlert(xnVar5, restrictionReason);
                        break;
                    } else {
                        rh.q2 q2Var = new rh.q2(chatActivityEnterView.getContext(), chatActivityEnterView.S3);
                        q2Var.w(false);
                        q2Var.x0 = true;
                        q2Var.h0 = chatActivityEnterView.K2;
                        q2Var.s(xnVar5, b10);
                        q2Var.show();
                        rh.a0 a0Var3 = chatActivityEnterView.i0;
                        if (a0Var3 != null) {
                            a0Var3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    af.f fVar = new af.f();
                    fVar.c = new id(chatActivityEnterView, i11);
                    af.g.k(chatActivityEnterView.getContext(), chatActivityEnterView.g0, false, false, fVar);
                    break;
                }
                break;
            default:
                if (chatActivityEnterView.i0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                    chatActivityEnterView.i0.setOpened(false);
                    break;
                }
                break;
        }
    }
}
