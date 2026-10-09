package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.d50;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class t2 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ d50 a;

    public t2(d50 d50Var) {
        this.a = d50Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        d50 d50Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, d50Var.a, d50Var.b, Shader.TileMode.CLAMP);
    }
}
