package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Shader;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class y5 {
    public final Path a;
    public final LinearGradient b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public y5(float f7, float f10, float f11, float f12, float f13, int i10, int i11) {
        Path path = new Path();
        this.a = path;
        float f14 = 0.14999998f * f11;
        path.rewind();
        float f15 = f7 - f11;
        path.moveTo(f15, f10);
        float f16 = f7 - f14;
        float f17 = f10 - f14;
        path.lineTo(f16, f17);
        float f18 = f10 - f11;
        path.lineTo(f7, f18);
        float f19 = f7 + f14;
        path.lineTo(f19, f17);
        float f20 = f7 + f11;
        path.lineTo(f20, f10);
        float f21 = f14 + f10;
        path.lineTo(f19, f21);
        float f22 = f11 + f10;
        path.lineTo(f7, f22);
        path.lineTo(f16, f21);
        path.close();
        this.c = f15 - 1.0f;
        this.d = f18 - 1.0f;
        this.e = f20 + 1.0f;
        this.f = f22 + 1.0f;
        this.b = new LinearGradient(f7 - f12, f10 - f13, f7 + f12, f10 + f13, i10, i11, Shader.TileMode.CLAMP);
    }
}
