package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ cy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ pv(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = cyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cy.n0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.z4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ pv(cy cyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = cyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
