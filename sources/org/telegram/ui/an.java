package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class an implements ct {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.u1 c;
    public final /* synthetic */ cn d;

    public an(cn cnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.u1 u1Var) {
        this.d = cnVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = u1Var;
    }

    @Override // org.telegram.ui.ct
    public final MessageObject A() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final void K() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), arrayList, null);
        u1Var.S0(true);
    }

    @Override // org.telegram.ui.ct
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        qn qnVar = this.d.a;
        if (inputStickerSet == null || qnVar.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(qnVar.getParentActivity(), qnVar, tL_inputStickerSetID, null, qnVar.Y, qnVar.ea);
        qy0Var.setCalcMandatoryInsets(qnVar.C9());
        qy0Var.i0 = z10;
        qnVar.showDialog(qy0Var);
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ct
    public final long a() {
        return this.d.a.T5;
    }

    @Override // org.telegram.ui.ct
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final boolean c() {
        return this.d.a.R3 == 1;
    }

    @Override // org.telegram.ui.ct
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final boolean k(int i10) {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ct
    public final void q() {
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), null, null);
        u1Var.S0(true);
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ org.telegram.ui.Components.i80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void t(CharSequence charSequence, String str, org.telegram.ui.Components.qy qyVar) {
    }

    @Override // org.telegram.ui.ct
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ct
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
