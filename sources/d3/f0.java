package d3;

import h2.l0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wf.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ f0(wf.b bVar, int i7, long j3) {
        this.b = bVar;
        this.d = i7;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.d;
        long j3 = this.c;
        wf.b bVar = this.b;
        switch (i7) {
            case 0:
                h0 h0Var = (h0) bVar.c;
                String str = l0.a;
                m2.d dVar = ((l2.a0) h0Var).a.s;
                m2.a S = dVar.S((x2.g0) dVar.d.e);
                dVar.V(S, 1018, new li.c(S, i10, j3));
                break;
            default:
                h0 h0Var2 = (h0) bVar.c;
                String str2 = l0.a;
                m2.d dVar2 = ((l2.a0) h0Var2).a.s;
                m2.a S2 = dVar2.S((x2.g0) dVar2.d.e);
                dVar2.V(S2, 1021, new li.c(S2, j3, i10));
                break;
        }
    }

    public /* synthetic */ f0(wf.b bVar, long j3, int i7) {
        this.b = bVar;
        this.c = j3;
        this.d = i7;
    }
}
