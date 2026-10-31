package kg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ba0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v0 extends FrameLayout implements t0 {
    public final p6 a;
    public final ArrayList b;
    public final u0 c;
    public final u0 d;
    public final u0 e;
    public final boolean f;

    public v0(Context context, p6 p6Var) {
        super(context);
        this.b = new ArrayList();
        this.a = p6Var;
        for (ba0 ba0Var : ba0.values()) {
            if (ba0Var.e) {
                this.b.add(ba0Var);
            }
            if (this.b.size() == 3) {
                break;
            }
        }
        if (this.b.size() < 3) {
            f8.g(new IllegalArgumentException("There should be at least 3 premium icons!"), true);
            this.f = true;
        } else {
            this.c = a(context, 0);
            this.d = a(context, 1);
            this.e = a(context, 2);
            setClipChildren(false);
        }
    }

    public final u0 a(Context context, int i10) {
        ba0 ba0Var = (ba0) this.b.get(i10);
        u0 u0Var = new u0(context);
        f2 f2Var = new f2(20);
        u0Var.e = f2Var;
        Paint paint = new Paint(1);
        u0Var.f = paint;
        f2Var.r = 12;
        f2Var.s = 8;
        f2Var.t = 6;
        if (i10 == 1) {
            f2Var.O = 1001;
        }
        if (i10 == 0) {
            f2Var.O = 1002;
        }
        f2Var.P = this.a;
        f2Var.Q = t6.Nk;
        f2Var.c();
        paint.setColor(-1);
        u0Var.setLayoutParams(b6.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        u0Var.setForeground(ba0Var.c);
        u0Var.setBackgroundResource(ba0Var.b);
        u0Var.setPadding(org.telegram.messenger.i0.L(8.0f));
        u0Var.setBackgroundOuterPadding(org.telegram.messenger.i0.L(32.0f));
        addView(u0Var);
        return u0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int L = org.telegram.messenger.i0.L(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.height = L;
        layoutParams.width = L;
        float f7 = L;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f7);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = L;
        layoutParams2.width = L;
        int i12 = (int) (f7 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams3.height = L;
        layoutParams3.width = L;
        layoutParams3.leftMargin = i12;
    }

    @Override // kg.t0
    public void setOffset(float f7) {
        if (this.f) {
            return;
        }
        float abs = Math.abs(f7 / getMeasuredWidth());
        float interpolation = gr.i.getInterpolation(abs);
        int right = getRight();
        u0 u0Var = this.e;
        u0Var.setTranslationX(((u0Var.getWidth() * 1.5f) + (right - u0Var.getRight()) + org.telegram.messenger.i0.L(32.0f)) * interpolation);
        u0Var.setTranslationY(org.telegram.messenger.i0.L(16.0f) * interpolation);
        float i10 = Utilities.i(org.telegram.messenger.i0.T1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        u0Var.setScaleX(i10);
        u0Var.setScaleY(i10);
        int top = getTop();
        u0 u0Var2 = this.c;
        u0Var2.setTranslationY((((top - u0Var2.getTop()) - (u0Var2.getHeight() * 1.8f)) - org.telegram.messenger.i0.L(32.0f)) * abs);
        u0Var2.setTranslationX(org.telegram.messenger.i0.L(16.0f) * abs);
        float i11 = Utilities.i(org.telegram.messenger.i0.T1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        u0Var2.setScaleX(i11);
        u0Var2.setScaleY(i11);
        float interpolation2 = gr.g.getInterpolation(abs);
        int left = getLeft();
        u0 u0Var3 = this.d;
        u0Var3.setTranslationX((((left - u0Var3.getLeft()) - (u0Var3.getWidth() * 2.5f)) + org.telegram.messenger.i0.L(32.0f)) * interpolation2);
        u0Var3.setTranslationY(((u0Var3.getHeight() * 2.5f) + (getBottom() - u0Var3.getBottom()) + org.telegram.messenger.i0.L(32.0f)) * interpolation2);
        float i12 = Utilities.i(org.telegram.messenger.i0.T1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        u0Var3.setScaleX(i12);
        u0Var3.setScaleY(i12);
        float f10 = abs < 0.4f ? abs / 0.4f : 1.0f;
        u0Var.h = f10;
        u0Var2.h = f10;
        u0Var3.h = f10;
    }
}
