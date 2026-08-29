package a4;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class p {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d);
        for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
            if (supportedPerformancePoints.get(i12).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
