package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rw0 implements org.telegram.ui.ft {
    public final /* synthetic */ cx0 a;

    public rw0(cx0 cx0Var) {
        this.a = cx0Var;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean C() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void E(TLRPC.Document document) {
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9;
        cx0 cx0Var = this.a;
        cx0Var.O.documents.remove(document);
        boolean isEmpty = cx0Var.O.documents.isEmpty();
        if (isEmpty) {
            cx0Var.dismiss();
        }
        cx0Var.d.l();
        Context context = cx0Var.getContext();
        b6Var = ((org.telegram.ui.ActionBar.f3) cx0Var).resourcesProvider;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, b6Var);
        c2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i9 = ((org.telegram.ui.ActionBar.f3) cx0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_stickers_removeStickerFromSet, new gh.m7(this, isEmpty, c2Var, 4));
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
        org.telegram.ui.ActionBar.o2 o2Var = this.a.H;
        if (o2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) o2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ft
    public final boolean b() {
        zw0 zw0Var = this.a.X;
        return zw0Var != null && zw0Var.b();
    }

    @Override // org.telegram.ui.ft
    public final boolean c() {
        zw0 zw0Var = this.a.X;
        return zw0Var != null && zw0Var.c();
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
        return this.a.T != null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.O;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // org.telegram.ui.ft
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.a.t0(importingSticker);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean k(int i9) {
        return this.a.X != null;
    }

    @Override // org.telegram.ui.ft
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
        cx0 cx0Var = this.a;
        zw0 zw0Var = cx0Var.X;
        if (zw0Var == null) {
            return;
        }
        zw0Var.a(document, str, obj, null, cx0Var.e0, z10, i9, 0);
        cx0Var.dismiss();
    }

    @Override // org.telegram.ui.ft
    public final void n(TLRPC.Document document) {
        cx0 cx0Var = this.a;
        cx0.n0(cx0Var.H, cx0Var.O, document);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ x60 r(fh.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void B(TLRPC.Document document) {
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
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.ft
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void F(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
