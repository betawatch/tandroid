package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rm implements org.telegram.ui.ft {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public rm(jn jnVar, int i9) {
        this.b = jnVar;
        this.a = i9;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean I() {
        return false;
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
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean c() {
        return false;
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
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean k(int i9) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final x60 r(fh.v vVar) {
        x60 F = x60.F(vVar, null, new View(this.b.getContext()));
        F.s = 0;
        F.t = false;
        int i9 = R.drawable.msg_replace;
        String string = LocaleController.getString(R.string.ReplaceAttachedPollMedia);
        final int i10 = 0;
        final int i11 = this.a;
        F.c(i9, string, new Runnable(this) { // from class: org.telegram.ui.Components.qm
            public final /* synthetic */ rm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.b.a0(i11);
                        break;
                    default:
                        this.b.b.d0(i11, null);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: org.telegram.ui.Components.qm
            public final /* synthetic */ rm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.b.a0(i11);
                        break;
                    default:
                        this.b.b.d0(i11, null);
                        break;
                }
            }
        }, true);
        return F;
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
    public final /* synthetic */ void E(TLRPC.Document document) {
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
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void n(TLRPC.Document document) {
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
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
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

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
    }
}
