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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class uy0 implements org.telegram.ui.rt {
    public final /* synthetic */ zy0 a;

    public uy0(zy0 zy0Var) {
        this.a = zy0Var;
    }

    @Override // org.telegram.ui.rt
    public final void A(TLRPC.Document document) {
        zy0 zy0Var = this.a;
        xy0 xy0Var = zy0Var.c;
        if (xy0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = xy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.eo) {
            ((org.telegram.ui.eo) parentFragment).bb(document);
            zy0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean C(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ String E(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final void G(TLRPC.Document document) {
        xy0 xy0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (xy0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.em.o(R.string.EmojiCopied, wc.a0(xy0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ w70 K(bi.n7 n7Var) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.rt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean c() {
        xy0 xy0Var = this.a.c;
        if (xy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = xy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean k(int i10) {
        xy0 xy0Var = this.a.c;
        if (xy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = xy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) parentFragment;
            if (eoVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (eoVar.i() != null && UserObject.isUserSelf(eoVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        zy0 zy0Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = zy0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(zy0Var.a).updateEmojiStatus(emojiStatus);
        yo0 yo0Var = new yo0(9, this, tL_emojiStatusEmpty);
        xy0 xy0Var = zy0Var.c;
        org.telegram.ui.ActionBar.p2 parentFragment = xy0Var == null ? null : xy0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                wc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), yo0Var).j();
                return;
            }
            hc hcVar = new hc(zy0Var.getContext(), f6Var);
            hcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            hcVar.a.setImageResource(R.drawable.msg_settings_premium);
            nc ncVar = new nc(zy0Var.getContext(), f6Var, true);
            ncVar.a = yo0Var;
            hcVar.setButton(ncVar);
            pc.g(parentFragment, hcVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void D(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.rt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
