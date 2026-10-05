package k4;

import c3.p;
import e2.v;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final long b;

    public /* synthetic */ d(int i10, long j3, boolean z10) {
        this.a = i10;
        this.b = j3;
    }

    public static d b(p pVar, v vVar) {
        pVar.b(0, 8, vVar.a);
        vVar.J(0);
        return new d(vVar.j(), vVar.o(), false);
    }

    public boolean a() {
        int i10 = this.a;
        return i10 == 0 || i10 == 1;
    }

    public d(int i10, long j3) {
        e2.d.b(j3 >= 0);
        this.a = i10;
        this.b = j3;
    }
}
