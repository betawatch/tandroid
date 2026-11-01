package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class md implements LocationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ md(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                od odVar = (od) this.b;
                if (location != null) {
                    Location location2 = odVar.s;
                    if (location2 != null && (this == odVar.h || this == odVar.n)) {
                        if (!odVar.D && location.distanceTo(location2) > 20.0f) {
                            odVar.m(location);
                            odVar.w = SystemClock.elapsedRealtime() - 25000;
                            break;
                        }
                    } else {
                        odVar.m(location);
                        break;
                    }
                }
                break;
            default:
                j2.f fVar = (j2.f) this.b;
                if (location != null && ((ns) fVar.e) != null) {
                    if (v2.a) {
                        f8.b("found location " + location);
                    }
                    fVar.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((nz) fVar.a).F(location);
                        ns nsVar = (ns) fVar.e;
                        if (nsVar != null) {
                            i0.r(nsVar);
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
