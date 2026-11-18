package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class ba implements ua {
    public LatLngBounds a;

    public final ab a() {
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
        return new ab(latLng3.a, latLng3.b);
    }
}
