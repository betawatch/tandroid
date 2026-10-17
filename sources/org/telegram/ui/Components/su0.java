package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class su0 implements org.telegram.ui.et {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.u1 c;
    public final /* synthetic */ xu0 d;

    public su0(xu0 xu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.u1 u1Var) {
        this.d = xu0Var;
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
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.et
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        xu0 xu0Var = this.d;
        zu0 zu0Var = xu0Var.c;
        if (inputStickerSet == null || zu0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        oy0 oy0Var = new oy0(zu0Var.s.getContext(), zu0Var.s.v1, tL_inputStickerSetID, null, null, xu0Var.b);
        oy0Var.setCalcMandatoryInsets(true);
        oy0Var.i0 = z10;
        oy0Var.show();
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
        return this.d.c.s.j1;
    }

    @Override // org.telegram.ui.et
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final boolean c() {
        return false;
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
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ i80 u(ah.v vVar) {
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
    public final /* synthetic */ void t(CharSequence charSequence, String str, qy qyVar) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.et
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
