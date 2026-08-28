package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c70 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final float c;
    public float d;
    public final View e;
    public boolean f;
    public float h;
    public int n;

    public c70(View view, float f10, int i9) {
        e5 e5Var = new e5(this, 2);
        this.f = true;
        this.n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.setCurrentAccount(i9);
        this.c = f10;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.e;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(e5Var);
            if (this.e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        View view3 = this.e;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        this.e = view;
        imageReceiver.setParentView(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(e5Var);
        }
    }

    public final void a(float f10) {
        float dp = AndroidUtilities.dp(f10);
        this.d = dp;
        this.b.setRoundRadius((int) dp);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z10 = this.f;
        Paint paint2 = this.a;
        if (z10 && this.n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.f6.l1(this.n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float dp = (((i11 + i13) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.c) / 2.0f);
        if (this.f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f11, dp, AndroidUtilities.dp(this.c) + f11, AndroidUtilities.dp(this.c) + dp);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        float dp2 = AndroidUtilities.dp(this.c);
        float dp3 = AndroidUtilities.dp(this.c);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(f11, dp, dp2, dp3);
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.c);
    }
}
