// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class fe9 extends qf0 implements ss4 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public fe9(int i, zw2 zw2Var) {
        super(zw2Var);
        if (zw2Var == null || zw2Var.getContext() == u24.a) {
            this.a = i;
        } else {
            lq5.j("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // ss4
    public final int getArity() {
        return this.a;
    }

    @Override // zw2
    public final mx2 getContext() {
        return u24.a;
    }

    @Override // qf0
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s89.a.getClass();
        return t89.a(this);
    }
}
