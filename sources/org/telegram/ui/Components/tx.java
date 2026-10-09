package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tx implements org.telegram.ui.pt {
    public final /* synthetic */ a00 a;

    public tx(a00 a00Var) {
        this.a = a00Var;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void C(TLRPC.Document document) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.Y1;
        if (n2Var instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) n2Var).fb(document);
        }
    }

    @Override // org.telegram.ui.pt
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final boolean E(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override // org.telegram.ui.pt
    public final String G(boolean z10) {
        a00 a00Var = this.a;
        if (z10) {
            s4.i0 adapter = a00Var.h0.getAdapter();
            ez ezVar = a00Var.j0;
            if (adapter == ezVar) {
                return ezVar.w;
            }
            return null;
        }
        s4.i0 adapter2 = a00Var.P.getAdapter();
        zy zyVar = a00Var.S;
        if (adapter2 == zyVar) {
            return zyVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.pt
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            a00 a00Var = this.a;
            org.telegram.ui.ActionBar.n2 n2Var = a00Var.Y1;
            org.telegram.messenger.bi.p(R.string.EmojiCopied, n2Var != null ? ad.a0(n2Var) : new ad(a00Var.r, a00Var.Z1));
        }
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void L() {
        this.a.W();
    }

    @Override // org.telegram.ui.pt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.pt
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.pt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final long a() {
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.pt
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.pt
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final boolean i() {
        a00 a00Var = this.a;
        return (a00Var.Y1 == null && a00Var.u0) ? false : true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ p80 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean m(int i10) {
        if (i10 != 2) {
            return true;
        }
        a00 a00Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = a00Var.Y1;
        if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).H6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.zn) a00Var.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.zn) a00Var.Y1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.pt
    public final void p(TLRPC.Document document) {
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
        a00 a00Var = this.a;
        xy0.p0(a00Var.Y1, MediaDataController.getInstance(a00Var.c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void r(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            jy jyVar = this.a.R;
            if (jyVar != null) {
                jyVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.pt
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        a00 a00Var = this.a;
        cx cxVar = a00Var.h0;
        if (cxVar.getAdapter() == a00Var.n0) {
            a00Var.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (cxVar.getAdapter() == a00Var.j0) {
            a00Var.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.pt
    public final void u() {
        my myVar = this.a.P;
        if (myVar == null || myVar.c3 == null) {
            return;
        }
        while (myVar.c3.size() > 0) {
            ly lyVar = (ly) myVar.c3.valueAt(0);
            myVar.c3.removeAt(0);
            if (lyVar != null) {
                View view = lyVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    lyVar.d.getBackground().setState(new int[0]);
                }
                View view2 = lyVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.pt
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        a00 a00Var = this.a;
        FrameLayout frameLayout = a00Var.r;
        org.telegram.ui.ActionBar.n2 n2Var = a00Var.Y1;
        org.telegram.ui.ActionBar.e6 e6Var = a00Var.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(a00Var.c1).updateEmojiStatus(emojiStatus);
        zr zrVar = new zr(7, this, tL_emojiStatusEmpty);
        if (document != null) {
            (n2Var != null ? ad.a0(n2Var) : new ad(frameLayout, e6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), zrVar).j();
            return;
        }
        lc lcVar = new lc(a00Var.getContext(), e6Var);
        lcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = lcVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z9, e6Var), PorterDuff.Mode.MULTIPLY));
        rc rcVar = new rc(a00Var.getContext(), e6Var, true);
        rcVar.a = zrVar;
        lcVar.setButton(rcVar);
        if (n2Var != null) {
            tc.g(n2Var, lcVar, 1500).j();
        } else {
            tc.f(frameLayout, lcVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.pt
    public final void x(TLObject tLObject, Object obj) {
        a00 a00Var = this.a;
        cx cxVar = a00Var.h0;
        if (cxVar.getAdapter() == a00Var.n0 || cxVar.getAdapter() == a00Var.j0) {
            a00Var.t1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.ft ftVar) {
    }
}
