package ac;

import a8.r7;
import pb.g;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
