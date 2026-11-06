package a3;

import a8.p0;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c8.e1;
import e2.p1;
import e2.q1;
import h2.m0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n extends q1 {
    public static final n F0 = new n(new m());
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final String S0;
    public static final String T0;
    public static final String U0;
    public static final String V0;
    public static final String W0;
    public static final String X0;
    public static final String Y0;
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final SparseArray D0;
    public final SparseBooleanArray E0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    static {
        String str = m0.a;
        G0 = Integer.toString(1000, 36);
        H0 = Integer.toString(1001, 36);
        I0 = Integer.toString(1002, 36);
        J0 = Integer.toString(1003, 36);
        K0 = Integer.toString(1004, 36);
        L0 = Integer.toString(1005, 36);
        M0 = Integer.toString(1006, 36);
        N0 = Integer.toString(1007, 36);
        O0 = Integer.toString(1008, 36);
        P0 = Integer.toString(1009, 36);
        Q0 = Integer.toString(1010, 36);
        R0 = Integer.toString(1011, 36);
        S0 = Integer.toString(1012, 36);
        T0 = Integer.toString(1013, 36);
        U0 = Integer.toString(1014, 36);
        V0 = Integer.toString(1015, 36);
        W0 = Integer.toString(1016, 36);
        X0 = Integer.toString(1017, 36);
        Y0 = Integer.toString(1018, 36);
    }

    public n(m mVar) {
        super(mVar);
        this.w0 = mVar.J;
        this.x0 = mVar.K;
        this.y0 = mVar.L;
        this.z0 = mVar.M;
        this.A0 = mVar.N;
        this.B0 = mVar.O;
        this.C0 = mVar.P;
        this.D0 = mVar.Q;
        this.E0 = mVar.R;
    }

    @Override // e2.q1
    public final p1 a() {
        return new m(this);
    }

    @Override // e2.q1
    public final Bundle c() {
        Bundle c10 = super.c();
        c10.putBoolean(G0, this.w0);
        c10.putBoolean(H0, false);
        c10.putBoolean(I0, this.x0);
        c10.putBoolean(U0, false);
        c10.putBoolean(J0, this.y0);
        c10.putBoolean(K0, false);
        c10.putBoolean(L0, false);
        c10.putBoolean(M0, false);
        c10.putBoolean(V0, false);
        c10.putBoolean(Y0, this.z0);
        c10.putBoolean(W0, this.A0);
        c10.putBoolean(N0, this.B0);
        c10.putBoolean(O0, false);
        c10.putBoolean(P0, this.C0);
        c10.putBoolean(X0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray2 = this.D0;
            if (i7 >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.E0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                    iArr[i10] = sparseBooleanArray.keyAt(i10);
                }
                c10.putIntArray(T0, iArr);
                return c10;
            }
            int keyAt = sparseArray2.keyAt(i7);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i7)).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                arrayList2.add((x2.q1) entry.getKey());
                arrayList.add(Integer.valueOf(keyAt));
            }
            c10.putIntArray(Q0, e1.f(arrayList));
            c10.putParcelableArrayList(R0, h2.e.h(arrayList2, new l(0)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                p0.A(sparseArray.valueAt(0));
                throw null;
            }
            c10.putSparseParcelableArray(S0, sparseArray3);
            i7++;
        }
    }

    @Override // e2.q1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (super.equals(nVar) && this.w0 == nVar.w0 && this.x0 == nVar.x0 && this.y0 == nVar.y0 && this.z0 == nVar.z0 && this.A0 == nVar.A0 && this.B0 == nVar.B0 && this.C0 == nVar.C0) {
                SparseBooleanArray sparseBooleanArray = nVar.E0;
                SparseBooleanArray sparseBooleanArray2 = this.E0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            SparseArray sparseArray = nVar.D0;
                            SparseArray sparseArray2 = this.D0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i10 = 0; i10 < size2; i10++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i10));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i10);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                x2.q1 q1Var = (x2.q1) entry.getKey();
                                                if (map2.containsKey(q1Var) && Objects.equals(entry.getValue(), map2.get(q1Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i7)) < 0) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // e2.q1
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w0 ? 1 : 0)) * 961) + (this.x0 ? 1 : 0)) * 961) + (this.y0 ? 1 : 0)) * 28629151) + (this.z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 961) + (this.C0 ? 1 : 0)) * 31;
    }
}
