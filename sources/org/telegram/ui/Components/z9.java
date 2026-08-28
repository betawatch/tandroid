package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z9 extends LinearLayout {
    public final xu0 a;
    public Paint b;
    public int c;
    public final boolean d;
    public final boolean e;
    public final Rect f;

    public z9(Context context, xu0 xu0Var) {
        super(context);
        this.c = 0;
        this.d = true;
        this.e = true;
        this.f = new Rect();
        this.a = xu0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        xu0 xu0Var;
        if (!SharedConfig.chatBlurEnabled() || this.a == null || !this.e || this.c == 0) {
            canvas2 = canvas;
        } else {
            if (this.b == null) {
                this.b = new Paint();
            }
            this.b.setColor(this.c);
            this.f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f10 = 0.0f;
            View view = this;
            while (true) {
                xu0Var = this.a;
                if (view == xu0Var) {
                    break;
                }
                f10 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            xu0Var.J(canvas2, f10, this.f, this.b, this.d);
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        xu0 xu0Var;
        if (SharedConfig.chatBlurEnabled() && (xu0Var = this.a) != null) {
            xu0Var.P.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        xu0 xu0Var = this.a;
        if (xu0Var != null) {
            xu0Var.P.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        if (!SharedConfig.chatBlurEnabled() || this.a == null) {
            super.setBackgroundColor(i9);
        } else {
            this.c = i9;
        }
    }
}
