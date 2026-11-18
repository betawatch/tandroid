package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class z9 implements qa {
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
