package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ w5(LocationController locationController, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = locationController;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadSharingLocations$14(this.c);
                break;
            default:
                this.b.lambda$loadSharingLocations$15(this.c);
                break;
        }
    }
}
