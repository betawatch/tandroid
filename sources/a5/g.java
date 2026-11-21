package a5;

import android.animation.TypeEvaluator;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class g implements TypeEvaluator {
    public static final g a = new g();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((intValue >> 24) & ks.e4) / 255.0f;
        float f12 = ((intValue >> 16) & ks.e4) / 255.0f;
        float f13 = ((intValue >> 8) & ks.e4) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f14 = ((intValue2 >> 24) & ks.e4) / 255.0f;
        float f15 = ((intValue2 >> 16) & ks.e4) / 255.0f;
        float f16 = ((intValue2 >> 8) & ks.e4) / 255.0f;
        float pow = (float) Math.pow(f12, 2.2d);
        float pow2 = (float) Math.pow(f13, 2.2d);
        float pow3 = (float) Math.pow((intValue & ks.e4) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(f15, 2.2d);
        float pow5 = (float) Math.pow(f16, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & ks.e4) / 255.0f, 2.2d);
        float z10 = e2.z(f14, f11, f10, f11);
        float z11 = e2.z(pow4, pow, f10, pow);
        float z12 = e2.z(pow5, pow2, f10, pow2);
        float z13 = e2.z(pow6, pow3, f10, pow3);
        float pow7 = ((float) Math.pow(z11, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(z12, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(z13, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(z10 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
