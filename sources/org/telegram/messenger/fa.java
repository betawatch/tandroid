package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class fa implements xa {
    public LatLngBounds a;

    public final db a() {
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
        return new db(latLng3.a, latLng3.b);
    }
}
