package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout {
    public final s1 a;
    public final p5 b;
    public final p5 c;
    public final p5 d;
    public boolean e;
    public final h6.m f;
    public final RectF h;

    public q5(Context context, org.telegram.ui.ActionBar.e6 e6Var, s1 s1Var) {
        super(context);
        this.f = new h6.m(29);
        this.h = new RectF();
        this.a = s1Var;
        p5 p5Var = new p5(context, e6Var);
        this.b = p5Var;
        p5 p5Var2 = new p5(context, e6Var);
        this.c = p5Var2;
        p5 p5Var3 = new p5(context, e6Var);
        this.d = p5Var3;
        addView(p5Var, c8.ja.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(p5Var2, c8.ja.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(p5Var3, c8.ja.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(g5 g5Var, float f10, boolean z10, g5 g5Var2, float f11, boolean z11, g5 g5Var3, float f12, boolean z12) {
        s1 s1Var = this.a;
        p5 p5Var = this.b;
        if (g5Var != null) {
            if (z10) {
                f10 = Math.max(0.5f, f10);
            }
            p5Var.setVisibility(0);
            p5Var.f(g5Var.a, g5Var.b, s1Var);
            p5Var.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            p5Var.setVisibility(4);
        }
        p5 p5Var2 = this.c;
        if (g5Var2 != null) {
            float f13 = f11;
            if (z11) {
                f13 = Math.max(0.5f, f13);
            }
            float f14 = (f13 - 0.5f) / 1.5f;
            p5Var2.setVisibility(0);
            p5Var2.f(g5Var2.a, g5Var2.b, s1Var);
            p5Var2.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f14);
            if (z11 && f14 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ah.h(p5Var2, 8));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            p5Var2.setVisibility(4);
        }
        p5 p5Var3 = this.d;
        if (g5Var3 == null) {
            p5Var3.setVisibility(4);
            return;
        }
        float f15 = f12;
        if (z12) {
            f15 = Math.max(0.5f, f15);
        }
        p5Var3.setVisibility(0);
        p5Var3.f(g5Var3.a, g5Var3.b, s1Var);
        p5Var3.setTranslationY(org.telegram.messenger.g0.L(36.0f) * ((f15 - 0.5f) / 1.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ns.e4, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float width = getWidth();
        float L = org.telegram.messenger.g0.L(8.0f);
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, width, L);
        h6.m mVar = this.f;
        mVar.m(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - org.telegram.messenger.g0.L(8.0f), getWidth(), getHeight());
        mVar.m(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.66f), TLObject.FLAG_30));
    }
}
