// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class h35 implements i35 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ rvc b;

    public h35(boolean[] zArr, rvc rvcVar) {
        this.a = zArr;
        this.b = rvcVar;
    }

    @Override // i35
    public final void a() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.b.a();
    }

    @Override // i35
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
        rvc rvcVar = this.b;
        rvcVar.b.b(4, null, rvcVar.c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        rvc rvcVar = this.b;
        vvc.w(rvcVar.a, rvcVar.b, rvcVar.c, widgetQueryType, rvcVar.d);
    }
}
