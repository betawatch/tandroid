package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ jw(yy yyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
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
                this.b.p4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ jw(yy yyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.b = yyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f = hashSet;
    }
}
