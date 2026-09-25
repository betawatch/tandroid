package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ bw(qy qyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = qyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qy.p0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.r4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ bw(qy qyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = qyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
