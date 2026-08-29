package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class da extends FrameLayout {
    public final hv0 a;
    public Paint b;
    public int c;
    public final boolean d;
    public final boolean e;
    public final Rect f;

    public da(Context context, hv0 hv0Var) {
        super(context);
        this.c = 0;
        this.d = true;
        this.e = true;
        this.f = new Rect();
        this.a = hv0Var;
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
            float f9 = 0.0f;
            View view = this;
            while (true) {
                hv0 hv0Var = this.a;
                if (view == hv0Var) {
                    canvas2 = canvas;
                    hv0Var.J(canvas2, f9, this.f, this.b, this.d);
                    break;
                }
                f9 += view.getY();
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
        hv0 hv0Var;
        if (SharedConfig.chatBlurEnabled() && (hv0Var = this.a) != null) {
            hv0Var.P.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        hv0 hv0Var = this.a;
        if (hv0Var != null) {
            hv0Var.P.remove(this);
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
    public void setTranslationY(float f9) {
        if (SharedConfig.chatBlurEnabled() && f9 != getTranslationY()) {
            invalidate();
        }
        super.setTranslationY(f9);
    }
}
