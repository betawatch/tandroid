package o2;

import b2.v0;
import b2.w;
import b2.x;
import java.util.ArrayList;
import t7.u;
import v7.c8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public u a;
    public boolean b;
    public int c;

    public static void a(int i10, ArrayList arrayList) {
        if (c8.d(i10, 0, 7, d) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }

    public final x b(x xVar) {
        if (!this.b || !this.a.F(xVar)) {
            return xVar;
        }
        w a2 = xVar.a();
        String str = xVar.k;
        a2.r = v0.n("application/x-media3-cues");
        a2.P = this.a.y(xVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xVar.s);
        sb2.append(str != null ? " ".concat(str) : "");
        a2.j = sb2.toString();
        a2.w = Long.MAX_VALUE;
        return new x(a2);
    }
}
