package fi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ n9(va vaVar, int i7) {
        this.a = i7;
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                va vaVar = this.b;
                vaVar.getClass();
                vaVar.f(1.0f, true, new u8(vaVar, 6));
                vaVar.b1.b(true, true);
                break;
            default:
                va vaVar2 = this.b;
                vaVar2.e(false);
                vaVar2.m2 = null;
                break;
        }
    }
}
