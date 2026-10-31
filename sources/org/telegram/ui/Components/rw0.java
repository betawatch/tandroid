package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rw0 implements org.telegram.ui.jt {
    public final /* synthetic */ cx0 a;

    public rw0(cx0 cx0Var) {
        this.a = cx0Var;
    }

    @Override // org.telegram.ui.jt
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ z60 D(fg.i iVar) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final void E(TLRPC.Document document) {
        cx0 cx0Var = this.a;
        cx0Var.J1.documents.remove(document);
        boolean isEmpty = cx0Var.J1.documents.isEmpty();
        if (isEmpty) {
            cx0Var.dismiss();
        }
        cx0Var.k1.f();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, cx0Var.getContext(), cx0Var.I0);
        x1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ui.a0(document, "").document;
        ConnectionsManager.getInstance(cx0Var.a).sendRequest(tL_stickers_removeStickerFromSet, new org.telegram.ui.wd(this, isEmpty, x1Var, 1));
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final boolean H() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final long a() {
        org.telegram.ui.ActionBar.k2 k2Var = this.a.C1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.jt
    public final boolean b() {
        zw0 zw0Var = this.a.S1;
        return zw0Var != null && zw0Var.b();
    }

    @Override // org.telegram.ui.jt
    public final boolean c() {
        zw0 zw0Var = this.a.S1;
        return zw0Var != null && zw0Var.c();
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean f() {
        return this.a.O1 != null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.J1;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.jt
    public final void i(org.telegram.messenger.jz jzVar) {
        this.a.S0(jzVar);
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean k(int i10) {
        return this.a.S1 != null;
    }

    @Override // org.telegram.ui.jt
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        cx0 cx0Var = this.a;
        zw0 zw0Var = cx0Var.S1;
        if (zw0Var == null) {
            return;
        }
        zw0Var.a(document, str, obj, null, cx0Var.Z1, z10, i10, 0);
        cx0Var.dismiss();
    }

    @Override // org.telegram.ui.jt
    public final void n(TLRPC.Document document) {
        cx0 cx0Var = this.a;
        cx0.M0(cx0Var.C1, cx0Var.J1, document);
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ org.telegram.messenger.jj y() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.jt
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void N(CharSequence charSequence, String str, vg vgVar) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
