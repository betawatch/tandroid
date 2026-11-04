package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ww implements Runnable {
    public final /* synthetic */ ej E;
    public final /* synthetic */ th.f F;
    public final /* synthetic */ ArrayList G;
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ c c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ zi f;
    public final /* synthetic */ zi h;
    public final /* synthetic */ org.telegram.ui.mm n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ zv w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ ww(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3, long j10, zi ziVar, zi ziVar2, org.telegram.ui.mm mmVar, boolean z10, int i3, zv zvVar, long j11, long j12, ej ejVar, th.f fVar, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = cVar;
        this.d = arrayList3;
        this.e = j10;
        this.f = ziVar;
        this.h = ziVar2;
        this.n = mmVar;
        this.r = z10;
        this.s = i3;
        this.w = zvVar;
        this.x = j11;
        this.y = j12;
        this.E = ejVar;
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
        yy.V(this.s, this.e, 0L, this.x, this.y, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, this.c, this.f, this.h, null, this.E, this.w, null, this.n, null, this.F, this.r, false);
    }
}
