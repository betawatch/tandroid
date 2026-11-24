// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class f59 {
    public static final g59 a;

    static {
        g59 g59Var = null;
        try {
            g59Var = (g59) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (g59Var == null) {
            g59Var = new g59();
        }
        a = g59Var;
    }

    public static oh2 a(Class cls) {
        a.getClass();
        return new oh2(cls);
    }
}
