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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dx implements org.telegram.ui.qt {
    public final /* synthetic */ kz a;

    public dx(kz kzVar) {
        this.a = kzVar;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.Y1;
        if (n2Var instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) n2Var).bb(document);
        }
    }

    @Override // org.telegram.ui.qt
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final boolean D(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override // org.telegram.ui.qt
    public final String F(boolean z10) {
        kz kzVar = this.a;
        if (z10) {
            s4.h0 adapter = kzVar.h0.getAdapter();
            py pyVar = kzVar.j0;
            if (adapter == pyVar) {
                return pyVar.w;
            }
            return null;
        }
        s4.h0 adapter2 = kzVar.P.getAdapter();
        ky kyVar = kzVar.S;
        if (adapter2 == kyVar) {
            return kyVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.qt
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            kz kzVar = this.a;
            org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
            org.telegram.messenger.wl.o(R.string.EmojiCopied, n2Var != null ? yc.a0(n2Var) : new yc(kzVar.r, kzVar.Z1));
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
    public final void L() {
        this.a.Y();
    }

    @Override // org.telegram.ui.qt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.qt
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.qt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
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
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.qt
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.qt
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
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
        kz kzVar = this.a;
        return (kzVar.Y1 == null && kzVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean k(int i10) {
        if (i10 != 2) {
            return true;
        }
        kz kzVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
        if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.co) kzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.co) kzVar.Y1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.qt
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
        kz kzVar = this.a;
        ux0.o0(kzVar.Y1, MediaDataController.getInstance(kzVar.c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            tx txVar = this.a.R;
            if (txVar != null) {
                txVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.qt
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        kz kzVar = this.a;
        nw nwVar = kzVar.h0;
        if (nwVar.getAdapter() == kzVar.n0) {
            kzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (nwVar.getAdapter() == kzVar.j0) {
            kzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.qt
    public final void s() {
        kx kxVar = this.a.P;
        if (kxVar == null || kxVar.e3 == null) {
            return;
        }
        while (kxVar.e3.size() > 0) {
            vx vxVar = (vx) kxVar.e3.valueAt(0);
            kxVar.e3.removeAt(0);
            if (vxVar != null) {
                if (vxVar.d.getBackground() instanceof RippleDrawable) {
                    vxVar.d.getBackground().setState(new int[0]);
                }
                vxVar.d.setPressed(false);
            }
        }
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ n70 t(ah.w wVar) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        kz kzVar = this.a;
        FrameLayout frameLayout = kzVar.r;
        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
        org.telegram.ui.ActionBar.f6 f6Var = kzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(kzVar.c1).updateEmojiStatus(emojiStatus);
        zu zuVar = new zu(1, this, tL_emojiStatusEmpty);
        if (document != null) {
            (n2Var != null ? yc.a0(n2Var) : new yc(frameLayout, f6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), zuVar).j();
            return;
        }
        ic icVar = new ic(kzVar.getContext(), f6Var);
        icVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = icVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var), PorterDuff.Mode.MULTIPLY));
        oc ocVar = new oc(kzVar.getContext(), f6Var, true);
        ocVar.a = zuVar;
        icVar.setButton(ocVar);
        if (n2Var != null) {
            qc.g(n2Var, icVar, 1500).j();
        } else {
            qc.f(frameLayout, icVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.qt
    public final void w(TLObject tLObject, Object obj) {
        kz kzVar = this.a;
        nw nwVar = kzVar.h0;
        if (nwVar.getAdapter() == kzVar.n0 || nwVar.getAdapter() == kzVar.j0) {
            kzVar.t1.e(tLObject, obj);
        }
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
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void G(CharSequence charSequence, String str, org.telegram.ui.nf nfVar) {
    }
}
