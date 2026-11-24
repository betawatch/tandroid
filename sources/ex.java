// default package

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ex {
    public static final /* synthetic */ Unsafe a;

    static {
        Field field;
        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                Field field2 = declaredFields[i];
                if (Modifier.isStatic(field2.getModifiers()) && Unsafe.class.isAssignableFrom(field2.getType())) {
                    field = field2;
                    break;
                }
                i++;
            }
            if (field != null) {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
        }
        field.setAccessible(true);
        try {
            a = (Unsafe) field.get(null);
        } catch (IllegalAccessException e2) {
            sdb.b(e2);
        }
    }

    public static /* synthetic */ Object a(Object obj, long j, Object obj2) {
        while (true) {
            Unsafe unsafe = a;
            Object objectVolatile = unsafe.getObjectVolatile(obj, j);
            Object obj3 = obj;
            long j2 = j;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(obj3, j2, objectVolatile, obj4)) {
                return objectVolatile;
            }
            obj = obj3;
            j = j2;
            obj2 = obj4;
        }
    }
}
