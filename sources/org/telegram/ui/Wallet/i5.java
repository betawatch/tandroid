package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Shader;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class i5 {
    public final Path a;
    public final LinearGradient b;

    public i5(float f7, float f10, float f11, float f12, float f13, int i10, int i11) {
        Path path = new Path();
        this.a = path;
        float f14 = 0.14999998f * f11;
        path.rewind();
        path.moveTo(f7 - f11, f10);
        float f15 = f7 - f14;
        float f16 = f10 - f14;
        path.lineTo(f15, f16);
        path.lineTo(f7, f10 - f11);
        float f17 = f7 + f14;
        path.lineTo(f17, f16);
        path.lineTo(f7 + f11, f10);
        float f18 = f14 + f10;
        path.lineTo(f17, f18);
        path.lineTo(f7, f10 + f11);
        path.lineTo(f15, f18);
        path.close();
        this.b = new LinearGradient(f7 - f12, f10 - f13, f7 + f12, f10 + f13, i10, i11, Shader.TileMode.CLAMP);
    }
}
