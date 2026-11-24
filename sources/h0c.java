// default package

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class h0c extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ ll5 a;

    public h0c(ll5 ll5Var) {
        this.a = ll5Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        ll5 ll5Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, ll5Var.a, ll5Var.b, Shader.TileMode.CLAMP);
    }
}
