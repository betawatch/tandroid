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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ww implements org.telegram.ui.ft {
    public final /* synthetic */ fz a;

    public ww(fz fzVar) {
        this.a = fzVar;
    }

    @Override // org.telegram.ui.ft
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.U1;
        if (o2Var instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) o2Var).bb(document);
        }
    }

    @Override // org.telegram.ui.ft
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final boolean C(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final void D(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.Y0).sendRequest(tL_stickers_removeStickerFromSet, new a2(this, 4));
    }

    @Override // org.telegram.ui.ft
    public final String E(boolean z10) {
        fz fzVar = this.a;
        if (z10) {
            f2.p0 adapter = fzVar.d0.getAdapter();
            jy jyVar = fzVar.f0;
            if (adapter == jyVar) {
                return jyVar.w;
            }
            return null;
        }
        f2.p0 adapter2 = fzVar.L.getAdapter();
        ey eyVar = fzVar.O;
        if (adapter2 == eyVar) {
            return eyVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ j70 G(bg.d1 d1Var) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            fz fzVar = this.a;
            org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
            org.telegram.ui.b.n(R.string.EmojiCopied, o2Var != null ? tc.a0(o2Var) : new tc(fzVar.r, fzVar.V1));
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
    public final void L() {
        this.a.Y();
    }

    @Override // org.telegram.ui.ft
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.p1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.ft
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.ft
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        return this.a.p1.a();
    }

    @Override // org.telegram.ui.ft
    public final boolean b() {
        return this.a.p1.b();
    }

    @Override // org.telegram.ui.ft
    public final boolean c() {
        return this.a.p1.c();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final boolean e(TLRPC.Document document) {
        return this.a.p1.j();
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
        fz fzVar = this.a;
        return (fzVar.U1 == null && fzVar.q0) ? false : true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean k(int i10) {
        if (i10 != 2) {
            return true;
        }
        fz fzVar = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
        if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.tn) fzVar.U1).i() != null && UserObject.isUserSelf(((org.telegram.ui.tn) fzVar.U1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.p1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.ft
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
        fz fzVar = this.a;
        nx0.o0(fzVar.U1, MediaDataController.getInstance(fzVar.Y0).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            nx nxVar = this.a.N;
            if (nxVar != null) {
                nxVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.ft
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        fz fzVar = this.a;
        fw fwVar = fzVar.d0;
        if (fwVar.getAdapter() == fzVar.j0) {
            fzVar.p1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (fwVar.getAdapter() == fzVar.f0) {
            fzVar.p1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.ft
    public final void s() {
        dx dxVar = this.a.L;
        if (dxVar == null || dxVar.a3 == null) {
            return;
        }
        while (dxVar.a3.size() > 0) {
            px pxVar = (px) dxVar.a3.valueAt(0);
            dxVar.a3.removeAt(0);
            if (pxVar != null) {
                if (pxVar.d.getBackground() instanceof RippleDrawable) {
                    pxVar.d.getBackground().setState(new int[0]);
                }
                pxVar.d.setPressed(false);
            }
        }
    }

    @Override // org.telegram.ui.ft
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        fz fzVar = this.a;
        FrameLayout frameLayout = fzVar.r;
        org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
        org.telegram.ui.ActionBar.c6 c6Var = fzVar.V1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(fzVar.Y0).updateEmojiStatus(emojiStatus);
        gt gtVar = new gt(4, this, tL_emojiStatusEmpty);
        if (document != null) {
            (o2Var != null ? tc.a0(o2Var) : new tc(frameLayout, c6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), gtVar).j();
            return;
        }
        ec ecVar = new ec(fzVar.getContext(), c6Var);
        ecVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = ecVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var), PorterDuff.Mode.MULTIPLY));
        kc kcVar = new kc(fzVar.getContext(), c6Var, true);
        kcVar.a = gtVar;
        ecVar.setButton(kcVar);
        if (o2Var != null) {
            mc.g(o2Var, ecVar, 1500).j();
        } else {
            mc.f(frameLayout, ecVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ft
    public final void v(TLObject tLObject, Object obj) {
        fz fzVar = this.a;
        fw fwVar = fzVar.d0;
        if (fwVar.getAdapter() == fzVar.j0 || fwVar.getAdapter() == fzVar.f0) {
            fzVar.p1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void K() {
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
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.tm tmVar) {
    }
}
