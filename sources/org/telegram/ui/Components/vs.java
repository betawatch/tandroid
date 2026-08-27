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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vs implements SensorEventListener {
    public int A;
    public int B;
    public long C;
    public boolean E;
    public boolean F;
    public float H;
    public final SensorManager a;
    public final AudioManager b;
    public final Sensor c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f;
    public final PowerManager.WakeLock h;
    public boolean n;
    public boolean r;
    public m61 s;
    public boolean v;
    public long w;
    public int x;
    public int y;
    public long D = 0;
    public float G = -100.0f;
    public final float[] I = new float[3];
    public final float[] J = new float[3];
    public final float[] K = new float[3];

    public vs() {
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
        m61 m61Var = this.s;
        if (m61Var == null) {
            return;
        }
        m61Var.T(this.r ? 0 : 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b5, code lost:
    
        if (r6.isBluetoothScoOn() == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f9  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        char c10;
        char c11;
        char c12;
        long j10;
        Sensor sensor2;
        double d;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        AudioManager audioManager;
        PowerManager.WakeLock wakeLock;
        boolean z12;
        boolean isHeld;
        if (this.n && VoIPService.getSharedInstance() == null) {
            int type = sensorEvent.sensor.getType();
            Sensor sensor3 = this.f;
            Sensor sensor4 = this.e;
            float[] fArr = this.K;
            float[] fArr2 = this.I;
            Sensor sensor5 = this.d;
            float[] fArr3 = this.J;
            if (type == 8) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f10 = this.G;
                float f11 = sensorEvent.values[0];
                if (f10 != f11) {
                    this.F = true;
                }
                this.G = f11;
                if (this.F) {
                    this.E = f11 < 5.0f && f11 != this.c.getMaximumRange();
                }
                sensor2 = sensor3;
                c10 = 0;
                c11 = 2;
                c12 = 1;
                j10 = 0;
            } else {
                Sensor sensor6 = sensorEvent.sensor;
                if (sensor6 == sensor5) {
                    if (this.D == 0) {
                        d = 0.9800000190734863d;
                        c11 = 2;
                        c12 = 1;
                    } else {
                        c11 = 2;
                        c12 = 1;
                        d = 1.0d / (((sensorEvent.timestamp - r8) / 1.0E9d) + 1.0d);
                    }
                    this.D = sensorEvent.timestamp;
                    double d10 = 1.0d - d;
                    float[] fArr4 = sensorEvent.values;
                    j10 = 0;
                    c10 = 0;
                    float f12 = (float) ((fArr4[0] * d10) + (fArr2[0] * d));
                    fArr2[0] = f12;
                    sensor = sensor3;
                    float f13 = (float) ((fArr4[c12] * d10) + (fArr2[c12] * d));
                    fArr2[c12] = f13;
                    float f14 = (float) ((d10 * fArr4[c11]) + (d * fArr2[c11]));
                    fArr2[c11] = f14;
                    fArr3[0] = (fArr4[0] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[c12] = (fArr4[c12] * 0.19999999f) + (f13 * 0.8f);
                    fArr3[c11] = (fArr4[c11] * 0.19999999f) + (f14 * 0.8f);
                    fArr[0] = fArr4[0] - fArr2[0];
                    fArr[c12] = fArr4[c12] - fArr2[c12];
                    fArr[c11] = fArr4[c11] - fArr2[c11];
                } else {
                    sensor = sensor3;
                    c10 = 0;
                    c11 = 2;
                    c12 = 1;
                    j10 = 0;
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
                float f18 = (fArr2[c11] * fArr[c11]) + (fArr2[c12] * fArr[c12]) + (fArr2[c10] * fArr[c10]);
                int i12 = this.A;
                if (i12 != 6 && ((f18 > 0.0f && this.H > 0.0f) || (f18 < 0.0f && this.H < 0.0f))) {
                    if (f18 > 0.0f) {
                        z10 = f18 > 15.0f;
                        i10 = 1;
                    } else {
                        z10 = f18 < -15.0f;
                        i10 = 2;
                    }
                    int i13 = this.y;
                    if (i13 != 0 && i13 != i10) {
                        int i14 = this.x;
                        if (i14 != 6 || !z10) {
                            if (!z10) {
                                this.B++;
                            }
                            if (this.B == 10 || i14 != 6 || i12 != 0) {
                                this.x = 0;
                                this.y = 0;
                                this.A = 0;
                                this.B = 0;
                            }
                        } else if (i12 < 6) {
                            int i15 = i12 + 1;
                            this.A = i15;
                            if (i15 == 6) {
                                this.x = 0;
                                this.y = 0;
                                this.B = 0;
                                this.C = System.currentTimeMillis();
                                if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                    FileLog.d("motion detected");
                                }
                            }
                        }
                    } else if (z10 && i12 == 0 && (i13 == 0 || i13 == i10)) {
                        int i16 = this.x;
                        if (i16 < 6 && !this.E) {
                            this.y = i10;
                            int i17 = i16 + 1;
                            this.x = i17;
                            if (i17 == 6) {
                                this.B = 0;
                            }
                        }
                    } else {
                        if (!z10) {
                            this.B++;
                        }
                        if (i13 != i10 || this.B == 10 || this.x != 6 || i12 != 0) {
                            this.A = 0;
                            this.x = 0;
                            this.y = 0;
                            this.B = 0;
                        }
                    }
                }
                this.H = f18;
                this.v = fArr3[c12] > 2.5f && Math.abs(fArr3[c11]) < 4.0f && Math.abs(fArr3[0]) > 1.5f;
            }
            if (this.A == 6 || this.v) {
                this.w = System.currentTimeMillis();
            }
            if (this.A == 6 || this.v || System.currentTimeMillis() - this.w < 60) {
                try {
                    i11 = Build.VERSION.SDK_INT;
                    audioManager = this.b;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (i11 >= 23) {
                    AudioDeviceInfo[] devices = audioManager.getDevices(2);
                    for (AudioDeviceInfo audioDeviceInfo : devices) {
                        int type2 = audioDeviceInfo.getType();
                        if ((type2 == 8 || type2 == 7 || type2 == 26 || type2 == 27 || type2 == 4 || type2 == 3) && audioDeviceInfo.isSink()) {
                            break;
                        }
                    }
                    if (!VoIPService.isAnyKindOfCallActive() && !PhotoViewer.t1().Q1()) {
                        z11 = true;
                        wakeLock = this.h;
                        if (wakeLock != null && !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                            isHeld = wakeLock.isHeld();
                            if (!isHeld && !z11) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("wake lock releasing");
                                }
                                wakeLock.release();
                            } else if (!isHeld && z11) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("wake lock acquiring");
                                }
                                wakeLock.acquire();
                            }
                        }
                        z12 = this.E;
                        if (!z12 && z11) {
                            if (!this.r) {
                                this.r = true;
                                a();
                            }
                            this.A = 0;
                            this.x = 0;
                            this.y = 0;
                            this.B = 0;
                        } else if (z12 || !((sensor5 == null || sensor4 == null) && sensor2 == null && !VoIPService.isAnyKindOfCallActive())) {
                            if (!this.E && this.r) {
                                this.r = false;
                                a();
                            }
                        } else if (!this.r) {
                            this.r = true;
                            a();
                        }
                        if (this.C == j10 && this.A == 6 && Math.abs(System.currentTimeMillis() - this.C) > 1000) {
                            this.A = 0;
                            this.x = 0;
                            this.y = 0;
                            this.B = 0;
                            this.C = j10;
                            return;
                        }
                        return;
                    }
                } else if (!audioManager.isWiredHeadsetOn()) {
                    if (!audioManager.isBluetoothA2dpOn()) {
                    }
                }
            }
            z11 = false;
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
            z12 = this.E;
            if (!z12) {
            }
            if (z12) {
            }
            if (!this.E) {
                this.r = false;
                a();
            }
            if (this.C == j10) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
