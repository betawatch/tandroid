package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class p0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ x10 c;
    public final /* synthetic */ r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, x10 x10Var) {
        this.d = r0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = x10Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(r0.h(location));
    }
}
