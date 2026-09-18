package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hk implements st {
    public final /* synthetic */ bo a;

    public hk(bo boVar) {
        this.a = boVar;
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            bo boVar = this.a;
            if (boVar.getParentActivity() == null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(boVar.getParentActivity(), boVar, tL_inputStickerSetID, null, boVar.Y, boVar.ea);
            wx0Var.setCalcMandatoryInsets(boVar.x9());
            wx0Var.i0 = z10;
            boVar.showDialog(wx0Var);
        }
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
        return this.a.T5;
    }

    @Override // org.telegram.ui.st
    public final boolean b() {
        return this.a.D6();
    }

    @Override // org.telegram.ui.st
    public final boolean c() {
        return this.a.R3 == 1;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
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
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ org.telegram.ui.Components.n70 i(ci.n6 n6Var) {
        return null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final boolean l(int i10) {
        return true;
    }

    @Override // org.telegram.ui.st
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.Y.d(document, str, obj, null, true, z10, i10, i11);
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ MessageObject z() {
        return null;
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
    public final /* synthetic */ void K() {
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
    public final /* synthetic */ void r() {
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
    public final /* synthetic */ void G(CharSequence charSequence, String str, pf pfVar) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
