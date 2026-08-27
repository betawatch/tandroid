package lh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ca implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ca(sb sbVar, boolean z10, int i10) {
        this.a = i10;
        this.b = sbVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                sb sbVar = this.b;
                if (!this.c) {
                    sbVar.F0.b(false, false);
                    break;
                } else {
                    sbVar.getClass();
                    break;
                }
            default:
                sb sbVar2 = this.b;
                sbVar2.N = null;
                sbVar2.e = false;
                sbVar2.q(this.c);
                break;
        }
    }
}
