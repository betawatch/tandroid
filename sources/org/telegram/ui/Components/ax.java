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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ax implements org.telegram.ui.nt {
    public final /* synthetic */ kz a;

    public ax(kz kzVar) {
        this.a = kzVar;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void C(TLRPC.Document document) {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.V1;
        if (p2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) p2Var).bb(document);
        }
    }

    @Override // org.telegram.ui.nt
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final boolean E(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.Z0).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override // org.telegram.ui.nt
    public final String G(boolean z4) {
        kz kzVar = this.a;
        if (z4) {
            f2.o0 adapter = kzVar.e0.getAdapter();
            oy oyVar = kzVar.g0;
            if (adapter == oyVar) {
                return oyVar.w;
            }
            return null;
        }
        f2.o0 adapter2 = kzVar.M.getAdapter();
        jy jyVar = kzVar.P;
        if (adapter2 == jyVar) {
            return jyVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.nt
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            kz kzVar = this.a;
            org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
            org.telegram.ui.b.m(R.string.EmojiCopied, p2Var != null ? qc.a0(p2Var) : new qc(kzVar.r, kzVar.W1));
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
    public final void L() {
        this.a.Y();
    }

    @Override // org.telegram.ui.nt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.q1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.nt
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb = new StringBuilder("animated_");
        sb.append(document.id);
        return arrayList.contains(sb.toString());
    }

    @Override // org.telegram.ui.nt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        return this.a.q1.a();
    }

    @Override // org.telegram.ui.nt
    public final boolean b() {
        return this.a.q1.b();
    }

    @Override // org.telegram.ui.nt
    public final boolean c() {
        return this.a.q1.c();
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
    public final boolean f(TLRPC.Document document) {
        return this.a.q1.j();
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
        kz kzVar = this.a;
        return (kzVar.V1 == null && kzVar.r0) ? false : true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean l(int i10) {
        if (i10 != 2) {
            return true;
        }
        kz kzVar = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
        if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.xn) kzVar.V1).i() != null && UserObject.isUserSelf(((org.telegram.ui.xn) kzVar.V1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        this.a.q1.m(null, document, str, obj, null, z4, i10);
    }

    @Override // org.telegram.ui.nt
    public final void o(TLRPC.Document document) {
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
        kz kzVar = this.a;
        xx0.o0(kzVar.V1, MediaDataController.getInstance(kzVar.Z0).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void q(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            rx rxVar = this.a.O;
            if (rxVar != null) {
                rxVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.nt
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
        kz kzVar = this.a;
        jw jwVar = kzVar.e0;
        if (jwVar.getAdapter() == kzVar.k0) {
            kzVar.q1.v(null, tLObject, null, obj, z4, i10, i11);
        } else if (jwVar.getAdapter() == kzVar.g0) {
            kzVar.q1.v(null, tLObject, null, obj, z4, i10, i11);
        }
    }

    @Override // org.telegram.ui.nt
    public final void t() {
        ix ixVar = this.a.M;
        if (ixVar == null || ixVar.b3 == null) {
            return;
        }
        while (ixVar.b3.size() > 0) {
            tx txVar = (tx) ixVar.b3.valueAt(0);
            ixVar.b3.removeAt(0);
            if (txVar != null) {
                if (txVar.d.getBackground() instanceof RippleDrawable) {
                    txVar.d.getBackground().setState(new int[0]);
                }
                txVar.d.setPressed(false);
            }
        }
    }

    @Override // org.telegram.ui.nt
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        kz kzVar = this.a;
        FrameLayout frameLayout = kzVar.r;
        org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
        org.telegram.ui.ActionBar.f6 f6Var = kzVar.W1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(kzVar.Z0).updateEmojiStatus(emojiStatus);
        il ilVar = new il(13, this, tL_emojiStatusEmpty);
        if (document != null) {
            (p2Var != null ? qc.a0(p2Var) : new qc(frameLayout, f6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ilVar).j();
            return;
        }
        ac acVar = new ac(kzVar.getContext(), f6Var);
        acVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = acVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var), PorterDuff.Mode.MULTIPLY));
        gc gcVar = new gc(kzVar.getContext(), f6Var, true);
        gcVar.a = ilVar;
        acVar.setButton(gcVar);
        if (p2Var != null) {
            ic.g(p2Var, acVar, 1500).j();
        } else {
            ic.f(frameLayout, acVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.nt
    public final void w(TLObject tLObject, Object obj) {
        kz kzVar = this.a;
        jw jwVar = kzVar.e0;
        if (jwVar.getAdapter() == kzVar.k0 || jwVar.getAdapter() == kzVar.g0) {
            kzVar.q1.e(tLObject, obj);
        }
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
    public final /* synthetic */ void K() {
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
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void A(CharSequence charSequence, String str, vk vkVar) {
    }
}
