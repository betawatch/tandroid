package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ kw(yy yyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = yyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yy.n0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.o4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ kw(yy yyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = yyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
