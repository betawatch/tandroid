// default package

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
