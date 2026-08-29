package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ t5(LocationController locationController, ArrayList arrayList, int i10) {
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
