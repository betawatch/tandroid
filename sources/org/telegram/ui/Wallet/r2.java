package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class r2 implements s2 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.utils.twidget.i0 b;

    public r2(boolean[] zArr, org.telegram.utils.twidget.i0 i0Var) {
        this.a = zArr;
        this.b = i0Var;
    }

    @Override // org.telegram.ui.Wallet.s2
    public final void a() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.b.a();
    }

    @Override // org.telegram.ui.Wallet.s2
    public final void b() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.b.b();
    }

    public final void c() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.b;
        i0Var.b.b(4, null, i0Var.c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.i0 i0Var = this.b;
        org.telegram.utils.twidget.n0.w(i0Var.a, i0Var.b, i0Var.c, widgetQueryType, i0Var.d);
    }
}
