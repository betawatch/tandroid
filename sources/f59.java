// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
