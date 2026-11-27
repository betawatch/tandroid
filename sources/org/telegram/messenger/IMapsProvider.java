package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
