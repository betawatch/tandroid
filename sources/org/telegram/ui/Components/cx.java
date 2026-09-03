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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class cx implements org.telegram.ui.ot {
    public final /* synthetic */ mz a;

    public cx(mz mzVar) {
        this.a = mzVar;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.V1;
        if (p2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) p2Var).bb(document);
        }
    }

    @Override // org.telegram.ui.ot
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final boolean D(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.Z0).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override // org.telegram.ui.ot
    public final String F(boolean z4) {
        mz mzVar = this.a;
        if (z4) {
            f2.p0 adapter = mzVar.e0.getAdapter();
            qy qyVar = mzVar.g0;
            if (adapter == qyVar) {
                return qyVar.w;
            }
            return null;
        }
        f2.p0 adapter2 = mzVar.M.getAdapter();
        ly lyVar = mzVar.P;
        if (adapter2 == lyVar) {
            return lyVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.ot
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new u5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            mz mzVar = this.a;
            org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
            org.telegram.ui.b.m(R.string.EmojiCopied, p2Var != null ? qc.a0(p2Var) : new qc(mzVar.r, mzVar.W1));
        }
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ q70 I(ag.l lVar) {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void L() {
        this.a.Y();
    }

    @Override // org.telegram.ui.ot
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.q1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.ot
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb = new StringBuilder("animated_");
        sb.append(document.id);
        return arrayList.contains(sb.toString());
    }

    @Override // org.telegram.ui.ot
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final long a() {
        return this.a.q1.a();
    }

    @Override // org.telegram.ui.ot
    public final boolean b() {
        return this.a.q1.b();
    }

    @Override // org.telegram.ui.ot
    public final boolean c() {
        return this.a.q1.c();
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final boolean e(TLRPC.Document document) {
        return this.a.q1.j();
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final boolean h() {
        mz mzVar = this.a;
        return (mzVar.V1 == null && mzVar.r0) ? false : true;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final boolean k(int i10) {
        if (i10 != 2) {
            return true;
        }
        mz mzVar = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
        if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.xn) mzVar.V1).i() != null && UserObject.isUserSelf(((org.telegram.ui.xn) mzVar.V1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void l(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        this.a.q1.m(null, document, str, obj, null, z4, i10);
    }

    @Override // org.telegram.ui.ot
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
        mz mzVar = this.a;
        xx0.o0(mzVar.V1, MediaDataController.getInstance(mzVar.Z0).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            tx txVar = this.a.O;
            if (txVar != null) {
                txVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.ot
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
        mz mzVar = this.a;
        lw lwVar = mzVar.e0;
        if (lwVar.getAdapter() == mzVar.k0) {
            mzVar.q1.v(null, tLObject, null, obj, z4, i10, i11);
        } else if (lwVar.getAdapter() == mzVar.g0) {
            mzVar.q1.v(null, tLObject, null, obj, z4, i10, i11);
        }
    }

    @Override // org.telegram.ui.ot
    public final void s() {
        kx kxVar = this.a.M;
        if (kxVar == null || kxVar.b3 == null) {
            return;
        }
        while (kxVar.b3.size() > 0) {
            vx vxVar = (vx) kxVar.b3.valueAt(0);
            kxVar.b3.removeAt(0);
            if (vxVar != null) {
                if (vxVar.d.getBackground() instanceof RippleDrawable) {
                    vxVar.d.getBackground().setState(new int[0]);
                }
                vxVar.d.setPressed(false);
            }
        }
    }

    @Override // org.telegram.ui.ot
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        mz mzVar = this.a;
        FrameLayout frameLayout = mzVar.r;
        org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
        org.telegram.ui.ActionBar.g6 g6Var = mzVar.W1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(mzVar.Z0).updateEmojiStatus(emojiStatus);
        eo eoVar = new eo(11, this, tL_emojiStatusEmpty);
        if (document != null) {
            (p2Var != null ? qc.a0(p2Var) : new qc(frameLayout, g6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), eoVar).j();
            return;
        }
        ac acVar = new ac(mzVar.getContext(), g6Var);
        acVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = acVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var), PorterDuff.Mode.MULTIPLY));
        gc gcVar = new gc(mzVar.getContext(), g6Var, true);
        gcVar.a = eoVar;
        acVar.setButton(gcVar);
        if (p2Var != null) {
            ic.g(p2Var, acVar, 1500).j();
        } else {
            ic.f(frameLayout, acVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.ot
    public final void v(TLObject tLObject, Object obj) {
        mz mzVar = this.a;
        lw lwVar = mzVar.e0;
        if (lwVar.getAdapter() == mzVar.k0 || lwVar.getAdapter() == mzVar.g0) {
            mzVar.q1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void z(CharSequence charSequence, String str, xk xkVar) {
    }
}
