package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vu implements org.telegram.ui.nt {
    public final /* synthetic */ mv a;

    public vu(mv mvVar) {
        this.a = mvVar;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void C(TLRPC.Document document) {
        mv mvVar = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = mvVar.c;
        if (p2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) p2Var).bb(document);
        }
        mvVar.Y();
        mvVar.dismiss();
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean E(TLRPC.Document document) {
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ String G(boolean z4) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final void H(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.f6 f6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            mv mvVar = this.a;
            viewGroup = ((org.telegram.ui.ActionBar.g3) mvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
            org.telegram.ui.b.m(R.string.EmojiCopied, new qc((FrameLayout) viewGroup, f6Var));
        }
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.nt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.c;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).c();
        }
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ o70 d(ah.d dVar) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean f(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final boolean i() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean l(int i10) {
        mv mvVar = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = mvVar.c;
        if (!(p2Var instanceof org.telegram.ui.xn) || !((org.telegram.ui.xn) p2Var).E6()) {
            return false;
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            return true;
        }
        return ((org.telegram.ui.xn) mvVar.c).i() != null && UserObject.isUserSelf(((org.telegram.ui.xn) mvVar.c).i());
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        ViewGroup viewGroup2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        mv mvVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.g3) mvVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        il ilVar = new il(12, this, tL_emojiStatusEmpty);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) mvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
            new qc((FrameLayout) viewGroup, f6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ilVar).j();
            return;
        }
        Context context = mvVar.getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
        ac acVar = new ac(context, f6Var2);
        acVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        acVar.a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = mvVar.getContext();
        f6Var3 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
        gc gcVar = new gc(context2, f6Var3, true);
        gcVar.a = ilVar;
        acVar.setButton(gcVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.g3) mvVar).containerView;
        ic.f((FrameLayout) viewGroup2, acVar, 1500).j();
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.nt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void A(CharSequence charSequence, String str, vk vkVar) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
