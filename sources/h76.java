// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
