package m4;

import android.util.SparseBooleanArray;
import e9.x1;
import java.util.HashSet;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u {
    public static final q1 e;
    public static final b2.b1 f;
    public final q1 a;
    public final b2.b1 b;
    public final e9.n0 c;
    public final e9.n0 d;

    static {
        HashSet hashSet = new HashSet();
        x1 x1Var = p1.d;
        for (int i10 = 0; i10 < x1Var.d; i10++) {
            hashSet.add(new p1(((Integer) x1Var.get(i10)).intValue()));
        }
        e = new q1(hashSet);
        HashSet hashSet2 = new HashSet();
        x1 x1Var2 = p1.e;
        for (int i11 = 0; i11 < x1Var2.d; i11++) {
            hashSet2.add(new p1(((Integer) x1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < x1Var.d; i12++) {
            hashSet2.add(new p1(((Integer) x1Var.get(i12)).intValue()));
        }
        new q1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.a1.b) {
            t6.p(!false);
            sparseBooleanArray.append(i13, true);
        }
        t6.p(!false);
        f = new b2.b1(new b2.v(sparseBooleanArray));
    }

    public u(q1 q1Var, b2.b1 b1Var, e9.n0 n0Var, e9.n0 n0Var2) {
        this.a = q1Var;
        this.b = b1Var;
        this.c = n0Var;
        this.d = n0Var2;
    }
}
