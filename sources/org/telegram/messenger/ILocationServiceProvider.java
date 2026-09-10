package org.telegram.messenger;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public interface ILocationServiceProvider {
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 1;
    public static final int PRIORITY_HIGH_ACCURACY = 0;
    public static final int PRIORITY_LOW_POWER = 2;
    public static final int PRIORITY_NO_POWER = 3;
    public static final int STATUS_RESOLUTION_REQUIRED = 1;
    public static final int STATUS_SETTINGS_CHANGE_UNAVAILABLE = 2;
    public static final int STATUS_SUCCESS = 0;

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public interface IAPIConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public interface IAPIOnConnectionFailedListener {
        void onConnectionFailed();
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public interface ILocationListener {
        void onLocationChanged(Location location);
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public interface ILocationRequest {
        void setFastestInterval(long j3);

        void setInterval(long j3);

        void setPriority(int i10);
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public interface IMapApiClient {
        void connect();

        void disconnect();
    }

    void checkLocationSettings(ILocationRequest iLocationRequest, q0.a aVar);

    boolean checkServices();

    void getLastLocation(q0.a aVar);

    void init(Context context);

    ILocationRequest onCreateLocationRequest();

    IMapApiClient onCreateLocationServicesAPI(Context context, IAPIConnectionCallbacks iAPIConnectionCallbacks, IAPIOnConnectionFailedListener iAPIOnConnectionFailedListener);

    void removeLocationUpdates(ILocationListener iLocationListener);

    void requestLocationUpdates(ILocationRequest iLocationRequest, ILocationListener iLocationListener);
}
