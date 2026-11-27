package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class zzit implements InvocationHandler {
    private final Object zza;

    public zzit(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (ur5.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (ur5.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (ur5.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z = false;
            if (objArr != null && objArr.length != 0) {
                Object obj2 = objArr[0];
                if ((obj2 != null ? obj2.hashCode() : 0) == obj.hashCode()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        boolean zza = zza(obj, method, objArr);
        f9c f9cVar = f9c.a;
        if (!zza) {
            return f9cVar;
        }
        Object obj3 = this.zza;
        if (obj3 == null) {
            if (ur5.a(method.getReturnType(), Void.TYPE)) {
                return f9cVar;
            }
        } else if (ur5.a(zzpu.zza(obj3.getClass()), zzpu.zza(method.getReturnType()))) {
            return obj3;
        }
        throw new IllegalArgumentException(obj3 + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
