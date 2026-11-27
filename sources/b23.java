// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class b23 implements uw8 {
    public final /* synthetic */ byte a;
    public final pq5 b;

    public /* synthetic */ b23(pq5 pq5Var, byte b) {
        this.a = b;
        this.b = pq5Var;
    }

    @Override // uw8
    public final Object get() {
        byte b = this.a;
        pq5 pq5Var = this.b;
        switch (b) {
            case 0:
                return new rx6((Context) pq5Var.a, new sae(), new z6f((byte) 28), false, (byte) 26);
            default:
                String packageName = ((Context) pq5Var.a).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                p3d.h("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
