package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nn implements rt {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.t1 c;
    public final /* synthetic */ pn d;

    public nn(pn pnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.t1 t1Var) {
        this.d = pnVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = t1Var;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ String E(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void J() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.t1 t1Var = this.c;
        sendMessagesHelper.sendVote(t1Var.getMessageObject(), arrayList, null);
        t1Var.S0(true);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ org.telegram.ui.Components.w70 K(bi.n7 n7Var) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        eo eoVar = this.d.a;
        if (inputStickerSet == null || eoVar.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(eoVar.getParentActivity(), eoVar, tL_inputStickerSetID, null, eoVar.Y, eoVar.ea);
        hy0Var.setCalcMandatoryInsets(eoVar.x9());
        hy0Var.i0 = z10;
        eoVar.showDialog(hy0Var);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final long a() {
        return this.d.a.T5;
    }

    @Override // org.telegram.ui.rt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean c() {
        return this.d.a.R3 == 1;
    }

    @Override // org.telegram.ui.rt
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean k(int i10) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void q() {
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.t1 t1Var = this.c;
        sendMessagesHelper.sendVote(t1Var.getMessageObject(), null, null);
        t1Var.S0(true);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final MessageObject y() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void D(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void F(CharSequence charSequence, String str, pf pfVar) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.rt
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
