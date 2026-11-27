package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    wj5 loadRawResourceStyle(Context context, int i);

    sj5 newCameraUpdateLatLng(ak5 ak5Var);

    sj5 newCameraUpdateLatLngBounds(uj5 uj5Var, int i);

    sj5 newCameraUpdateLatLngZoom(ak5 ak5Var, float f);

    tj5 onCreateCircleOptions();

    vj5 onCreateLatLngBoundsBuilder();

    xj5 onCreateMapView(Context context);

    yj5 onCreateMarkerOptions();
}
