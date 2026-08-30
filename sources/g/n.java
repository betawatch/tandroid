package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n extends f2.v {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ q d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, androidx.biometric.e eVar) {
        super(qVar);
        this.d = qVar;
        this.e = eVar;
    }

    @Override // f2.v
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // f2.v
    public final int e() {
        Location location;
        boolean z4;
        long j10;
        Location location2;
        switch (this.c) {
            case 0:
                return ((PowerManager) this.e).isPowerSaveMode() ? 2 : 1;
            default:
                androidx.biometric.e eVar = (androidx.biometric.e) this.e;
                x xVar = (x) eVar.d;
                LocationManager locationManager = (LocationManager) eVar.c;
                if (xVar.a > System.currentTimeMillis()) {
                    z4 = xVar.b;
                } else {
                    Context context = (Context) eVar.b;
                    Location location3 = null;
                    if (f0.f.a(context, "android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (f0.f.a(context, "android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e6) {
                            Log.d("TwilightManager", "Failed to get last known location", e6);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (w.d == null) {
                            w.d = new w();
                        }
                        w wVar = w.d;
                        wVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        wVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z4 = wVar.c == 1;
                        long j11 = wVar.b;
                        long j12 = wVar.a;
                        wVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j13 = wVar.b;
                        if (j11 == -1 || j12 == -1) {
                            j10 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j12) {
                                j11 = j13;
                            } else if (currentTimeMillis > j11) {
                                j11 = j12;
                            }
                            j10 = j11 + 60000;
                        }
                        xVar.b = z4;
                        xVar.a = j10;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
                            z4 = true;
                        }
                    }
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // f2.v
    public final void k() {
        switch (this.c) {
            case 0:
                this.d.d(true);
                break;
            default:
                this.d.d(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Context context) {
        super(qVar);
        this.d = qVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
