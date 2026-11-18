package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class w2 implements x2 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.utils.twidget.i0 b;

    public w2(boolean[] zArr, org.telegram.utils.twidget.i0 i0Var) {
        this.a = zArr;
        this.b = i0Var;
    }

    @Override // org.telegram.ui.Wallet.x2
    public final void a() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.b.a();
    }

    @Override // org.telegram.ui.Wallet.x2
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
