package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ld implements LocationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                nd ndVar = (nd) this.b;
                if (location != null) {
                    Location location2 = ndVar.s;
                    if (location2 != null && (this == ndVar.h || this == ndVar.n)) {
                        if (!ndVar.D && location.distanceTo(location2) > 20.0f) {
                            ndVar.m(location);
                            ndVar.w = SystemClock.elapsedRealtime() - 25000;
                            break;
                        }
                    } else {
                        ndVar.m(location);
                        break;
                    }
                }
                break;
            default:
                j2.f fVar = (j2.f) this.b;
                if (location != null && ((ms) fVar.e) != null) {
                    if (v2.a) {
                        f8.b("found location " + location);
                    }
                    fVar.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((mz) fVar.a).F(location);
                        ms msVar = (ms) fVar.e;
                        if (msVar != null) {
                            i0.r(msVar);
                        }
                        fVar.j();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        int i10 = this.a;
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        int i10 = this.a;
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
        int i11 = this.a;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }

    private final void d(String str) {
    }

    private final void e(String str, int i10, Bundle bundle) {
    }

    private final void f(String str, int i10, Bundle bundle) {
    }
}
