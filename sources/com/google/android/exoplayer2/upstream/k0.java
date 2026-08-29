package com.google.android.exoplayer2.upstream;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k0 {
    public final int a;
    public final long b;

    public /* synthetic */ k0(int i10, long j10, boolean z10) {
        this.a = i10;
        this.b = j10;
    }

    public static k0 b(o3.l lVar, f5.w wVar) {
        lVar.a(0, 8, wVar.a);
        wVar.C(0);
        return new k0(wVar.e(), wVar.i(), false);
    }

    public boolean a() {
        int i10 = this.a;
        return i10 == 0 || i10 == 1;
    }

    public k0(int i10, long j10) {
        f5.a.f(j10 >= 0);
        this.a = i10;
        this.b = j10;
    }
}
