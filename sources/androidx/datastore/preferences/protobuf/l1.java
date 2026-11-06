package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class l1 extends m1 {
    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(Object obj, long j3) {
        return this.a.getBoolean(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double d(Object obj, long j3) {
        return this.a.getDouble(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float e(Object obj, long j3) {
        return this.a.getFloat(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void j(Object obj, long j3, boolean z9) {
        this.a.putBoolean(obj, j3, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j3, byte b10) {
        this.a.putByte(obj, j3, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j3, double d) {
        this.a.putDouble(obj, j3, d);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j3, float f10) {
        this.a.putFloat(obj, j3, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            n1.a(th2);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean r() {
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (n1.g() != null) {
                    try {
                        Class<?> cls3 = this.a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        n1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                n1.a(th3);
            }
        }
        return false;
    }
}
