package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jx0 implements org.telegram.ui.nt {
    public final /* synthetic */ ux0 a;

    public jx0(ux0 ux0Var) {
        this.a = ux0Var;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final void F(TLRPC.Document document) {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        ux0 ux0Var = this.a;
        ux0Var.S.documents.remove(document);
        boolean isEmpty = ux0Var.S.documents.isEmpty();
        if (isEmpty) {
            ux0Var.dismiss();
        }
        ux0Var.d.l();
        Context context = ux0Var.getContext();
        d6Var = ((org.telegram.ui.ActionBar.f3) ux0Var).resourcesProvider;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, d6Var);
        b2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.f3) ux0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new ci.v1(this, isEmpty, b2Var, 3));
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.L;
        if (n2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) n2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.nt
    public final boolean b() {
        rx0 rx0Var = this.a.b0;
        return rx0Var != null && rx0Var.b();
    }

    @Override // org.telegram.ui.nt
    public final boolean c() {
        rx0 rx0Var = this.a.b0;
        return rx0Var != null && rx0Var.c();
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean g() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final boolean i() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ o70 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final void k(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean m(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.nt
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        ux0 ux0Var = this.a;
        rx0 rx0Var = ux0Var.b0;
        if (rx0Var == null) {
            return;
        }
        rx0Var.d(document, str, obj, null, ux0Var.i0, z10, i10, 0);
        ux0Var.dismiss();
    }

    @Override // org.telegram.ui.nt
    public final void p(TLRPC.Document document) {
        ux0 ux0Var = this.a;
        ux0.o0(ux0Var.L, ux0Var.S, document);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void r(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.nt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.dt dtVar) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
