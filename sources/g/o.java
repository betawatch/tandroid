package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class o extends p {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ s d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, aa.a aVar) {
        super(sVar);
        this.d = sVar;
        this.e = aVar;
    }

    @Override // g.p
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

    @Override // g.p
    public final int e() {
        Location location;
        boolean z10;
        long j3;
        Location location2;
        switch (this.c) {
            case 0:
                return ((PowerManager) this.e).isPowerSaveMode() ? 2 : 1;
            default:
                aa.a aVar = (aa.a) this.e;
                bh.a aVar2 = (bh.a) aVar.d;
                LocationManager locationManager = (LocationManager) aVar.c;
                if (aVar2.b > System.currentTimeMillis()) {
                    z10 = aVar2.a;
                } else {
                    Context context = (Context) aVar.b;
                    Location location3 = null;
                    if (f0.e.a(context, "android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
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
                    if (f0.e.a(context, "android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (y.d == null) {
                            y.d = new y();
                        }
                        y yVar = y.d;
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z10 = yVar.c == 1;
                        long j10 = yVar.b;
                        long j11 = yVar.a;
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j12 = yVar.b;
                        if (j10 == -1 || j11 == -1) {
                            j3 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j11) {
                                j10 = j12;
                            } else if (currentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j3 = j10 + 60000;
                        }
                        aVar2.a = z10;
                        aVar2.b = j3;
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

    @Override // g.p
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
    public o(s sVar, Context context) {
        super(sVar);
        this.d = sVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
