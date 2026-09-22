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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class iy0 implements org.telegram.ui.qt {
    public final /* synthetic */ ny0 a;

    public iy0(ny0 ny0Var) {
        this.a = ny0Var;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void B(TLRPC.Document document) {
        ny0 ny0Var = this.a;
        ly0 ly0Var = ny0Var.c;
        if (ly0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ly0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) parentFragment).bb(document);
            ny0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean D(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final void H(TLRPC.Document document) {
        ly0 ly0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (ly0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.vl.p(R.string.EmojiCopied, vc.a0(ly0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.qt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean c() {
        ly0 ly0Var = this.a.c;
        if (ly0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ly0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bo) {
            return ((org.telegram.ui.bo) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ n70 i(ci.n6 n6Var) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean l(int i10) {
        ly0 ly0Var = this.a.c;
        if (ly0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = ly0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bo) {
            org.telegram.ui.bo boVar = (org.telegram.ui.bo) parentFragment;
            if (boVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (boVar.i() != null && UserObject.isUserSelf(boVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        ny0 ny0Var = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = ny0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(ny0Var.a).updateEmojiStatus(emojiStatus);
        ar0 ar0Var = new ar0(6, this, tL_emojiStatusEmpty);
        ly0 ly0Var = ny0Var.c;
        org.telegram.ui.ActionBar.n2 parentFragment = ly0Var == null ? null : ly0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                vc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ar0Var).j();
                return;
            }
            gc gcVar = new gc(ny0Var.getContext(), e6Var);
            gcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            gcVar.a.setImageResource(R.drawable.msg_settings_premium);
            mc mcVar = new mc(ny0Var.getContext(), e6Var, true);
            mcVar.a = ar0Var;
            gcVar.setButton(mcVar);
            oc.g(parentFragment, gcVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.qt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void G(CharSequence charSequence, String str, org.telegram.ui.nf nfVar) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
