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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ hd(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ff ffVar;
        int i9 = this.a;
        int i10 = 1;
        int i11 = 0;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i9) {
            case 0:
                org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                if (qnVar != null) {
                    qnVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 1:
                int i12 = ChatActivityEnterView.i5;
                AndroidUtilities.runOnUIThread(new hd(chatActivityEnterView, 4));
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
                mh.c0 c0Var = chatActivityEnterView.h0;
                if (c0Var != null) {
                    c0Var.setOpened(false);
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
                            i10 = 0;
                        }
                    }
                }
                if (!chatActivityEnterView.e2 && i10 != 0 && (ffVar = chatActivityEnterView.A0) != null) {
                    try {
                        ffVar.requestFocus();
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 6:
                uf ufVar = chatActivityEnterView.Q0;
                if (ufVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        ufVar.getLayoutParams().height = chatActivityEnterView.y3;
                    }
                    chatActivityEnterView.Q0.setLayerType(0, null);
                    break;
                }
                break;
            case 7:
                cf cfVar = chatActivityEnterView.H0;
                if (cfVar != null) {
                    cfVar.h(chatActivityEnterView.z4);
                    chatActivityEnterView.H0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.qn qnVar2 = chatActivityEnterView.K2;
                if (qnVar2 == null || qnVar2.isLastFragment()) {
                    chatActivityEnterView.O();
                }
                chatActivityEnterView.I4 = null;
                break;
            case 9:
                int i13 = ChatActivityEnterView.i5;
                chatActivityEnterView.S1();
                break;
            case 10:
                eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.o(0.0f);
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
                int i14 = ChatActivityEnterView.i5;
                chatActivityEnterView.L0();
                break;
            case 14:
                oc.a0(chatActivityEnterView.K2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                break;
            case 15:
                ff ffVar2 = chatActivityEnterView.A0;
                if (ffVar2 != null) {
                    ffVar2.setText("");
                    break;
                }
                break;
            case 16:
                ff ffVar3 = chatActivityEnterView.A0;
                if (ffVar3 != null) {
                    ffVar3.setText("");
                }
                chatActivityEnterView.J(true);
                break;
            case 17:
                cf cfVar2 = chatActivityEnterView.H0;
                if (cfVar2 != null) {
                    cfVar2.h(false);
                    chatActivityEnterView.H0 = null;
                }
                AndroidUtilities.runOnUIThread(new yd(chatActivityEnterView, i11), 600L);
                break;
            case 18:
                y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new he(chatActivityEnterView, i10), chatActivityEnterView.R3);
                break;
            case 19:
                int i15 = ChatActivityEnterView.i5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                cf cfVar3 = chatActivityEnterView2.H0;
                if (cfVar3 != null) {
                    cfVar3.h(false);
                    chatActivityEnterView2.H0 = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.qn qnVar3 = chatActivityEnterView.K2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.z1;
                if (richMessage != null && chatActivityEnterView.A0 != null && qnVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.M).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.z1;
                        if (richMessage2 != null && chatActivityEnterView.A0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qh.t4.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class);
                            if (t5VarArr != null) {
                                int length = t5VarArr.length;
                                while (i11 < length) {
                                    t5VarArr[i11].applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), k5.g());
                                    i11++;
                                }
                            }
                            fi0.a(spannableStringBuilder);
                            chatActivityEnterView.N();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            break;
                        }
                    } else {
                        qh.x1 x1Var = new qh.x1(richMessage);
                        x1Var.e = true;
                        x1Var.setResourceProvider(chatActivityEnterView.R3);
                        x1Var.F = qnVar3;
                        x1Var.s = qnVar3.O;
                        x1Var.v = qnVar3.U;
                        x1Var.H = new hd(chatActivityEnterView, 24);
                        x1Var.G = new hd(chatActivityEnterView, 25);
                        qnVar3.presentFragment(x1Var);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.qn qnVar4 = chatActivityEnterView.K2;
                if (qnVar4 != null) {
                    qnVar4.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar4, 43, true));
                    break;
                }
                break;
            case 22:
                chatActivityEnterView.g3 = false;
                chatActivityEnterView.H0();
                break;
            case 23:
                int i16 = ChatActivityEnterView.i5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.R = null;
                break;
            case 24:
                ff ffVar4 = chatActivityEnterView.A0;
                if (ffVar4 != null) {
                    ffVar4.setText("");
                    break;
                }
                break;
            case 25:
                ff ffVar5 = chatActivityEnterView.A0;
                if (ffVar5 != null) {
                    ffVar5.setText("");
                }
                chatActivityEnterView.J(true);
                break;
            case 26:
                int i17 = ChatActivityEnterView.i5;
                chatActivityEnterView.W0();
                break;
            case 27:
                chatActivityEnterView.g3 = false;
                chatActivityEnterView.H0();
                break;
            case 28:
                int i18 = ChatActivityEnterView.i5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i19 = chatActivityEnterView.M;
                long j10 = chatActivityEnterView.L2;
                String str = chatActivityEnterView.e0;
                String str2 = chatActivityEnterView.f0;
                org.telegram.ui.qn qnVar5 = chatActivityEnterView.K2;
                mh.s4 b10 = mh.s4.b(i19, j10, j10, str, str2, 2, 0, qnVar5 == null ? 0L : qnVar5.N8(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().k(b10) != null) {
                    mh.c0 c0Var2 = chatActivityEnterView.h0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.kb0.l(chatActivityEnterView.f0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.M).getUser(Long.valueOf(chatActivityEnterView.L2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.M).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.M);
                        MessagesController.showCantOpenAlert(qnVar5, restrictionReason);
                        break;
                    } else {
                        mh.c3 c3Var = new mh.c3(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
                        c3Var.w(false);
                        c3Var.w0 = true;
                        c3Var.g0 = chatActivityEnterView.J2;
                        c3Var.s(qnVar5, b10);
                        c3Var.show();
                        mh.c0 c0Var3 = chatActivityEnterView.h0;
                        if (c0Var3 != null) {
                            c0Var3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    ve.d dVar = new ve.d();
                    dVar.c = new hd(chatActivityEnterView, i10);
                    ve.e.k(chatActivityEnterView.getContext(), chatActivityEnterView.f0, false, false, dVar);
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
