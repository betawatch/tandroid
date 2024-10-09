package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE = create();

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertInstantiable(Class cls) {
        String checkInstantiable = ConstructorConstructor.checkInstantiable(cls);
        if (checkInstantiable == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + checkInstantiable);
    }

    private static UnsafeAllocator create() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls.getMethod("allocateInstance", Class.class);
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.1
                        @Override // com.google.gson.internal.UnsafeAllocator
                        public Object newInstance(Class cls2) {
                            UnsafeAllocator.assertInstantiable(cls2);
                            return method.invoke(obj, cls2);
                        }
                    };
                } catch (Exception unused) {
                    final Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.3
                        @Override // com.google.gson.internal.UnsafeAllocator
                        public Object newInstance(Class cls2) {
                            UnsafeAllocator.assertInstantiable(cls2);
                            return declaredMethod.invoke(null, cls2, Object.class);
                        }
                    };
                }
            } catch (Exception unused2) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                final int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                final Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.2
                    @Override // com.google.gson.internal.UnsafeAllocator
                    public Object newInstance(Class cls2) {
                        UnsafeAllocator.assertInstantiable(cls2);
                        return declaredMethod3.invoke(null, cls2, Integer.valueOf(intValue));
                    }
                };
            }
        } catch (Exception unused3) {
            return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.4
                @Override // com.google.gson.internal.UnsafeAllocator
                public Object newInstance(Class cls2) {
                    throw new UnsupportedOperationException("Cannot allocate " + cls2 + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                }
            };
        }
    }

    public abstract Object newInstance(Class cls);
}
