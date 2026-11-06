package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
