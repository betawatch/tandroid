package hi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
