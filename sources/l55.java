// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
