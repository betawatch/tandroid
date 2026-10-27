package dc;

import a8.me;
import sb.g;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements s9.d {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // s9.d
    public final Object d1(me meVar) {
        switch (this.a) {
            case 0:
                return new c((g) meVar.a(g.class));
            default:
                return new b((c) meVar.a(c.class), (sb.d) meVar.a(sb.d.class));
        }
    }
}
