package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class at0 implements org.telegram.ui.ht {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.q1 c;
    public final /* synthetic */ ft0 d;

    public at0(ft0 ft0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.q1 q1Var) {
        this.d = ft0Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = q1Var;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ z60 D(fg.i iVar) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final void J() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        org.telegram.messenger.rz.C(this.d.a).w0(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.ht
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ft0 ft0Var = this.d;
        ht0 ht0Var = ft0Var.c;
        if (inputStickerSet == null || ht0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        dx0 dx0Var = new dx0(ht0Var.s.getContext(), ht0Var.s.x1, tL_inputStickerSetID, null, null, ft0Var.b);
        dx0Var.h0 = true;
        dx0Var.n = true;
        dx0Var.Z1 = z10;
        dx0Var.show();
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final long a() {
        return this.d.c.s.l1;
    }

    @Override // org.telegram.ui.ht
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean k(int i10) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final void q() {
        org.telegram.messenger.rz.C(this.d.a).w0(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final org.telegram.messenger.kj y() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void i(org.telegram.messenger.kz kzVar) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void N(CharSequence charSequence, String str, vg vgVar) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ht
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
