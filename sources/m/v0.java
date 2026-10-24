package m;

import android.widget.TextView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class v0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i10, int i11, int i12, int i13) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    public static void c(TextView textView, int[] iArr, int i10) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
