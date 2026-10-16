package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class on implements vt {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.u1 c;
    public final /* synthetic */ qn d;

    public on(qn qnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.u1 u1Var) {
        this.d = qnVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = u1Var;
    }

    @Override // org.telegram.ui.vt
    public final MessageObject A() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final void K() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), arrayList, null);
        u1Var.S0(true);
    }

    @Override // org.telegram.ui.vt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        fo foVar = this.d.a;
        if (inputStickerSet == null || foVar.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0(foVar.getParentActivity(), foVar, tL_inputStickerSetID, null, foVar.Y, foVar.ea);
        uy0Var.setCalcMandatoryInsets(foVar.C9());
        uy0Var.i0 = z10;
        foVar.showDialog(uy0Var);
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final long a() {
        return this.d.a.T5;
    }

    @Override // org.telegram.ui.vt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean c() {
        return this.d.a.R3 == 1;
    }

    @Override // org.telegram.ui.vt
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final TLRPC.PollAnswer h() {
        return this.b;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean l(int i10) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final void r() {
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), null, null);
        u1Var.S0(true);
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ org.telegram.ui.Components.l80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void f(CharSequence charSequence, String str, mt mtVar) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.vt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
