package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gk implements qt {
    public final /* synthetic */ zn a;

    public gk(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            zn znVar = this.a;
            if (znVar.getParentActivity() == null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            org.telegram.ui.Components.iy0 iy0Var = new org.telegram.ui.Components.iy0(znVar.getParentActivity(), znVar, tL_inputStickerSetID, null, znVar.Y, znVar.ea);
            iy0Var.setCalcMandatoryInsets(znVar.x9());
            iy0Var.i0 = z10;
            znVar.showDialog(iy0Var);
        }
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final long a() {
        return this.a.T5;
    }

    @Override // org.telegram.ui.qt
    public final boolean b() {
        return this.a.D6();
    }

    @Override // org.telegram.ui.qt
    public final boolean c() {
        return this.a.R3 == 1;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ org.telegram.ui.Components.y70 i(ci.n6 n6Var) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean l(int i10) {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.Y.d(document, str, obj, null, true, z10, i10, i11);
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void u(CharSequence charSequence, String str, of ofVar) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
