package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rx0 implements org.telegram.ui.ht {
    public final /* synthetic */ wx0 a;

    public rx0(wx0 wx0Var) {
        this.a = wx0Var;
    }

    @Override // org.telegram.ui.ht
    public final void A(TLRPC.Document document) {
        wx0 wx0Var = this.a;
        ux0 ux0Var = wx0Var.c;
        if (ux0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ux0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.rn) {
            ((org.telegram.ui.rn) parentFragment).bb(document);
            wx0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean C(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final void G(TLRPC.Document document) {
        ux0 ux0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (ux0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.rl.m(R.string.EmojiCopied, mc.a0(ux0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ b70 L(ag.y1 y1Var) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.a.A || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ht
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean c() {
        ux0 ux0Var = this.a.c;
        if (ux0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ux0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.rn) {
            return ((org.telegram.ui.rn) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean k(int i10) {
        ux0 ux0Var = this.a.c;
        if (ux0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ux0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) parentFragment;
            if (rnVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (rnVar.i() != null && UserObject.isUserSelf(rnVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        wx0 wx0Var = this.a;
        org.telegram.ui.ActionBar.c6 c6Var = wx0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(wx0Var.a).updateEmojiStatus(emojiStatus);
        lg0 lg0Var = new lg0(18, this, tL_emojiStatusEmpty);
        ux0 ux0Var = wx0Var.c;
        org.telegram.ui.ActionBar.n2 parentFragment = ux0Var == null ? null : ux0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                mc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), lg0Var).j();
                return;
            }
            wb wbVar = new wb(wx0Var.getContext(), c6Var);
            wbVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            wbVar.a.setImageResource(R.drawable.msg_settings_premium);
            cc ccVar = new cc(wx0Var.getContext(), c6Var, true);
            ccVar.a = lg0Var;
            wbVar.setButton(ccVar);
            ec.g(parentFragment, wbVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void D(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ht
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void E(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
