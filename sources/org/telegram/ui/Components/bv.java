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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bv implements org.telegram.ui.qt {
    public final /* synthetic */ sv a;

    public bv(sv svVar) {
        this.a = svVar;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void B(TLRPC.Document document) {
        sv svVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = svVar.c;
        if (n2Var instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) n2Var).bb(document);
        }
        svVar.Y();
        svVar.dismiss();
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean D(TLRPC.Document document) {
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document);
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final void H(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.e6 e6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            sv svVar = this.a;
            viewGroup = ((org.telegram.ui.ActionBar.f3) svVar).containerView;
            e6Var = ((org.telegram.ui.ActionBar.f3) svVar).resourcesProvider;
            org.telegram.messenger.vl.p(R.string.EmojiCopied, new vc((FrameLayout) viewGroup, e6Var));
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
        if (n2Var instanceof org.telegram.ui.bo) {
            return ((org.telegram.ui.bo) n2Var).c();
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
    public final /* synthetic */ n70 i(ci.n6 n6Var) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean l(int i10) {
        sv svVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = svVar.c;
        if (!(n2Var instanceof org.telegram.ui.bo) || !((org.telegram.ui.bo) n2Var).E6()) {
            return false;
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            return true;
        }
        return ((org.telegram.ui.bo) svVar.c).i() != null && UserObject.isUserSelf(((org.telegram.ui.bo) svVar.c).i());
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
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
        sv svVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.f3) svVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        oh ohVar = new oh(24, this, tL_emojiStatusEmpty);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) svVar).containerView;
            e6Var = ((org.telegram.ui.ActionBar.f3) svVar).resourcesProvider;
            new vc((FrameLayout) viewGroup, e6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ohVar).j();
            return;
        }
        Context context = svVar.getContext();
        e6Var2 = ((org.telegram.ui.ActionBar.f3) svVar).resourcesProvider;
        gc gcVar = new gc(context, e6Var2);
        gcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        gcVar.a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = svVar.getContext();
        e6Var3 = ((org.telegram.ui.ActionBar.f3) svVar).resourcesProvider;
        mc mcVar = new mc(context2, e6Var3, true);
        mcVar.a = ohVar;
        gcVar.setButton(mcVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) svVar).containerView;
        oc.f((FrameLayout) viewGroup2, gcVar, 1500).j();
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void E(TLRPC.Document document) {
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
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.qt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void G(CharSequence charSequence, String str, org.telegram.ui.nf nfVar) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
