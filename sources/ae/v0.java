package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class v0 implements Runnable, Comparable, q0 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public v0(long j3) {
        this.a = j3;
    }

    public final fe.x a() {
        Object obj = this._heap;
        if (obj instanceof fe.x) {
            return (fe.x) obj;
        }
        return null;
    }

    public final int c(long j3, w0 w0Var, x0 x0Var) {
        synchronized (this) {
            if (this._heap == g0.b) {
                return 2;
            }
            synchronized (w0Var) {
                try {
                    v0[] v0VarArr = w0Var.a;
                    v0 v0Var = v0VarArr != null ? v0VarArr[0] : null;
                    if (x0.r.get(x0Var) != 0) {
                        return 1;
                    }
                    if (v0Var == null) {
                        w0Var.c = j3;
                    } else {
                        long j10 = v0Var.a;
                        if (j10 - j3 < 0) {
                            j3 = j10;
                        }
                        if (j3 - w0Var.c > 0) {
                            w0Var.c = j3;
                        }
                    }
                    long j11 = this.a;
                    long j12 = w0Var.c;
                    if (j11 - j12 < 0) {
                        this.a = j12;
                    }
                    w0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.a - ((v0) obj).a;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    @Override // ae.q0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                da.a aVar = g0.b;
                if (obj == aVar) {
                    return;
                }
                w0 w0Var = obj instanceof w0 ? (w0) obj : null;
                if (w0Var != null) {
                    w0Var.c(this);
                }
                this._heap = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(w0 w0Var) {
        if (this._heap == g0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = w0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
