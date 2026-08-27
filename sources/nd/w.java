package nd;

import id.c2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.k implements ad.p {
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

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                rc.f fVar = (rc.f) obj2;
                if (!(fVar instanceof c2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar : Integer.valueOf(intValue + 1);
            case 1:
                c2 c2Var = (c2) obj;
                rc.f fVar2 = (rc.f) obj2;
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
