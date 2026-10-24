package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class iy0 implements org.telegram.ui.ft {
    public final /* synthetic */ ty0 a;

    public iy0(ty0 ty0Var) {
        this.a = ty0Var;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean D() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void F(TLRPC.Document document) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        ty0 ty0Var = this.a;
        ty0Var.S.documents.remove(document);
        boolean isEmpty = ty0Var.S.documents.isEmpty();
        if (isEmpty) {
            ty0Var.dismiss();
        }
        ty0Var.d.l();
        Context context = ty0Var.getContext();
        g6Var = ((org.telegram.ui.ActionBar.h3) ty0Var).resourcesProvider;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, g6Var);
        c2Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.h3) ty0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new ai.w9(this, isEmpty, c2Var, 4));
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final long a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.L;
        if (o2Var instanceof org.telegram.ui.sn) {
            return ((org.telegram.ui.sn) o2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ft
    public final boolean b() {
        qy0 qy0Var = this.a.b0;
        return qy0Var != null && qy0Var.b();
    }

    @Override // org.telegram.ui.ft
    public final boolean c() {
        qy0 qy0Var = this.a.b0;
        return qy0Var != null && qy0Var.c();
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean f() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.ft
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.w0(importingSticker);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean k(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.ft
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        ty0 ty0Var = this.a;
        qy0 qy0Var = ty0Var.b0;
        if (qy0Var == null) {
            return;
        }
        qy0Var.a(document, str, obj, null, ty0Var.i0, z10, i10, 0);
        ty0Var.dismiss();
    }

    @Override // org.telegram.ui.ft
    public final void n(TLRPC.Document document) {
        ty0 ty0Var = this.a;
        ty0.q0(ty0Var.L, ty0Var.S, document);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ j80 u(ah.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.ft
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void t(CharSequence charSequence, String str, qy qyVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
