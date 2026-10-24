package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ha extends LinearLayout {
    public final ow0 a;
    public Paint b;
    public int c;
    public final boolean d;
    public final boolean e;
    public final Rect f;

    public ha(Context context, ow0 ow0Var) {
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
        ow0 ow0Var;
        if (!SharedConfig.chatBlurEnabled() || this.a == null || !this.e || this.c == 0) {
            canvas2 = canvas;
        } else {
            if (this.b == null) {
                this.b = new Paint();
            }
            this.b.setColor(this.c);
            this.f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                ow0Var = this.a;
                if (view == ow0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            ow0Var.I(canvas2, f7, this.f, this.b, this.d);
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ow0 ow0Var;
        if (SharedConfig.chatBlurEnabled() && (ow0Var = this.a) != null) {
            ow0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
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
}
