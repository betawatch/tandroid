package org.telegram.messenger;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class qd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ qd(MediaController mediaController, int i10) {
        this.a = i10;
        this.b = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                MediaController mediaController = this.b;
                String[] strArr = MediaController.U1;
                try {
                    mediaController.z1 = 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.y1 = minBufferSize;
                    while (i10 < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.y1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.w1.add(allocateDirect);
                        i10++;
                    }
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                MediaController mediaController2 = this.b;
                String[] strArr2 = MediaController.U1;
                try {
                    mediaController2.p0 = vp.d1().getFloat("playbackSpeed", 1.0f);
                    mediaController2.q0 = vp.d1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController2.r0 = vp.d1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController2.s0 = vp.d1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) w0.b.getSystemService("sensor");
                    mediaController2.c = sensorManager;
                    mediaController2.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController2.c.getDefaultSensor(9);
                    mediaController2.n = defaultSensor;
                    if (mediaController2.h == null || defaultSensor == null) {
                        if (v2.a) {
                            f8.b("gravity or linear sensor not found");
                        }
                        mediaController2.f = mediaController2.c.getDefaultSensor(1);
                        mediaController2.h = null;
                        mediaController2.n = null;
                    }
                    mediaController2.e = mediaController2.c.getDefaultSensor(8);
                    mediaController2.d = ((PowerManager) w0.b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                try {
                    te teVar = new te(mediaController2);
                    TelephonyManager telephonyManager = (TelephonyManager) w0.b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(teVar, 32);
                        break;
                    }
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
                break;
            case 2:
                MediaController mediaController3 = this.b;
                String[] strArr3 = MediaController.U1;
                while (i10 < 4) {
                    zs.f(i10).b(mediaController3, zs.Y1);
                    zs.f(i10).b(mediaController3, zs.R1);
                    zs.f(i10).b(mediaController3, 1);
                    zs.f(i10).b(mediaController3, 7);
                    zs.f(i10).b(mediaController3, 41);
                    zs.f(i10).b(mediaController3, 73);
                    zs.f(i10).b(mediaController3, 32);
                    zs.f(i10).b(mediaController3, zs.T3);
                    zs.e().b(mediaController3, zs.H4);
                    i10++;
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
                String[] strArr4 = MediaController.U1;
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
                mediaController7.K1 = null;
                zs.f(mediaController7.g1).k(zs.m2, Integer.valueOf(mediaController7.f1));
                break;
            case 8:
                MediaController mediaController8 = this.b;
                String[] strArr5 = MediaController.U1;
                mediaController8.Y(true);
                mediaController8.d1 = new AudioRecord(0, mediaController8.z1, 16, 2, mediaController8.y1);
                System.currentTimeMillis();
                mediaController8.k1 = 0;
                mediaController8.u1 = 0L;
                mediaController8.x1.rewind();
                mediaController8.d1.startRecording();
                mediaController8.L1.c(mediaController8.N1);
                zs.f(mediaController8.g1).k(zs.p2, new Object[0]);
                break;
            default:
                MediaController mediaController9 = this.b;
                String[] strArr6 = MediaController.U1;
                mediaController9.q(true, true, false, false);
                break;
        }
    }
}
