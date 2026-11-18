package bg;

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.SystemClock;
import android.view.WindowManager;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.ui.da0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class m implements SensorEventListener {
    public float E;
    public boolean F;
    public float G;
    public boolean H;
    public long I;
    public final da0 a;
    public SensorManager b;
    public Sensor c;
    public Sensor d;
    public Sensor e;
    public boolean f;
    public final float[] h = new float[9];
    public final float[] n = new float[9];
    public final float[] r = new float[4];
    public final float[] s = new float[3];
    public final float[] w = new float[3];
    public boolean x;
    public float y;

    public m(da0 da0Var) {
        this.a = da0Var;
    }

    public final void a(Location location) {
        if (location == null) {
            return;
        }
        try {
            this.y = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis()).getDeclination();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0091  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        int i10;
        int i11;
        WindowManager windowManager;
        if (!this.f) {
            return;
        }
        if (sensorEvent.sensor.getType() == 11) {
            try {
                float[] fArr = sensorEvent.values;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.r, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.h, this.r);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.h, fArr);
                }
            } catch (Exception unused) {
                return;
            }
        } else if (sensorEvent.sensor.getType() == 1) {
            System.arraycopy(sensorEvent.values, 0, this.s, 0, 3);
            this.x = true;
            return;
        } else {
            if (sensorEvent.sensor.getType() != 2) {
                return;
            }
            System.arraycopy(sensorEvent.values, 0, this.w, 0, 3);
            if (!this.x || !SensorManager.getRotationMatrix(this.h, null, this.s, this.w)) {
                return;
            }
        }
        try {
            windowManager = (WindowManager) org.telegram.messenger.t0.b.getSystemService("window");
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (windowManager != null && windowManager.getDefaultDisplay() != null) {
            i7 = windowManager.getDefaultDisplay().getRotation();
            i10 = ks.N1;
            if (i7 == 1) {
                i11 = ks.O1;
                if (i7 != 2) {
                    if (i7 != 3) {
                        i11 = 2;
                        i10 = 1;
                    } else {
                        i10 = 130;
                        i11 = 1;
                    }
                }
            } else {
                i11 = 129;
                i10 = 2;
            }
            if (SensorManager.remapCoordinateSystem(this.h, i10, i11, this.n)) {
                return;
            }
            float[] fArr2 = this.n;
            float f10 = fArr2[1] - fArr2[2];
            float f11 = fArr2[4] - fArr2[5];
            if (f10 == 0.0f && f11 == 0.0f) {
                return;
            }
            float degrees = (((float) Math.toDegrees(Math.atan2(f10, f11))) + this.y) % 360.0f;
            if (degrees < 0.0f) {
                degrees += 360.0f;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.F) {
                float exp = 1.0f - ((float) Math.exp((-(this.I == 0 ? 0.02f : Math.min(0.25f, (elapsedRealtime - r9) / 1000.0f))) / 0.12f));
                float f12 = this.E;
                float f13 = (degrees - f12) % 360.0f;
                if (f13 > 180.0f) {
                    f13 -= 360.0f;
                } else if (f13 <= -180.0f) {
                    f13 += 360.0f;
                }
                float f14 = ((f13 * exp) + f12) % 360.0f;
                if (f14 < 0.0f) {
                    f14 += 360.0f;
                }
                this.E = f14;
            } else {
                this.E = degrees;
                this.F = true;
            }
            this.I = elapsedRealtime;
            if (this.H) {
                float f15 = (this.E - this.G) % 360.0f;
                if (f15 > 180.0f) {
                    f15 -= 360.0f;
                } else if (f15 <= -180.0f) {
                    f15 += 360.0f;
                }
                if (Math.abs(f15) < 0.3f) {
                    return;
                }
            }
            this.G = this.E;
            this.H = true;
            this.a.b.Q0(false);
            return;
        }
        i7 = 0;
        i10 = ks.N1;
        if (i7 == 1) {
        }
        if (SensorManager.remapCoordinateSystem(this.h, i10, i11, this.n)) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
