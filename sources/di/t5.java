package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public final q1 a;
    public final s5 b;
    public final s5 c;
    public final s5 d;
    public boolean e;
    public final h6.m f;
    public final RectF h;

    public t5(Context context, org.telegram.ui.ActionBar.h6 h6Var, q1 q1Var) {
        super(context);
        this.f = new h6.m(29);
        this.h = new RectF();
        this.a = q1Var;
        s5 s5Var = new s5(context, h6Var);
        this.b = s5Var;
        s5 s5Var2 = new s5(context, h6Var);
        this.c = s5Var2;
        s5 s5Var3 = new s5(context, h6Var);
        this.d = s5Var3;
        addView(s5Var, c8.ma.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(s5Var2, c8.ma.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(s5Var3, c8.ma.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(j5 j5Var, float f10, boolean z10, j5 j5Var2, float f11, boolean z11, j5 j5Var3, float f12, boolean z12) {
        q1 q1Var = this.a;
        s5 s5Var = this.b;
        if (j5Var != null) {
            if (z10) {
                f10 = Math.max(0.5f, f10);
            }
            s5Var.setVisibility(0);
            s5Var.f(j5Var.a, j5Var.b, q1Var);
            s5Var.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            s5Var.setVisibility(4);
        }
        s5 s5Var2 = this.c;
        if (j5Var2 != null) {
            float f13 = f11;
            if (z11) {
                f13 = Math.max(0.5f, f13);
            }
            float f14 = (f13 - 0.5f) / 1.5f;
            s5Var2.setVisibility(0);
            s5Var2.f(j5Var2.a, j5Var2.b, q1Var);
            s5Var2.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f14);
            if (z11 && f14 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ah.g(s5Var2, 8));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            s5Var2.setVisibility(4);
        }
        s5 s5Var3 = this.d;
        if (j5Var3 == null) {
            s5Var3.setVisibility(4);
            return;
        }
        float f15 = f12;
        if (z12) {
            f15 = Math.max(0.5f, f15);
        }
        s5Var3.setVisibility(0);
        s5Var3.f(j5Var3.a, j5Var3.b, q1Var);
        s5Var3.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f15 - 0.5f) / 1.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ls.e4, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float width = getWidth();
        float L = org.telegram.messenger.g0.L(8.0f);
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, width, L);
        h6.m mVar = this.f;
        mVar.n(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - org.telegram.messenger.g0.L(8.0f), getWidth(), getHeight());
        mVar.n(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.66f), TLObject.FLAG_30));
    }
}
