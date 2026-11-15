package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class bx implements Runnable {
    public final /* synthetic */ lj E;
    public final /* synthetic */ sh.f F;
    public final /* synthetic */ ArrayList G;
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ c c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ gj f;
    public final /* synthetic */ gj h;
    public final /* synthetic */ org.telegram.ui.qm n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ fw w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ bx(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, gj gjVar, gj gjVar2, org.telegram.ui.qm qmVar, boolean z10, int i7, fw fwVar, long j10, long j11, lj ljVar, sh.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = cVar;
        this.d = arrayList3;
        this.e = j3;
        this.f = gjVar;
        this.h = gjVar2;
        this.n = qmVar;
        this.r = z10;
        this.s = i7;
        this.w = fwVar;
        this.x = j10;
        this.y = j11;
        this.E = ljVar;
        this.F = fVar;
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
        ez.V(this.s, this.e, 0L, this.x, this.y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.c, this.f, this.h, null, this.E, this.w, null, this.n, null, this.F, this.r, false);
    }
}
