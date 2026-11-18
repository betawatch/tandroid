package hi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;

    public /* synthetic */ l9(ta taVar, int i7) {
        this.a = i7;
        this.b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ta taVar = this.b;
                taVar.getClass();
                taVar.f(1.0f, true, new s8(taVar, 6));
                taVar.c1.b(true, true);
                break;
            default:
                ta taVar2 = this.b;
                taVar2.e(false);
                taVar2.n2 = null;
                break;
        }
    }
}
