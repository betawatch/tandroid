package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v extends View {
    public final Paint a;
    public final Paint b;
    public int c;
    public int d;
    public final /* synthetic */ e0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e0 e0Var, Context context) {
        super(context);
        this.e = e0Var;
        this.a = new Paint(1);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }

    public final void a() {
        int argb;
        int argb2;
        int i10 = this.c;
        e0 e0Var = this.e;
        if (i10 == 1) {
            argb = Color.argb(255, Color.red(e0Var.f), 0, Color.blue(e0Var.f));
            argb2 = Color.argb(255, Color.red(e0Var.f), 255, Color.blue(e0Var.f));
        } else if (i10 != 2) {
            argb = Color.argb(255, 0, Color.green(e0Var.f), Color.blue(e0Var.f));
            argb2 = Color.argb(255, 255, Color.green(e0Var.f), Color.blue(e0Var.f));
        } else {
            argb = Color.argb(255, Color.red(e0Var.f), Color.green(e0Var.f), 0);
            argb2 = Color.argb(255, Color.red(e0Var.f), Color.green(e0Var.f), 255);
        }
        this.a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f10) {
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = k7.o.a(((f10 - dp) + (AndroidUtilities.dp(13.0f) - (this.b.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        int i10 = this.c;
        e0 e0Var = this.e;
        e0Var.m(i0.a.k(i10 != 1 ? i10 != 2 ? Color.argb(255, (int) (a2 * 255.0f), Color.green(e0Var.f), Color.blue(e0Var.f)) : Color.argb(255, Color.red(e0Var.f), Color.green(e0Var.f), (int) (a2 * 255.0f)) : Color.argb(255, Color.red(e0Var.f), (int) (a2 * 255.0f), Color.blue(e0Var.f)), Color.alpha(e0Var.f)), 4);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp, height - dp, getWidth() - dp, height + dp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.a);
        int i10 = this.c;
        e0 e0Var = this.e;
        float red = (i10 != 1 ? i10 != 2 ? Color.red(e0Var.f) : Color.blue(e0Var.f) : Color.green(e0Var.f)) / 255.0f;
        float dp2 = AndroidUtilities.dp(13.0f);
        Paint paint = this.b;
        float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * red) + dp) - strokeWidth);
        canvas.drawCircle(max, height, dp2, paint);
        eg.c2.w1(max, height, strokeWidth, this.d, canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                b(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        b(motionEvent.getX());
        return true;
    }
}
