package k4;

import c3.p;
import e2.x;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final long b;

    public /* synthetic */ d(int i10, long j10, boolean z10) {
        this.a = i10;
        this.b = j10;
    }

    public static d b(p pVar, x xVar) {
        pVar.b(0, 8, xVar.a);
        xVar.N(0);
        return new d(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i10 = this.a;
        return i10 == 0 || i10 == 1;
    }

    public d(int i10, long j10) {
        u6.g(j10 >= 0);
        this.a = i10;
        this.b = j10;
    }
}
