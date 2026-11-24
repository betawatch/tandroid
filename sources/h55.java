// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class h55 implements i55 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ sxc b;

    public h55(boolean[] zArr, sxc sxcVar) {
        this.a = zArr;
        this.b = sxcVar;
    }

    @Override // i55
    public final void a() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.b.a();
    }

    @Override // i55
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
        sxc sxcVar = this.b;
        sxcVar.b.b(4, null, sxcVar.c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        sxc sxcVar = this.b;
        wxc.x(sxcVar.a, sxcVar.b, sxcVar.c, widgetQueryType, sxcVar.d);
    }
}
