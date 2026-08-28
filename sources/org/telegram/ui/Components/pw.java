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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pw implements org.telegram.ui.ft {
    public final /* synthetic */ wy a;

    public pw(wy wyVar) {
        this.a = wyVar;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.U1;
        if (o2Var instanceof org.telegram.ui.qn) {
            ((org.telegram.ui.qn) o2Var).bb(document);
        }
    }

    @Override // org.telegram.ui.ft
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final boolean D(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.Y0).sendRequest(tL_stickers_removeStickerFromSet, new w1(this, 4));
    }

    @Override // org.telegram.ui.ft
    public final String G(boolean z10) {
        wy wyVar = this.a;
        if (z10) {
            f2.r0 adapter = wyVar.d0.getAdapter();
            ay ayVar = wyVar.f0;
            if (adapter == ayVar) {
                return ayVar.w;
            }
            return null;
        }
        f2.r0 adapter2 = wyVar.L.getAdapter();
        vx vxVar = wyVar.O;
        if (adapter2 == vxVar) {
            return vxVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new t5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            wy wyVar = this.a;
            org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
            org.telegram.messenger.ll.o(R.string.EmojiCopied, o2Var != null ? oc.a0(o2Var) : new oc(wyVar.r, wyVar.V1));
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
        this.a.X();
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
        wy wyVar = this.a;
        return (wyVar.U1 == null && wyVar.q0) ? false : true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean k(int i9) {
        if (i9 != 2) {
            return true;
        }
        wy wyVar = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
        if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.qn) wyVar.U1).i() != null && UserObject.isUserSelf(((org.telegram.ui.qn) wyVar.U1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
        this.a.p1.m(null, document, str, obj, null, z10, i9);
    }

    @Override // org.telegram.ui.ft
    public final void n(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i9 = 0;
        while (true) {
            if (i9 >= document.attributes.size()) {
                inputStickerSet = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                break;
            } else {
                i9++;
            }
        }
        wy wyVar = this.a;
        cx0.n0(wyVar.U1, MediaDataController.getInstance(wyVar.Y0).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            fx fxVar = this.a.N;
            if (fxVar != null) {
                fxVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ x60 r(fh.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
        wy wyVar = this.a;
        zv zvVar = wyVar.d0;
        if (zvVar.getAdapter() == wyVar.j0) {
            wyVar.p1.v(null, tLObject, null, obj, z10, i9, i10);
        } else if (zvVar.getAdapter() == wyVar.f0) {
            wyVar.p1.v(null, tLObject, null, obj, z10, i9, i10);
        }
    }

    @Override // org.telegram.ui.ft
    public final void t() {
        ww wwVar = this.a.L;
        if (wwVar == null || wwVar.a3 == null) {
            return;
        }
        while (wwVar.a3.size() > 0) {
            hx hxVar = (hx) wwVar.a3.valueAt(0);
            wwVar.a3.removeAt(0);
            if (hxVar != null) {
                if (hxVar.d.getBackground() instanceof RippleDrawable) {
                    hxVar.d.getBackground().setState(new int[0]);
                }
                hxVar.d.setPressed(false);
            }
        }
    }

    @Override // org.telegram.ui.ft
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        wy wyVar = this.a;
        FrameLayout frameLayout = wyVar.r;
        org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
        org.telegram.ui.ActionBar.b6 b6Var = wyVar.V1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(wyVar.Y0).updateEmojiStatus(emojiStatus);
        zq zqVar = new zq(7, this, tL_emojiStatusEmpty);
        if (document != null) {
            (o2Var != null ? oc.a0(o2Var) : new oc(frameLayout, b6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), zqVar).j();
            return;
        }
        yb ybVar = new yb(wyVar.getContext(), b6Var);
        ybVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i9 = R.drawable.msg_settings_premium;
        ImageView imageView = ybVar.a;
        imageView.setImageResource(i9);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z9, b6Var), PorterDuff.Mode.MULTIPLY));
        ec ecVar = new ec(wyVar.getContext(), b6Var, true);
        ecVar.a = zqVar;
        ybVar.setButton(ecVar);
        if (o2Var != null) {
            gc.g(o2Var, ybVar, 1500).j();
        } else {
            gc.f(frameLayout, ybVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ft
    public final void w(TLObject tLObject, Object obj) {
        wy wyVar = this.a;
        zv zvVar = wyVar.d0;
        if (zvVar.getAdapter() == wyVar.j0 || zvVar.getAdapter() == wyVar.f0) {
            wyVar.p1.e(tLObject, obj);
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
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }
}
