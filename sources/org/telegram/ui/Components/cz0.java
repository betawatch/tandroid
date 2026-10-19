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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class cz0 implements org.telegram.ui.ct {
    public final /* synthetic */ hz0 a;

    public cz0(hz0 hz0Var) {
        this.a = hz0Var;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final void C(TLRPC.Document document) {
        hz0 hz0Var = this.a;
        fz0 fz0Var = hz0Var.c;
        if (fz0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = fz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.qn) {
            ((org.telegram.ui.qn) parentFragment).fb(document);
            hz0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final boolean E(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ct
    public final void H(TLRPC.Document document) {
        fz0 fz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new a6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (fz0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.kk.p(R.string.EmojiCopied, xc.a0(fz0Var.getParentFragment()));
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (this.a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ct
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ct
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final boolean c() {
        fz0 fz0Var = this.a.c;
        if (fz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = fz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) parentFragment).c();
        }
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ct
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final boolean k(int i10) {
        fz0 fz0Var = this.a.c;
        if (fz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 parentFragment = fz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) parentFragment;
            if (qnVar.H6()) {
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

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ i80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.ct
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        hz0 hz0Var = this.a;
        org.telegram.ui.ActionBar.d6 d6Var = hz0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(hz0Var.a).updateEmojiStatus(emojiStatus);
        go0 go0Var = new go0(12, this, tL_emojiStatusEmpty);
        fz0 fz0Var = hz0Var.c;
        org.telegram.ui.ActionBar.n2 parentFragment = fz0Var == null ? null : fz0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                xc.a0(parentFragment).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), go0Var).j();
                return;
            }
            ic icVar = new ic(hz0Var.getContext(), d6Var);
            icVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            icVar.a.setImageResource(R.drawable.msg_settings_premium);
            oc ocVar = new oc(hz0Var.getContext(), d6Var, true);
            ocVar.a = go0Var;
            icVar.setButton(ocVar);
            qc.g(parentFragment, icVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.ct
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void t(CharSequence charSequence, String str, qy qyVar) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
