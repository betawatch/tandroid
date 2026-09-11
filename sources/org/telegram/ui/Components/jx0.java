package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class jx0 implements org.telegram.ui.qt {
    public final /* synthetic */ ux0 a;

    public jx0(ux0 ux0Var) {
        this.a = ux0Var;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final void E(TLRPC.Document document) {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        ux0 ux0Var = this.a;
        ux0Var.S.documents.remove(document);
        boolean isEmpty = ux0Var.S.documents.isEmpty();
        if (isEmpty) {
            ux0Var.dismiss();
        }
        ux0Var.d.l();
        Context context = ux0Var.getContext();
        f6Var = ((org.telegram.ui.ActionBar.f3) ux0Var).resourcesProvider;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, f6Var);
        b2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.f3) ux0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new di.v1(this, isEmpty, b2Var, 3));
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean J() {
        return false;
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
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.L;
        if (n2Var instanceof org.telegram.ui.co) {
            return ((org.telegram.ui.co) n2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.qt
    public final boolean b() {
        rx0 rx0Var = this.a.b0;
        return rx0Var != null && rx0Var.b();
    }

    @Override // org.telegram.ui.qt
    public final boolean c() {
        rx0 rx0Var = this.a.b0;
        return rx0Var != null && rx0Var.c();
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean f() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.qt
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final boolean k(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.qt
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        ux0 ux0Var = this.a;
        rx0 rx0Var = ux0Var.b0;
        if (rx0Var == null) {
            return;
        }
        rx0Var.a(document, str, obj, null, ux0Var.i0, z10, i10, 0);
        ux0Var.dismiss();
    }

    @Override // org.telegram.ui.qt
    public final void n(TLRPC.Document document) {
        ux0 ux0Var = this.a;
        ux0.o0(ux0Var.L, ux0Var.S, document);
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ n70 t(ah.w wVar) {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.qt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.qt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
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
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
