package o2;

import b2.v;
import b2.v0;
import b2.w;
import java.util.ArrayList;
import t7.u;
import v7.b8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public u a;
    public boolean b;
    public int c;

    public static void a(int i10, ArrayList arrayList) {
        if (b8.d(i10, 0, 7, d) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }

    public final w b(w wVar) {
        if (!this.b || !this.a.a0(wVar)) {
            return wVar;
        }
        v a2 = wVar.a();
        String str = wVar.k;
        a2.r = v0.n("application/x-media3-cues");
        a2.P = this.a.L(wVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wVar.s);
        sb2.append(str != null ? " ".concat(str) : "");
        a2.j = sb2.toString();
        a2.w = Long.MAX_VALUE;
        return new w(a2);
    }
}
