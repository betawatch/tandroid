package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zt0 implements org.telegram.ui.st {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.t1 c;
    public final /* synthetic */ eu0 d;

    public zt0(eu0 eu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.t1 t1Var) {
        this.d = eu0Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = t1Var;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final void K() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.st
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        eu0 eu0Var = this.d;
        gu0 gu0Var = eu0Var.c;
        if (inputStickerSet == null || gu0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        wx0 wx0Var = new wx0(gu0Var.s.getContext(), gu0Var.s.v1, tL_inputStickerSetID, null, null, eu0Var.b);
        wx0Var.setCalcMandatoryInsets(true);
        wx0Var.i0 = z10;
        wx0Var.show();
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final long a() {
        return this.d.c.s.j1;
    }

    @Override // org.telegram.ui.st
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ n70 i(ci.n6 n6Var) {
        return null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final boolean l(int i10) {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final void r() {
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final MessageObject z() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void G(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.st
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
