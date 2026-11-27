// default package

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
