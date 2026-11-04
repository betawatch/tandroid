package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q9 extends TextView {
    public final /* synthetic */ int a = 0;
    public final Paint b;
    public Path c;
    public Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(org.telegram.ui.Components.tl0 tl0Var, Context context) {
        super(context);
        this.e = tl0Var;
        this.c = new Path();
        this.d = new RectF();
        this.b = new Paint();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.o6, ((org.telegram.ui.Components.tl0) this.e).c));
                Paint paint = this.b;
                paint.setColor(r12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.c;
                Paint paint2 = dh.o0.S;
                dh.o0.h(rectF, org.telegram.messenger.g0.P, path);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.c;
                if (n70Var != null) {
                    canvas.drawPath(n70Var, this.b);
                }
                if (((m2.p0) this.e).h(canvas)) {
                    invalidate();
                }
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                org.telegram.ui.Components.tl0 tl0Var = (org.telegram.ui.Components.tl0) this.e;
                super.onLayout(z10, i3, i10, i11, i12);
                int width = getWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < tl0Var.getChildCount(); i14++) {
                    width = Math.min(width, tl0Var.getChildAt(i14).getLeft());
                    i13 = Math.max(i13, tl0Var.getChildAt(i14).getRight());
                }
                setPivotX((width + i13) / 2.0f);
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
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.v31[] v31VarArr = (org.telegram.ui.Components.v31[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.v31.class);
                    if (v31VarArr != null && v31VarArr.length > 0) {
                        org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(0);
                        this.c = n70Var;
                        n70Var.n = false;
                        for (int i11 = 0; i11 < v31VarArr.length; i11++) {
                            int spanStart = spanned.getSpanStart(v31VarArr[i11]);
                            int spanEnd = spanned.getSpanEnd(v31VarArr[i11]);
                            ((org.telegram.ui.Components.n70) this.c).d(getLayout(), spanStart, 0.0f);
                            int i12 = getText() != null ? getPaint().baselineShift : 0;
                            org.telegram.ui.Components.n70 n70Var2 = (org.telegram.ui.Components.n70) this.c;
                            n70Var2.o = i12 != 0 ? org.telegram.messenger.g0.L(i12 > 0 ? 5.0f : -2.0f) + i12 : 0;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.n70) this.c);
                        }
                        ((org.telegram.ui.Components.n70) this.c).n = true;
                        break;
                    }
                }
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                m2.p0 p0Var = (m2.p0) this.e;
                Layout layout = getLayout();
                float f10 = 0;
                int x10 = (int) (motionEvent.getX() - f10);
                int y9 = (int) (motionEvent.getY() - f10);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y9);
                    float f11 = x10;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f11);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f11 && layout.getLineWidth(lineForVertical) + lineLeft >= f11 && y9 >= 0 && y9 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            p0Var.f(true);
                            if (motionEvent.getAction() != 0) {
                                if (motionEvent.getAction() == 1) {
                                    org.telegram.ui.Components.t70 t70Var = (org.telegram.ui.Components.t70) this.d;
                                    if (t70Var != null) {
                                        CharacterStyle characterStyle = t70Var.i;
                                        ClickableSpan clickableSpan = clickableSpanArr[0];
                                        if (characterStyle == clickableSpan) {
                                            clickableSpan.onClick(this);
                                        }
                                    }
                                    this.d = null;
                                    break;
                                }
                            } else {
                                org.telegram.ui.Components.t70 t70Var2 = new org.telegram.ui.Components.t70(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = t70Var2;
                                t70Var2.d(771751935);
                                p0Var.b((org.telegram.ui.Components.t70) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.t70) this.d).i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.t70) this.d).i);
                                org.telegram.ui.Components.n70 b10 = ((org.telegram.ui.Components.t70) this.d).b();
                                b10.d(layout, spanStart, f10);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                break;
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    p0Var.f(true);
                    this.d = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(Context context, Paint paint) {
        super(context);
        this.b = paint;
        this.e = new m2.p0(this);
    }
}
