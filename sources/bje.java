// default package

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class bje {
    public static float[] a;

    public static int a(int i, boolean z) {
        float[] fArr = a;
        if (fArr == null) {
            fArr = new float[3];
            a = fArr;
        }
        Color.colorToHSV(i, fArr);
        float[] fArr2 = a;
        fArr2[2] = Utilities.i(fArr2[2] + (z ? -0.05f : 0.07f), 0.85f, 0.15f);
        float[] fArr3 = a;
        float f = fArr3[1];
        if (f > 0.1f && f <= 0.95f) {
            if (f <= 0.5f) {
                fArr3[1] = Utilities.i(f + 0.2f, 1.0f, 0.0f);
            } else if (f > 0.8f) {
                fArr3[1] = Utilities.i(f - 0.4f, 1.0f, 0.0f);
            }
        }
        return Color.HSVToColor(a);
    }

    public static int[] b(Bitmap bitmap, boolean z) {
        return new int[]{a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.1f)), z), a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.9f)), z)};
    }
}
