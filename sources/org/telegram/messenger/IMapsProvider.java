package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    wa loadRawResourceStyle(Context context, int i7);

    sa newCameraUpdateLatLng(ab abVar);

    sa newCameraUpdateLatLngBounds(ua uaVar, int i7);

    sa newCameraUpdateLatLngZoom(ab abVar, float f10);

    ta onCreateCircleOptions();

    va onCreateLatLngBoundsBuilder();

    xa onCreateMapView(Context context);

    ya onCreateMarkerOptions();
}
