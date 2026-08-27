package k2;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {
    public static final f a = new f();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f12 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float z10 = com.google.android.recaptcha.internal.a.z(f12, f11, f10, f11);
        float z11 = com.google.android.recaptcha.internal.a.z(pow4, pow, f10, pow);
        float z12 = com.google.android.recaptcha.internal.a.z(pow5, pow2, f10, pow2);
        float z13 = com.google.android.recaptcha.internal.a.z(pow6, pow3, f10, pow3);
        float pow7 = ((float) Math.pow(z11, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(z12, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(z13, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(z10 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
