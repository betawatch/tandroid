package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class zzit implements InvocationHandler {
    private final Object zza;

    public zzit(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (rr5.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (rr5.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (rr5.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
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
        g7c g7cVar = g7c.a;
        if (!zza) {
            return g7cVar;
        }
        Object obj3 = this.zza;
        if (obj3 == null) {
            if (rr5.a(method.getReturnType(), Void.TYPE)) {
                return g7cVar;
            }
        } else if (rr5.a(zzpu.zza(obj3.getClass()), zzpu.zza(method.getReturnType()))) {
            return obj3;
        }
        throw new IllegalArgumentException(obj3 + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
