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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class px implements org.telegram.ui.vt {
    public final /* synthetic */ wz a;

    public px(wz wzVar) {
        this.a = wzVar;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final void C(TLRPC.Document document) {
        org.telegram.ui.ActionBar.m2 m2Var = this.a.Y1;
        if (m2Var instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) m2Var).fb(document);
        }
    }

    @Override // org.telegram.ui.vt
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final boolean E(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override // org.telegram.ui.vt
    public final String G(boolean z10) {
        wz wzVar = this.a;
        if (z10) {
            s4.g0 adapter = wzVar.h0.getAdapter();
            az azVar = wzVar.j0;
            if (adapter == azVar) {
                return azVar.w;
            }
            return null;
        }
        s4.g0 adapter2 = wzVar.P.getAdapter();
        vy vyVar = wzVar.S;
        if (adapter2 == vyVar) {
            return vyVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.vt
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new b6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            wz wzVar = this.a;
            org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
            org.telegram.messenger.sk.p(R.string.EmojiCopied, m2Var != null ? zc.a0(m2Var) : new zc(wzVar.r, wzVar.Z1));
        }
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final void L() {
        this.a.W();
    }

    @Override // org.telegram.ui.vt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.vt
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.vt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final long a() {
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.vt
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.vt
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final boolean i() {
        wz wzVar = this.a;
        return (wzVar.Y1 == null && wzVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean l(int i10) {
        if (i10 != 2) {
            return true;
        }
        wz wzVar = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
        if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).H6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.fo) wzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.fo) wzVar.Y1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.vt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.vt
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
        wz wzVar = this.a;
        uy0.p0(wzVar.Y1, MediaDataController.getInstance(wzVar.c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final void q(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            fy fyVar = this.a.R;
            if (fyVar != null) {
                fyVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.vt
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        wz wzVar = this.a;
        yw ywVar = wzVar.h0;
        if (ywVar.getAdapter() == wzVar.n0) {
            wzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (ywVar.getAdapter() == wzVar.j0) {
            wzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.vt
    public final void t() {
        iy iyVar = this.a.P;
        if (iyVar == null || iyVar.c3 == null) {
            return;
        }
        while (iyVar.c3.size() > 0) {
            hy hyVar = (hy) iyVar.c3.valueAt(0);
            iyVar.c3.removeAt(0);
            if (hyVar != null) {
                View view = hyVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    hyVar.d.getBackground().setState(new int[0]);
                }
                View view2 = hyVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ l80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        wz wzVar = this.a;
        FrameLayout frameLayout = wzVar.r;
        org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
        org.telegram.ui.ActionBar.c6 c6Var = wzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(wzVar.c1).updateEmojiStatus(emojiStatus);
        vm vmVar = new vm(13, this, tL_emojiStatusEmpty);
        if (document != null) {
            (m2Var != null ? zc.a0(m2Var) : new zc(frameLayout, c6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), vmVar).j();
            return;
        }
        kc kcVar = new kc(wzVar.getContext(), c6Var);
        kcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = kcVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z9, c6Var), PorterDuff.Mode.MULTIPLY));
        qc qcVar = new qc(wzVar.getContext(), c6Var, true);
        qcVar.a = vmVar;
        kcVar.setButton(qcVar);
        if (m2Var != null) {
            sc.g(m2Var, kcVar, 1500).j();
        } else {
            sc.f(frameLayout, kcVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.vt
    public final void x(TLObject tLObject, Object obj) {
        wz wzVar = this.a;
        yw ywVar = wzVar.h0;
        if (ywVar.getAdapter() == wzVar.n0 || ywVar.getAdapter() == wzVar.j0) {
            wzVar.t1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.mt mtVar) {
    }
}
