package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class px implements Runnable {
    public final /* synthetic */ oj D;
    public final /* synthetic */ ih.i E;
    public final /* synthetic */ ArrayList F;
    public final /* synthetic */ ArrayList G;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ c c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ jj f;
    public final /* synthetic */ jj h;
    public final /* synthetic */ org.telegram.ui.kn n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ sw w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ px(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j10, jj jjVar, jj jjVar2, org.telegram.ui.kn knVar, boolean z10, int i10, sw swVar, long j11, long j12, oj ojVar, ih.i iVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = cVar;
        this.d = arrayList3;
        this.e = j10;
        this.f = jjVar;
        this.h = jjVar2;
        this.n = knVar;
        this.r = z10;
        this.s = i10;
        this.w = swVar;
        this.x = j11;
        this.y = j12;
        this.D = ojVar;
        this.E = iVar;
        this.F = arrayList4;
        this.G = arrayList5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        qz.V(this.s, this.e, 0L, this.x, this.y, this.E, null, null, arrayList, this.d, arrayList2, null, this.F, this.G, null, this.c, this.f, this.h, null, this.D, this.w, null, this.n, this.r, false);
    }
}
