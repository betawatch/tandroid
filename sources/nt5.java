// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nt5 extends iv5 {
    public static final /* synthetic */ long f = fx.a.objectFieldOffset(nt5.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final ur4 e;

    public nt5(ur4 ur4Var) {
        this.e = ur4Var;
    }

    @Override // iv5
    public final boolean k() {
        return true;
    }

    @Override // iv5
    public final void l(Throwable th) {
        if (fx.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
