// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class l55 implements m55 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ g0d b;

    public l55(boolean[] zArr, g0d g0dVar) {
        this.a = zArr;
        this.b = g0dVar;
    }

    @Override // m55
    public final void a() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.b.a();
    }

    @Override // m55
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
        g0d g0dVar = this.b;
        g0dVar.b.b(4, null, g0dVar.c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        g0d g0dVar = this.b;
        k0d.x(g0dVar.a, g0dVar.b, g0dVar.c, widgetQueryType, g0dVar.d);
    }
}
