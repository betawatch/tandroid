package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.v40;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class z2 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ v40 a;

    public z2(v40 v40Var) {
        this.a = v40Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        v40 v40Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, v40Var.a, v40Var.b, Shader.TileMode.CLAMP);
    }
}
