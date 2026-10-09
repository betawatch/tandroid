package fe;

import ae.v0;
import ae.w0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class x {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public v0[] a;

    public final void a(v0 v0Var) {
        v0Var.e((w0) this);
        v0[] v0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (v0VarArr == null) {
            v0VarArr = new v0[4];
            this.a = v0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= v0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(v0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            v0VarArr = (v0[]) copyOf;
            this.a = v0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        v0VarArr[i10] = v0Var;
        v0Var.b = i10;
        e(i10);
    }

    public final v0 b() {
        v0 v0Var;
        synchronized (this) {
            v0[] v0VarArr = this.a;
            v0Var = v0VarArr != null ? v0VarArr[0] : null;
        }
        return v0Var;
    }

    public final void c(v0 v0Var) {
        synchronized (this) {
            if (v0Var.a() != null) {
                d(v0Var.b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v0 d(int i10) {
        Object[] objArr = this.a;
        kotlin.jvm.internal.i.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            f(i10, atomicIntegerFieldUpdater.get(this));
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                v0 v0Var = objArr[i10];
                kotlin.jvm.internal.i.b(v0Var);
                Object obj = objArr[i11];
                kotlin.jvm.internal.i.b(obj);
                if (v0Var.compareTo(obj) < 0) {
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
                kotlin.jvm.internal.i.b(objArr2);
                int i14 = i12 + 2;
                if (i14 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i14];
                    kotlin.jvm.internal.i.b(comparable);
                    Object obj2 = objArr2[i13];
                    kotlin.jvm.internal.i.b(obj2);
                }
                i14 = i13;
                Comparable comparable2 = objArr2[i10];
                kotlin.jvm.internal.i.b(comparable2);
                Comparable comparable3 = objArr2[i14];
                kotlin.jvm.internal.i.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                f(i10, i14);
                i10 = i14;
            }
        }
        v0 v0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.i.b(v0Var2);
        v0Var2.e(null);
        v0Var2.b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return v0Var2;
    }

    public final void e(int i10) {
        while (i10 > 0) {
            v0[] v0VarArr = this.a;
            kotlin.jvm.internal.i.b(v0VarArr);
            int i11 = (i10 - 1) / 2;
            v0 v0Var = v0VarArr[i11];
            kotlin.jvm.internal.i.b(v0Var);
            v0 v0Var2 = v0VarArr[i10];
            kotlin.jvm.internal.i.b(v0Var2);
            if (v0Var.compareTo(v0Var2) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        v0[] v0VarArr = this.a;
        kotlin.jvm.internal.i.b(v0VarArr);
        v0 v0Var = v0VarArr[i11];
        kotlin.jvm.internal.i.b(v0Var);
        v0 v0Var2 = v0VarArr[i10];
        kotlin.jvm.internal.i.b(v0Var2);
        v0VarArr[i10] = v0Var;
        v0VarArr[i11] = v0Var2;
        v0Var.b = i10;
        v0Var2.b = i11;
    }
}
