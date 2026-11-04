package o4;

import android.util.SparseBooleanArray;
import b8.zb;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t {
    public static final o1 e;
    public static final d2.a1 f;
    public final o1 a;
    public final d2.a1 b;
    public final g9.i0 c;
    public final g9.i0 d;

    static {
        HashSet hashSet = new HashSet();
        g9.s1 s1Var = n1.d;
        for (int i3 = 0; i3 < s1Var.d; i3++) {
            hashSet.add(new n1(((Integer) s1Var.get(i3)).intValue()));
        }
        e = new o1(hashSet);
        HashSet hashSet2 = new HashSet();
        g9.s1 s1Var2 = n1.e;
        for (int i10 = 0; i10 < s1Var2.d; i10++) {
            hashSet2.add(new n1(((Integer) s1Var2.get(i10)).intValue()));
        }
        for (int i11 = 0; i11 < s1Var.d; i11++) {
            hashSet2.add(new n1(((Integer) s1Var.get(i11)).intValue()));
        }
        new o1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i12 : d2.z0.b) {
            zb.p(!false);
            sparseBooleanArray.append(i12, true);
        }
        zb.p(!false);
        f = new d2.a1(new d2.t(sparseBooleanArray));
    }

    public t(o1 o1Var, d2.a1 a1Var, g9.i0 i0Var, g9.i0 i0Var2) {
        this.a = o1Var;
        this.b = a1Var;
        this.c = i0Var;
        this.d = i0Var2;
    }
}
