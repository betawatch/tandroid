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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jz0 implements org.telegram.ui.pt {
    public final /* synthetic */ oz0 a;

    public jz0(oz0 oz0Var) {
        this.a = oz0Var;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void C(TLRPC.Document document) {
        oz0 oz0Var = this.a;
        mz0 mz0Var = oz0Var.c;
        if (mz0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = mz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) parentFragment).fb(document);
            oz0Var.c.setFieldText("");
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
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final void H(TLRPC.Document document) {
        mz0 mz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (mz0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.bi.p(R.string.EmojiCopied, ad.a0(mz0Var.getParentFragment()));
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
        if (this.a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        mz0 mz0Var = this.a.c;
        if (mz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = mz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
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
    public final /* synthetic */ p80 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean m(int i10) {
        mz0 mz0Var = this.a.c;
        if (mz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = mz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) parentFragment;
            if (znVar.H6()) {
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
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        oz0 oz0Var = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = oz0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(oz0Var.a).updateEmojiStatus(emojiStatus);
        ci0 ci0Var = new ci0(18, this, tL_emojiStatusEmpty);
        mz0 mz0Var = oz0Var.c;
        org.telegram.ui.ActionBar.n2 parentFragment = mz0Var == null ? null : mz0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                ad.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ci0Var).j();
                return;
            }
            lc lcVar = new lc(oz0Var.getContext(), e6Var);
            lcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            lcVar.a.setImageResource(R.drawable.msg_settings_premium);
            rc rcVar = new rc(oz0Var.getContext(), e6Var, true);
            rcVar.a = ci0Var;
            lcVar.setButton(rcVar);
            tc.g(parentFragment, lcVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean y() {
        return true;
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
    public final /* synthetic */ void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void r(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.pt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.ft ftVar) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
