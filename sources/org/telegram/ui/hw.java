package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ hw(wy wyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = wyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wy.p0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.r4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ hw(wy wyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = wyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
