package org.telegram.ui.ActionBar;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.w00;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.be1;
import org.telegram.ui.mt;
import org.telegram.ui.q41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q2 extends TextView {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    public void b(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        if (fragmentContextView.N != i10) {
            w00 w00Var = fragmentContextView.d;
            w00Var.setPadding(w00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i10;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.i0.L(1.0f);
                RectF rectF = org.telegram.messenger.i0.P;
                float f7 = L;
                rectF.set(f7, f7, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.b).O.a(org.telegram.messenger.i0.L(16.0f), canvas, rectF, this);
                break;
            case 6:
                super.draw(canvas);
                q41 q41Var = (q41) this.b;
                org.telegram.ui.Components.voip.g gVar = q41Var.c;
                if (gVar.g <= 1.0f) {
                    SessionsActivity sessionsActivity = q41Var.f;
                    if (sessionsActivity.V && sessionsActivity.W) {
                        RectF rectF2 = org.telegram.messenger.i0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        gVar.f = getMeasuredWidth();
                        gVar.a(org.telegram.messenger.i0.L(8.0f), canvas, rectF2, null);
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
    public void onAttachedToWindow() {
        switch (this.a) {
            case 5:
                super.onAttachedToWindow();
                zs.e().c((mt) this.b, zs.i4);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 5:
                super.onDetachedFromWindow();
                zs.e().n((mt) this.b, zs.i4);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.g) this.b) == null) {
                    org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
                    this.b = gVar;
                    gVar.k = false;
                    gVar.m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.g) this.b).f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.b).a(org.telegram.messenger.i0.L(22.0f), canvas, rectF, null);
                invalidate();
                break;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                break;
            case 9:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) this.b;
                float e = l6Var.g0.e(false, l6Var.e0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                l6Var.c(e, new org.telegram.ui.Wallet.d3(paint2, 3), new org.telegram.ui.Wallet.k3(7, this, canvas));
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    ((be1) this.b).G();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, i11);
                z2 z2Var = (z2) this.b;
                if (z2Var.Q) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = z2Var.N;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        break;
                    } else if (z2Var.b != null) {
                        for (int i12 = 1; i12 < z2Var.b.getChildCount(); i12++) {
                            View childAt = z2Var.b.getChildAt(i12);
                            if (childAt instanceof s2) {
                                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                measuredHeight = org.telegram.messenger.i0.L(48.0f) + measuredHeight;
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                super.onMeasure(i10, i11);
                b(getMeasuredWidth());
                break;
            case 3:
                super.onMeasure(i10, i11);
                if (cd.X) {
                    ((k31) this.b).b.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 10:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((r9) this.b).X));
                break;
            case 11:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.o1) this.b).c.setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.b).O.f = getWidth();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.r) this.b).N.getAlpha() - 1.0f) <= 0.001f) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 2:
                super.setVisibility(i10);
                if (i10 != 0) {
                    b(0);
                    ((FragmentContextView) this.b).N = 0;
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(Activity activity, Paint paint) {
        super(activity);
        this.a = 7;
        this.b = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 5:
                super(context);
                this.b = new mt(1, this);
                break;
            default:
                break;
        }
    }
}
