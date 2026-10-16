package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class ia extends FrameLayout {
    public final ow0 a;
    public Paint b;
    public int c;
    public final boolean d;
    public final boolean e;
    public final Rect f;

    public ia(Context context, ow0 ow0Var) {
        super(context);
        this.c = 0;
        this.d = true;
        this.e = true;
        this.f = new Rect();
        this.a = ow0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.a != null && this.e && this.c != 0) {
            if (this.b == null) {
                this.b = new Paint();
            }
            this.b.setColor(this.c);
            this.f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                ow0 ow0Var = this.a;
                if (view == ow0Var) {
                    canvas2 = canvas;
                    ow0Var.J(canvas2, f7, this.f, this.b, this.d);
                    break;
                }
                f7 += view.getY();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    super.dispatchDraw(canvas);
                    return;
                }
                view = (View) parent;
            }
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ow0 ow0Var;
        if (SharedConfig.chatBlurEnabled() && (ow0Var = this.a) != null) {
            ow0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ow0 ow0Var = this.a;
        if (ow0Var != null) {
            ow0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!SharedConfig.chatBlurEnabled() || this.a == null) {
            super.setBackgroundColor(i10);
        } else {
            this.c = i10;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (SharedConfig.chatBlurEnabled() && f7 != getTranslationY()) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
