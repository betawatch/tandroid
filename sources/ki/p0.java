package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class p0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ w10 c;
    public final /* synthetic */ r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, w10 w10Var) {
        this.d = r0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = w10Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(r0.h(location));
    }
}
