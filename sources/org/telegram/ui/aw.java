package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ oy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ aw(oy oyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        this.b = oyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z4;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oy.o0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.r4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ aw(oy oyVar, ArrayList arrayList, int i10, boolean z4, HashSet hashSet) {
        this.b = oyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z4;
        this.f = hashSet;
    }
}
