package org.telegram.messenger;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ vd(MediaController mediaController, int i7) {
        this.a = i7;
        this.b = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        switch (this.a) {
            case 0:
                MediaController mediaController = this.b;
                String[] strArr = MediaController.V1;
                try {
                    mediaController.A1 = 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.z1 = minBufferSize;
                    while (i7 < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.z1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.x1.add(allocateDirect);
                        i7++;
                    }
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                MediaController mediaController2 = this.b;
                String[] strArr2 = MediaController.V1;
                try {
                    mediaController2.p0 = qp.e1().getFloat("playbackSpeed", 1.0f);
                    mediaController2.q0 = qp.e1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController2.r0 = qp.e1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController2.s0 = qp.e1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) t0.b.getSystemService("sensor");
                    mediaController2.c = sensorManager;
                    mediaController2.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController2.c.getDefaultSensor(9);
                    mediaController2.n = defaultSensor;
                    if (mediaController2.h == null || defaultSensor == null) {
                        if (r2.a) {
                            a8.b("gravity or linear sensor not found");
                        }
                        mediaController2.f = mediaController2.c.getDefaultSensor(1);
                        mediaController2.h = null;
                        mediaController2.n = null;
                    }
                    mediaController2.e = mediaController2.c.getDefaultSensor(8);
                    mediaController2.d = ((PowerManager) t0.b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                try {
                    ue ueVar = new ue(mediaController2);
                    TelephonyManager telephonyManager = (TelephonyManager) t0.b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(ueVar, 32);
                        break;
                    }
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
                break;
            case 2:
                MediaController mediaController3 = this.b;
                String[] strArr3 = MediaController.V1;
                while (i7 < 4) {
                    qs.f(i7).b(mediaController3, qs.Y1);
                    qs.f(i7).b(mediaController3, qs.R1);
                    qs.f(i7).b(mediaController3, 1);
                    qs.f(i7).b(mediaController3, 7);
                    qs.f(i7).b(mediaController3, 41);
                    qs.f(i7).b(mediaController3, 73);
                    qs.f(i7).b(mediaController3, 32);
                    qs.f(i7).b(mediaController3, qs.T3);
                    qs.e().b(mediaController3, qs.H4);
                    i7++;
                }
                break;
            case 3:
                MediaController mediaController4 = this.b;
                Sensor sensor = mediaController4.n;
                if (sensor != null) {
                    mediaController4.c.registerListener(mediaController4, sensor, 30000);
                }
                Sensor sensor2 = mediaController4.h;
                if (sensor2 != null) {
                    mediaController4.c.registerListener(mediaController4, sensor2, 30000);
                }
                Sensor sensor3 = mediaController4.f;
                if (sensor3 != null) {
                    mediaController4.c.registerListener(mediaController4, sensor3, 30000);
                }
                mediaController4.c.registerListener(mediaController4, mediaController4.e, 3);
                break;
            case 4:
                MediaController mediaController5 = this.b;
                String[] strArr4 = MediaController.V1;
                mediaController5.q(true, true, false, false);
                break;
            case 5:
                MediaController mediaController6 = this.b;
                Sensor sensor4 = mediaController6.h;
                if (sensor4 != null) {
                    mediaController6.c.unregisterListener(mediaController6, sensor4);
                }
                Sensor sensor5 = mediaController6.n;
                if (sensor5 != null) {
                    mediaController6.c.unregisterListener(mediaController6, sensor5);
                }
                Sensor sensor6 = mediaController6.f;
                if (sensor6 != null) {
                    mediaController6.c.unregisterListener(mediaController6, sensor6);
                }
                mediaController6.c.unregisterListener(mediaController6, mediaController6.e);
                break;
            case 6:
                MediaController.d(this.b);
                break;
            case 7:
                MediaController mediaController7 = this.b;
                mediaController7.L1 = null;
                qs.f(mediaController7.h1).k(qs.m2, Integer.valueOf(mediaController7.g1));
                break;
            case 8:
                MediaController mediaController8 = this.b;
                String[] strArr5 = MediaController.V1;
                mediaController8.Y(true);
                mediaController8.e1 = new AudioRecord(0, mediaController8.A1, 16, 2, mediaController8.z1);
                System.currentTimeMillis();
                mediaController8.l1 = 0;
                mediaController8.v1 = 0L;
                mediaController8.y1.rewind();
                mediaController8.e1.startRecording();
                mediaController8.M1.c(mediaController8.O1);
                qs.f(mediaController8.h1).k(qs.p2, new Object[0]);
                break;
            default:
                MediaController mediaController9 = this.b;
                String[] strArr6 = MediaController.V1;
                mediaController9.q(true, true, false, false);
                break;
        }
    }
}
