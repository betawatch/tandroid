package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fk implements jt {
    public final /* synthetic */ un a;

    public fk(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ org.telegram.ui.Components.z60 D(fg.i iVar) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            un unVar = this.a;
            if (unVar.getParentActivity() == null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(unVar.getParentActivity(), unVar, tL_inputStickerSetID, null, unVar.Z, unVar.xa);
            boolean J9 = unVar.J9();
            cx0Var.h0 = J9;
            cx0Var.n = J9;
            cx0Var.Z1 = z10;
            unVar.showDialog(cx0Var);
        }
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
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final long a() {
        return this.a.j6;
    }

    @Override // org.telegram.ui.jt
    public final boolean b() {
        return this.a.L6();
    }

    @Override // org.telegram.ui.jt
    public final boolean c() {
        return this.a.f4 == 1;
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
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean k(int i10) {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.Z.a(document, str, obj, null, true, z10, i10, i11);
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
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void i(org.telegram.messenger.jz jzVar) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void n(TLRPC.Document document) {
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
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void N(CharSequence charSequence, String str, org.telegram.ui.Components.vg vgVar) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
