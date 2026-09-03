package org.telegram.messenger;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public interface ILocationServiceProvider {
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 1;
    public static final int PRIORITY_HIGH_ACCURACY = 0;
    public static final int PRIORITY_LOW_POWER = 2;
    public static final int PRIORITY_NO_POWER = 3;
    public static final int STATUS_RESOLUTION_REQUIRED = 1;
    public static final int STATUS_SETTINGS_CHANGE_UNAVAILABLE = 2;
    public static final int STATUS_SUCCESS = 0;

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public interface IAPIConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public interface IAPIOnConnectionFailedListener {
        void onConnectionFailed();
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public interface ILocationListener {
        void onLocationChanged(Location location);
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public interface ILocationRequest {
        void setFastestInterval(long j10);

        void setInterval(long j10);

        void setPriority(int i10);
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
