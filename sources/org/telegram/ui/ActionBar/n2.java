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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.i21;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.o9;
import org.telegram.ui.c31;
import org.telegram.ui.jc1;
import org.telegram.ui.os;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n2 extends TextView {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    public void b(int i7) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        if (fragmentContextView.N != i7) {
            i00 i00Var = fragmentContextView.d;
            i00Var.setPadding(i00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i7, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i7;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.g0.L(1.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L;
                rectF.set(f10, f10, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.b).O.a(org.telegram.messenger.g0.L(16.0f), canvas, rectF, this);
                break;
            case 6:
                super.draw(canvas);
                c31 c31Var = (c31) this.b;
                org.telegram.ui.Components.voip.n nVar = c31Var.c;
                if (nVar.g <= 1.0f) {
                    SessionsActivity sessionsActivity = c31Var.f;
                    if (sessionsActivity.V && sessionsActivity.W) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        nVar.f = getMeasuredWidth();
                        nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF2, null);
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
                qs.e().c((os) this.b, qs.i4);
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
                qs.e().n((os) this.b, qs.i4);
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
                if (((org.telegram.ui.Components.voip.n) this.b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.b = nVar;
                    nVar.k = false;
                    nVar.m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.b).f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.b).a(org.telegram.messenger.g0.L(22.0f), canvas, rectF, null);
                invalidate();
                break;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                break;
            case 9:
                org.telegram.ui.Wallet.i6 i6Var = (org.telegram.ui.Wallet.i6) this.b;
                float e10 = i6Var.g0.e(false, i6Var.e0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                i6Var.c(e10, new org.telegram.ui.Wallet.c3(paint2, 3), new sb1(15, this, canvas));
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 8:
                super.onLayout(z9, i7, i10, i11, i12);
                if (z9) {
                    ((jc1) this.b).y();
                    break;
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, i10);
                w2 w2Var = (w2) this.b;
                if (w2Var.Q) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = w2Var.N;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        break;
                    } else if (w2Var.b != null) {
                        for (int i11 = 1; i11 < w2Var.b.getChildCount(); i11++) {
                            View childAt = w2Var.b.getChildAt(i11);
                            if (childAt instanceof p2) {
                                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                measuredHeight = org.telegram.messenger.g0.L(48.0f) + measuredHeight;
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                super.onMeasure(i7, i10);
                b(getMeasuredWidth());
                break;
            case 3:
                super.onMeasure(i7, i10);
                if (id.a0) {
                    ((i21) this.b).b.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 10:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((o9) this.b).X));
                break;
            case 11:
                super.onMeasure(i7, i10);
                ((org.telegram.ui.web.n1) this.b).c.setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                ((FragmentContextView) this.b).O.f = getWidth();
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.y) this.b).N.getAlpha() - 1.0f) <= 0.001f) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    b(0);
                    ((FragmentContextView) this.b).N = 0;
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Activity activity, Paint paint) {
        super(activity);
        this.a = 7;
        this.b = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 5:
                super(context);
                this.b = new os(1, this);
                break;
            default:
                break;
        }
    }
}
