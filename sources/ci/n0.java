package ci;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
