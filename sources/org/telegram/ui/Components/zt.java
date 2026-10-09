package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zt implements SensorEventListener {
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
    public k81 s;
    public boolean v;
    public long w;
    public int x;
    public int y;
    public long H = 0;
    public float K = -100.0f;
    public final float[] M = new float[3];
    public final float[] N = new float[3];
    public final float[] O = new float[3];

    public zt() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.a = sensorManager;
        this.c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.e = null;
            this.f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.b = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public final void a() {
        k81 k81Var = this.s;
        if (k81Var == null) {
            return;
        }
        k81Var.S(this.r ? 0 : 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02dd  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        int i10;
        int i11;
        int i12;
        long j3;
        Sensor sensor2;
        double d;
        int i13;
        int i14;
        boolean z10;
        PowerManager.WakeLock wakeLock;
        boolean z11;
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
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f7 = this.K;
                float f10 = sensorEvent.values[0];
                if (f7 != f10) {
                    this.J = true;
                }
                this.K = f10;
                if (this.J) {
                    this.I = f10 < 5.0f && f10 != this.c.getMaximumRange();
                }
                sensor2 = sensor3;
                i10 = 1;
                i11 = 0;
                i12 = 2;
                j3 = 0;
            } else {
                Sensor sensor6 = sensorEvent.sensor;
                if (sensor6 == sensor5) {
                    if (this.H == 0) {
                        d = 0.9800000190734863d;
                        i10 = 1;
                        i12 = 2;
                    } else {
                        i10 = 1;
                        i12 = 2;
                        d = 1.0d / (((sensorEvent.timestamp - r8) / 1.0E9d) + 1.0d);
                    }
                    this.H = sensorEvent.timestamp;
                    double d10 = 1.0d - d;
                    float[] fArr4 = sensorEvent.values;
                    j3 = 0;
                    i11 = 0;
                    float f11 = (float) ((fArr4[0] * d10) + (fArr2[0] * d));
                    fArr2[0] = f11;
                    sensor = sensor3;
                    float f12 = (float) ((fArr4[i10 == true ? 1 : 0] * d10) + (fArr2[i10 == true ? 1 : 0] * d));
                    fArr2[i10 == true ? 1 : 0] = f12;
                    float f13 = (float) ((d10 * fArr4[i12]) + (d * fArr2[i12]));
                    fArr2[i12] = f13;
                    fArr3[0] = (fArr4[0] * 0.19999999f) + (f11 * 0.8f);
                    fArr3[i10 == true ? 1 : 0] = (fArr4[i10 == true ? 1 : 0] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[i12] = (fArr4[i12] * 0.19999999f) + (f13 * 0.8f);
                    fArr[0] = fArr4[0] - fArr2[0];
                    fArr[i10 == true ? 1 : 0] = fArr4[i10 == true ? 1 : 0] - fArr2[i10 == true ? 1 : 0];
                    fArr[i12] = fArr4[i12] - fArr2[i12];
                } else {
                    sensor = sensor3;
                    i10 = 1;
                    i11 = 0;
                    i12 = 2;
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
                            float f14 = fArr6[0];
                            fArr2[0] = f14;
                            fArr3[0] = f14;
                            float f15 = fArr6[1];
                            fArr2[1] = f15;
                            fArr3[1] = f15;
                            float f16 = fArr6[2];
                            fArr2[2] = f16;
                            fArr3[2] = f16;
                        }
                    }
                }
                sensor2 = sensor;
            }
            Sensor sensor7 = sensorEvent.sensor;
            if (sensor7 == sensor4 || sensor7 == sensor2 || sensor7 == sensor5) {
                float f17 = (fArr2[i12] * fArr[i12]) + (fArr2[i10] * fArr[i10]) + (fArr2[i11] * fArr[i11]);
                int i15 = this.E;
                if (i15 != 6 && ((f17 > 0.0f && this.L > 0.0f) || (f17 < 0.0f && this.L < 0.0f))) {
                    if (f17 > 0.0f) {
                        i13 = f17 > 15.0f ? i10 : i11;
                        i14 = i10;
                    } else {
                        i13 = f17 < -15.0f ? i10 : i11;
                        i14 = i12;
                    }
                    int i16 = this.y;
                    if (i16 != 0 && i16 != i14) {
                        int i17 = this.x;
                        if (i17 != 6 || i13 == 0) {
                            if (i13 == 0) {
                                this.F++;
                            }
                            if (this.F == 10 || i17 != 6 || i15 != 0) {
                                this.x = 0;
                                this.y = 0;
                                this.E = 0;
                                this.F = 0;
                            }
                        } else if (i15 < 6) {
                            int i18 = i15 + 1;
                            this.E = i18;
                            if (i18 == 6) {
                                int i19 = i11;
                                this.x = i19;
                                this.y = i19;
                                this.F = i19;
                                this.G = System.currentTimeMillis();
                                if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                    FileLog.d("motion detected");
                                }
                            }
                        }
                    } else if (i13 != 0 && i15 == 0 && (i16 == 0 || i16 == i14)) {
                        int i20 = this.x;
                        if (i20 < 6 && !this.I) {
                            this.y = i14;
                            int i21 = i20 + 1;
                            this.x = i21;
                            if (i21 == 6) {
                                this.F = 0;
                            }
                        }
                    } else {
                        if (i13 == 0) {
                            this.F++;
                        }
                        if (i16 != i14 || this.F == 10 || this.x != 6 || i15 != 0) {
                            this.E = 0;
                            this.x = 0;
                            this.y = 0;
                            this.F = 0;
                        }
                    }
                }
                this.L = f17;
                this.v = (fArr3[i10] <= 2.5f || Math.abs(fArr3[i12]) >= 4.0f || Math.abs(fArr3[0]) <= 1.5f) ? false : i10;
            }
            if (this.E == 6 || this.v) {
                this.w = System.currentTimeMillis();
            }
            if (this.E == 6 || this.v || System.currentTimeMillis() - this.w < 60) {
                try {
                    for (AudioDeviceInfo audioDeviceInfo : this.b.getDevices(i12)) {
                        int type2 = audioDeviceInfo.getType();
                        if ((type2 == 8 || type2 == 7 || type2 == 26 || type2 == 27 || type2 == 4 || type2 == 3) && audioDeviceInfo.isSink()) {
                            break;
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (!VoIPService.isAnyKindOfCallActive() && !PhotoViewer.t1().R1()) {
                    z10 = i10;
                    wakeLock = this.h;
                    if (wakeLock != null && !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        isHeld = wakeLock.isHeld();
                        if (!isHeld && !z10) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("wake lock releasing");
                            }
                            wakeLock.release();
                        } else if (!isHeld && z10) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("wake lock acquiring");
                            }
                            wakeLock.acquire();
                        }
                    }
                    z11 = this.I;
                    if (!z11 && z10) {
                        if (!this.r) {
                            this.r = i10;
                            a();
                        }
                        this.E = 0;
                        this.x = 0;
                        this.y = 0;
                        this.F = 0;
                    } else if (z11 || !((sensor5 == null || sensor4 == null) && sensor2 == null && !VoIPService.isAnyKindOfCallActive())) {
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
                        this.x = 0;
                        this.y = 0;
                        this.F = 0;
                        this.G = j3;
                        return;
                    }
                    return;
                }
            }
            z10 = false;
            wakeLock = this.h;
            if (wakeLock != null) {
                isHeld = wakeLock.isHeld();
                if (!isHeld) {
                }
                if (!isHeld) {
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    wakeLock.acquire();
                }
            }
            z11 = this.I;
            if (!z11) {
            }
            if (z11) {
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
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
