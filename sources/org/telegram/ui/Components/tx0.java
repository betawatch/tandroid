package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tx0 extends View {
    public String a;
    public Drawable b;
    public boolean c;
    public int d;
    public final y5 e;
    public final /* synthetic */ ux0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx0(ux0 ux0Var, Context context) {
        super(context);
        this.f = ux0Var;
        this.d = 0;
        this.e = new y5(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float d = ((1.0f - this.e.d(isPressed() ? 1.0f : 0.0f, false)) * 0.2f) + 0.8f;
        if (this.b != null) {
            int width = getWidth() / 2;
            int paddingTop = (getPaddingTop() + (getHeight() - getPaddingBottom())) / 2;
            this.b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(d, d, width, paddingTop);
            Drawable drawable = this.b;
            if (drawable instanceof k5) {
                ((k5) drawable).q(System.currentTimeMillis());
            }
            this.b.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.b;
        if (drawable instanceof k5) {
            ((k5) drawable).a(this);
        }
        this.c = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.b;
        if (drawable instanceof k5) {
            ((k5) drawable).o(this);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp((this.d == 0 ? 0.0f : 6.66f) + 3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp((this.d != 0 ? 0.0f : 6.66f) + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }

    public void setDirection(int i9) {
        this.d = i9;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 instanceof k5) {
            ((k5) drawable2).o(this);
        }
        this.b = drawable;
        if ((drawable instanceof k5) && this.c) {
            ((k5) drawable).a(this);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
