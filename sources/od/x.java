package od;

import jd.b2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.k implements bd.p {
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

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                sc.f fVar = (sc.f) obj2;
                if (!(fVar instanceof b2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar : Integer.valueOf(intValue + 1);
            case 1:
                b2 b2Var = (b2) obj;
                sc.f fVar2 = (sc.f) obj2;
                if (b2Var != null) {
                    return b2Var;
                }
                if (fVar2 instanceof b2) {
                    return (b2) fVar2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
