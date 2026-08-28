package m;

import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class v0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i9, int i10, int i11, int i12) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
    }

    public static void c(TextView textView, int[] iArr, int i9) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
