package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class pd implements LocationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pd(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                rd rdVar = (rd) this.b;
                if (location != null) {
                    Location location2 = rdVar.s;
                    if (location2 != null && (this == rdVar.h || this == rdVar.n)) {
                        if (!rdVar.E && location.distanceTo(location2) > 20.0f) {
                            rdVar.m(location);
                            rdVar.w = SystemClock.elapsedRealtime() - 25000;
                            break;
                        }
                    } else {
                        rdVar.m(location);
                        break;
                    }
                }
                break;
            default:
                a8.b8 b8Var = (a8.b8) this.b;
                if (location != null && ((yr) b8Var.e) != null) {
                    if (s2.a) {
                        a8.b("found location " + location);
                    }
                    b8Var.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((wy) b8Var.a).f(location);
                        yr yrVar = (yr) b8Var.e;
                        if (yrVar != null) {
                            g0.r(yrVar);
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
