package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cv0 implements org.telegram.ui.ft {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.s1 c;
    public final /* synthetic */ hv0 d;

    public cv0(hv0 hv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.s1 s1Var) {
        this.d = hv0Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = s1Var;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void J() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.ft
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        hv0 hv0Var = this.d;
        jv0 jv0Var = hv0Var.c;
        if (inputStickerSet == null || jv0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        dz0 dz0Var = new dz0(jv0Var.s.getContext(), jv0Var.s.x1, tL_inputStickerSetID, null, null, hv0Var.b);
        dz0Var.setCalcMandatoryInsets(true);
        dz0Var.i0 = z10;
        dz0Var.show();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final long a() {
        return this.d.c.s.l1;
    }

    @Override // org.telegram.ui.ft
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ l80 i(bh.p pVar) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean l(int i10) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void r() {
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final MessageObject z() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void N(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void O(CharSequence charSequence, String str, oy oyVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
