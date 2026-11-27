// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fr4 implements zy9 {
    public final SparseArray a;
    public final SparseArray b;
    public final long c;
    public final long d;
    public final int e;

    public fr4(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i) {
        this.a = sparseArray;
        this.b = sparseArray2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // zy9
    public final boolean c() {
        return true;
    }

    @Override // zy9
    public final boolean d() {
        return false;
    }

    @Override // zy9
    public final yy9 e(long j) {
        SparseArray sparseArray = this.a;
        int i = this.e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            bz9 bz9Var = new bz9(0L, this.d);
            return new yy9(bz9Var, bz9Var);
        }
        int f = gcc.f(jArr, j, true);
        bz9 bz9Var2 = new bz9(jArr[f], jArr2[f]);
        return new yy9(bz9Var2, bz9Var2);
    }

    @Override // zy9
    public final long h() {
        return this.c;
    }
}
