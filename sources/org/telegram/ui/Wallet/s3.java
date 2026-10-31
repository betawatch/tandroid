package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.u30;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ u30 a;

    public s3(u30 u30Var) {
        this.a = u30Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        u30 u30Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, u30Var.a, u30Var.b, Shader.TileMode.CLAMP);
    }
}
