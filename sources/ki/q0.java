package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class q0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ z10 c;
    public final /* synthetic */ s0 d;

    public q0(s0 s0Var, LocationManager locationManager, LocationListener[] locationListenerArr, z10 z10Var) {
        this.d = s0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = z10Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(s0.h(location));
    }
}
