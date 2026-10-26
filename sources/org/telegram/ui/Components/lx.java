package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.PorterDuff;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lx implements org.telegram.ui.dt {
    public final /* synthetic */ sz a;

    public lx(sz szVar) {
        this.a = szVar;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.r2 r2Var = this.a.Y1;
        if (r2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) r2Var).lb(document);
        }
    }

    @Override // org.telegram.ui.dt
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final boolean D(TLRPC.Document document) {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(this.a.c1).sendRequest(tL_stickers_removeStickerFromSet, new b2(this, 4));
    }

    @Override // org.telegram.ui.dt
    public final String F(boolean z10) {
        sz szVar = this.a;
        if (z10) {
            s4.h0 adapter = szVar.h0.getAdapter();
            xy xyVar = szVar.j0;
            if (adapter == xyVar) {
                return xyVar.w;
            }
            return null;
        }
        s4.h0 adapter2 = szVar.P.getAdapter();
        sy syVar = szVar.S;
        if (adapter2 == syVar) {
            return syVar.v;
        }
        return null;
    }

    @Override // org.telegram.ui.dt
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
        valueOf.setSpan(new c6(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (AndroidUtilities.addToClipboard(valueOf)) {
            sz szVar = this.a;
            org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
            org.telegram.messenger.vh.m(R.string.EmojiCopied, r2Var != null ? wc.b0(r2Var) : new wc(szVar.r, szVar.Z1));
        }
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void K() {
        this.a.W();
    }

    @Override // org.telegram.ui.dt
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.t1.d(null, inputStickerSet, false);
    }

    @Override // org.telegram.ui.dt
    public final boolean M(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList<String> arrayList = Emoji.recentEmoji;
        StringBuilder sb2 = new StringBuilder("animated_");
        sb2.append(document.id);
        return arrayList.contains(sb2.toString());
    }

    @Override // org.telegram.ui.dt
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User currentUser;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
            return null;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final long a() {
        return this.a.t1.a();
    }

    @Override // org.telegram.ui.dt
    public final boolean b() {
        return this.a.t1.b();
    }

    @Override // org.telegram.ui.dt
    public final boolean c() {
        return this.a.t1.c();
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final boolean e(TLRPC.Document document) {
        return this.a.t1.j();
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final boolean h() {
        sz szVar = this.a;
        return (szVar.Y1 == null && szVar.u0) ? false : true;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ k80 i(bh.p pVar) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final boolean l(int i10) {
        if (i10 != 2) {
            return true;
        }
        sz szVar = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
        if ((r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).J6()) {
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (((org.telegram.ui.un) szVar.Y1).i() != null && UserObject.isUserSelf(((org.telegram.ui.un) szVar.Y1).i()));
        }
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.dt
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
        sz szVar = this.a;
        cz0.q0(szVar.Y1, MediaDataController.getInstance(szVar.c1).getStickerSet(inputStickerSet, true), document);
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void q(TLRPC.Document document) {
        if (document != null) {
            Emoji.removeRecentEmoji("animated_" + document.id);
            zx zxVar = this.a.R;
            if (zxVar != null) {
                zxVar.F(false);
            }
        }
    }

    @Override // org.telegram.ui.dt
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        sz szVar = this.a;
        uw uwVar = szVar.h0;
        if (uwVar.getAdapter() == szVar.n0) {
            szVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (uwVar.getAdapter() == szVar.j0) {
            szVar.t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override // org.telegram.ui.dt
    public final void t() {
        dy dyVar = this.a.P;
        if (dyVar == null || dyVar.m3 == null) {
            return;
        }
        while (dyVar.m3.size() > 0) {
            cy cyVar = (cy) dyVar.m3.valueAt(0);
            dyVar.m3.removeAt(0);
            if (cyVar != null) {
                View view = cyVar.d;
                if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                    cyVar.d.getBackground().setState(new int[0]);
                }
                View view2 = cyVar.d;
                if (view2 != null) {
                    view2.setPressed(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.dt
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        sz szVar = this.a;
        FrameLayout frameLayout = szVar.r;
        org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        Object tL_emojiStatusEmpty = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
        MessagesController.getInstance(szVar.c1).updateEmojiStatus(emojiStatus);
        so soVar = new so(12, this, tL_emojiStatusEmpty);
        if (document != null) {
            (r2Var != null ? wc.b0(r2Var) : new wc(frameLayout, u6Var)).r(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), soVar).j();
            return;
        }
        ic icVar = new ic(szVar.getContext(), u6Var);
        icVar.b.setText(LocaleController.getString(R.string.RemoveStatusInfo));
        int i10 = R.drawable.msg_settings_premium;
        ImageView imageView = icVar.a;
        imageView.setImageResource(i10);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.z9, u6Var, PorterDuff.Mode.MULTIPLY);
        oc ocVar = new oc(szVar.getContext(), u6Var, true);
        ocVar.b = soVar;
        icVar.setButton(ocVar);
        if (r2Var != null) {
            qc.g(r2Var, icVar, 1500).j();
        } else {
            qc.f(frameLayout, icVar, 1500).j();
        }
    }

    @Override // org.telegram.ui.dt
    public final void w(TLObject tLObject, Object obj) {
        sz szVar = this.a;
        uw uwVar = szVar.h0;
        if (uwVar.getAdapter() == szVar.n0 || uwVar.getAdapter() == szVar.j0) {
            szVar.t1.e(tLObject, obj);
        }
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void N(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void O(CharSequence charSequence, String str, oy oyVar) {
    }
}
