package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cn implements org.telegram.ui.nt {
    public final /* synthetic */ int a;
    public final /* synthetic */ vn b;

    public cn(vn vnVar, int i10) {
        this.b = vnVar;
        this.a = i10;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ MessageObject A() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ TLRPC.PollAnswer h() {
        return null;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final o70 j(ci.m6 m6Var) {
        o70 F = o70.F(m6Var, null, new View(this.b.getContext()));
        F.s = 0;
        F.t = false;
        int i10 = R.drawable.msg_replace;
        String string = LocaleController.getString(R.string.ReplaceAttachedPollMedia);
        final int i11 = 0;
        final int i12 = this.a;
        F.c(i10, string, new Runnable(this) { // from class: org.telegram.ui.Components.bn
            public final /* synthetic */ cn b;

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
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: org.telegram.ui.Components.bn
            public final /* synthetic */ cn b;

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

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean m(int i10) {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void o(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void r(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void f(CharSequence charSequence, String str, org.telegram.ui.dt dtVar) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.nt
    public final /* synthetic */ void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
