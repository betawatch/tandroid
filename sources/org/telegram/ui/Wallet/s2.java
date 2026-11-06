package org.telegram.ui.Wallet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class s2 implements t2 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.utils.twidget.k b;

    public s2(boolean[] zArr, org.telegram.utils.twidget.k kVar) {
        this.a = zArr;
        this.b = kVar;
    }

    @Override // org.telegram.ui.Wallet.t2
    public final void a() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.b.a();
    }

    @Override // org.telegram.ui.Wallet.t2
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
