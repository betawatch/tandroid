package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jy0 implements org.telegram.ui.vt {
    public final /* synthetic */ uy0 a;

    public jy0(uy0 uy0Var) {
        this.a = uy0Var;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final void F(TLRPC.Document document) {
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        uy0 uy0Var = this.a;
        uy0Var.S.documents.remove(document);
        boolean isEmpty = uy0Var.S.documents.isEmpty();
        if (isEmpty) {
            uy0Var.dismiss();
        }
        uy0Var.d.l();
        Context context = uy0Var.getContext();
        c6Var = ((org.telegram.ui.ActionBar.e3) uy0Var).resourcesProvider;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, c6Var);
        a2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.e3) uy0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new di.u1(this, isEmpty, a2Var, 3));
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final long a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.a.L;
        if (m2Var instanceof org.telegram.ui.fo) {
            return ((org.telegram.ui.fo) m2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.vt
    public final boolean b() {
        ry0 ry0Var = this.a.b0;
        return ry0Var != null && ry0Var.b();
    }

    @Override // org.telegram.ui.vt
    public final boolean c() {
        ry0 ry0Var = this.a.b0;
        return ry0Var != null && ry0Var.c();
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean g() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final boolean i() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.vt
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.v0(importingSticker);
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final boolean l(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.vt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        uy0 uy0Var = this.a;
        ry0 ry0Var = uy0Var.b0;
        if (ry0Var == null) {
            return;
        }
        ry0Var.a(document, str, obj, null, uy0Var.i0, z10, i10, 0);
        uy0Var.dismiss();
    }

    @Override // org.telegram.ui.vt
    public final void o(TLRPC.Document document) {
        uy0 uy0Var = this.a;
        uy0.p0(uy0Var.L, uy0Var.S, document);
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ l80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.vt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.mt mtVar) {
    }

    @Override // org.telegram.ui.vt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
