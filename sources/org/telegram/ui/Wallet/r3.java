package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.c30;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class r3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ c30 a;

    public r3(c30 c30Var) {
        this.a = c30Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i7, int i10) {
        c30 c30Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, c30Var.a, c30Var.b, Shader.TileMode.CLAMP);
    }
}
