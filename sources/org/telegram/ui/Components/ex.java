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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ex implements org.telegram.ui.nt {
    public final /* synthetic */ lz a;

    public ex(lz lzVar) {
        this.a = lzVar;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void C(TLRPC.Document document) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.Y1;
        if (n2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) n2Var).bb(document);
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
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override // org.telegram.ui.nt
    public final String G(boolean z10) {
        lz lzVar = this.a;
        if (z10) {
            s4.h0 adapter = lzVar.h0.getAdapter();
            qy qyVar = lzVar.j0;
            if (adapter == qyVar) {
                return qyVar.w;
            }
            return null;
        }
        s4.h0 adapter2 = lzVar.P.getAdapter();
        ky kyVar = lzVar.S;
        if (adapter2 == kyVar) {
            return kyVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.nt
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            lz lzVar = this.a;
            org.telegram.ui.ActionBar.n2 n2Var = lzVar.Y1;
            org.telegram.messenger.ul.p(R.string.EmojiCopied, n2Var != null ? xc.a0(n2Var) : new xc(lzVar.r, lzVar.Z1));
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
        this.a.W();
    }

    @Override // org.telegram.ui.nt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.nt
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
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
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.nt
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.nt
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
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
        lz lzVar = this.a;
        return (lzVar.Y1 == null && lzVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ o70 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean m(int i10) {
        if (i10 != 2) {
            return true;
        }
        lz lzVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = lzVar.Y1;
        if ((n2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) n2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.xn) lzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.xn) lzVar.Y1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.nt
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
        lz lzVar = this.a;
        ux0.o0(lzVar.Y1, MediaDataController.getInstance(lzVar.c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void r(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            tx txVar = this.a.R;
            if (txVar != null) {
                txVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.nt
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        lz lzVar = this.a;
        nw nwVar = lzVar.h0;
        if (nwVar.getAdapter() == lzVar.n0) {
            lzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (nwVar.getAdapter() == lzVar.j0) {
            lzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.nt
    public final void u() {
        wx wxVar = this.a.P;
        if (wxVar == null || wxVar.e3 == null) {
            return;
        }
        while (wxVar.e3.size() > 0) {
            vx vxVar = (vx) wxVar.e3.valueAt(0);
            wxVar.e3.removeAt(0);
            if (vxVar != null) {
                View view = vxVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    vxVar.d.getBackground().setState(new int[0]);
                }
                View view2 = vxVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.nt
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        lz lzVar = this.a;
        FrameLayout frameLayout = lzVar.r;
        org.telegram.ui.ActionBar.n2 n2Var = lzVar.Y1;
        org.telegram.ui.ActionBar.d6 d6Var = lzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(lzVar.c1).updateEmojiStatus(emojiStatus);
        ph phVar = new ph(25, this, tL_emojiStatusEmpty);
        if (document != null) {
            (n2Var != null ? xc.a0(n2Var) : new xc(frameLayout, d6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), phVar).j();
            return;
        }
        ic icVar = new ic(lzVar.getContext(), d6Var);
        icVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = icVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.z9, d6Var), PorterDuff.Mode.MULTIPLY));
        oc ocVar = new oc(lzVar.getContext(), d6Var, true);
        ocVar.a = phVar;
        icVar.setButton(ocVar);
        if (n2Var != null) {
            qc.g(n2Var, icVar, 1500).j();
        } else {
            qc.f(frameLayout, icVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.nt
    public final void x(TLObject tLObject, Object obj) {
        lz lzVar = this.a;
        nw nwVar = lzVar.h0;
        if (nwVar.getAdapter() == lzVar.n0 || nwVar.getAdapter() == lzVar.j0) {
            lzVar.t1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.dt dtVar) {
    }
}
