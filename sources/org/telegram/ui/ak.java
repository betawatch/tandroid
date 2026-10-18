package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ak implements et {
    public final /* synthetic */ sn a;

    public ak(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            sn snVar = this.a;
            if (snVar.getParentActivity() == null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            org.telegram.ui.Components.oy0 oy0Var = new org.telegram.ui.Components.oy0(snVar.getParentActivity(), snVar, tL_inputStickerSetID, null, snVar.Y, snVar.ea);
            oy0Var.setCalcMandatoryInsets(snVar.C9());
            oy0Var.i0 = z10;
            snVar.showDialog(oy0Var);
        }
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.et
    public final long a() {
        return this.a.T5;
    }

    @Override // org.telegram.ui.et
    public final boolean b() {
        return this.a.G6();
    }

    @Override // org.telegram.ui.et
    public final boolean c() {
        return this.a.R3 == 1;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final boolean k(int i10) {
        return true;
    }

    @Override // org.telegram.ui.et
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.Y.e(document, str, obj, null, true, z10, i10, i11);
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ org.telegram.ui.Components.i80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void t(CharSequence charSequence, String str, org.telegram.ui.Components.qy qyVar) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
