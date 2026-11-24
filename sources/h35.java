// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
