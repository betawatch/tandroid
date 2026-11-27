// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class hpd {
    public boolean a(u2 u2Var, l2 l2Var, l2 l2Var2) {
        synchronized (u2Var) {
            if (u2Var.b != l2Var) {
                return false;
            }
            u2Var.b = l2Var2;
            return true;
        }
    }

    public boolean b(u2 u2Var, Object obj, Object obj2) {
        synchronized (u2Var) {
            if (u2Var.a != obj) {
                return false;
            }
            u2Var.a = obj2;
            return true;
        }
    }

    public boolean c(u2 u2Var, t2 t2Var, t2 t2Var2) {
        synchronized (u2Var) {
            if (u2Var.c != t2Var) {
                return false;
            }
            u2Var.c = t2Var2;
            return true;
        }
    }

    public l2 d(u2 u2Var) {
        l2 l2Var;
        l2 l2Var2 = l2.d;
        synchronized (u2Var) {
            l2Var = u2Var.b;
            if (l2Var != l2Var2) {
                u2Var.b = l2Var2;
            }
        }
        return l2Var;
    }

    public t2 e(u2 u2Var) {
        t2 t2Var;
        t2 t2Var2 = t2.c;
        synchronized (u2Var) {
            t2Var = u2Var.c;
            if (t2Var != t2Var2) {
                u2Var.c = t2Var2;
            }
        }
        return t2Var;
    }

    public void f(t2 t2Var, t2 t2Var2) {
        t2Var.b = t2Var2;
    }

    public void g(t2 t2Var, Thread thread) {
        t2Var.a = thread;
    }
}
