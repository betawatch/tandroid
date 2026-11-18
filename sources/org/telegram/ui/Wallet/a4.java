package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.n30;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class a4 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ n30 a;

    public a4(n30 n30Var) {
        this.a = n30Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i7, int i10) {
        n30 n30Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, n30Var.a, n30Var.b, Shader.TileMode.CLAMP);
    }
}
