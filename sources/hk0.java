// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class hk0 extends yi6 {
    @Override // yi6
    public final void e(yi6 yi6Var) {
        if (yi6Var instanceof hk0) {
            this.b = yi6Var;
        } else {
            lq5.j("Parent of block must also be block (can not be inline)");
        }
    }
}
