package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class js implements SensorEventListener {
    public int D;
    public int E;
    public int F;
    public long G;
    public boolean I;
    public boolean J;
    public float L;
    public final SensorManager a;
    public final AudioManager b;
    public final Sensor c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f;
    public final PowerManager.WakeLock h;
    public boolean n;
    public boolean r;
    public t51 s;
    public boolean w;
    public long x;
    public int y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public js() {
        SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.b.getSystemService("sensor");
        this.a = sensorManager;
        this.c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f = null;
        }
        this.h = ((PowerManager) org.telegram.messenger.t0.b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.b = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public final void a() {
        t51 t51Var = this.s;
        if (t51Var == null) {
            return;
        }
        t51Var.x0(this.r ? 0 : 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d3  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        int i7;
        int i10;
        int i11;
        long j3;
        Sensor sensor2;
        double d;
        int i12;
        int i13;
        boolean z9;
        PowerManager.WakeLock wakeLock;
        boolean z10;
        boolean isHeld;
        if (this.n && VoIPService.getSharedInstance() == null) {
            int type = sensorEvent.sensor.getType();
            Sensor sensor3 = this.f;
            Sensor sensor4 = this.e;
            float[] fArr = this.O;
            float[] fArr2 = this.M;
            Sensor sensor5 = this.d;
            float[] fArr3 = this.N;
            if (type == 8) {
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f10 = this.K;
                float f11 = sensorEvent.values[0];
                if (f10 != f11) {
                    this.J = true;
                }
                this.K = f11;
                if (this.J) {
                    this.I = f11 < 5.0f && f11 != this.c.getMaximumRange();
                }
                sensor2 = sensor3;
                i7 = 1;
                i10 = 0;
                i11 = 2;
                j3 = 0;
            } else {
                Sensor sensor6 = sensorEvent.sensor;
                if (sensor6 == sensor5) {
                    if (this.H == 0) {
                        d = 0.9800000190734863d;
                        i7 = 1;
                        i11 = 2;
                    } else {
                        i7 = 1;
                        i11 = 2;
                        d = 1.0d / (((sensorEvent.timestamp - r8) / 1.0E9d) + 1.0d);
                    }
                    this.H = sensorEvent.timestamp;
                    double d2 = 1.0d - d;
                    float[] fArr4 = sensorEvent.values;
                    j3 = 0;
                    i10 = 0;
                    float f12 = (float) ((fArr4[0] * d2) + (fArr2[0] * d));
                    fArr2[0] = f12;
                    sensor = sensor3;
                    float f13 = (float) ((fArr4[i7 == true ? 1 : 0] * d2) + (fArr2[i7 == true ? 1 : 0] * d));
                    fArr2[i7 == true ? 1 : 0] = f13;
                    float f14 = (float) ((d2 * fArr4[i11]) + (d * fArr2[i11]));
                    fArr2[i11] = f14;
                    fArr3[0] = (fArr4[0] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[i7 == true ? 1 : 0] = (fArr4[i7 == true ? 1 : 0] * 0.19999999f) + (f13 * 0.8f);
                    fArr3[i11] = (fArr4[i11] * 0.19999999f) + (f14 * 0.8f);
                    fArr[0] = fArr4[0] - fArr2[0];
                    fArr[i7 == true ? 1 : 0] = fArr4[i7 == true ? 1 : 0] - fArr2[i7 == true ? 1 : 0];
                    fArr[i11] = fArr4[i11] - fArr2[i11];
                } else {
                    sensor = sensor3;
                    i7 = 1;
                    i10 = 0;
                    i11 = 2;
                    j3 = 0;
                    if (sensor6 == sensor4) {
                        float[] fArr5 = sensorEvent.values;
                        fArr[0] = fArr5[0];
                        fArr[1] = fArr5[1];
                        fArr[2] = fArr5[2];
                    } else {
                        sensor2 = sensor;
                        if (sensor6 == sensor2) {
                            float[] fArr6 = sensorEvent.values;
                            float f15 = fArr6[0];
                            fArr2[0] = f15;
                            fArr3[0] = f15;
                            float f16 = fArr6[1];
                            fArr2[1] = f16;
                            fArr3[1] = f16;
                            float f17 = fArr6[2];
                            fArr2[2] = f17;
                            fArr3[2] = f17;
                        }
                    }
                }
                sensor2 = sensor;
            }
            Sensor sensor7 = sensorEvent.sensor;
            if (sensor7 == sensor4 || sensor7 == sensor2 || sensor7 == sensor5) {
                float f18 = (fArr2[i11] * fArr[i11]) + (fArr2[i7] * fArr[i7]) + (fArr2[i10] * fArr[i10]);
                int i14 = this.E;
                if (i14 != 6 && ((f18 > 0.0f && this.L > 0.0f) || (f18 < 0.0f && this.L < 0.0f))) {
                    if (f18 > 0.0f) {
                        i12 = f18 > 15.0f ? i7 : i10;
                        i13 = i7;
                    } else {
                        i12 = f18 < -15.0f ? i7 : i10;
                        i13 = i11;
                    }
                    int i15 = this.D;
                    if (i15 != 0 && i15 != i13) {
                        int i16 = this.y;
                        if (i16 != 6 || i12 == 0) {
                            if (i12 == 0) {
                                this.F++;
                            }
                            if (this.F == 10 || i16 != 6 || i14 != 0) {
                                this.y = 0;
                                this.D = 0;
                                this.E = 0;
                                this.F = 0;
                            }
                        } else if (i14 < 6) {
                            int i17 = i14 + 1;
                            this.E = i17;
                            if (i17 == 6) {
                                int i18 = i10;
                                this.y = i18;
                                this.D = i18;
                                this.F = i18;
                                this.G = System.currentTimeMillis();
                                boolean z11 = org.telegram.messenger.r2.a;
                            }
                        }
                    } else if (i12 != 0 && i14 == 0 && (i15 == 0 || i15 == i13)) {
                        int i19 = this.y;
                        if (i19 < 6 && !this.I) {
                            this.D = i13;
                            int i20 = i19 + 1;
                            this.y = i20;
                            if (i20 == 6) {
                                this.F = 0;
                            }
                        }
                    } else {
                        if (i12 == 0) {
                            this.F++;
                        }
                        if (i15 != i13 || this.F == 10 || this.y != 6 || i14 != 0) {
                            this.E = 0;
                            this.y = 0;
                            this.D = 0;
                            this.F = 0;
                        }
                    }
                }
                this.L = f18;
                this.w = (fArr3[i7] <= 2.5f || Math.abs(fArr3[i11]) >= 4.0f || Math.abs(fArr3[0]) <= 1.5f) ? false : i7;
            }
            if (this.E == 6 || this.w) {
                this.x = System.currentTimeMillis();
            }
            if (this.E == 6 || this.w || System.currentTimeMillis() - this.x < 60) {
                try {
                    for (AudioDeviceInfo audioDeviceInfo : this.b.getDevices(i11)) {
                        int type2 = audioDeviceInfo.getType();
                        if ((type2 == 8 || type2 == 7 || type2 == 26 || type2 == 27 || type2 == 4 || type2 == 3) && audioDeviceInfo.isSink()) {
                            break;
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, i7);
                }
                if (!VoIPService.isAnyKindOfCallActive() && !PhotoViewer.p1().P1()) {
                    z9 = true;
                    wakeLock = this.h;
                    if (wakeLock != null && !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        isHeld = wakeLock.isHeld();
                        if (!isHeld && !z9) {
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.a8.b("wake lock releasing");
                            }
                            wakeLock.release();
                        } else if (!isHeld && z9) {
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.a8.b("wake lock acquiring");
                            }
                            wakeLock.acquire();
                        }
                    }
                    z10 = this.I;
                    if (!z10 && z9) {
                        if (!this.r) {
                            this.r = true;
                            a();
                        }
                        this.E = 0;
                        this.y = 0;
                        this.D = 0;
                        this.F = 0;
                    } else if (z10 || !((sensor5 == null || sensor4 == null) && sensor2 == null && !VoIPService.isAnyKindOfCallActive())) {
                        if (!this.I && this.r) {
                            this.r = false;
                            a();
                        }
                    } else if (!this.r) {
                        this.r = true;
                        a();
                    }
                    if (this.G == j3 && this.E == 6 && Math.abs(System.currentTimeMillis() - this.G) > 1000) {
                        this.E = 0;
                        this.y = 0;
                        this.D = 0;
                        this.F = 0;
                        this.G = j3;
                        return;
                    }
                    return;
                }
            }
            z9 = false;
            wakeLock = this.h;
            if (wakeLock != null) {
                isHeld = wakeLock.isHeld();
                if (!isHeld) {
                }
                if (!isHeld) {
                    if (org.telegram.messenger.r2.a) {
                    }
                    wakeLock.acquire();
                }
            }
            z10 = this.I;
            if (!z10) {
            }
            if (z10) {
            }
            if (!this.I) {
                this.r = false;
                a();
            }
            if (this.G == j3) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
