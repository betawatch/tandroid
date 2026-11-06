package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class nv0 implements org.telegram.ui.is {
    public final /* synthetic */ yv0 a;

    public nv0(yv0 yv0Var) {
        this.a = yv0Var;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ org.telegram.messenger.ij A() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final void F(TLRPC.Document document) {
        yv0 yv0Var = this.a;
        yv0Var.J1.documents.remove(document);
        boolean isEmpty = yv0Var.J1.documents.isEmpty();
        if (isEmpty) {
            yv0Var.dismiss();
        }
        yv0Var.k1.f();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, yv0Var.getContext(), yv0Var.I0);
        u1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ui.a0(document, "").document;
        ConnectionsManager.getInstance(yv0Var.a).sendRequest(tL_stickers_removeStickerFromSet, new bi.u9(this, isEmpty, u1Var, 4));
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final long a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.a.C1;
        if (f2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) f2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.is
    public final boolean b() {
        vv0 vv0Var = this.a.S1;
        return vv0Var != null && vv0Var.b();
    }

    @Override // org.telegram.ui.is
    public final boolean c() {
        vv0 vv0Var = this.a.S1;
        return vv0Var != null && vv0Var.c();
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean f() {
        return this.a.O1 != null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.J1;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.is
    public final void i(org.telegram.messenger.zy zyVar) {
        this.a.S0(zyVar);
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean k(int i7) {
        return this.a.S1 != null;
    }

    @Override // org.telegram.ui.is
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
        yv0 yv0Var = this.a;
        vv0 vv0Var = yv0Var.S1;
        if (vv0Var == null) {
            return;
        }
        vv0Var.a(document, str, obj, null, yv0Var.Z1, z9, i7, 0);
        yv0Var.dismiss();
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ k60 m(bi.x5 x5Var) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final void o(TLRPC.Document document) {
        yv0 yv0Var = this.a;
        yv0.M0(yv0Var.C1, yv0Var.J1, document);
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.is
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void u(CharSequence charSequence, String str, ex exVar) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }
}
