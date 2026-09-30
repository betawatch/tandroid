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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class gx implements org.telegram.ui.lt {
    public final /* synthetic */ mz a;

    public gx(mz mzVar) {
        this.a = mzVar;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final void C(TLRPC.Document document) {
        org.telegram.ui.ActionBar.m2 m2Var = this.a.Y1;
        if (m2Var instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) m2Var).bb(document);
        }
    }

    @Override // org.telegram.ui.lt
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final boolean E(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override // org.telegram.ui.lt
    public final String G(boolean z10) {
        mz mzVar = this.a;
        if (z10) {
            s4.h0 adapter = mzVar.h0.getAdapter();
            ry ryVar = mzVar.j0;
            if (adapter == ryVar) {
                return ryVar.w;
            }
            return null;
        }
        s4.h0 adapter2 = mzVar.P.getAdapter();
        my myVar = mzVar.S;
        if (adapter2 == myVar) {
            return myVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.lt
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new z5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            mz mzVar = this.a;
            org.telegram.ui.ActionBar.m2 m2Var = mzVar.Y1;
            org.telegram.messenger.ok.o(R.string.EmojiCopied, m2Var != null ? yc.a0(m2Var) : new yc(mzVar.r, mzVar.Z1));
        }
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final void L() {
        this.a.W();
    }

    @Override // org.telegram.ui.lt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.lt
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.lt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final long a() {
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.lt
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.lt
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final boolean i() {
        mz mzVar = this.a;
        return (mzVar.Y1 == null && mzVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ a80 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final boolean m(int i10) {
        if (i10 != 2) {
            return true;
        }
        mz mzVar = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = mzVar.Y1;
        if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.wn) mzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.wn) mzVar.Y1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.lt
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.lt
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
        mz mzVar = this.a;
        hy0.o0(mzVar.Y1, MediaDataController.getInstance(mzVar.c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final void r(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            vx vxVar = this.a.R;
            if (vxVar != null) {
                vxVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.lt
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        mz mzVar = this.a;
        pw pwVar = mzVar.h0;
        if (pwVar.getAdapter() == mzVar.n0) {
            mzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (pwVar.getAdapter() == mzVar.j0) {
            mzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.lt
    public final void u() {
        yx yxVar = this.a.P;
        if (yxVar == null || yxVar.e3 == null) {
            return;
        }
        while (yxVar.e3.size() > 0) {
            xx xxVar = (xx) yxVar.e3.valueAt(0);
            yxVar.e3.removeAt(0);
            if (xxVar != null) {
                View view = xxVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    xxVar.d.getBackground().setState(new int[0]);
                }
                View view2 = xxVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.lt
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        mz mzVar = this.a;
        FrameLayout frameLayout = mzVar.r;
        org.telegram.ui.ActionBar.m2 m2Var = mzVar.Y1;
        org.telegram.ui.ActionBar.d6 d6Var = mzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(mzVar.c1).updateEmojiStatus(emojiStatus);
        dv dvVar = new dv(1, this, tL_emojiStatusEmpty);
        if (document != null) {
            (m2Var != null ? yc.a0(m2Var) : new yc(frameLayout, d6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), dvVar).j();
            return;
        }
        ic icVar = new ic(mzVar.getContext(), d6Var);
        icVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = icVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.z9, d6Var), PorterDuff.Mode.MULTIPLY));
        oc ocVar = new oc(mzVar.getContext(), d6Var, true);
        ocVar.a = dvVar;
        icVar.setButton(ocVar);
        if (m2Var != null) {
            qc.g(m2Var, icVar, 1500).j();
        } else {
            qc.f(frameLayout, icVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.lt
    public final void x(TLObject tLObject, Object obj) {
        mz mzVar = this.a;
        pw pwVar = mzVar.h0;
        if (pwVar.getAdapter() == mzVar.n0 || pwVar.getAdapter() == mzVar.j0) {
            mzVar.t1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.bt btVar) {
    }
}
