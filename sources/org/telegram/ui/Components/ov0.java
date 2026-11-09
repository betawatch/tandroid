package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ov0 implements org.telegram.ui.ks {
    public final /* synthetic */ zv0 a;

    public ov0(zv0 zv0Var) {
        this.a = zv0Var;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ org.telegram.messenger.ij A() {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final void F(TLRPC.Document document) {
        zv0 zv0Var = this.a;
        zv0Var.J1.documents.remove(document);
        boolean isEmpty = zv0Var.J1.documents.isEmpty();
        if (isEmpty) {
            zv0Var.dismiss();
        }
        zv0Var.k1.f();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, zv0Var.getContext(), zv0Var.I0);
        u1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ui.a0(document, "").document;
        ConnectionsManager.getInstance(zv0Var.a).sendRequest(tL_stickers_removeStickerFromSet, new bi.u9(this, isEmpty, u1Var, 4));
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final long a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.a.C1;
        if (f2Var instanceof org.telegram.ui.cn) {
            return ((org.telegram.ui.cn) f2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ks
    public final boolean b() {
        wv0 wv0Var = this.a.S1;
        return wv0Var != null && wv0Var.b();
    }

    @Override // org.telegram.ui.ks
    public final boolean c() {
        wv0 wv0Var = this.a.S1;
        return wv0Var != null && wv0Var.c();
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final boolean f() {
        return this.a.O1 != null;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.J1;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.ks
    public final void i(org.telegram.messenger.zy zyVar) {
        this.a.S0(zyVar);
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final boolean k(int i7) {
        return this.a.S1 != null;
    }

    @Override // org.telegram.ui.ks
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
        zv0 zv0Var = this.a;
        wv0 wv0Var = zv0Var.S1;
        if (wv0Var == null) {
            return;
        }
        wv0Var.a(document, str, obj, null, zv0Var.Z1, z9, i7, 0);
        zv0Var.dismiss();
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ l60 m(bi.x5 x5Var) {
        return null;
    }

    @Override // org.telegram.ui.ks
    public final void o(TLRPC.Document document) {
        zv0 zv0Var = this.a;
        zv0.M0(zv0Var.C1, zv0Var.J1, document);
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ks
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void u(CharSequence charSequence, String str, fx fxVar) {
    }

    @Override // org.telegram.ui.ks
    public final /* synthetic */ void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }
}
