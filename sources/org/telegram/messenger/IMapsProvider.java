package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    ya loadRawResourceStyle(Context context, int i7);

    ua newCameraUpdateLatLng(cb cbVar);

    ua newCameraUpdateLatLngBounds(wa waVar, int i7);

    ua newCameraUpdateLatLngZoom(cb cbVar, float f10);

    va onCreateCircleOptions();

    xa onCreateLatLngBoundsBuilder();

    za onCreateMapView(Context context);

    ab onCreateMarkerOptions();
}
