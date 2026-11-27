// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class jvd {
    public static final Object a(mx2 mx2Var, Object obj, Object obj2, is4 is4Var, zw2 zw2Var) {
        Object c = xhd.c(mx2Var, obj2);
        try {
            hqa hqaVar = new hqa(zw2Var, mx2Var);
            q7c.a(2, is4Var);
            Object invoke = is4Var.invoke(obj, hqaVar);
            xhd.a(mx2Var, c);
            if (invoke == vx2.a) {
                zw2Var.getClass();
            }
            return invoke;
        } catch (Throwable th) {
            xhd.a(mx2Var, c);
            throw th;
        }
    }
}
