// default package

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class g2c extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ ol5 a;

    public g2c(ol5 ol5Var) {
        this.a = ol5Var;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        ol5 ol5Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, ol5Var.a, ol5Var.b, Shader.TileMode.CLAMP);
    }
}
