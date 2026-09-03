package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class y9 extends FrameLayout {
    public final pv0 a;
    public Paint b;
    public int c;
    public final boolean d;
    public final boolean e;
    public final Rect f;

    public y9(Context context, pv0 pv0Var) {
        super(context);
        this.c = 0;
        this.d = true;
        this.e = true;
        this.f = new Rect();
        this.a = pv0Var;
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
            float f10 = 0.0f;
            View view = this;
            while (true) {
                pv0 pv0Var = this.a;
                if (view == pv0Var) {
                    canvas2 = canvas;
                    pv0Var.J(canvas2, f10, this.f, this.b, this.d);
                    break;
                }
                f10 += view.getY();
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
        pv0 pv0Var;
        if (SharedConfig.chatBlurEnabled() && (pv0Var = this.a) != null) {
            pv0Var.Q.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        pv0 pv0Var = this.a;
        if (pv0Var != null) {
            pv0Var.Q.remove(this);
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
    public void setTranslationY(float f10) {
        if (SharedConfig.chatBlurEnabled() && f10 != getTranslationY()) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
