package hi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c9(ta taVar, boolean z10, int i7) {
        this.a = i7;
        this.b = taVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                ta taVar = this.b;
                if (!this.c) {
                    taVar.K0.b(false, false);
                    break;
                } else {
                    taVar.getClass();
                    break;
                }
            default:
                ta taVar2 = this.b;
                taVar2.S = null;
                taVar2.e = false;
                taVar2.p(this.c);
                break;
        }
    }
}
