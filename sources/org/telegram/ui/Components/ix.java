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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ix implements org.telegram.ui.rt {
    public final /* synthetic */ rz a;

    public ix(rz rzVar) {
        this.a = rzVar;
    }

    @Override // org.telegram.ui.rt
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.Y1;
        if (p2Var instanceof org.telegram.ui.eo) {
            ((org.telegram.ui.eo) p2Var).bb(document);
        }
    }

    @Override // org.telegram.ui.rt
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final boolean C(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final void D(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new z1(this, 4));
    }

    @Override // org.telegram.ui.rt
    public final String E(boolean z10) {
        rz rzVar = this.a;
        if (z10) {
            s4.h0 adapter = rzVar.h0.getAdapter();
            wy wyVar = rzVar.j0;
            if (adapter == wyVar) {
                return wyVar.w;
            }
            return null;
        }
        s4.h0 adapter2 = rzVar.P.getAdapter();
        ry ryVar = rzVar.S;
        if (adapter2 == ryVar) {
            return ryVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.rt
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            rz rzVar = this.a;
            org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
            org.telegram.messenger.em.o(R.string.EmojiCopied, p2Var != null ? wc.a0(p2Var) : new wc(rzVar.r, rzVar.Z1));
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
    public final void L() {
        this.a.Y();
    }

    @Override // org.telegram.ui.rt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.rt
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.rt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.rt
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.rt
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
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
        rz rzVar = this.a;
        return (rzVar.Y1 == null && rzVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean k(int i10) {
        if (i10 != 2) {
            return true;
        }
        rz rzVar = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
        if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.eo) rzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.eo) rzVar.Y1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.rt
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
        rz rzVar = this.a;
        hy0.o0(rzVar.Y1, MediaDataController.getInstance(rzVar.c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            yx yxVar = this.a.R;
            if (yxVar != null) {
                yxVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.rt
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        rz rzVar = this.a;
        sw swVar = rzVar.h0;
        if (swVar.getAdapter() == rzVar.n0) {
            rzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (swVar.getAdapter() == rzVar.j0) {
            rzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.rt
    public final void s() {
        px pxVar = this.a.P;
        if (pxVar == null || pxVar.e3 == null) {
            return;
        }
        while (pxVar.e3.size() > 0) {
            ay ayVar = (ay) pxVar.e3.valueAt(0);
            pxVar.e3.removeAt(0);
            if (ayVar != null) {
                if (ayVar.d.getBackground() instanceof RippleDrawable) {
                    ayVar.d.getBackground().setState(new int[0]);
                }
                ayVar.d.setPressed(false);
            }
        }
    }

    @Override // org.telegram.ui.rt
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        rz rzVar = this.a;
        FrameLayout frameLayout = rzVar.r;
        org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
        org.telegram.ui.ActionBar.f6 f6Var = rzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(rzVar.c1).updateEmojiStatus(emojiStatus);
        ee eeVar = new ee(28, this, tL_emojiStatusEmpty);
        if (document != null) {
            (p2Var != null ? wc.a0(p2Var) : new wc(frameLayout, f6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), eeVar).j();
            return;
        }
        hc hcVar = new hc(rzVar.getContext(), f6Var);
        hcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = hcVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var), PorterDuff.Mode.MULTIPLY));
        nc ncVar = new nc(rzVar.getContext(), f6Var, true);
        ncVar.a = eeVar;
        hcVar.setButton(ncVar);
        if (p2Var != null) {
            pc.g(p2Var, hcVar, 1500).j();
        } else {
            pc.f(frameLayout, hcVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.rt
    public final void v(TLObject tLObject, Object obj) {
        rz rzVar = this.a;
        sw swVar = rzVar.h0;
        if (swVar.getAdapter() == rzVar.n0 || swVar.getAdapter() == rzVar.j0) {
            rzVar.t1.e(tLObject, obj);
        }
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
    public final /* synthetic */ void J() {
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
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }
}
