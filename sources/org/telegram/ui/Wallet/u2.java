package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.z40;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class u2 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ z40 a;

    public u2(z40 z40Var) {
        this.a = z40Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        z40 z40Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, z40Var.a, z40Var.b, Shader.TileMode.CLAMP);
    }
}
