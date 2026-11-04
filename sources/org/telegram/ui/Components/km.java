package org.telegram.ui.Components;

import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class km implements org.telegram.ui.gs {
    public int a;
    public Object b;

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean Q() {
        return true;
    }

    public boolean R(int i3) {
        if (((cg.k) this.b) != null && this.a == i3) {
            return false;
        }
        this.a = i3;
        this.b = new cg.k(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i3, i3}, null, Shader.TileMode.CLAMP);
        return true;
    }

    @Override // org.telegram.ui.gs
    public long a() {
        return 0L;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean k(int i3) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public f60 n(ai.c0 c0Var) {
        f60 F = f60.F(c0Var, null, new View(((an) this.b).getContext()));
        final int i3 = 0;
        F.s = 0;
        F.t = false;
        String M0 = org.telegram.messenger.bd.M0(2131746279, null);
        final int i10 = this.a;
        F.c(R.drawable.msg_replace, M0, new Runnable(this) { // from class: org.telegram.ui.Components.jm
            public final /* synthetic */ km b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        ((an) this.b.b).g0(i10);
                        break;
                    default:
                        ((an) this.b.b).j0(i10, null);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        F.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, null), new Runnable(this) { // from class: org.telegram.ui.Components.jm
            public final /* synthetic */ km b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ((an) this.b.b).g0(i10);
                        break;
                    default:
                        ((an) this.b.b).j0(i10, null);
                        break;
                }
            }
        }, true);
        return F;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ org.telegram.messenger.zi z() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void i(org.telegram.messenger.ry ryVar) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void K(CharSequence charSequence, String str, ei eiVar) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.gs
    public /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
    }
}
