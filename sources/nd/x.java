package nd;

import id.u0;
import id.v0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class x {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public u0[] a;

    public final void a(u0 u0Var) {
        u0Var.e((v0) this);
        u0[] u0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (u0VarArr == null) {
            u0VarArr = new u0[4];
            this.a = u0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= u0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(u0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            u0VarArr = (u0[]) copyOf;
            this.a = u0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        u0VarArr[i10] = u0Var;
        u0Var.b = i10;
        e(i10);
    }

    public final u0 b() {
        u0 u0Var;
        synchronized (this) {
            u0[] u0VarArr = this.a;
            u0Var = u0VarArr != null ? u0VarArr[0] : null;
        }
        return u0Var;
    }

    public final void c(u0 u0Var) {
        synchronized (this) {
            if (u0Var.a() != null) {
                d(u0Var.b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u0 d(int i10) {
        Object[] objArr = this.a;
        kotlin.jvm.internal.j.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            f(i10, atomicIntegerFieldUpdater.get(this));
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                u0 u0Var = objArr[i10];
                kotlin.jvm.internal.j.b(u0Var);
                Object obj = objArr[i11];
                kotlin.jvm.internal.j.b(obj);
                if (u0Var.compareTo(obj) < 0) {
                    f(i10, i11);
                    e(i11);
                }
            }
            while (true) {
                int i12 = i10 * 2;
                int i13 = i12 + 1;
                if (i13 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.a;
                kotlin.jvm.internal.j.b(objArr2);
                int i14 = i12 + 2;
                if (i14 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i14];
                    kotlin.jvm.internal.j.b(comparable);
                    Object obj2 = objArr2[i13];
                    kotlin.jvm.internal.j.b(obj2);
                }
                i14 = i13;
                Comparable comparable2 = objArr2[i10];
                kotlin.jvm.internal.j.b(comparable2);
                Comparable comparable3 = objArr2[i14];
                kotlin.jvm.internal.j.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                f(i10, i14);
                i10 = i14;
            }
        }
        u0 u0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.j.b(u0Var2);
        u0Var2.e(null);
        u0Var2.b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return u0Var2;
    }

    public final void e(int i10) {
        while (i10 > 0) {
            u0[] u0VarArr = this.a;
            kotlin.jvm.internal.j.b(u0VarArr);
            int i11 = (i10 - 1) / 2;
            u0 u0Var = u0VarArr[i11];
            kotlin.jvm.internal.j.b(u0Var);
            u0 u0Var2 = u0VarArr[i10];
            kotlin.jvm.internal.j.b(u0Var2);
            if (u0Var.compareTo(u0Var2) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        u0[] u0VarArr = this.a;
        kotlin.jvm.internal.j.b(u0VarArr);
        u0 u0Var = u0VarArr[i11];
        kotlin.jvm.internal.j.b(u0Var);
        u0 u0Var2 = u0VarArr[i10];
        kotlin.jvm.internal.j.b(u0Var2);
        u0VarArr[i10] = u0Var;
        u0VarArr[i11] = u0Var2;
        u0Var.b = i10;
        u0Var2.b = i11;
    }
}
