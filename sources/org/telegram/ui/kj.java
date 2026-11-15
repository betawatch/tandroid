package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kj implements ls {
    public final /* synthetic */ an a;

    public kj(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.ui.Components.m60 E(ai.k0 k0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            an anVar = this.a;
            if (anVar.getParentActivity() == null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(anVar.getParentActivity(), anVar, tL_inputStickerSetID, null, anVar.a0, anVar.Aa);
            boolean V9 = anVar.V9();
            bw0Var.i0 = V9;
            bw0Var.n = V9;
            bw0Var.d2 = z10;
            anVar.showDialog(bw0Var);
        }
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
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final long a() {
        return this.a.k6;
    }

    @Override // org.telegram.ui.ls
    public final boolean b() {
        return this.a.S6();
    }

    @Override // org.telegram.ui.ls
    public final boolean c() {
        return this.a.g4 == 1;
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
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean k(int i7) {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        this.a.a0.d(document, str, obj, null, true, z10, i7, i10);
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
    public final /* synthetic */ org.telegram.messenger.gj z() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void i(org.telegram.messenger.xy xyVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void n(TLRPC.Document document) {
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
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void y(CharSequence charSequence, String str, org.telegram.ui.Components.gh ghVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
