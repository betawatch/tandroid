package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    ra loadRawResourceStyle(Context context, int i3);

    na newCameraUpdateLatLng(va vaVar);

    na newCameraUpdateLatLngBounds(pa paVar, int i3);

    na newCameraUpdateLatLngZoom(va vaVar, float f10);

    oa onCreateCircleOptions();

    qa onCreateLatLngBoundsBuilder();

    sa onCreateMapView(Context context);

    ta onCreateMarkerOptions();
}
