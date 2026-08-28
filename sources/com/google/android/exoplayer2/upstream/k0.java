package com.google.android.exoplayer2.upstream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k0 {
    public final int a;
    public final long b;

    public /* synthetic */ k0(int i9, long j10, boolean z10) {
        this.a = i9;
        this.b = j10;
    }

    public static k0 b(m3.l lVar, d5.y yVar) {
        lVar.c(0, 8, yVar.a);
        yVar.C(0);
        return new k0(yVar.e(), yVar.i(), false);
    }

    public boolean a() {
        int i9 = this.a;
        return i9 == 0 || i9 == 1;
    }

    public k0(int i9, long j10) {
        d5.a.f(j10 >= 0);
        this.a = i9;
        this.b = j10;
    }
}
