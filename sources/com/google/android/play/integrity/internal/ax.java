package com.google.android.play.integrity.internal;

/* loaded from: classes.dex */
public final class ax implements bb {
    private static final Object a = new Object();
    private volatile bb b;
    private volatile Object c = a;

    private ax(bb bbVar) {
        this.b = bbVar;
    }

    public static bb b(bb bbVar) {
        return bbVar instanceof ax ? bbVar : new ax(bbVar);
    }

    @Override // com.google.android.play.integrity.internal.bd
    public final Object a() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = a;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.c;
                if (obj == obj3) {
                    obj = this.b.a();
                    Object obj4 = this.c;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.c = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
