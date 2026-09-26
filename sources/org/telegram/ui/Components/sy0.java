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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class sy0 implements org.telegram.ui.lt {
    public final /* synthetic */ xy0 a;

    public sy0(xy0 xy0Var) {
        this.a = xy0Var;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final void C(TLRPC.Document document) {
        xy0 xy0Var = this.a;
        vy0 vy0Var = xy0Var.c;
        if (vy0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 parentFragment = vy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) parentFragment).bb(document);
            xy0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final boolean E(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final void H(TLRPC.Document document) {
        vy0 vy0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (vy0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.ok.o(R.string.EmojiCopied, xc.a0(vy0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.lt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final boolean c() {
        vy0 vy0Var = this.a.c;
        if (vy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 parentFragment = vy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final boolean i() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ y70 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final boolean m(int i10) {
        vy0 vy0Var = this.a.c;
        if (vy0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 parentFragment = vy0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) parentFragment;
            if (wnVar.E6()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (wnVar.i() != null && UserObject.isUserSelf(wnVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        xy0 xy0Var = this.a;
        org.telegram.ui.ActionBar.d6 d6Var = xy0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(xy0Var.a).updateEmojiStatus(emojiStatus);
        wn0 wn0Var = new wn0(11, this, tL_emojiStatusEmpty);
        vy0 vy0Var = xy0Var.c;
        org.telegram.ui.ActionBar.m2 parentFragment = vy0Var == null ? null : vy0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                xc.a0(parentFragment).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), wn0Var).j();
                return;
            }
            ic icVar = new ic(xy0Var.getContext(), d6Var);
            icVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            icVar.a.setImageResource(R.drawable.msg_settings_premium);
            oc ocVar = new oc(xy0Var.getContext(), d6Var, true);
            ocVar.a = wn0Var;
            icVar.setButton(ocVar);
            qc.g(parentFragment, icVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void r(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.lt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.bt btVar) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
