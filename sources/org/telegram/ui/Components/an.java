package org.telegram.ui.Components;

import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class an implements org.telegram.ui.ls {
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
    public y60 E(ai.k0 k0Var) {
        y60 G = y60.G(k0Var, null, new View(((rn) this.b).getContext()));
        final int i7 = 0;
        G.s = 0;
        G.t = false;
        String M0 = org.telegram.messenger.gd.M0(2131746076, null);
        final int i10 = this.a;
        G.c(R.drawable.msg_replace, M0, new Runnable(this) { // from class: org.telegram.ui.Components.zm
            public final /* synthetic */ an b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        ((rn) this.b.b).g0(i10);
                        break;
                    default:
                        ((rn) this.b.b).j0(i10, null);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        G.c(R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131751587, null), new Runnable(this) { // from class: org.telegram.ui.Components.zm
            public final /* synthetic */ an b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ((rn) this.b.b).g0(i10);
                        break;
                    default:
                        ((rn) this.b.b).j0(i10, null);
                        break;
                }
            }
        }, true);
        return G;
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
    public /* synthetic */ org.telegram.messenger.fj z() {
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
    public /* synthetic */ void i(org.telegram.messenger.sy syVar) {
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
    public /* synthetic */ void y(CharSequence charSequence, String str, ph phVar) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
