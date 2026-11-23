package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class aa implements ra {
    public LocationRequest a;

    public final void a() {
        this.a.c = 1000L;
    }

    public final void b() {
        LocationRequest locationRequest = this.a;
        long j3 = locationRequest.c;
        long j10 = locationRequest.b;
        if (j3 == j10 / 6) {
            locationRequest.c = 166L;
        }
        if (locationRequest.r == j10) {
            locationRequest.r = 1000L;
        }
        locationRequest.b = 1000L;
    }

    public final void c() {
        this.a.a = 100;
    }
}
