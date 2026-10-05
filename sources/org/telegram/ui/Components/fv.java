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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fv implements org.telegram.ui.pt {
    public final /* synthetic */ wv a;

    public fv(wv wvVar) {
        this.a = wvVar;
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
        wv wvVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = wvVar.c;
        if (n2Var instanceof org.telegram.ui.yn) {
            ((org.telegram.ui.yn) n2Var).ab(document);
        }
        wvVar.X();
        wvVar.dismiss();
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean E(TLRPC.Document document) {
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document);
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final void H(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.d6 d6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            wv wvVar = this.a;
            viewGroup = ((org.telegram.ui.ActionBar.f3) wvVar).containerView;
            d6Var = ((org.telegram.ui.ActionBar.f3) wvVar).resourcesProvider;
            org.telegram.messenger.bi.n(R.string.EmojiCopied, new yc((FrameLayout) viewGroup, d6Var));
        }
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
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        org.telegram.ui.ActionBar.n2 n2Var = this.a.c;
        if (n2Var instanceof org.telegram.ui.yn) {
            return ((org.telegram.ui.yn) n2Var).c();
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
        wv wvVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = wvVar.c;
        if (!(n2Var instanceof org.telegram.ui.yn) || !((org.telegram.ui.yn) n2Var).E6()) {
            return false;
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            return true;
        }
        return ((org.telegram.ui.yn) wvVar.c).i() != null && UserObject.isUserSelf(((org.telegram.ui.yn) wvVar.c).i());
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
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
        wv wvVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.f3) wvVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        be beVar = new be(28, this, tL_emojiStatusEmpty);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) wvVar).containerView;
            d6Var = ((org.telegram.ui.ActionBar.f3) wvVar).resourcesProvider;
            new yc((FrameLayout) viewGroup, d6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), beVar).j();
            return;
        }
        Context context = wvVar.getContext();
        d6Var2 = ((org.telegram.ui.ActionBar.f3) wvVar).resourcesProvider;
        jc jcVar = new jc(context, d6Var2);
        jcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        jcVar.a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = wvVar.getContext();
        d6Var3 = ((org.telegram.ui.ActionBar.f3) wvVar).resourcesProvider;
        pc pcVar = new pc(context2, d6Var3, true);
        pcVar.a = beVar;
        jcVar.setButton(pcVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) wvVar).containerView;
        rc.f((FrameLayout) viewGroup2, jcVar, 1500).j();
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
