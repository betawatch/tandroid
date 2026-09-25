package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;

    public /* synthetic */ t5(LocationController locationController, int i10) {
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
