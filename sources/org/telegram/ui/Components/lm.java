package org.telegram.ui.Components;

import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class lm implements org.telegram.ui.is {
    public int a;
    public Object b;

    @Override // org.telegram.ui.is
    public /* synthetic */ org.telegram.messenger.ij A() {
        return null;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean Q() {
        return true;
    }

    public boolean R(int i7) {
        if (((bg.l) this.b) != null && this.a == i7) {
            return false;
        }
        this.a = i7;
        this.b = new bg.l(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i7, i7}, null, Shader.TileMode.CLAMP);
        return true;
    }

    @Override // org.telegram.ui.is
    public long a() {
        return 0L;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean k(int i7) {
        return false;
    }

    @Override // org.telegram.ui.is
    public k60 m(bi.x5 x5Var) {
        k60 F = k60.F(x5Var, null, new View(((bn) this.b).getContext()));
        final int i7 = 0;
        F.s = 0;
        F.t = false;
        String M0 = org.telegram.messenger.hd.M0(2131746270, null);
        final int i10 = this.a;
        F.c(R.drawable.msg_replace, M0, new Runnable(this) { // from class: org.telegram.ui.Components.km
            public final /* synthetic */ lm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        ((bn) this.b.b).g0(i10);
                        break;
                    default:
                        ((bn) this.b.b).j0(i10, null);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        F.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751599, null), new Runnable(this) { // from class: org.telegram.ui.Components.km
            public final /* synthetic */ lm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ((bn) this.b.b).g0(i10);
                        break;
                    default:
                        ((bn) this.b.b).j0(i10, null);
                        break;
                }
            }
        }, true);
        return F;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ boolean y() {
        return true;
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void i(org.telegram.messenger.zy zyVar) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void z(String str) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void u(CharSequence charSequence, String str, ex exVar) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.is
    public /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
