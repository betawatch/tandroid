package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class gy0 implements org.telegram.ui.pt {
    public final /* synthetic */ ry0 a;

    public gy0(ry0 ry0Var) {
        this.a = ry0Var;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final void F(TLRPC.Document document) {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        ry0 ry0Var = this.a;
        ry0Var.S.documents.remove(document);
        boolean isEmpty = ry0Var.S.documents.isEmpty();
        if (isEmpty) {
            ry0Var.dismiss();
        }
        ry0Var.d.l();
        Context context = ry0Var.getContext();
        d6Var = ((org.telegram.ui.ActionBar.f3) ry0Var).resourcesProvider;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, d6Var);
        b2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.f3) ry0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new ci.v1(this, isEmpty, b2Var, 3));
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean J() {
        return false;
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
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.L;
        if (n2Var instanceof org.telegram.ui.yn) {
            return ((org.telegram.ui.yn) n2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.pt
    public final boolean b() {
        oy0 oy0Var = this.a.b0;
        return oy0Var != null && oy0Var.b();
    }

    @Override // org.telegram.ui.pt
    public final boolean c() {
        oy0 oy0Var = this.a.b0;
        return oy0Var != null && oy0Var.c();
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean g() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final boolean i() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ b80 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.pt
    public final void k(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final boolean m(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.pt
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        ry0 ry0Var = this.a;
        oy0 oy0Var = ry0Var.b0;
        if (oy0Var == null) {
            return;
        }
        oy0Var.d(document, str, obj, null, ry0Var.i0, z10, i10, 0);
        ry0Var.dismiss();
    }

    @Override // org.telegram.ui.pt
    public final void p(TLRPC.Document document) {
        ry0 ry0Var = this.a;
        ry0.o0(ry0Var.L, ry0Var.S, document);
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void C(TLRPC.Document document) {
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
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void r(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.pt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.ft ftVar) {
    }

    @Override // org.telegram.ui.pt
    public final /* synthetic */ void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
