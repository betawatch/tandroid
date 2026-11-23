package bi;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ b8(i8 i8Var, int i7) {
        this.a = i7;
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e1();
                break;
            default:
                i8 i8Var = this.b;
                i8Var.e2.O(true);
                org.telegram.messenger.g0.h3(new b8(i8Var, 0), 150L);
                break;
        }
    }
}
