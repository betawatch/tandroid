// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class a54 extends c54 {
    public final va1 c;
    public final /* synthetic */ e54 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a54(e54 e54Var, long j, va1 va1Var) {
        super(j);
        this.d = e54Var;
        this.c = va1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.C(this.d);
    }

    @Override // c54
    public final String toString() {
        return super.toString() + this.c;
    }
}
