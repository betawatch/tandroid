package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dx implements Runnable {
    public final /* synthetic */ nj D;
    public final /* synthetic */ sh.f E;
    public final /* synthetic */ ArrayList F;
    public final /* synthetic */ ArrayList G;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ c c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ij f;
    public final /* synthetic */ ij h;
    public final /* synthetic */ org.telegram.ui.qm n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ hw w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ dx(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, ij ijVar, ij ijVar2, org.telegram.ui.qm qmVar, boolean z9, int i7, hw hwVar, long j10, long j11, nj njVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = cVar;
        this.d = arrayList3;
        this.e = j3;
        this.f = ijVar;
        this.h = ijVar2;
        this.n = qmVar;
        this.r = z9;
        this.s = i7;
        this.w = hwVar;
        this.x = j10;
        this.y = j11;
        this.D = njVar;
        this.E = fVar;
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
        gz.V(this.s, this.e, 0L, this.x, this.y, null, null, arrayList, this.d, arrayList2, null, this.F, this.G, this.c, this.f, this.h, null, this.D, this.w, null, this.n, null, this.E, this.r, false);
    }
}
