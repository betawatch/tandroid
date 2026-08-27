package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pw implements org.telegram.ui.ht {
    public final /* synthetic */ yy a;

    public pw(yy yyVar) {
        this.a = yyVar;
    }

    @Override // org.telegram.ui.ht
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.U1;
        if (n2Var instanceof org.telegram.ui.rn) {
            ((org.telegram.ui.rn) n2Var).bb(document);
        }
    }

    @Override // org.telegram.ui.ht
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final boolean C(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final void D(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.Y0).sendRequest(tL_stickers_removeStickerFromSet, new w1(this, 4));
    }

    @Override // org.telegram.ui.ht
    public final String F(boolean z10) {
        yy yyVar = this.a;
        if (z10) {
            f2.q0 adapter = yyVar.d0.getAdapter();
            cy cyVar = yyVar.f0;
            if (adapter == cyVar) {
                return cyVar.w;
            }
            return null;
        }
        f2.q0 adapter2 = yyVar.L.getAdapter();
        wx wxVar = yyVar.O;
        if (adapter2 == wxVar) {
            return wxVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.ht
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            yy yyVar = this.a;
            org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
            org.telegram.messenger.rl.m(R.string.EmojiCopied, n2Var != null ? mc.a0(n2Var) : new mc(yyVar.r, yyVar.V1));
        }
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final void K() {
        this.a.Y();
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ b70 L(ag.y1 y1Var) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.p1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.ht
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.ht
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final long a() {
        return this.a.p1.a();
    }

    @Override // org.telegram.ui.ht
    public final boolean b() {
        return this.a.p1.b();
    }

    @Override // org.telegram.ui.ht
    public final boolean c() {
        return this.a.p1.c();
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final boolean e(TLRPC.Document document) {
        return this.a.p1.j();
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final boolean h() {
        yy yyVar = this.a;
        return (yyVar.U1 == null && yyVar.q0) ? false : true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean k(int i10) {
        if (i10 != 2) {
            return true;
        }
        yy yyVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
        if ((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.rn) yyVar.U1).i() != null && UserObject.isUserSelf(((org.telegram.ui.rn) yyVar.U1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.ht
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.p1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.ht
    public final void n(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10 = 0;
        while (true) {
            if (i10 >= document.attributes.size()) {
                inputStickerSet = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                break;
            } else {
                i10++;
            }
        }
        yy yyVar = this.a;
        ex0.o0(yyVar.U1, MediaDataController.getInstance(yyVar.Y0).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            gx gxVar = this.a.N;
            if (gxVar != null) {
                gxVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.ht
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        yy yyVar = this.a;
        yv yvVar = yyVar.d0;
        if (yvVar.getAdapter() == yyVar.j0) {
            yyVar.p1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (yvVar.getAdapter() == yyVar.f0) {
            yyVar.p1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.ht
    public final void s() {
        ww wwVar = this.a.L;
        if (wwVar == null || wwVar.a3 == null) {
            return;
        }
        while (wwVar.a3.size() > 0) {
            ix ixVar = (ix) wwVar.a3.valueAt(0);
            wwVar.a3.removeAt(0);
            if (ixVar != null) {
                if (ixVar.d.getBackground() instanceof RippleDrawable) {
                    ixVar.d.getBackground().setState(new int[0]);
                }
                ixVar.d.setPressed(false);
            }
        }
    }

    @Override // org.telegram.ui.ht
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        yy yyVar = this.a;
        FrameLayout frameLayout = yyVar.r;
        org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
        org.telegram.ui.ActionBar.c6 c6Var = yyVar.V1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(yyVar.Y0).updateEmojiStatus(emojiStatus);
        xq xqVar = new xq(7, this, tL_emojiStatusEmpty);
        if (document != null) {
            (n2Var != null ? mc.a0(n2Var) : new mc(frameLayout, c6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), xqVar).j();
            return;
        }
        wb wbVar = new wb(yyVar.getContext(), c6Var);
        wbVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = wbVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var), PorterDuff.Mode.MULTIPLY));
        cc ccVar = new cc(yyVar.getContext(), c6Var, true);
        ccVar.a = xqVar;
        wbVar.setButton(ccVar);
        if (n2Var != null) {
            ec.g(n2Var, wbVar, 1500).j();
        } else {
            ec.f(frameLayout, wbVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ht
    public final void v(TLObject tLObject, Object obj) {
        yy yyVar = this.a;
        yv yvVar = yyVar.d0;
        if (yvVar.getAdapter() == yyVar.j0 || yvVar.getAdapter() == yyVar.f0) {
            yyVar.p1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void E(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }
}
