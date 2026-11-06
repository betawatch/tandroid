package ee;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.q0;
import zd.r0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class u {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public q0[] a;

    public final void a(q0 q0Var) {
        q0Var.d((r0) this);
        q0[] q0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (q0VarArr == null) {
            q0VarArr = new q0[4];
            this.a = q0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= q0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(q0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            q0VarArr = (q0[]) copyOf;
            this.a = q0VarArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        q0VarArr[i7] = q0Var;
        q0Var.b = i7;
        d(i7);
    }

    public final void b(q0 q0Var) {
        synchronized (this) {
            if (q0Var.b() != null) {
                c(q0Var.b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q0 c(int i7) {
        Object[] objArr = this.a;
        kotlin.jvm.internal.j.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            e(i7, atomicIntegerFieldUpdater.get(this));
            int i10 = (i7 - 1) / 2;
            if (i7 > 0) {
                q0 q0Var = objArr[i7];
                kotlin.jvm.internal.j.b(q0Var);
                Object obj = objArr[i10];
                kotlin.jvm.internal.j.b(obj);
                if (q0Var.compareTo(obj) < 0) {
                    e(i7, i10);
                    d(i10);
                }
            }
            while (true) {
                int i11 = i7 * 2;
                int i12 = i11 + 1;
                if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.a;
                kotlin.jvm.internal.j.b(objArr2);
                int i13 = i11 + 2;
                if (i13 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i13];
                    kotlin.jvm.internal.j.b(comparable);
                    Object obj2 = objArr2[i12];
                    kotlin.jvm.internal.j.b(obj2);
                }
                i13 = i12;
                Comparable comparable2 = objArr2[i7];
                kotlin.jvm.internal.j.b(comparable2);
                Comparable comparable3 = objArr2[i13];
                kotlin.jvm.internal.j.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                e(i7, i13);
                i7 = i13;
            }
        }
        q0 q0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.j.b(q0Var2);
        q0Var2.d(null);
        q0Var2.b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return q0Var2;
    }

    public final void d(int i7) {
        while (i7 > 0) {
            q0[] q0VarArr = this.a;
            kotlin.jvm.internal.j.b(q0VarArr);
            int i10 = (i7 - 1) / 2;
            q0 q0Var = q0VarArr[i10];
            kotlin.jvm.internal.j.b(q0Var);
            q0 q0Var2 = q0VarArr[i7];
            kotlin.jvm.internal.j.b(q0Var2);
            if (q0Var.compareTo(q0Var2) <= 0) {
                return;
            }
            e(i7, i10);
            i7 = i10;
        }
    }

    public final void e(int i7, int i10) {
        q0[] q0VarArr = this.a;
        kotlin.jvm.internal.j.b(q0VarArr);
        q0 q0Var = q0VarArr[i10];
        kotlin.jvm.internal.j.b(q0Var);
        q0 q0Var2 = q0VarArr[i7];
        kotlin.jvm.internal.j.b(q0Var2);
        q0VarArr[i7] = q0Var;
        q0VarArr[i10] = q0Var2;
        q0Var.b = i7;
        q0Var2.b = i10;
    }
}
