package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ek implements pt {
    public final /* synthetic */ zn a;

    public ek(zn znVar) {
        this.a = znVar;
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        if (inputStickerSet != null) {
            zn znVar = this.a;
            if (znVar.getParentActivity() == null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(znVar.getParentActivity(), znVar, tL_inputStickerSetID, null, znVar.V, znVar.ba);
            xx0Var.setCalcMandatoryInsets(znVar.x9());
            xx0Var.f0 = z4;
            znVar.showDialog(xx0Var);
        }
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
        return this.a.Q5;
    }

    @Override // org.telegram.ui.pt
    public final boolean b() {
        return this.a.D6();
    }

    @Override // org.telegram.ui.pt
    public final boolean c() {
        return this.a.O3 == 1;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ org.telegram.ui.Components.p70 d(ah.e eVar) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll e() {
        return null;
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
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
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
        return true;
    }

    @Override // org.telegram.ui.pt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        this.a.V.d(document, str, obj, null, true, z4, i10, i11);
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ MessageObject z() {
        return null;
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
    public final /* synthetic */ void K() {
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
    public final /* synthetic */ void r() {
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
    public final /* synthetic */ void A(CharSequence charSequence, String str, org.telegram.ui.Components.vk vkVar) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }
}
