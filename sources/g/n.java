package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n extends o {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ r d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, androidx.biometric.e eVar) {
        super(rVar);
        this.d = rVar;
        this.e = eVar;
    }

    @Override // g.o
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

    @Override // g.o
    public final int e() {
        Location location;
        boolean z10;
        long j10;
        Location location2;
        switch (this.c) {
            case 0:
                return ((PowerManager) this.e).isPowerSaveMode() ? 2 : 1;
            default:
                androidx.biometric.e eVar = (androidx.biometric.e) this.e;
                bh.a aVar = (bh.a) eVar.d;
                LocationManager locationManager = (LocationManager) eVar.c;
                if (aVar.b > System.currentTimeMillis()) {
                    z10 = aVar.a;
                } else {
                    Context context = (Context) eVar.b;
                    Location location3 = null;
                    if (f0.c.a(context, "android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
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
                    if (f0.c.a(context, "android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (x.d == null) {
                            x.d = new x();
                        }
                        x xVar = x.d;
                        xVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        xVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z10 = xVar.c == 1;
                        long j11 = xVar.b;
                        long j12 = xVar.a;
                        xVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j13 = xVar.b;
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
                        aVar.a = z10;
                        aVar.b = j10;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
                            z10 = true;
                        }
                    }
                }
                return z10 ? 2 : 1;
        }
    }

    @Override // g.o
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
    public n(r rVar, Context context) {
        super(rVar);
        this.d = rVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
