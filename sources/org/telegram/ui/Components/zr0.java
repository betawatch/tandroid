package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zr0 implements org.telegram.ui.is {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.q1 c;
    public final /* synthetic */ es0 d;

    public zr0(es0 es0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.q1 q1Var) {
        this.d = es0Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = q1Var;
    }

    @Override // org.telegram.ui.is
    public final org.telegram.messenger.ij A() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final void K() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        org.telegram.messenger.gz.C(this.d.a).w0(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.is
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
        es0 es0Var = this.d;
        gs0 gs0Var = es0Var.c;
        if (inputStickerSet == null || gs0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        yv0 yv0Var = new yv0(gs0Var.s.getContext(), gs0Var.s.x1, tL_inputStickerSetID, null, null, es0Var.b);
        yv0Var.h0 = true;
        yv0Var.n = true;
        yv0Var.Z1 = z9;
        yv0Var.show();
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final long a() {
        return this.d.c.s.l1;
    }

    @Override // org.telegram.ui.is
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean k(int i7) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ k60 m(bi.x5 x5Var) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final void r() {
        org.telegram.messenger.gz.C(this.d.a).w0(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void i(org.telegram.messenger.zy zyVar) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void u(CharSequence charSequence, String str, ex exVar) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.is
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
