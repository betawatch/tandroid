package c4;

import h5.w;
import r3.l;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final long b;

    public /* synthetic */ e(int i10, long j10, boolean z4) {
        this.a = i10;
        this.b = j10;
    }

    public static e b(l lVar, w wVar) {
        lVar.b(0, 8, wVar.a);
        wVar.F(0);
        return new e(wVar.g(), wVar.l(), false);
    }

    public boolean a() {
        int i10 = this.a;
        return i10 == 0 || i10 == 1;
    }

    public e(int i10, long j10) {
        h5.a.f(j10 >= 0);
        this.a = i10;
        this.b = j10;
    }
}
