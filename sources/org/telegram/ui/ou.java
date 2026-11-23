package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bx b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ ou(bx bxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = bxVar;
        this.c = i7;
        this.d = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.K4(this.d, this.c, false, this.e, this.f);
                break;
            default:
                bx.K0(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ ou(bx bxVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.b = bxVar;
        this.d = arrayList;
        this.c = i7;
        this.e = z10;
        this.f = hashSet;
    }
}
