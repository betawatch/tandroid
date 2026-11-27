// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fx0 extends TextView {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 4:
                super(context);
                this.b = new nv2(this, (byte) 2);
                break;
            default:
                break;
        }
    }

    public final /* synthetic */ void a(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void b(int i) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        if (fragmentContextView.N != i) {
            sp4 sp4Var = fragmentContextView.d;
            sp4Var.setPadding(sp4Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.draw(canvas);
                int L = hl.L(1.0f);
                RectF rectF = hl.P;
                float f = L;
                rectF.set(f, f, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.b).O.a(hl.L(16.0f), canvas, rectF, this);
                break;
            case 5:
                super.draw(canvas);
                yaa yaaVar = (yaa) this.b;
                fe1 fe1Var = yaaVar.c;
                if (fe1Var.g <= 1.0f) {
                    SessionsActivity sessionsActivity = yaaVar.f;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = hl.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        fe1Var.f = getMeasuredWidth();
                        fe1Var.a(hl.L(8.0f), canvas, rectF2, null);
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 4:
                super.onAttachedToWindow();
                jn7.e().b((nv2) this.b, jn7.l4);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 4:
                super.onDetachedFromWindow();
                jn7.e().n((nv2) this.b, jn7.l4);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                fe1 fe1Var = (fe1) this.b;
                if (fe1Var == null) {
                    fe1Var = new fe1();
                    this.b = fe1Var;
                    fe1Var.k = false;
                    fe1Var.m = 2.0f;
                }
                fe1Var.f = getMeasuredWidth();
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((fe1) this.b).a(hl.L(22.0f), canvas, rectF, null);
                invalidate();
                break;
            case 6:
                super.onDraw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = hl.P;
                rectF2.set(hl.L(1.0f), hl.L(1.0f), getMeasuredWidth() - hl.L(1.0f), getMeasuredHeight() - hl.L(1.0f));
                canvas.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), paint);
                break;
            case 9:
                frc frcVar = (frc) this.b;
                float e = frcVar.h0.e(false, frcVar.f0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                frcVar.c(e, new ec1(paint2, (byte) 2), new vlc(this, canvas, (byte) 13));
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 8:
                super.onLayout(z, i, i2, i3, i4);
                if (z) {
                    ((mkc) this.b).y();
                    break;
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                nx0 nx0Var = (nx0) this.b;
                if (nx0Var.R) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = nx0Var.O;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        break;
                    } else if (nx0Var.b != null) {
                        for (int i3 = 1; i3 < nx0Var.b.getChildCount(); i3++) {
                            View childAt = nx0Var.b.getChildAt(i3);
                            if (childAt instanceof hx0) {
                                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                measuredHeight = hl.L(48.0f) + measuredHeight;
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                super.onMeasure(i, i2);
                b(getMeasuredWidth());
                break;
            case 7:
                super.onMeasure(i, i2);
                if (ob6.a0) {
                    ((o3c) this.b).b.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 10:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((euc) this.b).Y));
                break;
            case 11:
                super.onMeasure(i, i2);
                ((hxc) this.b).c.setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i, i2, i3, i4);
                ((FragmentContextView) this.b).O.f = getWidth();
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                if (Math.abs(((ka5) this.b).O.getAlpha() - 1.0f) <= 0.001f) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 2:
                super.setVisibility(i);
                if (i != 0) {
                    b(0);
                    ((FragmentContextView) this.b).N = 0;
                    break;
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(Activity activity, Paint paint) {
        super(activity);
        this.a = (byte) 6;
        this.b = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx0(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
