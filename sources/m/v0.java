package m;

import android.widget.TextView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
