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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class et implements SensorEventListener {
    public int B;
    public int C;
    public long D;
    public boolean F;
    public boolean G;
    public float I;
    public final SensorManager a;
    public final AudioManager b;
    public final Sensor c;
    public final Sensor d;
    public final Sensor e;
    public final Sensor f;
    public final PowerManager.WakeLock h;
    public boolean n;
    public boolean r;
    public i71 s;
    public boolean v;
    public long w;
    public int x;
    public int y;
    public long E = 0;
    public float H = -100.0f;
    public final float[] J = new float[3];
    public final float[] K = new float[3];
    public final float[] L = new float[3];

    public et() {
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
        i71 i71Var = this.s;
        if (i71Var == null) {
            return;
        }
        i71Var.S(this.r ? 0 : 3);
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
        char c3;
        char c10;
        char c11;
        long j10;
        Sensor sensor2;
        double d;
        boolean z4;
        int i10;
        boolean z10;
        int i11;
        AudioManager audioManager;
        PowerManager.WakeLock wakeLock;
        boolean z11;
        boolean isHeld;
        if (this.n && VoIPService.getSharedInstance() == null) {
            int type = sensorEvent.sensor.getType();
            Sensor sensor3 = this.f;
            Sensor sensor4 = this.e;
            float[] fArr = this.L;
            float[] fArr2 = this.J;
            Sensor sensor5 = this.d;
            float[] fArr3 = this.K;
            if (type == 8) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f10 = this.H;
                float f11 = sensorEvent.values[0];
                if (f10 != f11) {
                    this.G = true;
                }
                this.H = f11;
                if (this.G) {
                    this.F = f11 < 5.0f && f11 != this.c.getMaximumRange();
                }
                sensor2 = sensor3;
                c3 = 0;
                c10 = 2;
                c11 = 1;
                j10 = 0;
            } else {
                Sensor sensor6 = sensorEvent.sensor;
                if (sensor6 == sensor5) {
                    if (this.E == 0) {
                        d = 0.9800000190734863d;
                        c10 = 2;
                        c11 = 1;
                    } else {
                        c10 = 2;
                        c11 = 1;
                        d = 1.0d / (((sensorEvent.timestamp - r8) / 1.0E9d) + 1.0d);
                    }
                    this.E = sensorEvent.timestamp;
                    double d10 = 1.0d - d;
                    float[] fArr4 = sensorEvent.values;
                    j10 = 0;
                    c3 = 0;
                    float f12 = (float) ((fArr4[0] * d10) + (fArr2[0] * d));
                    fArr2[0] = f12;
                    sensor = sensor3;
                    float f13 = (float) ((fArr4[c11] * d10) + (fArr2[c11] * d));
                    fArr2[c11] = f13;
                    float f14 = (float) ((d10 * fArr4[c10]) + (d * fArr2[c10]));
                    fArr2[c10] = f14;
                    fArr3[0] = (fArr4[0] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[c11] = (fArr4[c11] * 0.19999999f) + (f13 * 0.8f);
                    fArr3[c10] = (fArr4[c10] * 0.19999999f) + (f14 * 0.8f);
                    fArr[0] = fArr4[0] - fArr2[0];
                    fArr[c11] = fArr4[c11] - fArr2[c11];
                    fArr[c10] = fArr4[c10] - fArr2[c10];
                } else {
                    sensor = sensor3;
                    c3 = 0;
                    c10 = 2;
                    c11 = 1;
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
                float f18 = (fArr2[c10] * fArr[c10]) + (fArr2[c11] * fArr[c11]) + (fArr2[c3] * fArr[c3]);
                int i12 = this.B;
                if (i12 != 6 && ((f18 > 0.0f && this.I > 0.0f) || (f18 < 0.0f && this.I < 0.0f))) {
                    if (f18 > 0.0f) {
                        z4 = f18 > 15.0f;
                        i10 = 1;
                    } else {
                        z4 = f18 < -15.0f;
                        i10 = 2;
                    }
                    int i13 = this.y;
                    if (i13 != 0 && i13 != i10) {
                        int i14 = this.x;
                        if (i14 != 6 || !z4) {
                            if (!z4) {
                                this.C++;
                            }
                            if (this.C == 10 || i14 != 6 || i12 != 0) {
                                this.x = 0;
                                this.y = 0;
                                this.B = 0;
                                this.C = 0;
                            }
                        } else if (i12 < 6) {
                            int i15 = i12 + 1;
                            this.B = i15;
                            if (i15 == 6) {
                                this.x = 0;
                                this.y = 0;
                                this.C = 0;
                                this.D = System.currentTimeMillis();
                                if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                    FileLog.d("motion detected");
                                }
                            }
                        }
                    } else if (z4 && i12 == 0 && (i13 == 0 || i13 == i10)) {
                        int i16 = this.x;
                        if (i16 < 6 && !this.F) {
                            this.y = i10;
                            int i17 = i16 + 1;
                            this.x = i17;
                            if (i17 == 6) {
                                this.C = 0;
                            }
                        }
                    } else {
                        if (!z4) {
                            this.C++;
                        }
                        if (i13 != i10 || this.C == 10 || this.x != 6 || i12 != 0) {
                            this.B = 0;
                            this.x = 0;
                            this.y = 0;
                            this.C = 0;
                        }
                    }
                }
                this.I = f18;
                this.v = fArr3[c11] > 2.5f && Math.abs(fArr3[c10]) < 4.0f && Math.abs(fArr3[0]) > 1.5f;
            }
            if (this.B == 6 || this.v) {
                this.w = System.currentTimeMillis();
            }
            if (this.B == 6 || this.v || System.currentTimeMillis() - this.w < 60) {
                try {
                    i11 = Build.VERSION.SDK_INT;
                    audioManager = this.b;
                } catch (Exception e) {
                    FileLog.e(e);
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
                        z10 = true;
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
                        z11 = this.F;
                        if (!z11 && z10) {
                            if (!this.r) {
                                this.r = true;
                                a();
                            }
                            this.B = 0;
                            this.x = 0;
                            this.y = 0;
                            this.C = 0;
                        } else if (z11 || !((sensor5 == null || sensor4 == null) && sensor2 == null && !VoIPService.isAnyKindOfCallActive())) {
                            if (!this.F && this.r) {
                                this.r = false;
                                a();
                            }
                        } else if (!this.r) {
                            this.r = true;
                            a();
                        }
                        if (this.D == j10 && this.B == 6 && Math.abs(System.currentTimeMillis() - this.D) > 1000) {
                            this.B = 0;
                            this.x = 0;
                            this.y = 0;
                            this.C = 0;
                            this.D = j10;
                            return;
                        }
                        return;
                    }
                } else if (!audioManager.isWiredHeadsetOn()) {
                    if (!audioManager.isBluetoothA2dpOn()) {
                    }
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
            z11 = this.F;
            if (!z11) {
            }
            if (z11) {
            }
            if (!this.F) {
                this.r = false;
                a();
            }
            if (this.D == j10) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
