package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ry0 implements org.telegram.ui.dt {
    public final /* synthetic */ cz0 a;

    public ry0(cz0 cz0Var) {
        this.a = cz0Var;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void E(TLRPC.Document document) {
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10;
        cz0 cz0Var = this.a;
        cz0Var.S.documents.remove(document);
        boolean isEmpty = cz0Var.S.documents.isEmpty();
        if (isEmpty) {
            cz0Var.dismiss();
        }
        cz0Var.d.l();
        Context context = cz0Var.getContext();
        u6Var = ((org.telegram.ui.ActionBar.k3) cz0Var).resourcesProvider;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, u6Var);
        e2Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.k3) cz0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new bi.r9(this, isEmpty, e2Var, 4));
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final boolean H() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final long a() {
        org.telegram.ui.ActionBar.r2 r2Var = this.a.L;
        if (r2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) r2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.dt
    public final boolean b() {
        zy0 zy0Var = this.a.b0;
        return zy0Var != null && zy0Var.b();
    }

    @Override // org.telegram.ui.dt
    public final boolean c() {
        zy0 zy0Var = this.a.b0;
        return zy0Var != null && zy0Var.c();
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final boolean f() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ k80 i(bh.p pVar) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.w0(importingSticker);
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final boolean l(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.dt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        cz0 cz0Var = this.a;
        zy0 zy0Var = cz0Var.b0;
        if (zy0Var == null) {
            return;
        }
        zy0Var.a(document, str, obj, null, cz0Var.i0, z10, i10, 0);
        cz0Var.dismiss();
    }

    @Override // org.telegram.ui.dt
    public final void o(TLRPC.Document document) {
        cz0 cz0Var = this.a;
        cz0.q0(cz0Var.L, cz0Var.S, document);
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void N(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.dt
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void O(CharSequence charSequence, String str, oy oyVar) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
