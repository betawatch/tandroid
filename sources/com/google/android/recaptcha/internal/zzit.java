package com.google.android.recaptcha.internal;

import gd.k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class zzit implements InvocationHandler {
    private final Object zza;

    public zzit(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (j.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (j.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (j.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z9 = false;
            if (objArr != null && objArr.length != 0) {
                Object obj2 = objArr[0];
                if ((obj2 != null ? obj2.hashCode() : 0) == obj.hashCode()) {
                    z9 = true;
                }
            }
            return Boolean.valueOf(z9);
        }
        boolean zza = zza(obj, method, objArr);
        k kVar = k.a;
        if (!zza) {
            return kVar;
        }
        Object obj3 = this.zza;
        if ((obj3 == null && j.a(method.getReturnType(), Void.TYPE)) || (obj3 != null && j.a(zzpu.zza(obj3.getClass()), zzpu.zza(method.getReturnType())))) {
            return obj3 == null ? kVar : obj3;
        }
        throw new IllegalArgumentException(obj3 + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
