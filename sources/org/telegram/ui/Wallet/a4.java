package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.q30;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class a4 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ q30 a;

    public a4(q30 q30Var) {
        this.a = q30Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i7, int i10) {
        q30 q30Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, q30Var.a, q30Var.b, Shader.TileMode.CLAMP);
    }
}
