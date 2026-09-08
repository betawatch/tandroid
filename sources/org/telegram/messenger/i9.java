package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ i9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.b = mediaDataController;
        this.c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadRecents$48(this.c, this.e, this.d);
                break;
            default:
                this.b.lambda$processLoadedRecentDocuments$53(this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ i9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.b = mediaDataController;
        this.c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
