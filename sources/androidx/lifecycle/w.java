package androidx.lifecycle;

import g7.o6;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class w {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, s sVar) {
        try {
            kotlin.jvm.internal.i.d(constructor.newInstance(sVar), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z10;
        HashMap hashMap = a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i9 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r42 != null ? r42.getName() : "";
                kotlin.jvm.internal.i.d(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    kotlin.jvm.internal.i.d(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    kotlin.jvm.internal.i.d(name, "this as java.lang.String).substring(startIndex)");
                }
                kotlin.jvm.internal.i.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = fd.j.g(name, ".", "_").concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    concat = fullPackage + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = b;
            if (constructor != null) {
                hashMap2.put(cls, o6.a(constructor));
            } else {
                d dVar = d.c;
                HashMap hashMap3 = dVar.b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            }
                            if (((b0) declaredMethods[i10].getAnnotation(b0.class)) != null) {
                                dVar.a(cls, declaredMethods);
                                z10 = true;
                                break;
                            }
                            i10++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && s.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.i.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.i.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    kotlin.jvm.internal.i.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            Class<?> intrface = interfaces[i11];
                            if (intrface != null && s.class.isAssignableFrom(intrface)) {
                                kotlin.jvm.internal.i.d(intrface, "intrface");
                                if (b(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                kotlin.jvm.internal.i.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i11++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i9 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i9));
        return i9;
    }
}
