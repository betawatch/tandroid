package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class j5 extends ShapeDrawable.ShaderFactory {
    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i7, int i10) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, -765355, -2148011, Shader.TileMode.CLAMP);
    }
}
