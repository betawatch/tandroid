package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public interface ILocationServiceProvider {
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 1;
    public static final int PRIORITY_HIGH_ACCURACY = 0;
    public static final int PRIORITY_LOW_POWER = 2;
    public static final int PRIORITY_NO_POWER = 3;
    public static final int STATUS_RESOLUTION_REQUIRED = 1;
    public static final int STATUS_SETTINGS_CHANGE_UNAVAILABLE = 2;
    public static final int STATUS_SUCCESS = 0;

    void checkLocationSettings(qa qaVar, q0.a aVar);

    boolean checkServices();

    void getLastLocation(q0.a aVar);

    void init(Context context);

    qa onCreateLocationRequest();

    ra onCreateLocationServicesAPI(Context context, na naVar, oa oaVar);

    void removeLocationUpdates(pa paVar);

    void requestLocationUpdates(qa qaVar, pa paVar);
}
