// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ct3 implements SensorEventListener {
    public byte E;
    public int F;
    public int G;
    public long H;
    public boolean J;
    public boolean K;
    public float M;
    public final SensorManager a;
    public final AudioManager b;
    public final Sensor c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f;
    public final PowerManager.WakeLock h;
    public boolean n;
    public boolean r;
    public kfc s;
    public boolean w;
    public long x;
    public int y;
    public long I = 0;
    public float L = -100.0f;
    public final float[] N = new float[3];
    public final float[] O = new float[3];
    public final float[] P = new float[3];

    public ct3() {
        SensorManager sensorManager = (SensorManager) a.b.getSystemService("sensor");
        this.a = sensorManager;
        this.c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (f11.a) {
                cc4.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f = null;
        }
        this.h = ((PowerManager) a.b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.b = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public final void a() {
        kfc kfcVar = this.s;
        if (kfcVar == null) {
            return;
        }
        kfcVar.w0(this.r ? 0 : 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        byte b;
        byte b2;
        byte b3;
        long j;
        Sensor sensor2;
        double d;
        byte b4;
        byte b5;
        boolean z;
        PowerManager.WakeLock wakeLock;
        if (!this.n || VoIPService.getSharedInstance() != null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        Sensor sensor3 = this.f;
        Sensor sensor4 = this.e;
        float[] fArr = this.P;
        float[] fArr2 = this.N;
        Sensor sensor5 = this.d;
        float[] fArr3 = this.O;
        if (type == 8) {
            if (f11.a) {
                cc4.b("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
            }
            float f = this.L;
            float f2 = sensorEvent.values[0];
            if (f != f2) {
                this.K = true;
            }
            this.L = f2;
            if (this.K) {
                this.J = f2 < 5.0f && f2 != this.c.getMaximumRange();
            }
            sensor2 = sensor3;
            b = 1;
            b2 = 0;
            b3 = 2;
            j = 0;
        } else {
            Sensor sensor6 = sensorEvent.sensor;
            if (sensor6 == sensor5) {
                if (this.I == 0) {
                    d = 0.9800000190734863d;
                    b = 1;
                    b3 = 2;
                } else {
                    b = 1;
                    b3 = 2;
                    d = 1.0d / (((sensorEvent.timestamp - r8) / 1.0E9d) + 1.0d);
                }
                this.I = sensorEvent.timestamp;
                double d2 = 1.0d - d;
                float[] fArr4 = sensorEvent.values;
                j = 0;
                b2 = 0;
                float f3 = (float) ((fArr4[0] * d2) + (fArr2[0] * d));
                fArr2[0] = f3;
                sensor = sensor3;
                float f4 = (float) ((fArr4[b == true ? 1 : 0] * d2) + (fArr2[b == true ? 1 : 0] * d));
                fArr2[b == true ? 1 : 0] = f4;
                float f5 = (float) ((d2 * fArr4[b3]) + (d * fArr2[b3]));
                fArr2[b3] = f5;
                fArr3[0] = (fArr4[0] * 0.19999999f) + (f3 * 0.8f);
                fArr3[b == true ? 1 : 0] = (fArr4[b == true ? 1 : 0] * 0.19999999f) + (f4 * 0.8f);
                fArr3[b3] = (fArr4[b3] * 0.19999999f) + (f5 * 0.8f);
                fArr[0] = fArr4[0] - fArr2[0];
                fArr[b == true ? 1 : 0] = fArr4[b == true ? 1 : 0] - fArr2[b == true ? 1 : 0];
                fArr[b3] = fArr4[b3] - fArr2[b3];
            } else {
                sensor = sensor3;
                b = 1;
                b2 = 0;
                b3 = 2;
                j = 0;
                if (sensor6 == sensor4) {
                    float[] fArr5 = sensorEvent.values;
                    fArr[0] = fArr5[0];
                    fArr[1] = fArr5[1];
                    fArr[2] = fArr5[2];
                } else {
                    sensor2 = sensor;
                    if (sensor6 == sensor2) {
                        float[] fArr6 = sensorEvent.values;
                        float f6 = fArr6[0];
                        fArr2[0] = f6;
                        fArr3[0] = f6;
                        float f7 = fArr6[1];
                        fArr2[1] = f7;
                        fArr3[1] = f7;
                        float f8 = fArr6[2];
                        fArr2[2] = f8;
                        fArr3[2] = f8;
                    }
                }
            }
            sensor2 = sensor;
        }
        Sensor sensor7 = sensorEvent.sensor;
        if (sensor7 == sensor4 || sensor7 == sensor2 || sensor7 == sensor5) {
            float f9 = (fArr2[b3] * fArr[b3]) + (fArr2[b] * fArr[b]) + (fArr2[b2] * fArr[b2]);
            int i = this.F;
            if (i != 6 && ((f9 > 0.0f && this.M > 0.0f) || (f9 < 0.0f && this.M < 0.0f))) {
                if (f9 > 0.0f) {
                    b4 = f9 > 15.0f ? b : b2;
                    b5 = b;
                } else {
                    b4 = f9 < -15.0f ? b : b2;
                    b5 = b3;
                }
                byte b6 = this.E;
                if (b6 != 0 && b6 != b5) {
                    int i2 = this.y;
                    if (i2 != 6 || b4 == 0) {
                        if (b4 == 0) {
                            this.G++;
                        }
                        if (this.G == 10 || i2 != 6 || i != 0) {
                            this.y = 0;
                            this.E = (byte) 0;
                            this.F = 0;
                            this.G = 0;
                        }
                    } else if (i < 6) {
                        int i3 = i + 1;
                        this.F = i3;
                        if (i3 == 6) {
                            byte b7 = b2;
                            this.y = b7;
                            this.E = b7;
                            this.G = b7;
                            this.H = System.currentTimeMillis();
                            boolean z2 = f11.a;
                        }
                    }
                } else if (b4 != 0 && i == 0 && (b6 == 0 || b6 == b5)) {
                    int i4 = this.y;
                    if (i4 < 6 && !this.J) {
                        this.E = b5;
                        int i5 = i4 + 1;
                        this.y = i5;
                        if (i5 == 6) {
                            this.G = 0;
                        }
                    }
                } else {
                    if (b4 == 0) {
                        this.G++;
                    }
                    if (b6 != b5 || this.G == 10 || this.y != 6 || i != 0) {
                        this.F = 0;
                        this.y = 0;
                        this.E = (byte) 0;
                        this.G = 0;
                    }
                }
            }
            this.M = f9;
            this.w = (fArr3[b] <= 2.5f || Math.abs(fArr3[b3]) >= 4.0f || Math.abs(fArr3[0]) <= 1.5f) ? false : b;
        }
        if (this.F == 6 || this.w) {
            this.x = System.currentTimeMillis();
        }
        if (this.F == 6 || this.w || System.currentTimeMillis() - this.x < 60) {
            try {
                for (AudioDeviceInfo audioDeviceInfo : this.b.getDevices(b3)) {
                    int type2 = audioDeviceInfo.getType();
                    if ((type2 == 8 || type2 == 7 || type2 == 26 || type2 == 27 || type2 == 4 || type2 == 3) && audioDeviceInfo.isSink()) {
                        break;
                    }
                }
            } catch (Exception e) {
                cc4.g(e, b);
            }
            if (!VoIPService.isAnyKindOfCallActive() && !PhotoViewer.q0().V0()) {
                z = true;
                wakeLock = this.h;
                if (wakeLock != null && !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    if (wakeLock.isHeld()) {
                        if (z) {
                            if (f11.a) {
                                cc4.b("wake lock acquiring");
                            }
                            wakeLock.acquire();
                        }
                    } else if (!z) {
                        if (f11.a) {
                            cc4.b("wake lock releasing");
                        }
                        wakeLock.release();
                    }
                }
                if (this.J) {
                    if (z) {
                        if (!this.r) {
                            this.r = true;
                            a();
                        }
                        this.F = 0;
                        this.y = 0;
                        this.E = (byte) 0;
                        this.G = 0;
                    } else if ((sensor5 == null || sensor4 == null) && sensor2 == null && !VoIPService.isAnyKindOfCallActive()) {
                        if (!this.r) {
                            this.r = true;
                            a();
                        }
                    }
                    if (this.H == j || this.F != 6 || Math.abs(System.currentTimeMillis() - this.H) <= 1000) {
                        return;
                    }
                    this.F = 0;
                    this.y = 0;
                    this.E = (byte) 0;
                    this.G = 0;
                    this.H = j;
                    return;
                }
                if (!this.J && this.r) {
                    this.r = false;
                    a();
                }
                if (this.H == j) {
                    return;
                } else {
                    return;
                }
            }
        }
        z = false;
        wakeLock = this.h;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
            }
        }
        if (this.J) {
        }
        if (!this.J) {
            this.r = false;
            a();
        }
        if (this.H == j) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
