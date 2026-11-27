// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
