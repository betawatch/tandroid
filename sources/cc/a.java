package cc;

import com.google.android.gms.internal.cast.z5;
import rb.g;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements r9.d {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // r9.d
    public final Object j2(z5 z5Var) {
        switch (this.a) {
            case 0:
                return new c((g) z5Var.a(g.class));
            default:
                return new b((c) z5Var.a(c.class), (rb.d) z5Var.a(rb.d.class));
        }
    }
}
