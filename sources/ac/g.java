package ac;

import com.google.android.gms.internal.cast.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements r9.d {
    public static final /* synthetic */ g b = new g(0);
    public static final /* synthetic */ g c = new g(1);
    public static final /* synthetic */ g d = new g(2);
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i10) {
        this.a = i10;
    }

    @Override // r9.d
    public final Object j2(z5 z5Var) {
        switch (this.a) {
            case 0:
                return new e((rb.g) z5Var.a(rb.g.class));
            case 1:
                return new d((e) z5Var.a(e.class), (rb.d) z5Var.a(rb.d.class));
            default:
                return new xb.b(z5Var.b(d.class));
        }
    }
}
