package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ww implements Runnable {
    public final /* synthetic */ kj E;
    public final /* synthetic */ sh.g F;
    public final /* synthetic */ ArrayList G;
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ c c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ fj f;
    public final /* synthetic */ fj h;
    public final /* synthetic */ org.telegram.ui.rm n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ bw w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ ww(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j3, fj fjVar, fj fjVar2, org.telegram.ui.rm rmVar, boolean z10, int i7, bw bwVar, long j10, long j11, kj kjVar, sh.g gVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = cVar;
        this.d = arrayList3;
        this.e = j3;
        this.f = fjVar;
        this.h = fjVar2;
        this.n = rmVar;
        this.r = z10;
        this.s = i7;
        this.w = bwVar;
        this.x = j10;
        this.y = j11;
        this.E = kjVar;
        this.F = gVar;
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
        zy.V(this.s, this.e, 0L, this.x, this.y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.c, this.f, this.h, null, this.E, this.w, null, this.n, null, this.F, this.r, false);
    }
}
