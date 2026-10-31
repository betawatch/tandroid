package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class o0 {
    public static final List a = bd.j.c(Application.class, i0.class);
    public static final List b = bd.j.b(i0.class);

    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.i.e(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.i.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.i.d(parameterTypes, "constructor.parameterTypes");
            List h = bd.h.h(parameterTypes);
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
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e10.getCause());
        }
    }
}
