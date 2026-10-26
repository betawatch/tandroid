package ce;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class u0 implements Runnable, Comparable, p0 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public u0(long j10) {
        this.a = j10;
    }

    public final he.y a() {
        Object obj = this._heap;
        if (obj instanceof he.y) {
            return (he.y) obj;
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
                } catch (Throwable th2) {
                    throw th2;
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

    public final void d(v0 v0Var) {
        if (this._heap == f0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = v0Var;
    }

    @Override // ce.p0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                he.v vVar = f0.b;
                if (obj == vVar) {
                    return;
                }
                v0 v0Var = obj instanceof v0 ? (v0) obj : null;
                if (v0Var != null) {
                    v0Var.c(this);
                }
                this._heap = vVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
