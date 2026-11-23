package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yv0 implements org.telegram.ui.ls {
    public final /* synthetic */ jw0 a;

    public yv0(jw0 jw0Var) {
        this.a = jw0Var;
    }

    @Override // org.telegram.ui.ls
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ x60 D(ai.h0 h0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void E(TLRPC.Document document) {
        jw0 jw0Var = this.a;
        jw0Var.N1.documents.remove(document);
        boolean isEmpty = jw0Var.N1.documents.isEmpty();
        if (isEmpty) {
            jw0Var.dismiss();
        }
        jw0Var.o1.f();
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, jw0Var.getContext(), jw0Var.J0);
        t1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ri.c0(document, "").document;
        ConnectionsManager.getInstance(jw0Var.a).sendRequest(tL_stickers_removeStickerFromSet, new di.o8(this, isEmpty, t1Var, 4));
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final boolean H() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final long a() {
        org.telegram.ui.ActionBar.g2 g2Var = this.a.G1;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ls
    public final boolean b() {
        gw0 gw0Var = this.a.W1;
        return gw0Var != null && gw0Var.b();
    }

    @Override // org.telegram.ui.ls
    public final boolean c() {
        gw0 gw0Var = this.a.W1;
        return gw0Var != null && gw0Var.c();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean f() {
        return this.a.S1 != null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.N1;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.ls
    public final void i(org.telegram.messenger.sy syVar) {
        this.a.T0(syVar);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean k(int i7) {
        return this.a.W1 != null;
    }

    @Override // org.telegram.ui.ls
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        jw0 jw0Var = this.a;
        gw0 gw0Var = jw0Var.W1;
        if (gw0Var == null) {
            return;
        }
        gw0Var.d(document, str, obj, null, jw0Var.d2, z10, i7, 0);
        jw0Var.dismiss();
    }

    @Override // org.telegram.ui.ls
    public final void n(TLRPC.Document document) {
        jw0 jw0Var = this.a;
        jw0.N0(jw0Var.G1, jw0Var.N1, document);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.messenger.fj y() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ls
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void K(CharSequence charSequence, String str, ph phVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
