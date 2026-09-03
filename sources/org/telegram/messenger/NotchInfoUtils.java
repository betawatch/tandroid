package org.telegram.messenger;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class NotchInfoUtils {
    private static final String BOTTOM_MARKER = "@bottom";
    private static final String DP_MARKER = "@dp";
    private static final String LEFT_MARKER = "@left";
    private static final String RIGHT_MARKER = "@right";

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class NotchInfo {
        public RectF bounds;
        public int gravity;
        public boolean isAccurate;
        public boolean isLikelyCircle;
        public Path path;
        public String rawPath;
    }

    public static NotchInfo getInfo(Context context) {
        float f10;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        NotchInfo notchInfo = new NotchInfo();
        int identifier = context.getResources().getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
        if (identifier != 0) {
            String string = context.getString(identifier);
            if (string.isEmpty()) {
                return null;
            }
            String trim = string.trim();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i11 = displayMetrics.widthPixels;
            float f11 = displayMetrics.density;
            if (trim.endsWith(RIGHT_MARKER)) {
                f10 = i11;
                trim = trim.substring(0, trim.length() - 6).trim();
                i10 = 5;
            } else if (trim.endsWith(LEFT_MARKER)) {
                trim = trim.substring(0, trim.length() - 5).trim();
                f10 = 0.0f;
                i10 = 3;
            } else {
                f10 = i11 / 2.0f;
                i10 = 17;
            }
            boolean endsWith = trim.endsWith(DP_MARKER);
            if (endsWith) {
                trim = e2.c.j(trim, 3, 0);
            }
            if (trim.contains(BOTTOM_MARKER)) {
                trim = trim.split(BOTTOM_MARKER, 2)[0].trim();
            }
            try {
                i0.d[] c3 = j7.z7.c(trim);
                Path path = new Path();
                i0.d.b(c3, path);
                Matrix matrix = new Matrix();
                if (endsWith) {
                    matrix.postScale(f11, f11);
                }
                matrix.postTranslate(f10, 0.0f);
                path.transform(matrix);
                notchInfo.path = path;
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                notchInfo.bounds = rectF;
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (i10 != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= AndroidUtilities.dp(2.0f)) {
                    i10 = 17;
                }
                int i12 = (i10 != 17 || rectF.left >= ((float) displayMetrics2.widthPixels) / 4.0f) ? i10 : 3;
                notchInfo.gravity = (i12 != 17 || rectF.right <= (((float) displayMetrics2.widthPixels) / 4.0f) * 3.0f) ? i12 : 5;
                notchInfo.rawPath = trim;
                notchInfo.isAccurate = trim.contains("C") || trim.contains("S") || trim.contains("Q");
                notchInfo.isLikelyCircle = rectF.width() <= ((float) AndroidUtilities.dp(32.0f)) || rectF.width() <= rectF.height();
                return notchInfo;
            } catch (Throwable th2) {
                FileLog.e("Failed to parse notch info", th2);
            }
        }
        return null;
    }
}
