// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
