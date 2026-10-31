package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r2 implements s2 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.utils.twidget.k b;

    public r2(boolean[] zArr, org.telegram.utils.twidget.k kVar) {
        this.a = zArr;
        this.b = kVar;
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
        org.telegram.utils.twidget.k kVar = this.b;
        kVar.b.a(4, null, kVar.c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.utils.twidget.k kVar = this.b;
        org.telegram.utils.twidget.p.u(kVar.a, kVar.b, kVar.c, widgetQueryType, kVar.d);
    }
}
