package org.telegram.messenger;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ od(MediaController mediaController, int i3) {
        this.a = i3;
        this.b = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 0;
        switch (this.a) {
            case 0:
                MediaController mediaController = this.b;
                String[] strArr = MediaController.W1;
                try {
                    mediaController.B1 = 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.A1 = minBufferSize;
                    while (i3 < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.A1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.y1.add(allocateDirect);
                        i3++;
                    }
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                MediaController mediaController2 = this.b;
                String[] strArr2 = MediaController.W1;
                try {
                    mediaController2.q0 = hp.e1().getFloat("playbackSpeed", 1.0f);
                    mediaController2.r0 = hp.e1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController2.s0 = hp.e1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController2.t0 = hp.e1().getFloat("fastMusicPlaybackSpeed", 1.8f);
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
                    ne neVar = new ne(mediaController2);
                    TelephonyManager telephonyManager = (TelephonyManager) t0.b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(neVar, 32);
                        break;
                    }
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
                break;
            case 2:
                MediaController mediaController3 = this.b;
                String[] strArr3 = MediaController.W1;
                while (i3 < 4) {
                    hs.f(i3).b(mediaController3, hs.Y1);
                    hs.f(i3).b(mediaController3, hs.R1);
                    hs.f(i3).b(mediaController3, 1);
                    hs.f(i3).b(mediaController3, 7);
                    hs.f(i3).b(mediaController3, 41);
                    hs.f(i3).b(mediaController3, 73);
                    hs.f(i3).b(mediaController3, 32);
                    hs.f(i3).b(mediaController3, hs.T3);
                    hs.e().b(mediaController3, hs.H4);
                    i3++;
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
                String[] strArr4 = MediaController.W1;
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
                mediaController7.M1 = null;
                hs.f(mediaController7.i1).k(hs.m2, Integer.valueOf(mediaController7.h1));
                break;
            case 8:
                MediaController mediaController8 = this.b;
                String[] strArr5 = MediaController.W1;
                mediaController8.Y(true);
                mediaController8.f1 = new AudioRecord(0, mediaController8.B1, 16, 2, mediaController8.A1);
                System.currentTimeMillis();
                mediaController8.m1 = 0;
                mediaController8.w1 = 0L;
                mediaController8.z1.rewind();
                mediaController8.f1.startRecording();
                mediaController8.N1.c(mediaController8.P1);
                hs.f(mediaController8.i1).k(hs.p2, new Object[0]);
                break;
            default:
                MediaController mediaController9 = this.b;
                String[] strArr6 = MediaController.W1;
                mediaController9.q(true, true, false, false);
                break;
        }
    }
}
