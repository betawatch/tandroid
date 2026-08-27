package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tw0 implements org.telegram.ui.ht {
    public final /* synthetic */ ex0 a;

    public tw0(ex0 ex0Var) {
        this.a = ex0Var;
    }

    @Override // org.telegram.ui.ht
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final void D(TLRPC.Document document) {
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        ex0 ex0Var = this.a;
        ex0Var.O.documents.remove(document);
        boolean isEmpty = ex0Var.O.documents.isEmpty();
        if (isEmpty) {
            ex0Var.dismiss();
        }
        ex0Var.d.l();
        Context context = ex0Var.getContext();
        c6Var = ((org.telegram.ui.ActionBar.e3) ex0Var).resourcesProvider;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, c6Var);
        b2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.e3) ex0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new hh.l7(this, isEmpty, b2Var, 3));
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final boolean H() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ b70 L(ag.y1 y1Var) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.H;
        if (n2Var instanceof org.telegram.ui.rn) {
            return ((org.telegram.ui.rn) n2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ht
    public final boolean b() {
        bx0 bx0Var = this.a.X;
        return bx0Var != null && bx0Var.b();
    }

    @Override // org.telegram.ui.ht
    public final boolean c() {
        bx0 bx0Var = this.a.X;
        return bx0Var != null && bx0Var.c();
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean f() {
        return this.a.T != null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.O;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.ht
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final boolean k(int i10) {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.ht
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        ex0 ex0Var = this.a;
        bx0 bx0Var = ex0Var.X;
        if (bx0Var == null) {
            return;
        }
        bx0Var.e(document, str, obj, null, ex0Var.e0, z10, i10, 0);
        ex0Var.dismiss();
    }

    @Override // org.telegram.ui.ht
    public final void n(TLRPC.Document document) {
        ex0 ex0Var = this.a;
        ex0.o0(ex0Var.H, ex0Var.O, document);
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ht
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void E(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override // org.telegram.ui.ht
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
