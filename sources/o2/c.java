package o2;

import b2.r0;
import java.util.ArrayList;
import v7.z7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class c {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public qb.b a;
    public boolean b;

    public static void a(int i10, ArrayList arrayList) {
        if (z7.d(i10, 0, 7, c) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }

    public final b2.s b(b2.s sVar) {
        if (!this.b || !this.a.W(sVar)) {
            return sVar;
        }
        b2.r a2 = sVar.a();
        String str = sVar.k;
        a2.q = r0.n("application/x-media3-cues");
        a2.O = this.a.D(sVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sVar.r);
        sb2.append(str != null ? " ".concat(str) : "");
        a2.j = sb2.toString();
        a2.v = Long.MAX_VALUE;
        return new b2.s(a2);
    }
}
