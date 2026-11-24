// default package

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.SystemClock;
import android.view.WindowManager;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iq2 implements SensorEventListener {
    public float E;
    public boolean F;
    public float G;
    public boolean H;
    public long I;
    public final yb6 a;
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

    public iq2(yb6 yb6Var) {
        this.a = yb6Var;
    }

    public final void a(Location location) {
        if (location == null) {
            return;
        }
        try {
            this.y = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis()).getDeclination();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008d  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        int i2;
        int i3;
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
            windowManager = (WindowManager) a.b.getSystemService("window");
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (windowManager != null && windowManager.getDefaultDisplay() != null) {
            i = windowManager.getDefaultDisplay().getRotation();
            i2 = nm7.M1;
            if (i == 1) {
                i3 = nm7.N1;
                if (i != 2) {
                    if (i != 3) {
                        i3 = 2;
                        i2 = 1;
                    } else {
                        i2 = 130;
                        i3 = 1;
                    }
                }
            } else {
                i3 = 129;
                i2 = 2;
            }
            if (SensorManager.remapCoordinateSystem(this.h, i2, i3, this.n)) {
                return;
            }
            float[] fArr2 = this.n;
            float f = fArr2[1] - fArr2[2];
            float f2 = fArr2[4] - fArr2[5];
            if (f == 0.0f && f2 == 0.0f) {
                return;
            }
            float degrees = (((float) Math.toDegrees(Math.atan2(f, f2))) + this.y) % 360.0f;
            if (degrees < 0.0f) {
                degrees += 360.0f;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.F) {
                float exp = 1.0f - ((float) Math.exp((-(this.I == 0 ? 0.02f : Math.min(0.25f, (elapsedRealtime - r9) / 1000.0f))) / 0.12f));
                float f3 = this.E;
                float f4 = (degrees - f3) % 360.0f;
                if (f4 > 180.0f) {
                    f4 -= 360.0f;
                } else if (f4 <= -180.0f) {
                    f4 += 360.0f;
                }
                degrees = ((f4 * exp) + f3) % 360.0f;
                if (degrees < 0.0f) {
                    degrees += 360.0f;
                }
                this.E = degrees;
            } else {
                this.E = degrees;
                this.F = true;
            }
            this.I = elapsedRealtime;
            if (this.H) {
                float f5 = (degrees - this.G) % 360.0f;
                if (f5 > 180.0f) {
                    f5 -= 360.0f;
                } else if (f5 <= -180.0f) {
                    f5 += 360.0f;
                }
                if (Math.abs(f5) < 0.3f) {
                    return;
                }
            }
            this.G = this.E;
            this.H = true;
            this.a.b.Q0(false);
            return;
        }
        i = 0;
        i2 = nm7.M1;
        if (i == 1) {
        }
        if (SensorManager.remapCoordinateSystem(this.h, i2, i3, this.n)) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
