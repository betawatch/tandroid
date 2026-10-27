package org.telegram.messenger;

import android.os.SystemClock;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class DownloadSpeedEstimator {
    private static final long MAX_AGE_MS = 60000;
    private static double bitrate;
    private static long updatedAt;

    public static synchronized long getBitrate() {
        synchronized (DownloadSpeedEstimator.class) {
            if (updatedAt == 0 || SystemClock.elapsedRealtime() - updatedAt > MAX_AGE_MS) {
                return y2.f.c(ApplicationLoader.applicationContext).a();
            }
            return (long) bitrate;
        }
    }

    public static boolean isFast() {
        return getBitrate() >= 3000000;
    }

    public static synchronized void onSample(long j10, long j11) {
        synchronized (DownloadSpeedEstimator.class) {
            if (j10 <= 0 || j11 <= 0) {
                return;
            }
            double d = (j10 * 1000.0d) / j11;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = updatedAt;
                if (j12 != 0 && elapsedRealtime - j12 <= MAX_AGE_MS) {
                    d = (d * 0.3d) + (bitrate * 0.7d);
                }
                bitrate = d;
                updatedAt = elapsedRealtime;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
