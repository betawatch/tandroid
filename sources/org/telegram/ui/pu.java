package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ yw b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ pu(yw ywVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = ywVar;
        this.c = i7;
        this.d = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D4(this.d, this.c, false, this.e, this.f);
                break;
            default:
                yw.r0(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ pu(yw ywVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.b = ywVar;
        this.d = arrayList;
        this.c = i7;
        this.e = z10;
        this.f = hashSet;
    }
}
