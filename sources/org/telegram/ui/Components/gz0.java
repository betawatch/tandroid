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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gz0 implements org.telegram.ui.vt {
    public final /* synthetic */ lz0 a;

    public gz0(lz0 lz0Var) {
        this.a = lz0Var;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final void C(TLRPC.Document document) {
        lz0 lz0Var = this.a;
        jz0 jz0Var = lz0Var.c;
        if (jz0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 parentFragment = jz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) parentFragment).fb(document);
            lz0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean E(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final void H(TLRPC.Document document) {
        jz0 jz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (jz0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.sk.p(R.string.EmojiCopied, zc.a0(jz0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.vt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean c() {
        jz0 jz0Var = this.a.c;
        if (jz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 parentFragment = jz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.fo) {
            return ((org.telegram.ui.fo) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final boolean i() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean l(int i10) {
        jz0 jz0Var = this.a.c;
        if (jz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 parentFragment = jz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.fo) {
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) parentFragment;
            if (foVar.H6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (foVar.i() != null && UserObject.isUserSelf(foVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ l80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        lz0 lz0Var = this.a;
        org.telegram.ui.ActionBar.c6 c6Var = lz0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(lz0Var.a).updateEmojiStatus(emojiStatus);
        g90 g90Var = new g90(24, this, tL_emojiStatusEmpty);
        jz0 jz0Var = lz0Var.c;
        org.telegram.ui.ActionBar.m2 parentFragment = jz0Var == null ? null : jz0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                zc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), g90Var).j();
                return;
            }
            kc kcVar = new kc(lz0Var.getContext(), c6Var);
            kcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            kcVar.a.setImageResource(R.drawable.msg_settings_premium);
            qc qcVar = new qc(lz0Var.getContext(), c6Var, true);
            qcVar.a = g90Var;
            kcVar.setButton(qcVar);
            sc.g(parentFragment, kcVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.vt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.mt mtVar) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
