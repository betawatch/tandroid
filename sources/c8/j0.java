package c8;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class j0 {
    public static float[] a;

    public static int a(int i7, boolean z10) {
        if (a == null) {
            a = new float[3];
        }
        Color.colorToHSV(i7, a);
        float[] fArr = a;
        fArr[2] = Utilities.i(fArr[2] + (z10 ? -0.05f : 0.07f), 0.85f, 0.15f);
        float[] fArr2 = a;
        float f10 = fArr2[1];
        if (f10 > 0.1f && f10 <= 0.95f) {
            if (f10 <= 0.5f) {
                fArr2[1] = Utilities.i(f10 + 0.2f, 1.0f, 0.0f);
            } else if (f10 > 0.8f) {
                fArr2[1] = Utilities.i(f10 - 0.4f, 1.0f, 0.0f);
            }
        }
        return Color.HSVToColor(a);
    }

    public static int[] b(Bitmap bitmap, boolean z10) {
        return new int[]{a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.1f)), z10), a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.9f)), z10)};
    }
}
