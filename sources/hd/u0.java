package hd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class u0 implements Runnable, Comparable, p0 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public u0(long j10) {
        this.a = j10;
    }

    public final md.x a() {
        Object obj = this._heap;
        if (obj instanceof md.x) {
            return (md.x) obj;
        }
        return null;
    }

    public final int c(long j10, v0 v0Var, w0 w0Var) {
        synchronized (this) {
            if (this._heap == f0.b) {
                return 2;
            }
            synchronized (v0Var) {
                try {
                    u0[] u0VarArr = v0Var.a;
                    u0 u0Var = u0VarArr != null ? u0VarArr[0] : null;
                    if (w0.r.get(w0Var) != 0) {
                        return 1;
                    }
                    if (u0Var == null) {
                        v0Var.c = j10;
                    } else {
                        long j11 = u0Var.a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - v0Var.c > 0) {
                            v0Var.c = j10;
                        }
                    }
                    long j12 = this.a;
                    long j13 = v0Var.c;
                    if (j12 - j13 < 0) {
                        this.a = j13;
                    }
                    v0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.a - ((u0) obj).a;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    @Override // hd.p0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                e5.c cVar = f0.b;
                if (obj == cVar) {
                    return;
                }
                v0 v0Var = obj instanceof v0 ? (v0) obj : null;
                if (v0Var != null) {
                    v0Var.c(this);
                }
                this._heap = cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(v0 v0Var) {
        if (this._heap == f0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = v0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
