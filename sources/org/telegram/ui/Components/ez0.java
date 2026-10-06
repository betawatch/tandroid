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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ez0 implements org.telegram.ui.pt {
    public final /* synthetic */ jz0 a;

    public ez0(jz0 jz0Var) {
        this.a = jz0Var;
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
        jz0 jz0Var = this.a;
        hz0 hz0Var = jz0Var.c;
        if (hz0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = hz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.yn) {
            ((org.telegram.ui.yn) parentFragment).ab(document);
            jz0Var.c.setFieldText("");
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
        hz0 hz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (hz0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.bi.n(R.string.EmojiCopied, yc.a0(hz0Var.getParentFragment()));
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
        hz0 hz0Var = this.a.c;
        if (hz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = hz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.yn) {
            return ((org.telegram.ui.yn) parentFragment).c();
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
    public final /* synthetic */ b80 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean m(int i10) {
        hz0 hz0Var = this.a.c;
        if (hz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = hz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.yn) {
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) parentFragment;
            if (ynVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (ynVar.i() != null && UserObject.isUserSelf(ynVar.i())) {
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
        jz0 jz0Var = this.a;
        org.telegram.ui.ActionBar.d6 d6Var = jz0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(jz0Var.a).updateEmojiStatus(emojiStatus);
        vo0 vo0Var = new vo0(10, this, tL_emojiStatusEmpty);
        hz0 hz0Var = jz0Var.c;
        org.telegram.ui.ActionBar.n2 parentFragment = hz0Var == null ? null : hz0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                yc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), vo0Var).j();
                return;
            }
            jc jcVar = new jc(jz0Var.getContext(), d6Var);
            jcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            jcVar.a.setImageResource(R.drawable.msg_settings_premium);
            pc pcVar = new pc(jz0Var.getContext(), d6Var, true);
            pcVar.a = vo0Var;
            jcVar.setButton(pcVar);
            rc.g(parentFragment, jcVar, 1500).j();
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
