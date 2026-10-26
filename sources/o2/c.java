package o2;

import a8.ed;
import b2.w;
import b2.w0;
import b2.x;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public qb.a a;
    public boolean b;
    public int c;

    public static void a(int i10, ArrayList arrayList) {
        if (ed.d(i10, 0, 7, d) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }

    public final x b(x xVar) {
        if (!this.b || !this.a.i1(xVar)) {
            return xVar;
        }
        w a2 = xVar.a();
        String str = xVar.k;
        a2.r = w0.n("application/x-media3-cues");
        a2.P = this.a.B0(xVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xVar.s);
        sb2.append(str != null ? " ".concat(str) : "");
        a2.j = sb2.toString();
        a2.w = Long.MAX_VALUE;
        return new x(a2);
    }
}
