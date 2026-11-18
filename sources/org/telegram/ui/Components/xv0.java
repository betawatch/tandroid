package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xv0 implements org.telegram.ui.ls {
    public final /* synthetic */ iw0 a;

    public xv0(iw0 iw0Var) {
        this.a = iw0Var;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ y60 E(ai.k0 k0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final void F(TLRPC.Document document) {
        iw0 iw0Var = this.a;
        iw0Var.N1.documents.remove(document);
        boolean isEmpty = iw0Var.N1.documents.isEmpty();
        if (isEmpty) {
            iw0Var.dismiss();
        }
        iw0Var.o1.f();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, iw0Var.getContext(), iw0Var.J0);
        u1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ri.c0(document, "").document;
        ConnectionsManager.getInstance(iw0Var.a).sendRequest(tL_stickers_removeStickerFromSet, new di.n8(this, isEmpty, u1Var, 4));
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean J() {
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
        org.telegram.ui.ActionBar.h2 h2Var = this.a.G1;
        if (h2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) h2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ls
    public final boolean b() {
        fw0 fw0Var = this.a.W1;
        return fw0Var != null && fw0Var.b();
    }

    @Override // org.telegram.ui.ls
    public final boolean c() {
        fw0 fw0Var = this.a.W1;
        return fw0Var != null && fw0Var.c();
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
        iw0 iw0Var = this.a;
        fw0 fw0Var = iw0Var.W1;
        if (fw0Var == null) {
            return;
        }
        fw0Var.d(document, str, obj, null, iw0Var.d2, z10, i7, 0);
        iw0Var.dismiss();
    }

    @Override // org.telegram.ui.ls
    public final void n(TLRPC.Document document) {
        iw0 iw0Var = this.a;
        iw0.N0(iw0Var.G1, iw0Var.N1, document);
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
    public final /* synthetic */ org.telegram.messenger.fj z() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void H(TLRPC.Document document) {
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
    public final /* synthetic */ void K() {
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
    public final /* synthetic */ void y(CharSequence charSequence, String str, ph phVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
