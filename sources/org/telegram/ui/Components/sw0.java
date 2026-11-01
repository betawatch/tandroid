package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sw0 implements org.telegram.ui.ht {
    public final /* synthetic */ dx0 a;

    public sw0(dx0 dx0Var) {
        this.a = dx0Var;
    }

    @Override // org.telegram.ui.ht
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ z60 D(fg.i iVar) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final void E(TLRPC.Document document) {
        dx0 dx0Var = this.a;
        dx0Var.J1.documents.remove(document);
        boolean isEmpty = dx0Var.J1.documents.isEmpty();
        if (isEmpty) {
            dx0Var.dismiss();
        }
        dx0Var.k1.f();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, dx0Var.getContext(), dx0Var.I0);
        x1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.vi.a0(document, "").document;
        ConnectionsManager.getInstance(dx0Var.a).sendRequest(tL_stickers_removeStickerFromSet, new org.telegram.ui.wd(this, isEmpty, x1Var, 1));
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final boolean H() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final long a() {
        org.telegram.ui.ActionBar.k2 k2Var = this.a.C1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ht
    public final boolean b() {
        ax0 ax0Var = this.a.S1;
        return ax0Var != null && ax0Var.b();
    }

    @Override // org.telegram.ui.ht
    public final boolean c() {
        ax0 ax0Var = this.a.S1;
        return ax0Var != null && ax0Var.c();
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean f() {
        return this.a.O1 != null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.J1;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.ht
    public final void i(org.telegram.messenger.kz kzVar) {
        this.a.S0(kzVar);
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean k(int i10) {
        return this.a.S1 != null;
    }

    @Override // org.telegram.ui.ht
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        dx0 dx0Var = this.a;
        ax0 ax0Var = dx0Var.S1;
        if (ax0Var == null) {
            return;
        }
        ax0Var.a(document, str, obj, null, dx0Var.Z1, z10, i10, 0);
        dx0Var.dismiss();
    }

    @Override // org.telegram.ui.ht
    public final void n(TLRPC.Document document) {
        dx0 dx0Var = this.a;
        dx0.M0(dx0Var.C1, dx0Var.J1, document);
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ org.telegram.messenger.kj y() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ht
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void N(CharSequence charSequence, String str, vg vgVar) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
