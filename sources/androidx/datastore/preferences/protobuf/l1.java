package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l1 extends m1 {
    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(Object obj, long j10) {
        return this.a.getBoolean(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double d(Object obj, long j10) {
        return this.a.getDouble(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float e(Object obj, long j10) {
        return this.a.getFloat(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void j(Object obj, long j10, boolean z10) {
        this.a.putBoolean(obj, j10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j10, byte b10) {
        this.a.putByte(obj, j10, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j10, double d) {
        this.a.putDouble(obj, j10, d);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j10, float f10) {
        this.a.putFloat(obj, j10, f10);
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
