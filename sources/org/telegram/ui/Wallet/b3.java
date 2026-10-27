package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.x40;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ x40 a;

    public b3(x40 x40Var) {
        this.a = x40Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        x40 x40Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, x40Var.a, x40Var.b, Shader.TileMode.CLAMP);
    }
}
