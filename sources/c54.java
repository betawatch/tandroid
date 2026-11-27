// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class c54 implements Runnable, Comparable, ep3 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public c54(long j) {
        this.a = j;
    }

    public final drb b() {
        Object obj = this._heap;
        if (obj instanceof drb) {
            return (drb) obj;
        }
        return null;
    }

    public final int c(long j, d54 d54Var, e54 e54Var) {
        synchronized (this) {
            if (this._heap == sdd.a) {
                return 2;
            }
            synchronized (d54Var) {
                c54[] c54VarArr = d54Var.a;
                c54 c54Var = c54VarArr != null ? c54VarArr[0] : null;
                int i = e54.s;
                if (fx.a.getIntVolatile(e54Var, e54.n) != 0) {
                    return 1;
                }
                if (c54Var == null) {
                    d54Var.c = j;
                } else {
                    long j2 = c54Var.a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    long j3 = d54Var.c;
                    if (j - j3 > 0) {
                        d54Var.c = j;
                    } else {
                        j = j3;
                    }
                }
                if (this.a - j < 0) {
                    this.a = j;
                }
                d54Var.a(this);
                return 0;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((c54) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(d54 d54Var) {
        if (this._heap != sdd.a) {
            this._heap = d54Var;
        } else {
            lq5.j("Failed requirement.");
        }
    }

    @Override // ep3
    public final void dispose() {
        synchronized (this) {
            Object obj = this._heap;
            ow5 ow5Var = sdd.a;
            if (obj == ow5Var) {
                return;
            }
            d54 d54Var = obj instanceof d54 ? (d54) obj : null;
            if (d54Var != null) {
                d54Var.c(this);
            }
            this._heap = ow5Var;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
