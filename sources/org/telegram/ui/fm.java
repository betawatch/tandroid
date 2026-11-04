package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fm implements gs {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.q1 c;
    public final /* synthetic */ hm d;

    public fm(hm hmVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.q1 q1Var) {
        this.d = hmVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = q1Var;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void J() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        org.telegram.messenger.yy sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.q1 q1Var = this.c;
        sendMessagesHelper.w0(q1Var.getMessageObject(), arrayList, null);
        q1Var.a0(true);
    }

    @Override // org.telegram.ui.gs
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        wm wmVar = this.d.a;
        if (inputStickerSet == null || wmVar.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        org.telegram.ui.Components.xv0 xv0Var = new org.telegram.ui.Components.xv0(wmVar.getParentActivity(), wmVar, tL_inputStickerSetID, null, wmVar.a0, wmVar.ya);
        boolean T9 = wmVar.T9();
        xv0Var.i0 = T9;
        xv0Var.n = T9;
        xv0Var.a2 = z10;
        wmVar.showDialog(xv0Var);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final long a() {
        return this.d.a.k6;
    }

    @Override // org.telegram.ui.gs
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean c() {
        return this.d.a.g4 == 1;
    }

    @Override // org.telegram.ui.gs
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean k(int i3) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ org.telegram.ui.Components.f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void r() {
        org.telegram.messenger.yy sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.q1 q1Var = this.c;
        sendMessagesHelper.w0(q1Var.getMessageObject(), null, null);
        q1Var.a0(true);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final org.telegram.messenger.zi z() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void i(org.telegram.messenger.ry ryVar) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void K(CharSequence charSequence, String str, org.telegram.ui.Components.ei eiVar) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.gs
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
    }
}
