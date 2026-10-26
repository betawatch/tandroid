package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.x40;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ x40 a;

    public b3(x40 x40Var) {
        this.a = x40Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        x40 x40Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, x40Var.a, x40Var.b, Shader.TileMode.CLAMP);
    }
}
