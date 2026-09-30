package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class lu0 implements org.telegram.ui.lt {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.u1 c;
    public final /* synthetic */ qu0 d;

    public lu0(qu0 qu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.u1 u1Var) {
        this.d = qu0Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = u1Var;
    }

    @Override // org.telegram.ui.lt
    public final MessageObject A() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final void K() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.lt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        qu0 qu0Var = this.d;
        su0 su0Var = qu0Var.c;
        if (inputStickerSet == null || su0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        hy0 hy0Var = new hy0(su0Var.s.getContext(), su0Var.s.v1, tL_inputStickerSetID, null, null, qu0Var.b);
        hy0Var.setCalcMandatoryInsets(true);
        hy0Var.i0 = z10;
        hy0Var.show();
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final long a() {
        return this.d.c.s.j1;
    }

    @Override // org.telegram.ui.lt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final TLRPC.PollAnswer h() {
        return this.b;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ a80 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final boolean m(int i10) {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final void s() {
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void r(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.bt btVar) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.lt
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
