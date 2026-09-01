package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mx0 implements org.telegram.ui.ot {
    public final /* synthetic */ yx0 a;

    public mx0(yx0 yx0Var) {
        this.a = yx0Var;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void E(TLRPC.Document document) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        yx0 yx0Var = this.a;
        yx0Var.P.documents.remove(document);
        boolean isEmpty = yx0Var.P.documents.isEmpty();
        if (isEmpty) {
            yx0Var.dismiss();
        }
        yx0Var.d.l();
        Context context = yx0Var.getContext();
        g6Var = ((org.telegram.ui.ActionBar.h3) yx0Var).resourcesProvider;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, g6Var);
        d2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.h3) yx0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new mh.k7(this, isEmpty, d2Var, 2));
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ String F(boolean z4) {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final boolean H() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ q70 I(ag.l lVar) {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final long a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.I;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ot
    public final boolean b() {
        vx0 vx0Var = this.a.Y;
        return vx0Var != null && vx0Var.b();
    }

    @Override // org.telegram.ui.ot
    public final boolean c() {
        vx0 vx0Var = this.a.Y;
        return vx0Var != null && vx0Var.c();
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final boolean f() {
        return this.a.U != null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.P;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.ot
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final boolean k(int i10) {
        return this.a.Y != null;
    }

    @Override // org.telegram.ui.ot
    public final void l(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        yx0 yx0Var = this.a;
        vx0 vx0Var = yx0Var.Y;
        if (vx0Var == null) {
            return;
        }
        vx0Var.d(document, str, obj, null, yx0Var.f0, z4, i10, 0);
        yx0Var.dismiss();
    }

    @Override // org.telegram.ui.ot
    public final void n(TLRPC.Document document) {
        yx0 yx0Var = this.a;
        yx0.o0(yx0Var.I, yx0Var.P, document);
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ot
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void z(CharSequence charSequence, String str, xk xkVar) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }
}
