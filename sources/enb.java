// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class enb {
    public static final /* synthetic */ long b = ex.a.objectFieldOffset(enb.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public g44[] a;

    public final void a(g44 g44Var) {
        g44Var.d((h44) this);
        g44[] g44VarArr = this.a;
        if (g44VarArr == null) {
            g44VarArr = new g44[4];
            this.a = g44VarArr;
        } else if (b() >= g44VarArr.length) {
            g44VarArr = (g44[]) Arrays.copyOf(g44VarArr, b() << 1);
            this.a = g44VarArr;
        }
        int b2 = b();
        ex.a.putIntVolatile(this, b, b2 + 1);
        g44VarArr[b2] = g44Var;
        g44Var.b = b2;
        e(b2);
    }

    public final int b() {
        return ex.a.getIntVolatile(this, b);
    }

    public final void c(g44 g44Var) {
        synchronized (this) {
            if (g44Var.b() != null) {
                d(g44Var.b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r5.compareTo(r6) >= 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g44 d(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        ex.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            f(i, b());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                g44 g44Var = objArr[i];
                g44Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (g44Var.compareTo(obj) < 0) {
                    f(i, i2);
                    e(i2);
                }
            }
            while (true) {
                int i3 = i << 1;
                int i4 = i3 + 1;
                if (i4 >= b()) {
                    break;
                }
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < b()) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                f(i, i5);
                i = i5;
            }
        }
        g44 g44Var2 = objArr[b()];
        g44Var2.getClass();
        g44Var2.d(null);
        g44Var2.b = -1;
        objArr[b()] = null;
        return g44Var2;
    }

    public final void e(int i) {
        while (i > 0) {
            g44[] g44VarArr = this.a;
            g44VarArr.getClass();
            int i2 = (i - 1) / 2;
            g44 g44Var = g44VarArr[i2];
            g44Var.getClass();
            g44 g44Var2 = g44VarArr[i];
            g44Var2.getClass();
            if (g44Var.compareTo(g44Var2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        g44[] g44VarArr = this.a;
        g44VarArr.getClass();
        g44 g44Var = g44VarArr[i2];
        g44Var.getClass();
        g44 g44Var2 = g44VarArr[i];
        g44Var2.getClass();
        g44VarArr[i] = g44Var;
        g44VarArr[i2] = g44Var2;
        g44Var.b = i;
        g44Var2.b = i2;
    }
}
