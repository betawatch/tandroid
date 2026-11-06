package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class da implements wa {
    public LatLngBounds a;

    public final cb a() {
        LatLngBounds latLngBounds = this.a;
        LatLng latLng = latLngBounds.a;
        double d = latLng.a;
        LatLng latLng2 = latLngBounds.b;
        double d2 = (d + latLng2.a) / 2.0d;
        double d10 = latLng2.b;
        double d11 = latLng.b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new cb(latLng3.a, latLng3.b);
    }
}
