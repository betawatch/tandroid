package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ x5(LocationController locationController, ArrayList arrayList, int i10) {
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
