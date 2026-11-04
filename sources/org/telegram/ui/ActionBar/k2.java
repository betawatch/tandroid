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
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.e00;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.m9;
import org.telegram.ui.js;
import org.telegram.ui.ma1;
import org.telegram.ui.p21;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k2 extends TextView {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.b = obj;
    }

    public void b(int i3) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        if (fragmentContextView.O != i3) {
            e00 e00Var = fragmentContextView.d;
            e00Var.setPadding(e00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.O) + i3, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.O = i3;
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
                ((FragmentContextView) this.b).P.a(org.telegram.messenger.g0.L(16.0f), canvas, rectF, this);
                break;
            case 6:
                super.draw(canvas);
                p21 p21Var = (p21) this.b;
                org.telegram.ui.Components.voip.g gVar = p21Var.c;
                if (gVar.g <= 1.0f) {
                    SessionsActivity sessionsActivity = p21Var.f;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        gVar.f = getMeasuredWidth();
                        gVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF2, null);
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
                hs.e().c((js) this.b, hs.i4);
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
                hs.e().n((js) this.b, hs.i4);
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
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.b).a(org.telegram.messenger.g0.L(22.0f), canvas, rectF, null);
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
                org.telegram.ui.Wallet.f6 f6Var = (org.telegram.ui.Wallet.f6) this.b;
                float e10 = f6Var.h0.e(false, f6Var.f0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                f6Var.c(e10, new org.telegram.ui.Wallet.c3(paint2, 3), new ma1(19, this, canvas));
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 8:
                super.onLayout(z10, i3, i10, i11, i12);
                if (z10) {
                    ((zb1) this.b).G();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i3, i10);
                t2 t2Var = (t2) this.b;
                if (t2Var.R) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = t2Var.O;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        break;
                    } else if (t2Var.b != null) {
                        for (int i11 = 1; i11 < t2Var.b.getChildCount(); i11++) {
                            View childAt = t2Var.b.getChildAt(i11);
                            if (childAt instanceof m2) {
                                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                measuredHeight = org.telegram.messenger.g0.L(48.0f) + measuredHeight;
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                super.onMeasure(i3, i10);
                b(getMeasuredWidth());
                break;
            case 3:
                super.onMeasure(i3, i10);
                if (bd.a0) {
                    ((d21) this.b).b.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 10:
                super.onMeasure(i3, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((m9) this.b).Y));
                break;
            case 11:
                super.onMeasure(i3, i10);
                ((org.telegram.ui.web.l1) this.b).c.setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i3, i10, i11, i12);
                ((FragmentContextView) this.b).P.f = getWidth();
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.r) this.b).O.getAlpha() - 1.0f) <= 0.001f) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        switch (this.a) {
            case 2:
                super.setVisibility(i3);
                if (i3 != 0) {
                    b(0);
                    ((FragmentContextView) this.b).O = 0;
                    break;
                }
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Activity activity, Paint paint) {
        super(activity);
        this.a = 7;
        this.b = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 5:
                super(context);
                this.b = new js(1, this);
                break;
            default:
                break;
        }
    }
}
