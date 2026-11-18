package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xw0 extends View {
    public String a;
    public Drawable b;
    public boolean c;
    public int d;
    public final c6 e;
    public final /* synthetic */ yw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(yw0 yw0Var, Context context) {
        super(context);
        this.f = yw0Var;
        this.d = 0;
        this.e = new c6(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float e10 = ((1.0f - this.e.e(false, isPressed() ? 1.0f : 0.0f)) * 0.2f) + 0.8f;
        if (this.b != null) {
            int width = getWidth() / 2;
            int paddingTop = (getPaddingTop() + (getHeight() - getPaddingBottom())) / 2;
            this.b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(e10, e10, width, paddingTop);
            Drawable drawable = this.b;
            if (drawable instanceof o5) {
                ((o5) drawable).p(System.currentTimeMillis());
            }
            this.b.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.b;
        if (drawable instanceof o5) {
            ((o5) drawable).a(this);
        }
        this.c = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.b;
        if (drawable instanceof o5) {
            ((o5) drawable).n(this);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L((this.d == 0 ? 0.0f : 6.66f) + 3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L((this.d != 0 ? 0.0f : 6.66f) + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
    }

    public void setDirection(int i7) {
        this.d = i7;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 instanceof o5) {
            ((o5) drawable2).n(this);
        }
        this.b = drawable;
        if ((drawable instanceof o5) && this.c) {
            ((o5) drawable).a(this);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
