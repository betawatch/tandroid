package o2;

import b2.r0;
import java.util.ArrayList;
import v7.x7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public rb.a a;
    public boolean b;

    public static void a(int i10, ArrayList arrayList) {
        if (x7.d(i10, 0, 7, c) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }

    public final b2.s b(b2.s sVar) {
        if (!this.b || !this.a.i0(sVar)) {
            return sVar;
        }
        b2.r a2 = sVar.a();
        String str = sVar.k;
        a2.q = r0.n("application/x-media3-cues");
        a2.O = this.a.J(sVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sVar.r);
        sb2.append(str != null ? " ".concat(str) : "");
        a2.j = sb2.toString();
        a2.v = Long.MAX_VALUE;
        return new b2.s(a2);
    }
}
