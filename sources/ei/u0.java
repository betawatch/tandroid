package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class u0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = callback;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.run(w0.h(location));
    }
}
