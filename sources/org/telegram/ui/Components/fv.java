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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fv implements org.telegram.ui.rt {
    public final /* synthetic */ wv a;

    public fv(wv wvVar) {
        this.a = wvVar;
    }

    @Override // org.telegram.ui.rt
    public final void A(TLRPC.Document document) {
        wv wvVar = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = wvVar.c;
        if (p2Var instanceof org.telegram.ui.eo) {
            ((org.telegram.ui.eo) p2Var).bb(document);
        }
        wvVar.Y();
        wvVar.dismiss();
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean C(TLRPC.Document document) {
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ String E(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final void G(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.f6 f6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            wv wvVar = this.a;
            viewGroup = ((org.telegram.ui.ActionBar.h3) wvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
            org.telegram.messenger.em.o(R.string.EmojiCopied, new wc((FrameLayout) viewGroup, f6Var));
        }
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ w70 K(bi.n7 n7Var) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.rt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.c;
        if (p2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) p2Var).c();
        }
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean k(int i10) {
        wv wvVar = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = wvVar.c;
        if (!(p2Var instanceof org.telegram.ui.eo) || !((org.telegram.ui.eo) p2Var).E6()) {
            return false;
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            return true;
        }
        return ((org.telegram.ui.eo) wvVar.c).i() != null && UserObject.isUserSelf(((org.telegram.ui.eo) wvVar.c).i());
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void t(TLRPC.Document document) {
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
        wv wvVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.h3) wvVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        ee eeVar = new ee(27, this, tL_emojiStatusEmpty);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) wvVar).containerView;
            f6Var = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
            new wc((FrameLayout) viewGroup, f6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), eeVar).j();
            return;
        }
        Context context = wvVar.getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
        hc hcVar = new hc(context, f6Var2);
        hcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        hcVar.a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = wvVar.getContext();
        f6Var3 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
        nc ncVar = new nc(context2, f6Var3, true);
        ncVar.a = eeVar;
        hcVar.setButton(ncVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.h3) wvVar).containerView;
        pc.f((FrameLayout) viewGroup2, hcVar, 1500).j();
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void D(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.rt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
