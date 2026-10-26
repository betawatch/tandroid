package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dn implements dt {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.s1 c;
    public final /* synthetic */ fn d;

    public dn(fn fnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.s1 s1Var) {
        this.d = fnVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = s1Var;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void J() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.s1 s1Var = this.c;
        sendMessagesHelper.sendVote(s1Var.getMessageObject(), arrayList, null);
        s1Var.R0(true);
    }

    @Override // org.telegram.ui.dt
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        un unVar = this.d.a;
        if (inputStickerSet == null || unVar.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(unVar.getParentActivity(), unVar, tL_inputStickerSetID, null, unVar.Y, unVar.qa);
        cz0Var.setCalcMandatoryInsets(unVar.F9());
        cz0Var.i0 = z10;
        unVar.showDialog(cz0Var);
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final long a() {
        return this.d.a.f6;
    }

    @Override // org.telegram.ui.dt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final boolean c() {
        return this.d.a.d4 == 1;
    }

    @Override // org.telegram.ui.dt
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ org.telegram.ui.Components.k80 i(bh.p pVar) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final boolean l(int i10) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void r() {
        SendMessagesHelper sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.s1 s1Var = this.c;
        sendMessagesHelper.sendVote(s1Var.getMessageObject(), null, null);
        s1Var.R0(true);
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final MessageObject z() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void N(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void O(CharSequence charSequence, String str, org.telegram.ui.Components.oy oyVar) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.dt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
