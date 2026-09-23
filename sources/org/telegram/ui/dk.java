package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dk implements nt {
    public final /* synthetic */ xn a;

    public dk(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            xn xnVar = this.a;
            if (xnVar.getParentActivity() == null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.Y, xnVar.ea);
            ux0Var.setCalcMandatoryInsets(xnVar.x9());
            ux0Var.i0 = z10;
            xnVar.showDialog(ux0Var);
        }
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final long a() {
        return this.a.T5;
    }

    @Override // org.telegram.ui.nt
    public final boolean b() {
        return this.a.D6();
    }

    @Override // org.telegram.ui.nt
    public final boolean c() {
        return this.a.R3 == 1;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ org.telegram.ui.Components.o70 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean m(int i10) {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.Y.d(document, str, obj, null, true, z10, i10, i11);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void r(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void f(CharSequence charSequence, String str, dt dtVar) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
