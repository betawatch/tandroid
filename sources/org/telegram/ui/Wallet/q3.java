package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.y20;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ y20 a;

    public q3(y20 y20Var) {
        this.a = y20Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i3, int i10) {
        y20 y20Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, y20Var.a, y20Var.b, Shader.TileMode.CLAMP);
    }
}
