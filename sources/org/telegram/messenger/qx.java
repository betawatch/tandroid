package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class qx implements Runnable {
    public final /* synthetic */ pj D;
    public final /* synthetic */ ih.i E;
    public final /* synthetic */ ArrayList F;
    public final /* synthetic */ ArrayList G;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ c c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ kj f;
    public final /* synthetic */ kj h;
    public final /* synthetic */ org.telegram.ui.kn n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ tw w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ qx(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j10, kj kjVar, kj kjVar2, org.telegram.ui.kn knVar, boolean z10, int i10, tw twVar, long j11, long j12, pj pjVar, ih.i iVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = cVar;
        this.d = arrayList3;
        this.e = j10;
        this.f = kjVar;
        this.h = kjVar2;
        this.n = knVar;
        this.r = z10;
        this.s = i10;
        this.w = twVar;
        this.x = j11;
        this.y = j12;
        this.D = pjVar;
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
        rz.V(this.s, this.e, 0L, this.x, this.y, this.E, null, null, arrayList, this.d, arrayList2, null, this.F, this.G, null, this.c, this.f, this.h, null, this.D, this.w, null, this.n, this.r, false);
    }
}
