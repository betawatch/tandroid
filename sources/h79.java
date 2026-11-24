// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class h79 {
    public static final i79 a;

    static {
        i79 i79Var = null;
        try {
            i79Var = (i79) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (i79Var == null) {
            i79Var = new i79();
        }
        a = i79Var;
    }

    public static cj2 a(Class cls) {
        a.getClass();
        return new cj2(cls);
    }
}
