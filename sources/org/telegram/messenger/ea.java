package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ea implements wa {
    public LatLngBounds a;

    public final cb a() {
        LatLngBounds latLngBounds = this.a;
        LatLng latLng = latLngBounds.a;
        double d = latLng.a;
        LatLng latLng2 = latLngBounds.b;
        double d10 = (d + latLng2.a) / 2.0d;
        double d11 = latLng2.b;
        double d12 = latLng.b;
        if (d12 > d11) {
            d11 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d10, (d11 + d12) / 2.0d);
        return new cb(latLng3.a, latLng3.b);
    }
}
