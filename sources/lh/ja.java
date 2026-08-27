package lh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ ja(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb sbVar = this.b;
                sbVar.getClass();
                sbVar.g(1.0f, true, new s9(sbVar, 6));
                sbVar.X0.b(true, true);
                break;
            default:
                sb sbVar2 = this.b;
                sbVar2.f(false);
                sbVar2.i2 = null;
                break;
        }
    }
}
