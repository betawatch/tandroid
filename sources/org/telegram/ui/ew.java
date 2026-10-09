package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ty b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ ew(ty tyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = tyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ty.n0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.o4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ ew(ty tyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = tyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
