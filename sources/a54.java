// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
