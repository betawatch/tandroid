package org.telegram.ui.Components;

import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class tm implements org.telegram.ui.ls {
    public int a;
    public Object b;

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public m60 E(ai.k0 k0Var) {
        m60 F = m60.F(k0Var, null, new View(((jn) this.b).getContext()));
        final int i7 = 0;
        F.s = 0;
        F.t = false;
        String M0 = org.telegram.messenger.hd.M0(2131746271, null);
        final int i10 = this.a;
        F.c(R.drawable.msg_replace, M0, new Runnable(this) { // from class: org.telegram.ui.Components.sm
            public final /* synthetic */ tm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        ((jn) this.b.b).g0(i10);
                        break;
                    default:
                        ((jn) this.b.b).j0(i10, null);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        F.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, null), new Runnable(this) { // from class: org.telegram.ui.Components.sm
            public final /* synthetic */ tm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ((jn) this.b.b).g0(i10);
                        break;
                    default:
                        ((jn) this.b.b).j0(i10, null);
                        break;
                }
            }
        }, true);
        return F;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ls
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

    @Override // org.telegram.ui.ls
    public long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean k(int i7) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ boolean w() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ org.telegram.messenger.gj z() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void i(org.telegram.messenger.xy xyVar) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void x(String str) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void y(CharSequence charSequence, String str, gh ghVar) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
