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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pz0 implements org.telegram.ui.ft {
    public final /* synthetic */ uz0 a;

    public pz0(uz0 uz0Var) {
        this.a = uz0Var;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void B(TLRPC.Document document) {
        uz0 uz0Var = this.a;
        sz0 sz0Var = uz0Var.c;
        if (sz0Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.r2 parentFragment = sz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) parentFragment).pb(document);
            uz0Var.c.setFieldText("");
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean D(TLRPC.Document document) {
        if (this.a.y) {
            return false;
        }
        return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void G(TLRPC.Document document) {
        sz0 sz0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new c6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!AndroidUtilities.addToClipboard(valueOf) || (sz0Var = this.a.c) == null) {
            return;
        }
        org.telegram.messenger.wh.m(R.string.EmojiCopied, wc.b0(sz0Var.getParentFragment()));
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
        if (this.a.E || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        sz0 sz0Var = this.a.c;
        if (sz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.r2 parentFragment = sz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) parentFragment).c();
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
        sz0 sz0Var = this.a.c;
        if (sz0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.r2 parentFragment = sz0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) parentFragment;
            if (wnVar.L6()) {
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

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        uz0 uz0Var = this.a;
        org.telegram.ui.ActionBar.u6 u6Var = uz0Var.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(uz0Var.a).updateEmojiStatus(emojiStatus);
        u90 u90Var = new u90(23, this, tL_emojiStatusEmpty);
        sz0 sz0Var = uz0Var.c;
        org.telegram.ui.ActionBar.r2 parentFragment = sz0Var == null ? null : sz0Var.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                wc.b0(parentFragment).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), u90Var).j();
                return;
            }
            ic icVar = new ic(uz0Var.getContext(), u6Var);
            icVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            icVar.a.setImageResource(R.drawable.msg_settings_premium);
            oc ocVar = new oc(uz0Var.getContext(), u6Var, true);
            ocVar.b = u90Var;
            icVar.setButton(ocVar);
            qc.g(parentFragment, icVar, 1500).j();
        }
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
