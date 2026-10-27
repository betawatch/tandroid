package he;

import ce.c2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements ud.p {
    public static final x c;
    public static final x d;
    public static final x e;
    public final /* synthetic */ int b;

    static {
        int i10 = 2;
        c = new x(i10, 0);
        d = new x(i10, 1);
        e = new x(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, int i11) {
        super(i10);
        this.b = i11;
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ld.f fVar = (ld.f) obj2;
                if (!(fVar instanceof c2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar : Integer.valueOf(intValue + 1);
            case 1:
                c2 c2Var = (c2) obj;
                ld.f fVar2 = (ld.f) obj2;
                if (c2Var != null) {
                    return c2Var;
                }
                if (fVar2 instanceof c2) {
                    return (c2) fVar2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
