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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class cv implements org.telegram.ui.qt {
    public final /* synthetic */ tv a;

    public cv(tv tvVar) {
        this.a = tvVar;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void C(TLRPC.Document document) {
        tv tvVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = tvVar.c;
        if (n2Var instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) n2Var).bb(document);
        }
        tvVar.Y();
        tvVar.dismiss();
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean E(TLRPC.Document document) {
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document);
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final void H(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.f6 f6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            tv tvVar = this.a;
            viewGroup = ((org.telegram.ui.ActionBar.f3) tvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
            org.telegram.messenger.rk.o(R.string.EmojiCopied, new xc((FrameLayout) viewGroup, f6Var));
        }
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
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        org.telegram.ui.ActionBar.n2 n2Var = this.a.c;
        if (n2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) n2Var).c();
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
    public final /* synthetic */ y70 i(ci.n6 n6Var) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean l(int i10) {
        tv tvVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = tvVar.c;
        if (!(n2Var instanceof org.telegram.ui.zn) || !((org.telegram.ui.zn) n2Var).E6()) {
            return false;
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            return true;
        }
        return ((org.telegram.ui.zn) tvVar.c).i() != null && UserObject.isUserSelf(((org.telegram.ui.zn) tvVar.c).i());
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void v(TLRPC.Document document) {
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
        tv tvVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.f3) tvVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        bv bvVar = new bv(0, this, tL_emojiStatusEmpty);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) tvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
            new xc((FrameLayout) viewGroup, f6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), bvVar).j();
            return;
        }
        Context context = tvVar.getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
        hc hcVar = new hc(context, f6Var2);
        hcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        hcVar.a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = tvVar.getContext();
        f6Var3 = ((org.telegram.ui.ActionBar.f3) tvVar).resourcesProvider;
        nc ncVar = new nc(context2, f6Var3, true);
        ncVar.a = bvVar;
        hcVar.setButton(ncVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) tvVar).containerView;
        pc.f((FrameLayout) viewGroup2, hcVar, 1500).j();
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void F(TLRPC.Document document) {
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
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.qt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void u(CharSequence charSequence, String str, org.telegram.ui.of ofVar) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
