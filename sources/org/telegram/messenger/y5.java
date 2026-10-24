package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;

    public /* synthetic */ y5(LocationController locationController, int i10) {
        this.a = i10;
        this.b = locationController;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$onConnected$4((Integer) obj);
                break;
            default:
                this.b.setLastKnownLocation((Location) obj);
                break;
        }
    }
}
