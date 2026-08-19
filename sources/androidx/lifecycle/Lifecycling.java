package androidx.lifecycle;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class Lifecycling {
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final Map callbackCache = new HashMap();
    private static final Map classToAdapters = new HashMap();

    private Lifecycling() {
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof LifecycleEventObserver;
        boolean z2 = object instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) == 2) {
            Object obj = classToAdapters.get(cls);
            Intrinsics.checkNotNull(obj);
            List list = (List) obj;
            if (list.size() == 1) {
                lifecycling.createGeneratedAdapter((Constructor) list.get(0), object);
                return new SingleGeneratedAdapterObserver(null);
            }
            int size = list.size();
            GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
            for (int i = 0; i < size; i++) {
                INSTANCE.createGeneratedAdapter((Constructor) list.get(i), object);
                generatedAdapterArr[i] = null;
            }
            return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(newInstance);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Constructor generatedConstructor(Class cls) {
        try {
            Package r1 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r1 != null ? r1.getName() : "";
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String adapterName = getAdapterName(name);
            if (fullPackage.length() != 0) {
                adapterName = fullPackage + '.' + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private final int getObserverConstructorType(Class cls) {
        Map map = callbackCache;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int resolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(resolveObserverCallbackType));
        return resolveObserverCallbackType;
    }

    private final int resolveObserverCallbackType(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor generatedConstructor = generatedConstructor(cls);
        if (generatedConstructor != null) {
            classToAdapters.put(cls, CollectionsKt.listOf(generatedConstructor));
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (isLifecycleParent(superclass)) {
            Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            Object obj = classToAdapters.get(superclass);
            Intrinsics.checkNotNull(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (isLifecycleParent(intrface)) {
                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                if (getObserverConstructorType(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = classToAdapters.get(intrface);
                Intrinsics.checkNotNull(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(cls, arrayList);
        return 2;
    }

    private final boolean isLifecycleParent(Class cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    public static final String getAdapterName(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.replace$default(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }
}
