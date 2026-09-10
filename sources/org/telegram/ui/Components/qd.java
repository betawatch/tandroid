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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        rf rfVar;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
                if (eoVar != null) {
                    eoVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 1:
                int i13 = ChatActivityEnterView.m5;
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
                di.f0 f0Var = chatActivityEnterView.l0;
                if (f0Var != null) {
                    f0Var.setOpened(false);
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
                if (!chatActivityEnterView.i2 && i11 != 0 && (rfVar = chatActivityEnterView.E0) != null) {
                    try {
                        rfVar.requestFocus();
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 6:
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView.c5 == null) {
                        fgVar.getLayoutParams().height = chatActivityEnterView.C3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    break;
                }
                break;
            case 7:
                of ofVar = chatActivityEnterView.L0;
                if (ofVar != null) {
                    ofVar.h(chatActivityEnterView.D4);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.eo eoVar2 = chatActivityEnterView.O2;
                if (eoVar2 == null || eoVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.M4 = null;
                break;
            case 9:
                int i14 = ChatActivityEnterView.m5;
                chatActivityEnterView.S1();
                break;
            case 10:
                qg qgVar = chatActivityEnterView.Y2;
                if (qgVar != null) {
                    qgVar.y(0.0f);
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
                wc.a0(chatActivityEnterView.O2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
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
                chatActivityEnterView.K(true);
                break;
            case 17:
                of ofVar2 = chatActivityEnterView.L0;
                if (ofVar2 != null) {
                    ofVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ie(chatActivityEnterView, i12), 600L);
                break;
            case 18:
                d5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new re(chatActivityEnterView, i11), chatActivityEnterView.V3);
                break;
            case 19:
                int i16 = ChatActivityEnterView.m5;
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
                org.telegram.ui.eo eoVar3 = chatActivityEnterView.O2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.D1;
                if (richMessage != null && chatActivityEnterView.E0 != null && eoVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.D1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hi.f5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                            if (y5VarArr != null) {
                                int length = y5VarArr.length;
                                while (i12 < length) {
                                    y5VarArr[i12].applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), p5.g());
                                    i12++;
                                }
                            }
                            cj0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            break;
                        }
                    } else {
                        hi.g2 g2Var = new hi.g2(richMessage);
                        g2Var.e = true;
                        g2Var.setResourceProvider(chatActivityEnterView.V3);
                        g2Var.J = eoVar3;
                        g2Var.s = eoVar3.S;
                        g2Var.v = eoVar3.Y;
                        g2Var.L = new qd(chatActivityEnterView, 24);
                        g2Var.K = new qd(chatActivityEnterView, 25);
                        eoVar3.presentFragment(g2Var);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.eo eoVar4 = chatActivityEnterView.O2;
                if (eoVar4 != null) {
                    eoVar4.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar4, 43, true));
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
                org.telegram.ui.eo eoVar5 = chatActivityEnterView.O2;
                di.j5 b10 = di.j5.b(i20, j3, j3, str, str2, 2, 0, eoVar5 == null ? 0L : eoVar5.N8(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    di.f0 f0Var2 = chatActivityEnterView.l0;
                    if (f0Var2 != null) {
                        f0Var2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.fc0.l(chatActivityEnterView.j0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.Q).getUser(Long.valueOf(chatActivityEnterView.P2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.Q);
                        MessagesController.showCantOpenAlert(eoVar5, restrictionReason);
                        break;
                    } else {
                        di.n3 n3Var = new di.n3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
                        n3Var.w(false);
                        n3Var.A0 = true;
                        n3Var.k0 = chatActivityEnterView.N2;
                        n3Var.s(eoVar5, b10);
                        n3Var.show();
                        di.f0 f0Var3 = chatActivityEnterView.l0;
                        if (f0Var3 != null) {
                            f0Var3.setOpened(false);
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
