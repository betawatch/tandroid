package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.z40;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class t2 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ z40 a;

    public t2(z40 z40Var) {
        this.a = z40Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        z40 z40Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, z40Var.a, z40Var.b, Shader.TileMode.CLAMP);
    }
}
