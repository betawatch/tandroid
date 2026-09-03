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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ly0 implements org.telegram.ui.pt {
    public final /* synthetic */ qy0 a;

    public ly0(qy0 qy0Var) {
        this.a = qy0Var;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void C(TLRPC.Document document) {
        qy0 qy0Var = this.a;
        oy0 oy0Var = qy0Var.c;
        if (oy0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) parentFragment).bb(document);
            qy0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean E(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ String G(boolean z4) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final void H(TLRPC.Document document) {
        oy0 oy0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (oy0Var = this.a.c) == null) {
            return;
        }
        org.telegram.ui.b.m(R.string.EmojiCopied, qc.a0(oy0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.a.B || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.pt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean c() {
        oy0 oy0Var = this.a.c;
        if (oy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ p70 d(ah.e eVar) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean f(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final boolean i() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean l(int i10) {
        oy0 oy0Var = this.a.c;
        if (oy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) parentFragment;
            if (znVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (znVar.i() != null && UserObject.isUserSelf(znVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        qy0 qy0Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = qy0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(qy0Var.a).updateEmojiStatus(emojiStatus);
        z80 z80Var = new z80(23, this, tL_emojiStatusEmpty);
        oy0 oy0Var = qy0Var.c;
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var == null ? null : oy0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                qc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), z80Var).j();
                return;
            }
            ac acVar = new ac(qy0Var.getContext(), f6Var);
            acVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            acVar.a.setImageResource(R.drawable.msg_settings_premium);
            gc gcVar = new gc(qy0Var.getContext(), f6Var, true);
            gcVar.a = z80Var;
            acVar.setButton(gcVar);
            ic.g(parentFragment, acVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.pt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void A(CharSequence charSequence, String str, vk vkVar) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
