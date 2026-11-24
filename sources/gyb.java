// default package

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class gyb extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ mj5 a;

    public gyb(mj5 mj5Var) {
        this.a = mj5Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        mj5 mj5Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, mj5Var.a, mj5Var.b, Shader.TileMode.CLAMP);
    }
}
