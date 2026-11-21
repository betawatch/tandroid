package bi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ c8(j8 j8Var, int i7) {
        this.a = i7;
        this.b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e1();
                break;
            default:
                j8 j8Var = this.b;
                j8Var.e2.O(true);
                org.telegram.messenger.g0.h3(new c8(j8Var, 0), 150L);
                break;
        }
    }
}
