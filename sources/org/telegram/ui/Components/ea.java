package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class ea extends FrameLayout {
    public final qv0 a;
    public Paint b;
    public int c;
    public final boolean d;
    public final boolean e;
    public final Rect f;

    public ea(Context context, qv0 qv0Var) {
        super(context);
        this.c = 0;
        this.d = true;
        this.e = true;
        this.f = new Rect();
        this.a = qv0Var;
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
                qv0 qv0Var = this.a;
                if (view == qv0Var) {
                    canvas2 = canvas;
                    qv0Var.J(canvas2, f7, this.f, this.b, this.d);
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
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && (qv0Var = this.a) != null) {
            qv0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        qv0 qv0Var = this.a;
        if (qv0Var != null) {
            qv0Var.T.remove(this);
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
