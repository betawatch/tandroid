package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cx0 implements org.telegram.ui.ft {
    public final /* synthetic */ nx0 a;

    public cx0(nx0 nx0Var) {
        this.a = nx0Var;
    }

    @Override // org.telegram.ui.ft
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void D(TLRPC.Document document) {
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        nx0 nx0Var = this.a;
        nx0Var.O.documents.remove(document);
        boolean isEmpty = nx0Var.O.documents.isEmpty();
        if (isEmpty) {
            nx0Var.dismiss();
        }
        nx0Var.d.l();
        Context context = nx0Var.getContext();
        c6Var = ((org.telegram.ui.ActionBar.f3) nx0Var).resourcesProvider;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, c6Var);
        c2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.f3) nx0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new jh.j7(this, isEmpty, c2Var, 3));
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String E(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ j70 G(bg.d1 d1Var) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final long a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.H;
        if (o2Var instanceof org.telegram.ui.tn) {
            return ((org.telegram.ui.tn) o2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ft
    public final boolean b() {
        kx0 kx0Var = this.a.X;
        return kx0Var != null && kx0Var.b();
    }

    @Override // org.telegram.ui.ft
    public final boolean c() {
        kx0 kx0Var = this.a.X;
        return kx0Var != null && kx0Var.c();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean f() {
        return this.a.T != null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.O;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.ft
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean k(int i10) {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.ft
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        nx0 nx0Var = this.a;
        kx0 kx0Var = nx0Var.X;
        if (kx0Var == null) {
            return;
        }
        kx0Var.a(document, str, obj, null, nx0Var.e0, z10, i10, 0);
        nx0Var.dismiss();
    }

    @Override // org.telegram.ui.ft
    public final void n(TLRPC.Document document) {
        nx0 nx0Var = this.a;
        nx0.o0(nx0Var.H, nx0Var.O, document);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ft
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.tm tmVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
