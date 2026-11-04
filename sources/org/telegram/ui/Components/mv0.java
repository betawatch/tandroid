package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mv0 implements org.telegram.ui.gs {
    public final /* synthetic */ xv0 a;

    public mv0(xv0 xv0Var) {
        this.a = xv0Var;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void E(TLRPC.Document document) {
        xv0 xv0Var = this.a;
        xv0Var.K1.documents.remove(document);
        boolean isEmpty = xv0Var.K1.documents.isEmpty();
        if (isEmpty) {
            xv0Var.dismiss();
        }
        xv0Var.l1.f();
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, xv0Var.getContext(), xv0Var.J0);
        s1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.li.a0(document, "").document;
        ConnectionsManager.getInstance(xv0Var.a).sendRequest(tL_stickers_removeStickerFromSet, new ci.t8(this, isEmpty, s1Var, 4));
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final boolean H() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final long a() {
        org.telegram.ui.ActionBar.d2 d2Var = this.a.D1;
        if (d2Var instanceof org.telegram.ui.wm) {
            return ((org.telegram.ui.wm) d2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.gs
    public final boolean b() {
        uv0 uv0Var = this.a.T1;
        return uv0Var != null && uv0Var.b();
    }

    @Override // org.telegram.ui.gs
    public final boolean c() {
        uv0 uv0Var = this.a.T1;
        return uv0Var != null && uv0Var.c();
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean f() {
        return this.a.P1 != null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.K1;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.gs
    public final void i(org.telegram.messenger.ry ryVar) {
        this.a.S0(ryVar);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean k(int i3) {
        return this.a.T1 != null;
    }

    @Override // org.telegram.ui.gs
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
        xv0 xv0Var = this.a;
        uv0 uv0Var = xv0Var.T1;
        if (uv0Var == null) {
            return;
        }
        uv0Var.a(document, str, obj, null, xv0Var.a2, z10, i3, 0);
        xv0Var.dismiss();
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final void o(TLRPC.Document document) {
        xv0 xv0Var = this.a;
        xv0.M0(xv0Var.D1, xv0Var.K1, document);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ org.telegram.messenger.zi z() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.gs
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void K(CharSequence charSequence, String str, ei eiVar) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
