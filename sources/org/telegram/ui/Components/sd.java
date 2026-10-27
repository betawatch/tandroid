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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        pf pfVar;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 3:
                int i13 = ChatActivityEnterView.r5;
                AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 4));
                break;
            case 4:
                hi.i0 i0Var = chatActivityEnterView.l0;
                if (i0Var != null) {
                    i0Var.setOpened(false);
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
                if (!chatActivityEnterView.j2 && i11 != 0 && (pfVar = chatActivityEnterView.E0) != null) {
                    try {
                        pfVar.requestFocus();
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 6:
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.h5 == null) {
                        dgVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    break;
                }
                break;
            case 7:
                mf mfVar = chatActivityEnterView.L0;
                if (mfVar != null) {
                    mfVar.g(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.wn wnVar2 = chatActivityEnterView.P2;
                if (wnVar2 == null || wnVar2.isLastFragment()) {
                    chatActivityEnterView.L();
                }
                chatActivityEnterView.N4 = null;
                break;
            case 9:
                int i14 = ChatActivityEnterView.r5;
                chatActivityEnterView.P1();
                break;
            case 10:
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.t(0.0f);
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
                int i15 = ChatActivityEnterView.r5;
                chatActivityEnterView.I0();
                break;
            case 14:
                wc.b0(chatActivityEnterView.P2).U(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                break;
            case 15:
                pf pfVar2 = chatActivityEnterView.E0;
                if (pfVar2 != null) {
                    pfVar2.setText("");
                    break;
                }
                break;
            case 16:
                pf pfVar3 = chatActivityEnterView.E0;
                if (pfVar3 != null) {
                    pfVar3.setText("");
                }
                chatActivityEnterView.F(true);
                break;
            case 17:
                mf mfVar2 = chatActivityEnterView.L0;
                if (mfVar2 != null) {
                    mfVar2.g(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ie(chatActivityEnterView, i12), 600L);
                break;
            case 18:
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new qe(chatActivityEnterView, i11), chatActivityEnterView.W3);
                break;
            case 19:
                int i16 = ChatActivityEnterView.r5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.Q0(2147483646, true, 0, true, 0L);
                mf mfVar3 = chatActivityEnterView2.L0;
                if (mfVar3 != null) {
                    mfVar3.g(false);
                    chatActivityEnterView2.L0 = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.wn wnVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && wnVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(li.c5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            c6[] c6VarArr = (c6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c6.class);
                            if (c6VarArr != null) {
                                int length = c6VarArr.length;
                                while (i12 < length) {
                                    c6VarArr[i12].applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), t5.g());
                                    i12++;
                                }
                            }
                            tj0.a(spannableStringBuilder);
                            chatActivityEnterView.K();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.P0();
                            break;
                        }
                    } else {
                        li.b2 b2Var = new li.b2(richMessage);
                        b2Var.e = true;
                        b2Var.setResourceProvider(chatActivityEnterView.W3);
                        b2Var.J = wnVar3;
                        b2Var.s = wnVar3.S;
                        b2Var.v = wnVar3.Y;
                        b2Var.L = new sd(chatActivityEnterView, 24);
                        b2Var.K = new sd(chatActivityEnterView, 25);
                        wnVar3.presentFragment(b2Var);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.wn wnVar4 = chatActivityEnterView.P2;
                if (wnVar4 != null) {
                    wnVar4.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar4, 43, true));
                    break;
                }
                break;
            case 22:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.F0();
                break;
            case 23:
                int i17 = ChatActivityEnterView.r5;
                chatActivityEnterView.t1(true, true);
                chatActivityEnterView.V = null;
                break;
            case 24:
                pf pfVar4 = chatActivityEnterView.E0;
                if (pfVar4 != null) {
                    pfVar4.setText("");
                    break;
                }
                break;
            case 25:
                pf pfVar5 = chatActivityEnterView.E0;
                if (pfVar5 != null) {
                    pfVar5.setText("");
                }
                chatActivityEnterView.F(true);
                break;
            case 26:
                int i18 = ChatActivityEnterView.r5;
                chatActivityEnterView.S0();
                break;
            case 27:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.F0();
                break;
            case 28:
                int i19 = ChatActivityEnterView.r5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i20 = chatActivityEnterView.Q;
                long j10 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.i0;
                String str2 = chatActivityEnterView.j0;
                org.telegram.ui.wn wnVar5 = chatActivityEnterView.P2;
                hi.c5 b10 = hi.c5.b(i20, j10, j10, str, str2, 2, 0, wnVar5 == null ? 0L : wnVar5.a9(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().k(b10) != null) {
                    hi.i0 i0Var2 = chatActivityEnterView.l0;
                    if (i0Var2 != null) {
                        i0Var2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.ob0.q(chatActivityEnterView.j0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.Q).getUser(Long.valueOf(chatActivityEnterView.Q2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.Q);
                        MessagesController.showCantOpenAlert(wnVar5, restrictionReason);
                        break;
                    } else {
                        hi.m3 m3Var = new hi.m3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                        m3Var.x(false);
                        m3Var.B0 = true;
                        m3Var.l0 = chatActivityEnterView.O2;
                        m3Var.t(wnVar5, b10);
                        m3Var.show();
                        hi.i0 i0Var3 = chatActivityEnterView.l0;
                        if (i0Var3 != null) {
                            i0Var3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    qf.c cVar = new qf.c();
                    cVar.c = new sd(chatActivityEnterView, 3);
                    qf.d.j(chatActivityEnterView.getContext(), chatActivityEnterView.j0, false, false, cVar);
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
