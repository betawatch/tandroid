package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class cn implements et {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.u1 c;
    public final /* synthetic */ en d;

    public cn(en enVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.u1 u1Var) {
        this.d = enVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = u1Var;
    }

    @Override // org.telegram.ui.et
    public final MessageObject A() {
        return this.c.getMessageObject();
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
    public final void K() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), arrayList, null);
        u1Var.S0(true);
    }

    @Override // org.telegram.ui.et
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        sn snVar = this.d.a;
        if (inputStickerSet == null || snVar.getParentActivity() == null) {
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
        return this.d.a.T5;
    }

    @Override // org.telegram.ui.et
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final boolean c() {
        return this.d.a.R3 == 1;
    }

    @Override // org.telegram.ui.et
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
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
    public final TLRPC.PollAnswer g() {
        return this.b;
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
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final void q() {
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), null, null);
        u1Var.S0(true);
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

    @Override // org.telegram.ui.et
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
