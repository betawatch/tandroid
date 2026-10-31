package org.telegram.ui.Components;

import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tm implements org.telegram.ui.jt {
    public int a;
    public Object b;

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public z60 D(fg.i iVar) {
        z60 F = z60.F(iVar, null, new View(((jn) this.b).getContext()));
        final int i10 = 0;
        F.s = 0;
        F.t = false;
        String L0 = org.telegram.messenger.cd.L0(2131746286, null);
        final int i11 = this.a;
        F.c(R.drawable.msg_replace, L0, new Runnable(this) { // from class: org.telegram.ui.Components.sm
            public final /* synthetic */ tm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ((jn) this.b.b).e0(i11);
                        break;
                    default:
                        ((jn) this.b.b).h0(i11, null);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        F.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), new Runnable(this) { // from class: org.telegram.ui.Components.sm
            public final /* synthetic */ tm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        ((jn) this.b.b).e0(i11);
                        break;
                    default:
                        ((jn) this.b.b).h0(i11, null);
                        break;
                }
            }
        }, true);
        return F;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean Q() {
        return true;
    }

    public boolean R(int i10) {
        if (((rf.h) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new rf.h(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }

    @Override // org.telegram.ui.jt
    public long a() {
        return 0L;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean k(int i10) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ org.telegram.messenger.jj y() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void i(org.telegram.messenger.jz jzVar) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void N(CharSequence charSequence, String str, vg vgVar) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.jt
    public /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
