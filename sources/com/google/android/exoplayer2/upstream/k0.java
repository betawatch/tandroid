package com.google.android.exoplayer2.upstream;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k0 {
    public final int a;
    public final long b;

    public /* synthetic */ k0(int i10, long j10, boolean z10) {
        this.a = i10;
        this.b = j10;
    }

    public static k0 b(m3.l lVar, d5.z zVar) {
        lVar.b(0, 8, zVar.a);
        zVar.C(0);
        return new k0(zVar.e(), zVar.i(), false);
    }

    public boolean a() {
        int i10 = this.a;
        return i10 == 0 || i10 == 1;
    }

    public k0(int i10, long j10) {
        d5.a.f(j10 >= 0);
        this.a = i10;
        this.b = j10;
    }
}
