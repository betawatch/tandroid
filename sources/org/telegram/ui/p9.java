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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p9 extends TextView {
    public final /* synthetic */ int a = 0;
    public final Paint b;
    public Path c;
    public Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(org.telegram.ui.Components.en0 en0Var, Context context) {
        super(context);
        this.e = en0Var;
        this.c = new Path();
        this.d = new RectF();
        this.b = new Paint();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int l1 = org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.o6, ((org.telegram.ui.Components.en0) this.e).c));
                Paint paint = this.b;
                paint.setColor(l1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.c;
                Paint paint2 = kg.r0.V;
                kg.r0.h(rectF, AndroidUtilities.rectTmp, path);
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
                org.telegram.ui.Components.s80 s80Var = (org.telegram.ui.Components.s80) this.c;
                if (s80Var != null) {
                    canvas.drawPath(s80Var, this.b);
                }
                if (((org.telegram.ui.Components.v80) this.e).f(canvas)) {
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                org.telegram.ui.Components.en0 en0Var = (org.telegram.ui.Components.en0) this.e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < en0Var.getChildCount(); i15++) {
                    width = Math.min(width, en0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, en0Var.getChildAt(i15).getRight());
                }
                setPivotX((width + i14) / 2.0f);
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
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.a51[] a51VarArr = (org.telegram.ui.Components.a51[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.a51.class);
                    if (a51VarArr != null && a51VarArr.length > 0) {
                        org.telegram.ui.Components.s80 s80Var = new org.telegram.ui.Components.s80(0);
                        this.c = s80Var;
                        s80Var.n = false;
                        for (int i12 = 0; i12 < a51VarArr.length; i12++) {
                            int spanStart = spanned.getSpanStart(a51VarArr[i12]);
                            int spanEnd = spanned.getSpanEnd(a51VarArr[i12]);
                            ((org.telegram.ui.Components.s80) this.c).d(getLayout(), spanStart, 0.0f);
                            int i13 = getText() != null ? getPaint().baselineShift : 0;
                            org.telegram.ui.Components.s80 s80Var2 = (org.telegram.ui.Components.s80) this.c;
                            s80Var2.o = i13 != 0 ? AndroidUtilities.dp(i13 > 0 ? 5.0f : -2.0f) + i13 : 0;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.s80) this.c);
                        }
                        ((org.telegram.ui.Components.s80) this.c).n = true;
                        break;
                    }
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.v80 v80Var = (org.telegram.ui.Components.v80) this.e;
                Layout layout = getLayout();
                float f9 = 0;
                int x4 = (int) (motionEvent.getX() - f9);
                int y8 = (int) (motionEvent.getY() - f9);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y8);
                    float f10 = x4;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && y8 >= 0 && y8 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            v80Var.d(true);
                            if (motionEvent.getAction() != 0) {
                                if (motionEvent.getAction() == 1) {
                                    org.telegram.ui.Components.z80 z80Var = (org.telegram.ui.Components.z80) this.d;
                                    if (z80Var != null) {
                                        CharacterStyle characterStyle = z80Var.i;
                                        ClickableSpan clickableSpan = clickableSpanArr[0];
                                        if (characterStyle == clickableSpan) {
                                            clickableSpan.onClick(this);
                                        }
                                    }
                                    this.d = null;
                                    break;
                                }
                            } else {
                                org.telegram.ui.Components.z80 z80Var2 = new org.telegram.ui.Components.z80(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = z80Var2;
                                z80Var2.d(771751935);
                                v80Var.a((org.telegram.ui.Components.z80) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.z80) this.d).i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.z80) this.d).i);
                                org.telegram.ui.Components.s80 b10 = ((org.telegram.ui.Components.z80) this.d).b();
                                b10.d(layout, spanStart, f9);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                break;
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    v80Var.d(true);
                    this.d = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(Context context, Paint paint) {
        super(context);
        this.b = paint;
        this.e = new org.telegram.ui.Components.v80(this);
    }
}
