package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.d30;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class q3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ d30 a;

    public q3(d30 d30Var) {
        this.a = d30Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i7, int i10) {
        d30 d30Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, d30Var.a, d30Var.b, Shader.TileMode.CLAMP);
    }
}
