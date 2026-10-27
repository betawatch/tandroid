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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jv implements org.telegram.ui.ft {
    public final /* synthetic */ aw a;

    public jv(aw awVar) {
        this.a = awVar;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void B(TLRPC.Document document) {
        aw awVar = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = awVar.c;
        if (r2Var instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) r2Var).pb(document);
        }
        awVar.i0();
        awVar.dismiss();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean D(TLRPC.Document document) {
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void G(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.u6 u6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new c6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            aw awVar = this.a;
            viewGroup = ((org.telegram.ui.ActionBar.k3) awVar).containerView;
            u6Var = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            org.telegram.messenger.wh.m(R.string.EmojiCopied, new wc((FrameLayout) viewGroup, u6Var));
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        org.telegram.ui.ActionBar.r2 r2Var = this.a.c;
        if (r2Var instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) r2Var).c();
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
    public final /* synthetic */ l80 i(bh.p pVar) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean l(int i10) {
        aw awVar = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = awVar.c;
        if (!(r2Var instanceof org.telegram.ui.wn) || !((org.telegram.ui.wn) r2Var).L6()) {
            return false;
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            return true;
        }
        return ((org.telegram.ui.wn) awVar.c).i() != null && UserObject.isUserSelf(((org.telegram.ui.wn) awVar.c).i());
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
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
        aw awVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.k3) awVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        so soVar = new so(11, this, tL_emojiStatusEmpty);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) awVar).containerView;
            u6Var = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            new wc((FrameLayout) viewGroup, u6Var).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), soVar).j();
            return;
        }
        Context context = awVar.getContext();
        u6Var2 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
        ic icVar = new ic(context, u6Var2);
        icVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        icVar.a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = awVar.getContext();
        u6Var3 = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
        oc ocVar = new oc(context2, u6Var3, true);
        ocVar.b = soVar;
        icVar.setButton(ocVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.k3) awVar).containerView;
        qc.f((FrameLayout) viewGroup2, icVar, 1500).j();
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
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void N(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.ft
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void O(CharSequence charSequence, String str, oy oyVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
