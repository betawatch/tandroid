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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lx implements org.telegram.ui.et {
    public final /* synthetic */ tz a;

    public lx(tz tzVar) {
        this.a = tzVar;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final void C(TLRPC.Document document) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.Y1;
        if (n2Var instanceof org.telegram.ui.sn) {
            ((org.telegram.ui.sn) n2Var).fb(document);
        }
    }

    @Override // org.telegram.ui.et
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.et
    public final boolean E(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.et
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new y1(this, 4));
    }

    @Override // org.telegram.ui.et
    public final String G(boolean z10) {
        tz tzVar = this.a;
        if (z10) {
            s4.g0 adapter = tzVar.h0.getAdapter();
            yy yyVar = tzVar.j0;
            if (adapter == yyVar) {
                return yyVar.w;
            }
            return null;
        }
        s4.g0 adapter2 = tzVar.P.getAdapter();
        ty tyVar = tzVar.S;
        if (adapter2 == tyVar) {
            return tyVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.et
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new a6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            tz tzVar = this.a;
            org.telegram.ui.ActionBar.n2 n2Var = tzVar.Y1;
            org.telegram.messenger.lk.p(R.string.EmojiCopied, n2Var != null ? xc.a0(n2Var) : new xc(tzVar.r, tzVar.Z1));
        }
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final void L() {
        this.a.W();
    }

    @Override // org.telegram.ui.et
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.et
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.et
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.et
    public final long a() {
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.et
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.et
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.et
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.et
    public final boolean h() {
        tz tzVar = this.a;
        return (tzVar.Y1 == null && tzVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final boolean k(int i10) {
        if (i10 != 2) {
            return true;
        }
        tz tzVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = tzVar.Y1;
        if ((n2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) n2Var).H6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.sn) tzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.sn) tzVar.Y1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.et
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.et
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
        tz tzVar = this.a;
        oy0.p0(tzVar.Y1, MediaDataController.getInstance(tzVar.c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final void p(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            ay ayVar = this.a.R;
            if (ayVar != null) {
                ayVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.et
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        tz tzVar = this.a;
        uw uwVar = tzVar.h0;
        if (uwVar.getAdapter() == tzVar.n0) {
            tzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (uwVar.getAdapter() == tzVar.j0) {
            tzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.et
    public final void s() {
        ey eyVar = this.a.P;
        if (eyVar == null || eyVar.c3 == null) {
            return;
        }
        while (eyVar.c3.size() > 0) {
            dy dyVar = (dy) eyVar.c3.valueAt(0);
            eyVar.c3.removeAt(0);
            if (dyVar != null) {
                View view = dyVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    dyVar.d.getBackground().setState(new int[0]);
                }
                View view2 = dyVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ i80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.et
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        tz tzVar = this.a;
        FrameLayout frameLayout = tzVar.r;
        org.telegram.ui.ActionBar.n2 n2Var = tzVar.Y1;
        org.telegram.ui.ActionBar.d6 d6Var = tzVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(tzVar.c1).updateEmojiStatus(emojiStatus);
        yt ytVar = new yt(2, this, tL_emojiStatusEmpty);
        if (document != null) {
            (n2Var != null ? xc.a0(n2Var) : new xc(frameLayout, d6Var)).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ytVar).j();
            return;
        }
        ic icVar = new ic(tzVar.getContext(), d6Var);
        icVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = icVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z9, d6Var), PorterDuff.Mode.MULTIPLY));
        oc ocVar = new oc(tzVar.getContext(), d6Var, true);
        ocVar.a = ytVar;
        icVar.setButton(ocVar);
        if (n2Var != null) {
            qc.g(n2Var, icVar, 1500).j();
        } else {
            qc.f(frameLayout, icVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.et
    public final void x(TLObject tLObject, Object obj) {
        tz tzVar = this.a;
        uw uwVar = tzVar.h0;
        if (uwVar.getAdapter() == tzVar.n0 || uwVar.getAdapter() == tzVar.j0) {
            tzVar.t1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void t(CharSequence charSequence, String str, qy qyVar) {
    }
}
