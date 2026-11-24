// default package

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
