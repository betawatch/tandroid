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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ly0 implements org.telegram.ui.ot {
    public final /* synthetic */ qy0 a;

    public ly0(qy0 qy0Var) {
        this.a = qy0Var;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void B(TLRPC.Document document) {
        qy0 qy0Var = this.a;
        oy0 oy0Var = qy0Var.c;
        if (oy0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) parentFragment).bb(document);
            qy0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final boolean D(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ String F(boolean z4) {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final void G(TLRPC.Document document) {
        oy0 oy0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (oy0Var = this.a.c) == null) {
            return;
        }
        org.telegram.ui.b.m(R.string.EmojiCopied, qc.a0(oy0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ q70 I(ag.l lVar) {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.a.B || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ot
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final boolean c() {
        oy0 oy0Var = this.a.c;
        if (oy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final boolean k(int i10) {
        oy0 oy0Var = this.a.c;
        if (oy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) parentFragment;
            if (xnVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (xnVar.i() != null && UserObject.isUserSelf(xnVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        qy0 qy0Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = qy0Var.b;
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
        b90 b90Var = new b90(22, this, tL_emojiStatusEmpty);
        oy0 oy0Var = qy0Var.c;
        org.telegram.ui.ActionBar.p2 parentFragment = oy0Var == null ? null : oy0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                qc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), b90Var).j();
                return;
            }
            ac acVar = new ac(qy0Var.getContext(), g6Var);
            acVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            acVar.a.setImageResource(R.drawable.msg_settings_premium);
            gc gcVar = new gc(qy0Var.getContext(), g6Var, true);
            gcVar.a = b90Var;
            acVar.setButton(gcVar);
            ic.g(parentFragment, acVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ot
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void z(CharSequence charSequence, String str, xk xkVar) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
