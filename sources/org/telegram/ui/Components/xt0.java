package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xt0 implements org.telegram.ui.pt {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.s1 c;
    public final /* synthetic */ cu0 d;

    public xt0(cu0 cu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.s1 s1Var) {
        this.d = cu0Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = s1Var;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ String G(boolean z4) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void K() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.pt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        cu0 cu0Var = this.d;
        eu0 eu0Var = cu0Var.c;
        if (inputStickerSet == null || eu0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        xx0 xx0Var = new xx0(eu0Var.s.getContext(), eu0Var.s.s1, tL_inputStickerSetID, null, null, cu0Var.b);
        xx0Var.setCalcMandatoryInsets(true);
        xx0Var.f0 = z4;
        xx0Var.show();
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final long a() {
        return this.d.c.s.g1;
    }

    @Override // org.telegram.ui.pt
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean c() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ p70 d(ah.e eVar) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final TLRPC.TL_messageMediaPoll e() {
        return this.a;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean f(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final TLRPC.PollAnswer h() {
        return this.b;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean l(int i10) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void r() {
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final MessageObject z() {
        return this.c.getMessageObject();
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void A(CharSequence charSequence, String str, vk vkVar) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.pt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
