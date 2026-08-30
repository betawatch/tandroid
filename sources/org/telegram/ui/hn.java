package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hn implements nt {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.t1 c;
    public final /* synthetic */ jn d;

    public hn(jn jnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.t1 t1Var) {
        this.d = jnVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = t1Var;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ String G(boolean z4) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void K() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.t1 t1Var = this.c;
        sendMessagesHelper.sendVote(t1Var.getMessageObject(), arrayList, null);
        t1Var.S0(true);
    }

    @Override // org.telegram.ui.nt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        xn xnVar = this.d.a;
        if (inputStickerSet == null || xnVar.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.V, xnVar.ba);
        xx0Var.setCalcMandatoryInsets(xnVar.x9());
        xx0Var.f0 = z4;
        xnVar.showDialog(xx0Var);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final long a() {
        return this.d.a.Q5;
    }

    @Override // org.telegram.ui.nt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean c() {
        return this.d.a.O3 == 1;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ org.telegram.ui.Components.o70 d(ah.d dVar) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final TLRPC.TL_messageMediaPoll e() {
        return this.a;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean f(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final TLRPC.PollAnswer h() {
        return this.b;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean l(int i10) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void r() {
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.t1 t1Var = this.c;
        sendMessagesHelper.sendVote(t1Var.getMessageObject(), null, null);
        t1Var.S0(true);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final MessageObject z() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void A(CharSequence charSequence, String str, org.telegram.ui.Components.vk vkVar) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.nt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
