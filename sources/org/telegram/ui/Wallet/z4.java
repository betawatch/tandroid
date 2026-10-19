package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class z4 extends ShapeDrawable.ShaderFactory {
    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, -765355, -2148011, Shader.TileMode.CLAMP);
    }
}
