package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class wx0 implements org.telegram.ui.lt {
    public final /* synthetic */ hy0 a;

    public wx0(hy0 hy0Var) {
        this.a = hy0Var;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final void F(TLRPC.Document document) {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        hy0 hy0Var = this.a;
        hy0Var.S.documents.remove(document);
        boolean isEmpty = hy0Var.S.documents.isEmpty();
        if (isEmpty) {
            hy0Var.dismiss();
        }
        hy0Var.d.l();
        Context context = hy0Var.getContext();
        d6Var = ((org.telegram.ui.ActionBar.e3) hy0Var).resourcesProvider;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, d6Var);
        a2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.e3) hy0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new ci.v1(this, isEmpty, a2Var, 3));
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final long a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.a.L;
        if (m2Var instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) m2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.lt
    public final boolean b() {
        ey0 ey0Var = this.a.b0;
        return ey0Var != null && ey0Var.b();
    }

    @Override // org.telegram.ui.lt
    public final boolean c() {
        ey0 ey0Var = this.a.b0;
        return ey0Var != null && ey0Var.c();
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final boolean g() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final boolean i() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ a80 j(ci.m6 m6Var) {
        return null;
    }

    @Override // org.telegram.ui.lt
    public final void k(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final boolean m(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.lt
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        hy0 hy0Var = this.a;
        ey0 ey0Var = hy0Var.b0;
        if (ey0Var == null) {
            return;
        }
        ey0Var.d(document, str, obj, null, hy0Var.i0, z10, i10, 0);
        hy0Var.dismiss();
    }

    @Override // org.telegram.ui.lt
    public final void p(TLRPC.Document document) {
        hy0 hy0Var = this.a;
        hy0.o0(hy0Var.L, hy0Var.S, document);
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void r(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.lt
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.bt btVar) {
    }

    @Override // org.telegram.ui.lt
    public final /* synthetic */ void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
