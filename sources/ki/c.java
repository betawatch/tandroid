package ki;

import android.os.Handler;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ l c;

    public /* synthetic */ c(i iVar, l lVar, int i10) {
        this.a = i10;
        this.b = iVar;
        this.c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        switch (this.a) {
            case 0:
                i iVar = this.b;
                c cVar = new c(iVar, this.c, 2);
                Handler handler = iVar.n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                i iVar2 = this.b;
                c cVar2 = new c(iVar2, this.c, 3);
                Handler handler2 = iVar2.n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                i iVar3 = this.b;
                l lVar = this.c;
                if (!iVar3.S || iVar3.Y || iVar3.w != lVar || iVar3.z == null || (qVar = iVar3.v) == null) {
                    return;
                }
                try {
                    long j3 = lVar.A;
                    if (j3 <= 0) {
                        throw new IllegalArgumentException("Invalid recording time origin");
                    }
                    qVar.h = j3;
                    qVar.A = -1L;
                    qVar.B = 0L;
                    qVar.C = -1L;
                    qVar.i = Long.MAX_VALUE;
                    qVar.a0 = true;
                    iVar3.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + i.m(iVar3.f0));
                    return;
                } catch (RuntimeException e) {
                    iVar3.d();
                    iVar3.t(e);
                    return;
                }
            default:
                i iVar4 = this.b;
                l lVar2 = this.c;
                if (iVar4.S && !iVar4.Y && iVar4.w == lVar2) {
                    iVar4.d();
                    iVar4.j.b("common A/V start completed: segmentElapsedMs=" + i.m(iVar4.f0));
                    s0 s0Var = (s0) iVar4.k.b;
                    s0Var.h.post(new b0(s0Var, 2));
                    return;
                }
                return;
        }
    }
}
