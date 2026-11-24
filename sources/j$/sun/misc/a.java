package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class a {
    public static final a b;
    public final Unsafe a;

    static {
        Field field;
        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field2 : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field2.getModifiers()) && Unsafe.class.isAssignableFrom(field2.getType())) {
                    field = field2;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e);
        }
        field.setAccessible(true);
        try {
            b = new a((Unsafe) field.get(null));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("Couldn't get the Unsafe", e2);
        }
    }

    public a(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final long a(Class cls, String str) {
        try {
            return this.a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Cannot find field:", e);
        }
    }
}
