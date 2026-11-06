package hi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class p0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ c20 c;
    public final /* synthetic */ r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, c20 c20Var) {
        this.d = r0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = c20Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(r0.h(location));
    }
}
