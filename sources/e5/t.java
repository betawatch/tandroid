package e5;

import d5.g0;
import h3.h0;
import j4.c0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xe.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ t(xe.b bVar, int i10, long j10) {
        this.b = bVar;
        this.d = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        long j10 = this.c;
        xe.b bVar = this.b;
        switch (i10) {
            case 0:
                h0 h0Var = (h0) bVar.c;
                int i12 = g0.a;
                i3.f fVar = h0Var.a.r;
                i3.a i13 = fVar.i((c0) fVar.d.e);
                fVar.l(i13, 1018, new i3.d(i13, i11, j10));
                break;
            default:
                h0 h0Var2 = (h0) bVar.c;
                int i14 = g0.a;
                i3.f fVar2 = h0Var2.a.r;
                i3.a i15 = fVar2.i((c0) fVar2.d.e);
                fVar2.l(i15, 1021, new i3.d(i15, j10, i11));
                break;
        }
    }

    public /* synthetic */ t(xe.b bVar, long j10, int i10) {
        this.b = bVar;
        this.c = j10;
        this.d = i10;
    }
}
