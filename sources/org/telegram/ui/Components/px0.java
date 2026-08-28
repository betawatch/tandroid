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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class px0 implements org.telegram.ui.ft {
    public final /* synthetic */ ux0 a;

    public px0(ux0 ux0Var) {
        this.a = ux0Var;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void B(TLRPC.Document document) {
        ux0 ux0Var = this.a;
        sx0 sx0Var = ux0Var.c;
        if (sx0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = sx0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.qn) {
            ((org.telegram.ui.qn) parentFragment).bb(document);
            ux0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean D(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void H(TLRPC.Document document) {
        sx0 sx0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (sx0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.ll.o(R.string.EmojiCopied, oc.a0(sx0Var.getParentFragment()));
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
        sx0 sx0Var = this.a.c;
        if (sx0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = sx0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) parentFragment).c();
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
    public final boolean k(int i9) {
        sx0 sx0Var = this.a.c;
        if (sx0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 parentFragment = sx0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) parentFragment;
            if (qnVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (qnVar.i() != null && UserObject.isUserSelf(qnVar.i())) {
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
    public final /* synthetic */ x60 r(fh.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        ux0 ux0Var = this.a;
        org.telegram.ui.ActionBar.b6 b6Var = ux0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(ux0Var.a).updateEmojiStatus(emojiStatus);
        jg0 jg0Var = new jg0(18, this, tL_emojiStatusEmpty);
        sx0 sx0Var = ux0Var.c;
        org.telegram.ui.ActionBar.o2 parentFragment = sx0Var == null ? null : sx0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                oc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), jg0Var).j();
                return;
            }
            yb ybVar = new yb(ux0Var.getContext(), b6Var);
            ybVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            ybVar.a.setImageResource(R.drawable.msg_settings_premium);
            ec ecVar = new ec(ux0Var.getContext(), b6Var, true);
            ecVar.a = jg0Var;
            ybVar.setButton(ecVar);
            gc.g(parentFragment, ybVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void E(TLRPC.Document document) {
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
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.ft
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
    }
}
