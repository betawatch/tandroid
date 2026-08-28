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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mu implements org.telegram.ui.ft {
    public final /* synthetic */ dv a;

    public mu(dv dvVar) {
        this.a = dvVar;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void B(TLRPC.Document document) {
        dv dvVar = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = dvVar.c;
        if (o2Var instanceof org.telegram.ui.qn) {
            ((org.telegram.ui.qn) o2Var).bb(document);
        }
        dvVar.X();
        dvVar.dismiss();
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
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void H(TLRPC.Document document) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.b6 b6Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            dv dvVar = this.a;
            viewGroup = ((org.telegram.ui.ActionBar.f3) dvVar).containerView;
            b6Var = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
            org.telegram.messenger.ll.o(R.string.EmojiCopied, new oc((FrameLayout) viewGroup, b6Var));
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean N(TLRPC.Document document) {
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
        org.telegram.ui.ActionBar.o2 o2Var = this.a.c;
        if (o2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) o2Var).c();
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
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean k(int i9) {
        dv dvVar = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = dvVar.c;
        if (!(o2Var instanceof org.telegram.ui.qn) || !((org.telegram.ui.qn) o2Var).E6()) {
            return false;
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            return true;
        }
        return ((org.telegram.ui.qn) dvVar.c).i() != null && UserObject.isUserSelf(((org.telegram.ui.qn) dvVar.c).i());
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ x60 r(fh.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        int i9;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
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
        dv dvVar = this.a;
        i9 = ((org.telegram.ui.ActionBar.f3) dvVar).currentAccount;
        MessagesController.getInstance(i9).updateEmojiStatus(emojiStatus);
        zq zqVar = new zq(6, this, tL_emojiStatusEmpty);
        if (document != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) dvVar).containerView;
            b6Var = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
            new oc((FrameLayout) viewGroup, b6Var).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), zqVar).j();
            return;
        }
        Context context = dvVar.getContext();
        b6Var2 = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
        yb ybVar = new yb(context, b6Var2);
        ybVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        ybVar.a.setImageResource(R.drawable.msg_settings_premium);
        Context context2 = dvVar.getContext();
        b6Var3 = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
        ec ecVar = new ec(context2, b6Var3, true);
        ecVar.a = zqVar;
        ybVar.setButton(ecVar);
        viewGroup2 = ((org.telegram.ui.ActionBar.f3) dvVar).containerView;
        gc.f((FrameLayout) viewGroup2, ybVar, 1500).j();
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
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.ft
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
    }
}
