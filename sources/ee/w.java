package ee;

import zd.b2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.j implements rd.p {
    public static final w c;
    public static final w d;
    public static final w e;
    public final /* synthetic */ int b;

    static {
        int i10 = 2;
        c = new w(i10, 0);
        d = new w(i10, 1);
        e = new w(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10, int i11) {
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
                return (y) obj;
        }
    }
}
