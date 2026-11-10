package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lm implements ls {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.q1 c;
    public final /* synthetic */ nm d;

    public lm(nm nmVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.q1 q1Var) {
        this.d = nmVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = q1Var;
    }

    @Override // org.telegram.ui.ls
    public final org.telegram.messenger.ij A() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void K() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        org.telegram.messenger.gz sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.q1 q1Var = this.c;
        sendMessagesHelper.w0(q1Var.getMessageObject(), arrayList, null);
        q1Var.a0(true);
    }

    @Override // org.telegram.ui.ls
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
        cn cnVar = this.d.a;
        if (inputStickerSet == null || cnVar.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        org.telegram.ui.Components.yv0 yv0Var = new org.telegram.ui.Components.yv0(cnVar.getParentActivity(), cnVar, tL_inputStickerSetID, null, cnVar.Z, cnVar.za);
        boolean U9 = cnVar.U9();
        yv0Var.h0 = U9;
        yv0Var.n = U9;
        yv0Var.c2 = z9;
        cnVar.showDialog(yv0Var);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final long a() {
        return this.d.a.j6;
    }

    @Override // org.telegram.ui.ls
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean c() {
        return this.d.a.f4 == 1;
    }

    @Override // org.telegram.ui.ls
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean k(int i7) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.ui.Components.k60 m(bi.x5 x5Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void r() {
        org.telegram.messenger.gz sendMessagesHelper = this.d.a.getSendMessagesHelper();
        org.telegram.ui.Cells.q1 q1Var = this.c;
        sendMessagesHelper.w0(q1Var.getMessageObject(), null, null);
        q1Var.a0(true);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void i(org.telegram.messenger.zy zyVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void u(CharSequence charSequence, String str, org.telegram.ui.Components.ex exVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.ls
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
