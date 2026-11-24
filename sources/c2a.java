// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c2a implements Runnable {
    public final /* synthetic */ u47 E;
    public final /* synthetic */ we8 F;
    public final /* synthetic */ ArrayList G;
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j5 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ k27 f;
    public final /* synthetic */ k27 h;
    public final /* synthetic */ bu1 n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ j1a w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ c2a(ArrayList arrayList, ArrayList arrayList2, j5 j5Var, ArrayList arrayList3, long j, k27 k27Var, k27 k27Var2, bu1 bu1Var, boolean z, int i, j1a j1aVar, long j2, long j3, u47 u47Var, we8 we8Var, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = j5Var;
        this.d = arrayList3;
        this.e = j;
        this.f = k27Var;
        this.h = k27Var2;
        this.n = bu1Var;
        this.r = z;
        this.s = i;
        this.w = j1aVar;
        this.x = j2;
        this.y = j3;
        this.E = u47Var;
        this.F = we8Var;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        z3a.U(this.s, this.e, 0L, this.x, this.y, this.c, this.n, null, this.f, this.h, null, this.E, this.F, this.w, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, null, this.r, false);
    }
}
