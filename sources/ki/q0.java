package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class q0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ x10 c;
    public final /* synthetic */ s0 d;

    public q0(s0 s0Var, LocationManager locationManager, LocationListener[] locationListenerArr, x10 x10Var) {
        this.d = s0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = x10Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(s0.h(location));
    }
}
