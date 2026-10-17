package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class dy0 implements org.telegram.ui.et {
    public final /* synthetic */ oy0 a;

    public dy0(oy0 oy0Var) {
        this.a = oy0Var;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.et
    public final void F(TLRPC.Document document) {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        oy0 oy0Var = this.a;
        oy0Var.S.documents.remove(document);
        boolean isEmpty = oy0Var.S.documents.isEmpty();
        if (isEmpty) {
            oy0Var.dismiss();
        }
        oy0Var.d.l();
        Context context = oy0Var.getContext();
        d6Var = ((org.telegram.ui.ActionBar.f3) oy0Var).resourcesProvider;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, d6Var);
        b2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.f3) oy0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new ai.w9(this, isEmpty, b2Var, 4));
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.et
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.et
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.L;
        if (n2Var instanceof org.telegram.ui.sn) {
            return ((org.telegram.ui.sn) n2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.et
    public final boolean b() {
        ly0 ly0Var = this.a.b0;
        return ly0Var != null && ly0Var.b();
    }

    @Override // org.telegram.ui.et
    public final boolean c() {
        ly0 ly0Var = this.a.b0;
        return ly0Var != null && ly0Var.c();
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.et
    public final boolean f() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.et
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.et
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.v0(importingSticker);
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final boolean k(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.et
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        oy0 oy0Var = this.a;
        ly0 ly0Var = oy0Var.b0;
        if (ly0Var == null) {
            return;
        }
        ly0Var.e(document, str, obj, null, oy0Var.i0, z10, i10, 0);
        oy0Var.dismiss();
    }

    @Override // org.telegram.ui.et
    public final void n(TLRPC.Document document) {
        oy0 oy0Var = this.a;
        oy0.p0(oy0Var.L, oy0Var.S, document);
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ i80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.et
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void t(CharSequence charSequence, String str, qy qyVar) {
    }

    @Override // org.telegram.ui.et
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
