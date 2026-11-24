// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e4a implements Runnable {
    public final /* synthetic */ v67 E;
    public final /* synthetic */ yg8 F;
    public final /* synthetic */ ArrayList G;
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j5 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ k47 f;
    public final /* synthetic */ k47 h;
    public final /* synthetic */ nv1 n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ l3a w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ e4a(ArrayList arrayList, ArrayList arrayList2, j5 j5Var, ArrayList arrayList3, long j, k47 k47Var, k47 k47Var2, nv1 nv1Var, boolean z, int i, l3a l3aVar, long j2, long j3, v67 v67Var, yg8 yg8Var, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = j5Var;
        this.d = arrayList3;
        this.e = j;
        this.f = k47Var;
        this.h = k47Var2;
        this.n = nv1Var;
        this.r = z;
        this.s = i;
        this.w = l3aVar;
        this.x = j2;
        this.y = j3;
        this.E = v67Var;
        this.F = yg8Var;
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
        a6a.U(this.s, this.e, 0L, this.x, this.y, this.c, this.n, null, this.f, this.h, null, this.E, this.F, this.w, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, null, this.r, false);
    }
}
