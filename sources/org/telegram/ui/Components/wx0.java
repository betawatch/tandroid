package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wx0 implements org.telegram.ui.rt {
    public final /* synthetic */ hy0 a;

    public wx0(hy0 hy0Var) {
        this.a = hy0Var;
    }

    @Override // org.telegram.ui.rt
    public final boolean B() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void D(TLRPC.Document document) {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        hy0 hy0Var = this.a;
        hy0Var.S.documents.remove(document);
        boolean isEmpty = hy0Var.S.documents.isEmpty();
        if (isEmpty) {
            hy0Var.dismiss();
        }
        hy0Var.d.l();
        Context context = hy0Var.getContext();
        f6Var = ((org.telegram.ui.ActionBar.h3) hy0Var).resourcesProvider;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, f6Var);
        d2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.h3) hy0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new bi.f2(this, isEmpty, d2Var, 3));
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ String E(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final boolean H() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ w70 K(bi.n7 n7Var) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final long a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.L;
        if (p2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) p2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.rt
    public final boolean b() {
        ey0 ey0Var = this.a.b0;
        return ey0Var != null && ey0Var.b();
    }

    @Override // org.telegram.ui.rt
    public final boolean c() {
        ey0 ey0Var = this.a.b0;
        return ey0Var != null && ey0Var.c();
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean f() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.rt
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean k(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.rt
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        hy0 hy0Var = this.a;
        ey0 ey0Var = hy0Var.b0;
        if (ey0Var == null) {
            return;
        }
        ey0Var.d(document, str, obj, null, hy0Var.i0, z10, i10, 0);
        hy0Var.dismiss();
    }

    @Override // org.telegram.ui.rt
    public final void n(TLRPC.Document document) {
        hy0 hy0Var = this.a;
        hy0.o0(hy0Var.L, hy0Var.S, document);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.rt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
