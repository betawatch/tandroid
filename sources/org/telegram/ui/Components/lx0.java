package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lx0 implements org.telegram.ui.st {
    public final /* synthetic */ wx0 a;

    public lx0(wx0 wx0Var) {
        this.a = wx0Var;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.st
    public final void E(TLRPC.Document document) {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        wx0 wx0Var = this.a;
        wx0Var.S.documents.remove(document);
        boolean isEmpty = wx0Var.S.documents.isEmpty();
        if (isEmpty) {
            wx0Var.dismiss();
        }
        wx0Var.d.l();
        Context context = wx0Var.getContext();
        f6Var = ((org.telegram.ui.ActionBar.g3) wx0Var).resourcesProvider;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, f6Var);
        c2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.g3) wx0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new ci.v1(this, isEmpty, c2Var, 3));
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.st
    public final boolean I() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.st
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final long a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.L;
        if (o2Var instanceof org.telegram.ui.bo) {
            return ((org.telegram.ui.bo) o2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.st
    public final boolean b() {
        tx0 tx0Var = this.a.b0;
        return tx0Var != null && tx0Var.b();
    }

    @Override // org.telegram.ui.st
    public final boolean c() {
        tx0 tx0Var = this.a.b0;
        return tx0Var != null && tx0Var.c();
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.st
    public final boolean f() {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.st
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.S;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ n70 i(ci.n6 n6Var) {
        return null;
    }

    @Override // org.telegram.ui.st
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.u0(importingSticker);
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final boolean l(int i10) {
        return this.a.b0 != null;
    }

    @Override // org.telegram.ui.st
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        wx0 wx0Var = this.a;
        tx0 tx0Var = wx0Var.b0;
        if (tx0Var == null) {
            return;
        }
        tx0Var.d(document, str, obj, null, wx0Var.i0, z10, i10, 0);
        wx0Var.dismiss();
    }

    @Override // org.telegram.ui.st
    public final void o(TLRPC.Document document) {
        wx0 wx0Var = this.a;
        wx0.o0(wx0Var.L, wx0Var.S, document);
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.st
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void G(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }

    @Override // org.telegram.ui.st
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
