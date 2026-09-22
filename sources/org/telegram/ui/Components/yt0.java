package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yt0 implements org.telegram.ui.qt {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.t1 c;
    public final /* synthetic */ du0 d;

    public yt0(du0 du0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.t1 t1Var) {
        this.d = du0Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = t1Var;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void K() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.qt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        du0 du0Var = this.d;
        fu0 fu0Var = du0Var.c;
        if (inputStickerSet == null || fu0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        vx0 vx0Var = new vx0(fu0Var.s.getContext(), fu0Var.s.v1, tL_inputStickerSetID, null, null, du0Var.b);
        vx0Var.setCalcMandatoryInsets(true);
        vx0Var.i0 = z10;
        vx0Var.show();
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final long a() {
        return this.d.c.s.j1;
    }

    @Override // org.telegram.ui.qt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ n70 i(ci.n6 n6Var) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean l(int i10) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void r() {
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final MessageObject z() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void G(CharSequence charSequence, String str, org.telegram.ui.nf nfVar) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.qt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
