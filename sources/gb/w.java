package gb;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import v7.m8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class w extends t {
    public static final HashMap e;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        e = hashMap;
    }

    public w(Class cls, v vVar) {
        super(vVar);
        this.d = new HashMap();
        m8 m8Var = ib.c.a;
        Constructor b10 = m8Var.b(cls);
        this.b = b10;
        ib.c.f(b10);
        String[] c10 = m8Var.c(cls);
        for (int i10 = 0; i10 < c10.length; i10++) {
            this.d.put(c10[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.c[i11] = e.get(parameterTypes[i11]);
        }
    }

    @Override // gb.t
    public final Object a() {
        return (Object[]) this.c.clone();
    }

    @Override // gb.t
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e7) {
            m8 m8Var = ib.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override // gb.t
    public final void c(Object obj, lb.a aVar, s sVar) {
        Object[] objArr = (Object[]) obj;
        String str = sVar.c;
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + ib.c.b(this.b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int intValue = num.intValue();
        Object read = sVar.f.read(aVar);
        if (read != null || !sVar.g) {
            objArr[intValue] = read;
        } else {
            StringBuilder v = a4.a.v("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            v.append(aVar.h());
            throw new androidx.car.app.j(v.toString());
        }
    }
}
