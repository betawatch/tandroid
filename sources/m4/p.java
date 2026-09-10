package m4;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p {
    public static final o1 e;
    public static final b2.x0 f;
    public final o1 a;
    public final b2.x0 b;
    public final e9.i0 c;
    public final e9.i0 d;

    static {
        HashSet hashSet = new HashSet();
        e9.a1 a1Var = n1.d;
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            hashSet.add(new n1(((Integer) a1Var.get(i10)).intValue()));
        }
        e = new o1(hashSet);
        HashSet hashSet2 = new HashSet();
        e9.a1 a1Var2 = n1.e;
        for (int i11 = 0; i11 < a1Var2.d; i11++) {
            hashSet2.add(new n1(((Integer) a1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < a1Var.d; i12++) {
            hashSet2.add(new n1(((Integer) a1Var.get(i12)).intValue()));
        }
        new o1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.w0.b) {
            e2.d.g(!false);
            sparseBooleanArray.append(i13, true);
        }
        e2.d.g(!false);
        f = new b2.x0(new b2.q(sparseBooleanArray));
    }

    public p(o1 o1Var, b2.x0 x0Var, e9.i0 i0Var, e9.i0 i0Var2) {
        this.a = o1Var;
        this.b = x0Var;
        this.c = i0Var;
        this.d = i0Var2;
    }
}
