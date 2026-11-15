package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    xa loadRawResourceStyle(Context context, int i7);

    ta newCameraUpdateLatLng(bb bbVar);

    ta newCameraUpdateLatLngBounds(va vaVar, int i7);

    ta newCameraUpdateLatLngZoom(bb bbVar, float f10);

    ua onCreateCircleOptions();

    wa onCreateLatLngBoundsBuilder();

    ya onCreateMapView(Context context);

    za onCreateMarkerOptions();
}
