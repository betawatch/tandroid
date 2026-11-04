package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class jd implements LocationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jd(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                ld ldVar = (ld) this.b;
                if (location != null) {
                    Location location2 = ldVar.s;
                    if (location2 != null && (this == ldVar.h || this == ldVar.n)) {
                        if (!ldVar.E && location.distanceTo(location2) > 20.0f) {
                            ldVar.m(location);
                            ldVar.w = SystemClock.elapsedRealtime() - 25000;
                            break;
                        }
                    } else {
                        ldVar.m(location);
                        break;
                    }
                }
                break;
            default:
                l2.e eVar = (l2.e) this.b;
                if (location != null && ((vs) eVar.e) != null) {
                    if (r2.a) {
                        a8.b("found location " + location);
                    }
                    eVar.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((uy) eVar.a).B(location);
                        vs vsVar = (vs) eVar.e;
                        if (vsVar != null) {
                            g0.r(vsVar);
                        }
                        eVar.d();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        int i3 = this.a;
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        int i3 = this.a;
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i3, Bundle bundle) {
        int i10 = this.a;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }

    private final void d(String str) {
    }

    private final void e(String str, int i3, Bundle bundle) {
    }

    private final void f(String str, int i3, Bundle bundle) {
    }
}
