package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.v40;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class c3 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ v40 a;

    public c3(v40 v40Var) {
        this.a = v40Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i10, int i11) {
        v40 v40Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, v40Var.a, v40Var.b, Shader.TileMode.CLAMP);
    }
}
