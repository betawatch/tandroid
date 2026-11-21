package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
