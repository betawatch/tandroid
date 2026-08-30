package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ n9(MediaDataController mediaDataController, boolean z4, int i10, ArrayList arrayList) {
        this.b = mediaDataController;
        this.c = z4;
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

    public /* synthetic */ n9(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10) {
        this.b = mediaDataController;
        this.c = z4;
        this.e = arrayList;
        this.d = i10;
    }
}
