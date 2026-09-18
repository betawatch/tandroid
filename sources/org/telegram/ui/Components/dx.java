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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dx implements org.telegram.ui.st {
    public final /* synthetic */ kz a;

    public dx(kz kzVar) {
        this.a = kzVar;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.Y1;
        if (o2Var instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) o2Var).bb(document);
        }
    }

    @Override // org.telegram.ui.st
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final boolean D(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.st
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new x1(this, 4));
    }

    @Override // org.telegram.ui.st
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
        jy jyVar = kzVar.S;
        if (adapter2 == jyVar) {
            return jyVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.st
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            kz kzVar = this.a;
            org.telegram.ui.ActionBar.o2 o2Var = kzVar.Y1;
            org.telegram.messenger.wl.o(R.string.EmojiCopied, o2Var != null ? vc.a0(o2Var) : new vc(kzVar.r, kzVar.Z1));
        }
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final void L() {
        this.a.W();
    }

    @Override // org.telegram.ui.st
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.st
    public final boolean N(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.st
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final long a() {
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.st
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.st
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.st
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.st
    public final boolean h() {
        kz kzVar = this.a;
        return (kzVar.Y1 == null && kzVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ n70 i(ci.n6 n6Var) {
        return null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final boolean l(int i10) {
        if (i10 != 2) {
            return true;
        }
        kz kzVar = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = kzVar.Y1;
        if ((o2Var instanceof org.telegram.ui.bo) && ((org.telegram.ui.bo) o2Var).E6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.bo) kzVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.bo) kzVar.Y1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.st
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.st
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
        kz kzVar = this.a;
        wx0.o0(kzVar.Y1, MediaDataController.getInstance(kzVar.c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final void q(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            sx sxVar = this.a.R;
            if (sxVar != null) {
                sxVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.st
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        kz kzVar = this.a;
        mw mwVar = kzVar.h0;
        if (mwVar.getAdapter() == kzVar.n0) {
            kzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (mwVar.getAdapter() == kzVar.j0) {
            kzVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.st
    public final void t() {
        vx vxVar = this.a.P;
        if (vxVar == null || vxVar.e3 == null) {
            return;
        }
        while (vxVar.e3.size() > 0) {
            ux uxVar = (ux) vxVar.e3.valueAt(0);
            vxVar.e3.removeAt(0);
            if (uxVar != null) {
                View view = uxVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    uxVar.d.getBackground().setState(new int[0]);
                }
                View view2 = uxVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.st
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        kz kzVar = this.a;
        FrameLayout frameLayout = kzVar.r;
        org.telegram.ui.ActionBar.o2 o2Var = kzVar.Y1;
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
        oh ohVar = new oh(25, this, tL_emojiStatusEmpty);
        if (document != null) {
            (o2Var != null ? vc.a0(o2Var) : new vc(frameLayout, f6Var)).q(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), ohVar).j();
            return;
        }
        gc gcVar = new gc(kzVar.getContext(), f6Var);
        gcVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = gcVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var), PorterDuff.Mode.MULTIPLY));
        mc mcVar = new mc(kzVar.getContext(), f6Var, true);
        mcVar.a = ohVar;
        gcVar.setButton(mcVar);
        if (o2Var != null) {
            oc.g(o2Var, gcVar, 1500).j();
        } else {
            oc.f(frameLayout, gcVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.st
    public final void w(TLObject tLObject, Object obj) {
        kz kzVar = this.a;
        mw mwVar = kzVar.h0;
        if (mwVar.getAdapter() == kzVar.n0 || mwVar.getAdapter() == kzVar.j0) {
            kzVar.t1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void G(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }
}
