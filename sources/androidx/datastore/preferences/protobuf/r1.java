package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class r1 {
    public final Unsafe a;

    public r1(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j10);

    public abstract byte d(Object obj, long j10);

    public abstract double e(Object obj, long j10);

    public abstract float f(Object obj, long j10);

    public final int g(Object obj, long j10) {
        return this.a.getInt(obj, j10);
    }

    public final long h(Object obj, long j10) {
        return this.a.getLong(obj, j10);
    }

    public final Object i(Object obj, long j10) {
        return this.a.getObject(obj, j10);
    }

    public final long j(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j10, boolean z4);

    public abstract void l(Object obj, long j10, byte b10);

    public abstract void m(Object obj, long j10, double d);

    public abstract void n(Object obj, long j10, float f10);

    public final void o(long j10, Object obj, int i10) {
        this.a.putInt(obj, j10, i10);
    }

    public final void p(Object obj, long j10, long j11) {
        this.a.putLong(obj, j10, j11);
    }

    public final void q(Object obj, long j10, Object obj2) {
        this.a.putObject(obj, j10, obj2);
    }
}
