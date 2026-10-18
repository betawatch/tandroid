package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.v40;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class a3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ v40 a;

    public a3(v40 v40Var) {
        this.a = v40Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        v40 v40Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, v40Var.a, v40Var.b, Shader.TileMode.CLAMP);
    }
}
