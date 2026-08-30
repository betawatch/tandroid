package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lx0 implements org.telegram.ui.nt {
    public final /* synthetic */ xx0 a;

    public lx0(xx0 xx0Var) {
        this.a = xx0Var;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        xx0 xx0Var = this.a;
        xx0Var.P.documents.remove(document);
        boolean isEmpty = xx0Var.P.documents.isEmpty();
        if (isEmpty) {
            xx0Var.dismiss();
        }
        xx0Var.d.l();
        Context context = xx0Var.getContext();
        f6Var = ((org.telegram.ui.ActionBar.g3) xx0Var).resourcesProvider;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, f6Var);
        d2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.g3) xx0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new lh.k7(this, isEmpty, d2Var, 2));
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ String G(boolean z4) {
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
        org.telegram.ui.ActionBar.p2 p2Var = this.a.I;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.nt
    public final boolean b() {
        ux0 ux0Var = this.a.Y;
        return ux0Var != null && ux0Var.b();
    }

    @Override // org.telegram.ui.nt
    public final boolean c() {
        ux0 ux0Var = this.a.Y;
        return ux0Var != null && ux0Var.c();
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ o70 d(ah.d dVar) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean f(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean g() {
        return this.a.U != null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final boolean i() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.P;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.nt
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final boolean l(int i10) {
        return this.a.Y != null;
    }

    @Override // org.telegram.ui.nt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        xx0 xx0Var = this.a;
        ux0 ux0Var = xx0Var.Y;
        if (ux0Var == null) {
            return;
        }
        ux0Var.d(document, str, obj, null, xx0Var.f0, z4, i10, 0);
        xx0Var.dismiss();
    }

    @Override // org.telegram.ui.nt
    public final void o(TLRPC.Document document) {
        xx0 xx0Var = this.a;
        xx0.o0(xx0Var.I, xx0Var.P, document);
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ MessageObject z() {
        return null;
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
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.nt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void A(CharSequence charSequence, String str, vk vkVar) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }
}
