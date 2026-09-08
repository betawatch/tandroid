package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
