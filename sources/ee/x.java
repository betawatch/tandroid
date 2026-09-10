package ee;

import zd.b2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements rd.p {
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

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                id.f fVar = (id.f) obj2;
                if (!(fVar instanceof b2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar : Integer.valueOf(intValue + 1);
            case 1:
                b2 b2Var = (b2) obj;
                id.f fVar2 = (id.f) obj2;
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
