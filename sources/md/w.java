package md;

import hd.c2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.j implements zc.p {
    public static final w c;
    public static final w d;
    public static final w e;
    public final /* synthetic */ int b;

    static {
        int i9 = 2;
        c = new w(i9, 0);
        d = new w(i9, 1);
        e = new w(i9, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i9, int i10) {
        super(i9);
        this.b = i10;
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                qc.f fVar = (qc.f) obj2;
                if (!(fVar instanceof c2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar : Integer.valueOf(intValue + 1);
            case 1:
                c2 c2Var = (c2) obj;
                qc.f fVar2 = (qc.f) obj2;
                if (c2Var != null) {
                    return c2Var;
                }
                if (fVar2 instanceof c2) {
                    return (c2) fVar2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
