package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zs0 implements org.telegram.ui.jt {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.q1 c;
    public final /* synthetic */ et0 d;

    public zs0(et0 et0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.q1 q1Var) {
        this.d = et0Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = q1Var;
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
    public final /* synthetic */ z60 D(fg.i iVar) {
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
    public final void J() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        org.telegram.messenger.qz.C(this.d.a).w0(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.jt
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        et0 et0Var = this.d;
        gt0 gt0Var = et0Var.c;
        if (inputStickerSet == null || gt0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        cx0 cx0Var = new cx0(gt0Var.s.getContext(), gt0Var.s.x1, tL_inputStickerSetID, null, null, et0Var.b);
        cx0Var.h0 = true;
        cx0Var.n = true;
        cx0Var.Z1 = z10;
        cx0Var.show();
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
        return this.d.c.s.l1;
    }

    @Override // org.telegram.ui.jt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
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
    public final TLRPC.PollAnswer g() {
        return this.b;
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
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final void q() {
        org.telegram.messenger.qz.C(this.d.a).w0(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final org.telegram.messenger.jj y() {
        return this.c.getMessageObject();
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
    public final /* synthetic */ void K() {
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
    public final /* synthetic */ void N(CharSequence charSequence, String str, vg vgVar) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.jt
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
