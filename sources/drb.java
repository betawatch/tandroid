// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class drb {
    public static final /* synthetic */ long b = fx.a.objectFieldOffset(drb.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public c54[] a;

    public final void a(c54 c54Var) {
        c54Var.d((d54) this);
        c54[] c54VarArr = this.a;
        if (c54VarArr == null) {
            c54VarArr = new c54[4];
            this.a = c54VarArr;
        } else if (b() >= c54VarArr.length) {
            c54VarArr = (c54[]) Arrays.copyOf(c54VarArr, b() << 1);
            this.a = c54VarArr;
        }
        int b2 = b();
        fx.a.putIntVolatile(this, b, b2 + 1);
        c54VarArr[b2] = c54Var;
        c54Var.b = b2;
        e(b2);
    }

    public final int b() {
        return fx.a.getIntVolatile(this, b);
    }

    public final void c(c54 c54Var) {
        synchronized (this) {
            if (c54Var.b() != null) {
                d(c54Var.b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r5.compareTo(r6) >= 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c54 d(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        fx.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            f(i, b());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                c54 c54Var = objArr[i];
                c54Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (c54Var.compareTo(obj) < 0) {
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
        c54 c54Var2 = objArr[b()];
        c54Var2.getClass();
        c54Var2.d(null);
        c54Var2.b = -1;
        objArr[b()] = null;
        return c54Var2;
    }

    public final void e(int i) {
        while (i > 0) {
            c54[] c54VarArr = this.a;
            c54VarArr.getClass();
            int i2 = (i - 1) / 2;
            c54 c54Var = c54VarArr[i2];
            c54Var.getClass();
            c54 c54Var2 = c54VarArr[i];
            c54Var2.getClass();
            if (c54Var.compareTo(c54Var2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        c54[] c54VarArr = this.a;
        c54VarArr.getClass();
        c54 c54Var = c54VarArr[i2];
        c54Var.getClass();
        c54 c54Var2 = c54VarArr[i];
        c54Var2.getClass();
        c54VarArr[i] = c54Var;
        c54VarArr[i2] = c54Var2;
        c54Var.b = i;
        c54Var2.b = i2;
    }
}
