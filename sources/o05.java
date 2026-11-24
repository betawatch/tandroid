// default package

import com.google.android.gms.location.LocationRequest;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o05 implements nj5 {
    public LocationRequest a;

    public final void a() {
        this.a.c = 1000L;
    }

    public final void b() {
        LocationRequest locationRequest = this.a;
        long j = locationRequest.c;
        long j2 = locationRequest.b;
        if (j == j2 / 6) {
            locationRequest.c = 166L;
        }
        if (locationRequest.r == j2) {
            locationRequest.r = 1000L;
        }
        locationRequest.b = 1000L;
    }

    public final void c() {
        this.a.a = 100;
    }
}
