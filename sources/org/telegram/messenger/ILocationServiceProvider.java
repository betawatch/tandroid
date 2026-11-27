package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public interface ILocationServiceProvider {
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 1;
    public static final int PRIORITY_HIGH_ACCURACY = 0;
    public static final int PRIORITY_LOW_POWER = 2;
    public static final int PRIORITY_NO_POWER = 3;
    public static final int STATUS_RESOLUTION_REQUIRED = 1;
    public static final int STATUS_SETTINGS_CHANGE_UNAVAILABLE = 2;
    public static final int STATUS_SUCCESS = 0;

    void checkLocationSettings(qj5 qj5Var, pt2 pt2Var);

    boolean checkServices();

    void getLastLocation(pt2 pt2Var);

    void init(Context context);

    qj5 onCreateLocationRequest();

    rj5 onCreateLocationServicesAPI(Context context, nj5 nj5Var, oj5 oj5Var);

    void removeLocationUpdates(pj5 pj5Var);

    void requestLocationUpdates(qj5 qj5Var, pj5 pj5Var);
}
