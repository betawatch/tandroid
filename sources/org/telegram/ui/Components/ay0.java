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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ay0 implements org.telegram.ui.ft {
    public final /* synthetic */ fy0 a;

    public ay0(fy0 fy0Var) {
        this.a = fy0Var;
    }

    @Override // org.telegram.ui.ft
    public final void A(TLRPC.Document document) {
        fy0 fy0Var = this.a;
        dy0 dy0Var = fy0Var.c;
        if (dy0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = dy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) parentFragment).bb(document);
            fy0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean C(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String E(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ j70 G(bg.d1 d1Var) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void H(TLRPC.Document document) {
        dy0 dy0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (dy0Var = this.a.c) == null) {
            return;
        }
        org.telegram.ui.b.n(R.string.EmojiCopied, tc.a0(dy0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.a.A || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ft
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean c() {
        dy0 dy0Var = this.a.c;
        if (dy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = dy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.tn) {
            return ((org.telegram.ui.tn) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean k(int i10) {
        dy0 dy0Var = this.a.c;
        if (dy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = dy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.tn) {
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) parentFragment;
            if (tnVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (tnVar.i() != null && UserObject.isUserSelf(tnVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        fy0 fy0Var = this.a;
        org.telegram.ui.ActionBar.c6 c6Var = fy0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(fy0Var.a).updateEmojiStatus(emojiStatus);
        ii0 ii0Var = new ii0(15, this, tL_emojiStatusEmpty);
        dy0 dy0Var = fy0Var.c;
        org.telegram.ui.ActionBar.o2 parentFragment = dy0Var == null ? null : dy0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                tc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ii0Var).j();
                return;
            }
            ec ecVar = new ec(fy0Var.getContext(), c6Var);
            ecVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            ecVar.a.setImageResource(R.drawable.msg_settings_premium);
            kc kcVar = new kc(fy0Var.getContext(), c6Var, true);
            kcVar.a = ii0Var;
            ecVar.setButton(kcVar);
            mc.g(parentFragment, ecVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void D(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ft
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.tm tmVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
