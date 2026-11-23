package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class r5 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ sg.j0 c;
    public final /* synthetic */ pa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(pa paVar, Context context, sg.j0 j0Var) {
        super(context);
        this.d = paVar;
        this.c = j0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = paVar.h1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        pa paVar = this.d;
        sg.g1 g1Var = paVar.k1;
        Paint paint = paVar.i1;
        Paint paint2 = paVar.h1;
        Paint paint3 = paVar.j1;
        barView = paVar.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        int left = barView.getLeft();
        d5 d5Var = paVar.g1;
        rectF.set(org.telegram.messenger.g0.W1(paVar.n1, left, d5Var.getLeft()), org.telegram.messenger.g0.W1(paVar.n1, barView.getTop(), d5Var.getTop()), org.telegram.messenger.g0.W1(paVar.n1, barView.getRight(), d5Var.getRight()), org.telegram.messenger.g0.W1(paVar.n1, barView.getBottom(), d5Var.getBottom()));
        float W1 = org.telegram.messenger.g0.W1(paVar.n1, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        canvas2.drawRoundRect(rectF, W1, W1, paVar.o1);
        if (barView.getChildCount() < 1 || paVar.n1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof tg.j1) {
            childAt = ((tg.j1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - paVar.n1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i7 = g1Var.a;
            int i10 = paVar.J0;
            View view = childAt;
            if (i10 != -1) {
                ViewGroup viewGroup = i10 == 0 ? paVar.U0 : i10 == 2 ? paVar.V0 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof tg.j1) {
                    childAt2 = ((tg.j1) viewGroup).getColorClickableView();
                }
                x10 = org.telegram.messenger.g0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), paVar.K0);
                y10 = org.telegram.messenger.g0.T1(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), paVar.K0);
            }
            if (d5Var != null && d5Var.getChildCount() > 0) {
                View childAt3 = d5Var.getChildAt(0);
                x10 = org.telegram.messenger.g0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (d5Var.getX() - barView.getLeft()), paVar.n1);
                y10 = org.telegram.messenger.g0.T1(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (d5Var.getY() - barView.getTop()), paVar.n1);
                i7 = i0.a.f(paVar.n1, g1Var.a, this.c.b(0));
            }
            float f10 = x10;
            float f11 = y10;
            if (f10 != this.a || f11 != this.b) {
                this.a = f10;
                this.b = f11;
                paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.g0.L(0.5f);
            if (d5Var != null && d5Var.getChildCount() > 0) {
                View childAt4 = d5Var.getChildAt(0);
                min = org.telegram.messenger.g0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), paVar.n1);
            }
            float f12 = min;
            rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(i7);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(i7);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float L = f12 - org.telegram.messenger.g0.L(3.0f);
            if (d5Var != null && d5Var.getSelectedColorIndex() != 0) {
                L = org.telegram.messenger.g0.T1(f12 - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(2.0f) + f12, paVar.n1);
            }
            tg.d1.A1(f10, f11, L, paint.getColor(), canvas2);
            if (d5Var != null && d5Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * paVar.n1));
                canvas2.drawCircle(f10, f11, com.google.android.gms.internal.vision.e2.t(1.0f, paVar.n1, paint3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f), f12), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        c5 c5Var = this.d.E0;
        if (c5Var != null) {
            c5Var.invalidate();
        }
    }
}
