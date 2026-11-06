package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class qd implements LocationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qd(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                sd sdVar = (sd) this.b;
                if (location != null) {
                    Location location2 = sdVar.s;
                    if (location2 != null && (this == sdVar.h || this == sdVar.n)) {
                        if (!sdVar.D && location.distanceTo(location2) > 20.0f) {
                            sdVar.m(location);
                            sdVar.w = SystemClock.elapsedRealtime() - 25000;
                            break;
                        }
                    } else {
                        sdVar.m(location);
                        break;
                    }
                }
                break;
            default:
                a8.b8 b8Var = (a8.b8) this.b;
                if (location != null && ((ds) b8Var.e) != null) {
                    if (r2.a) {
                        a8.b("found location " + location);
                    }
                    b8Var.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((cz) b8Var.a).K(location);
                        ds dsVar = (ds) b8Var.e;
                        if (dsVar != null) {
                            g0.r(dsVar);
                        }
                        b8Var.d();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        int i7 = this.a;
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        int i7 = this.a;
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i7, Bundle bundle) {
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

    private final void e(String str, int i7, Bundle bundle) {
    }

    private final void f(String str, int i7, Bundle bundle) {
    }
}
