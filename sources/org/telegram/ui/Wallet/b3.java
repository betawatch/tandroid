package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.v40;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class b3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ v40 a;

    public b3(v40 v40Var) {
        this.a = v40Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        v40 v40Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, v40Var.a, v40Var.b, Shader.TileMode.CLAMP);
    }
}
