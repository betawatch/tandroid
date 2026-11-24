// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gl1 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ gl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.n8((Integer) obj, (Boolean) obj2);
                break;
            case 1:
                mu1Var.o8((Long) obj, (Boolean) obj2);
                break;
            case 2:
                hx4 hx4Var = mu1Var.P8;
                hx4Var.a((Bitmap) obj2);
                tk0.c(hx4Var, mu1Var.fragmentView);
                mu1Var.Q8.d();
                break;
            default:
                mu1Var.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                mu1Var.T8 = paint;
                Bitmap bitmap = mu1Var.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                mu1Var.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                mu1Var.U8 = new Matrix();
                hx4 hx4Var2 = mu1Var.P8;
                hx4Var2.a((Bitmap) obj2);
                tk0.c(hx4Var2, mu1Var.fragmentView);
                mu1Var.Q8.d();
                break;
        }
    }
}
