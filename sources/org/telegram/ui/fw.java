package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ uy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ fw(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = uyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uy.p0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.A4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ fw(uy uyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = uyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
