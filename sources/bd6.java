// default package

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import org.telegram.messenger.a;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bd6 implements LocationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bd6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                dd6 dd6Var = (dd6) this.b;
                if (location != null) {
                    Location location2 = dd6Var.s;
                    if (location2 != null && (this == dd6Var.h || this == dd6Var.n)) {
                        if (!dd6Var.E && location.distanceTo(location2) > 20.0f) {
                            dd6Var.m(location);
                            dd6Var.w = SystemClock.elapsedRealtime() - 25000;
                            break;
                        }
                    } else {
                        dd6Var.m(location);
                        break;
                    }
                }
                break;
            case 1:
                eq eqVar = (eq) this.b;
                if (location != null && ((c0a) eqVar.e) != null) {
                    if (e21.a) {
                        fc4.b("found location " + location);
                    }
                    eqVar.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((w5a) eqVar.a).U(location);
                        c0a c0aVar = (c0a) eqVar.e;
                        if (c0aVar != null) {
                            gm.r(c0aVar);
                        }
                        eqVar.c();
                        break;
                    }
                }
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.b;
                if (location != null) {
                    themeActivity.M0 = false;
                    LocationManager locationManager = (LocationManager) a.b.getSystemService("location");
                    locationManager.removeUpdates(themeActivity.S0);
                    locationManager.removeUpdates(themeActivity.T0);
                    themeActivity.G0(location, false);
                    break;
                }
                break;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        byte b = this.a;
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        byte b = this.a;
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        byte b = this.a;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }

    private final void d(String str) {
    }

    private final void e(String str) {
    }

    private final void f(String str) {
    }

    private final void g(String str, int i, Bundle bundle) {
    }

    private final void h(String str, int i, Bundle bundle) {
    }

    private final void i(String str, int i, Bundle bundle) {
    }
}
