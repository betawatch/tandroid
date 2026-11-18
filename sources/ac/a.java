package ac;

import a8.r7;
import pb.g;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements u9.d {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    @Override // u9.d
    public final Object e(r7 r7Var) {
        switch (this.a) {
            case 0:
                return new c((g) r7Var.a(g.class));
            default:
                return new b((c) r7Var.a(c.class), (pb.d) r7Var.a(pb.d.class));
        }
    }
}
