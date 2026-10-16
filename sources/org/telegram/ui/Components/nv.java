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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class nv implements org.telegram.ui.vt {
    public final /* synthetic */ ew a;

    public nv(ew ewVar) {
        this.a = ewVar;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final void C(TLRPC.Document document) {
        ew ewVar = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = ewVar.c;
        if (m2Var instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) m2Var).fb(document);
        }
        ewVar.Z();
        ewVar.dismiss();
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean E(TLRPC.Document document) {
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document);
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final void H(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.c6 c6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            ew ewVar = this.a;
            viewGroup = ((org.telegram.ui.ActionBar.e3) ewVar).containerView;
            c6Var = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
            org.telegram.messenger.sk.p(R.string.EmojiCopied, new zc((FrameLayout) viewGroup, c6Var));
        }
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.vt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.a.c;
        if (m2Var instanceof org.telegram.ui.fo) {
            return ((org.telegram.ui.fo) m2Var).c();
        }
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final boolean i() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean l(int i10) {
        ew ewVar = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = ewVar.c;
        if (!(m2Var instanceof org.telegram.ui.fo) || !((org.telegram.ui.fo) m2Var).H6()) {
            return false;
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            return true;
        }
        return ((org.telegram.ui.fo) ewVar.c).i() != null && UserObject.isUserSelf(((org.telegram.ui.fo) ewVar.c).i());
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ l80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
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
        ew ewVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.e3) ewVar).currentAccount;
        MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
        vm vmVar = new vm(12, this, tL_emojiStatusEmpty);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) ewVar).containerView;
            c6Var = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
            new zc((FrameLayout) viewGroup, c6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), vmVar).j();
            return;
        }
        Context context = ewVar.getContext();
        c6Var2 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
        kc kcVar = new kc(context, c6Var2);
        kcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        kcVar.a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = ewVar.getContext();
        c6Var3 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
        qc qcVar = new qc(context2, c6Var3, true);
        qcVar.a = vmVar;
        kcVar.setButton(qcVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.e3) ewVar).containerView;
        sc.f((FrameLayout) viewGroup2, kcVar, 1500).j();
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.vt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.mt mtVar) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
