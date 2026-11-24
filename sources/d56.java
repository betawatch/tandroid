// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d56 {
    public static lp5 a(Object obj, long j) {
        lp5 lp5Var = (lp5) d6c.h(obj, j);
        if (((s3) lp5Var).a) {
            return lp5Var;
        }
        int size = lp5Var.size();
        gt8 j2 = ((gt8) lp5Var).j(size == 0 ? 10 : size << 1);
        d6c.o(obj, j, j2);
        return j2;
    }
}
