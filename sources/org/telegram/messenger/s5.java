package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s5 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;

    public /* synthetic */ s5(LocationController locationController, int i9) {
        this.a = i9;
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
