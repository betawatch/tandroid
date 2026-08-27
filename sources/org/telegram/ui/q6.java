package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q6 extends View {
    public final /* synthetic */ int a = 0;
    public Paint b;
    public Paint c;
    public float d;
    public Object e;

    public /* synthetic */ q6(Context context) {
        super(context);
    }

    public void a() {
        this.b.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ((yf.x) this.e).f}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void b(float f10) {
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = h7.n.a(((f10 - dp) + (AndroidUtilities.dp(13.0f) - (this.c.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        this.d = a2;
        yf.x xVar = (yf.x) this.e;
        xVar.m(i0.b.k(xVar.f, (int) (a2 * 255.0f)), 1);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.c);
                rectF.set(0.0f, 0.0f, ((org.telegram.ui.Components.y5) this.e).d(this.d, false) * getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.b);
                break;
            default:
                super.onDraw(canvas);
                float height = getHeight() / 2.0f;
                float dp = AndroidUtilities.dp(6.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f10 = height - dp;
                float f11 = height + dp;
                rectF2.set(dp, f10, getWidth() - dp, f11);
                canvas.save();
                yf.x xVar = (yf.x) this.e;
                xVar.e.rewind();
                xVar.e.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                canvas.clipPath(xVar.e);
                zf.i1.w1(canvas, rectF2, AndroidUtilities.dp(6.0f));
                canvas.restore();
                rectF2.set(dp, f10, getWidth() - dp, f11);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.b);
                float dp2 = AndroidUtilities.dp(13.0f);
                Paint paint = this.c;
                float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
                float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * this.d) + dp) - strokeWidth);
                canvas.drawCircle(max, height, dp2, paint);
                zf.i1.x1(max, height, strokeWidth, i0.b.k(xVar.f, (int) (this.d * 255.0f)), canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                a();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
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
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(yf.x xVar, Context context) {
        super(context);
        this.e = xVar;
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }
}
