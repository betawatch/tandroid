package e5;

import d5.f0;
import h3.h0;
import j4.d0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ we.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ v(we.b bVar, int i9, long j10) {
        this.b = bVar;
        this.d = i9;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        int i10 = this.d;
        long j10 = this.c;
        we.b bVar = this.b;
        switch (i9) {
            case 0:
                h0 h0Var = (h0) bVar.c;
                int i11 = f0.a;
                i3.f fVar = h0Var.a.r;
                i3.a i12 = fVar.i((d0) fVar.d.e);
                fVar.l(i12, 1018, new i3.d(i12, i10, j10));
                break;
            default:
                h0 h0Var2 = (h0) bVar.c;
                int i13 = f0.a;
                i3.f fVar2 = h0Var2.a.r;
                i3.a i14 = fVar2.i((d0) fVar2.d.e);
                fVar2.l(i14, 1021, new i3.d(i14, j10, i10));
                break;
        }
    }

    public /* synthetic */ v(we.b bVar, long j10, int i9) {
        this.b = bVar;
        this.c = j10;
        this.d = i9;
    }
}
