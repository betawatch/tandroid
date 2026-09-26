package ki;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ c0(s0 s0Var, Exception exc, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c);
                break;
            case 1:
                this.b.g(this.c);
                break;
            case 2:
                this.b.g(this.c);
                break;
            default:
                this.b.g(this.c);
                break;
        }
    }
}
