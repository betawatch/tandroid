package di;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public abstract class n0 {
    public static float[] a;

    public static int a(int i10, boolean z10) {
        if (a == null) {
            a = new float[3];
        }
        Color.colorToHSV(i10, a);
        float[] fArr = a;
        fArr[2] = Utilities.clamp(fArr[2] + (z10 ? -0.05f : 0.07f), 0.85f, 0.15f);
        float[] fArr2 = a;
        float f7 = fArr2[1];
        if (f7 > 0.1f && f7 <= 0.95f) {
            if (f7 <= 0.5f) {
                fArr2[1] = Utilities.clamp(f7 + 0.2f, 1.0f, 0.0f);
            } else if (f7 > 0.8f) {
                fArr2[1] = Utilities.clamp(f7 - 0.4f, 1.0f, 0.0f);
            }
        }
        return Color.HSVToColor(a);
    }

    public static int[] b(Bitmap bitmap, boolean z10) {
        return new int[]{a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.1f)), z10), a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.9f)), z10)};
    }
}
