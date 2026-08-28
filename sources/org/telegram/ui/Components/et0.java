package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class et0 implements org.telegram.ui.ft {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ org.telegram.ui.Cells.t1 c;
    public final /* synthetic */ jt0 d;

    public et0(jt0 jt0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.t1 t1Var) {
        this.d = jt0Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = t1Var;
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
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void K() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.b);
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.ft
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        jt0 jt0Var = this.d;
        lt0 lt0Var = jt0Var.c;
        if (inputStickerSet == null || lt0Var.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        cx0 cx0Var = new cx0(lt0Var.s.getContext(), lt0Var.s.r1, tL_inputStickerSetID, null, null, jt0Var.b);
        cx0Var.setCalcMandatoryInsets(true);
        cx0Var.e0 = z10;
        cx0Var.show();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean N(TLRPC.Document document) {
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
        return this.d.c.s.f1;
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
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean k(int i9) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void q() {
        SendMessagesHelper.getInstance(this.d.a).sendVote(this.c.getMessageObject(), null, null);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ x60 r(fh.v vVar) {
        return null;
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
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void t() {
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
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
    }
}
