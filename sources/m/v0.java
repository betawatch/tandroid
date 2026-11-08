package m;

import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class v0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i7, int i10, int i11, int i12) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
    }

    public static void c(TextView textView, int[] iArr, int i7) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
