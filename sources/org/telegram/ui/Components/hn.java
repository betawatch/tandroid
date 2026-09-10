package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hn implements org.telegram.ui.rt {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public hn(zn znVar, int i10) {
        this.b = znVar;
        this.a = i10;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ String E(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final w70 K(bi.n7 n7Var) {
        w70 F = w70.F(n7Var, null, new View(this.b.getContext()));
        F.s = 0;
        F.t = false;
        int i10 = R.drawable.msg_replace;
        String string = LocaleController.getString(R.string.ReplaceAttachedPollMedia);
        final int i11 = 0;
        final int i12 = this.a;
        F.c(i10, string, new Runnable(this) { // from class: org.telegram.ui.Components.gn
            public final /* synthetic */ hn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.b.b0(i12);
                        break;
                    default:
                        this.b.b.e0(i12, null);
                        break;
                }
            }
        }, false);
        final int i13 = 1;
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: org.telegram.ui.Components.gn
            public final /* synthetic */ hn b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.b.b0(i12);
                        break;
                    default:
                        this.b.b.e0(i12, null);
                        break;
                }
            }
        }, true);
        return F;
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
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean c() {
        return false;
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
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean k(int i10) {
        return false;
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
    public final /* synthetic */ void D(TLRPC.Document document) {
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
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void n(TLRPC.Document document) {
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
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
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

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
