package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
