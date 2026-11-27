// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mea extends Drawable {
    public final Paint a;
    public final b29 b;
    public final Drawable c;
    public final vnb d;
    public int e;
    public int f;
    public int g;

    public mea(Context context, View view, boolean z, int i, vnb vnbVar) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.g = jn7.d4;
        this.d = vnbVar;
        this.e = aob.v0(aob.Yk, vnbVar);
        this.f = aob.v0(aob.Zk, vnbVar);
        paint.setShader(new LinearGradient(0.0f, 0.0f, hl.L(56.0f), hl.L(56.0f), new int[]{this.e, this.f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (!z) {
            this.b = null;
            Drawable e = c00.e(context, i);
            this.c = e;
            e.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        b29 b29Var = new b29(R.raw.story_repost, hl.L(42.0f), hl.L(42.0f), true, null);
        this.b = b29Var;
        b29Var.M(view);
        hl.d3(new zk1(b29Var, (byte) 8), 450L);
        this.c = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        vnb vnbVar = this.d;
        try {
            int v0 = aob.v0(aob.Yk, vnbVar);
            int v02 = aob.v0(aob.Zk, vnbVar);
            if (v0 != this.e || v02 != this.f) {
                this.e = v0;
                this.f = v02;
                paint.setShader(new LinearGradient(0.0f, 0.0f, hl.L(56.0f), hl.L(56.0f), new int[]{v0, v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        paint.setAlpha(this.g);
        float min = (this.g / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, min, min, paint);
        canvas.restore();
        Drawable drawable = this.b;
        int L = hl.L(drawable != null ? 20.0f : 15.0f);
        Rect rect = hl.Q;
        rect.set(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
        if (drawable == null) {
            drawable = this.c;
        }
        if (drawable != null) {
            drawable.setBounds(rect);
            drawable.setAlpha(this.g);
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
