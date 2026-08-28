package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g2 extends View {
    public final i2 a;
    public CharSequence b;

    public g2(Context context) {
        super(context);
        i2 i2Var = new i2(this);
        this.a = i2Var;
        i2Var.setCallback(this);
    }

    public final void a(int i9, int i10) {
        this.a.a.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        this.b = str;
        this.a.e(z10 ? 10 : 11, str, z10);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        i2 i2Var = this.a;
        i2Var.setBounds(0, 0, width, height);
        i2Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.b;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.a.d(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i9) {
        Paint paint = this.a.a;
        paint.setShader(null);
        paint.setColor(i9);
    }

    public void setStrokeColor(int i9) {
        this.a.d.setColor(i9);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }
}
