package fe;

import ae.d2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.j implements sd.p {
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

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                jd.f fVar = (jd.f) obj2;
                if (!(fVar instanceof d2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar : Integer.valueOf(intValue + 1);
            case 1:
                d2 d2Var = (d2) obj;
                jd.f fVar2 = (jd.f) obj2;
                if (d2Var != null) {
                    return d2Var;
                }
                if (fVar2 instanceof d2) {
                    return (d2) fVar2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
