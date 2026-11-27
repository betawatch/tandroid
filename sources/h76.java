// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class h76 {
    public static or5 a(long j, Object obj) {
        or5 or5Var = (or5) dac.h(j, obj);
        if (((t3) or5Var).a) {
            return or5Var;
        }
        int size = or5Var.size();
        pw8 j2 = ((pw8) or5Var).j(size == 0 ? 10 : size << 1);
        dac.o(j, obj, j2);
        return j2;
    }
}
