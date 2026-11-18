package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class od implements LocationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ od(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                qd qdVar = (qd) this.b;
                if (location != null) {
                    Location location2 = qdVar.s;
                    if (location2 != null && (this == qdVar.h || this == qdVar.n)) {
                        if (!qdVar.E && location.distanceTo(location2) > 20.0f) {
                            qdVar.m(location);
                            qdVar.w = SystemClock.elapsedRealtime() - 25000;
                            break;
                        }
                    } else {
                        qdVar.m(location);
                        break;
                    }
                }
                break;
            default:
                a8.b8 b8Var = (a8.b8) this.b;
                if (location != null && ((xr) b8Var.e) != null) {
                    if (s2.a) {
                        a8.b("found location " + location);
                    }
                    b8Var.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((vy) b8Var.a).f(location);
                        xr xrVar = (xr) b8Var.e;
                        if (xrVar != null) {
                            g0.r(xrVar);
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
