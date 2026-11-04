package ii;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ u10 c;
    public final /* synthetic */ s0 d;

    public q0(s0 s0Var, LocationManager locationManager, LocationListener[] locationListenerArr, u10 u10Var) {
        this.d = s0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = u10Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(s0.h(location));
    }
}
