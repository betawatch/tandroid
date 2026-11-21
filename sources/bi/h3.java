package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class h3 extends View {
    public final j3 a;
    public CharSequence b;

    public h3(Context context) {
        super(context);
        j3 j3Var = new j3(this, 1.0f);
        this.a = j3Var;
        j3Var.setCallback(this);
    }

    public final void a(int i7, int i10) {
        ((Paint) this.a.b).setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        this.b = str;
        this.a.g(z10 ? 10 : 11, str, z10);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        j3 j3Var = this.a;
        j3Var.setBounds(0, 0, width, height);
        j3Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.b;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i7) {
        this.a.f(i7);
    }

    public void setStrokeColor(int i7) {
        this.a.r.setColor(i7);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }
}
