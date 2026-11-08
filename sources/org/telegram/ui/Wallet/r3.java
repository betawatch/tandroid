package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.c30;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
