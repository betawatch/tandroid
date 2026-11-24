// default package

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jt implements TypeEvaluator {
    public static final jt a = new jt();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & nm7.d4) / 255.0f;
        float f3 = ((intValue >> 16) & nm7.d4) / 255.0f;
        float f4 = ((intValue >> 8) & nm7.d4) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f5 = ((intValue2 >> 24) & nm7.d4) / 255.0f;
        float f6 = ((intValue2 >> 16) & nm7.d4) / 255.0f;
        float f7 = ((intValue2 >> 8) & nm7.d4) / 255.0f;
        float pow = (float) Math.pow(f3, 2.2d);
        float pow2 = (float) Math.pow(f4, 2.2d);
        float pow3 = (float) Math.pow((intValue & nm7.d4) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(f6, 2.2d);
        float pow5 = (float) Math.pow(f7, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & nm7.d4) / 255.0f, 2.2d);
        return Integer.valueOf((Math.round(td4.A(f5, f2, f, f2) * 255.0f) << 24) | (Math.round(((float) Math.pow(td4.A(pow4, pow, f, pow), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(td4.A(pow5, pow2, f, pow2), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(td4.A(pow6, pow3, f, pow3), 0.45454545454545453d)) * 255.0f));
    }
}
