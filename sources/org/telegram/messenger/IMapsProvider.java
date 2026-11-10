package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
