package ld;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class t0 implements Runnable, Comparable, o0 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public t0(long j10) {
        this.a = j10;
    }

    public final qd.x a() {
        Object obj = this._heap;
        if (obj instanceof qd.x) {
            return (qd.x) obj;
        }
        return null;
    }

    public final int c(long j10, u0 u0Var, v0 v0Var) {
        synchronized (this) {
            if (this._heap == e0.b) {
                return 2;
            }
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.a;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    if (v0.r.get(v0Var) != 0) {
                        return 1;
                    }
                    if (t0Var == null) {
                        u0Var.c = j10;
                    } else {
                        long j11 = t0Var.a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - u0Var.c > 0) {
                            u0Var.c = j10;
                        }
                    }
                    long j12 = this.a;
                    long j13 = u0Var.c;
                    if (j12 - j13 < 0) {
                        this.a = j13;
                    }
                    u0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.a - ((t0) obj).a;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    @Override // ld.o0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                i5.c cVar = e0.b;
                if (obj == cVar) {
                    return;
                }
                u0 u0Var = obj instanceof u0 ? (u0) obj : null;
                if (u0Var != null) {
                    u0Var.c(this);
                }
                this._heap = cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(u0 u0Var) {
        if (this._heap == e0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = u0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
