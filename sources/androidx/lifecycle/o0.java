package androidx.lifecycle;

import android.app.Application;
import g7.o6;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class o0 {
    public static final List a = pc.h.c(Application.class, i0.class);
    public static final List b = o6.a(i0.class);

    public static final Constructor a(List signature, Class cls) {
        kotlin.jvm.internal.i.e(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.i.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.i.d(parameterTypes, "constructor.parameterTypes");
            List h = pc.f.h(parameterTypes);
            if (signature.equals(h)) {
                return constructor;
            }
            if (signature.size() == h.size() && h.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final p0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (p0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
