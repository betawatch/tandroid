package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                this.b.p4(this.c, this.d, false, this.e, this.f);
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
