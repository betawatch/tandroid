package m4;

import android.util.SparseBooleanArray;
import e9.x1;
import java.util.HashSet;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class t {
    public static final p1 e;
    public static final b2.b1 f;
    public final p1 a;
    public final b2.b1 b;
    public final e9.n0 c;
    public final e9.n0 d;

    static {
        HashSet hashSet = new HashSet();
        x1 x1Var = o1.d;
        for (int i10 = 0; i10 < x1Var.d; i10++) {
            hashSet.add(new o1(((Integer) x1Var.get(i10)).intValue()));
        }
        e = new p1(hashSet);
        HashSet hashSet2 = new HashSet();
        x1 x1Var2 = o1.e;
        for (int i11 = 0; i11 < x1Var2.d; i11++) {
            hashSet2.add(new o1(((Integer) x1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < x1Var.d; i12++) {
            hashSet2.add(new o1(((Integer) x1Var.get(i12)).intValue()));
        }
        new p1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.a1.b) {
            u6.p(!false);
            sparseBooleanArray.append(i13, true);
        }
        u6.p(!false);
        f = new b2.b1(new b2.u(sparseBooleanArray));
    }

    public t(p1 p1Var, b2.b1 b1Var, e9.n0 n0Var, e9.n0 n0Var2) {
        this.a = p1Var;
        this.b = b1Var;
        this.c = n0Var;
        this.d = n0Var2;
    }
}
