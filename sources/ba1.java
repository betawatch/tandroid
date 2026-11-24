// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ba1 extends TextView {
    public final /* synthetic */ byte a = 0;
    public final Paint b;
    public Path c;
    public Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba1(vs9 vs9Var, Context context) {
        super(context);
        this.e = vs9Var;
        this.c = new Path();
        this.d = new RectF();
        this.b = new Paint();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int p1 = bkb.p1(0.15f, bkb.v0(bkb.n6, ((vs9) this.e).c));
                Paint paint = this.b;
                paint.setColor(p1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.c;
                Paint paint2 = i19.S;
                i19.h(rectF, gl.P, path);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                b46 b46Var = (b46) this.c;
                if (b46Var != null) {
                    canvas.drawPath(b46Var, this.b);
                }
                if (((i46) this.e).g(canvas)) {
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                vs9 vs9Var = (vs9) this.e;
                super.onLayout(z, i, i2, i3, i4);
                int width = getWidth();
                int i5 = 0;
                for (int i6 = 0; i6 < vs9Var.getChildCount(); i6++) {
                    width = Math.min(width, vs9Var.getChildAt(i6).getLeft());
                    i5 = Math.max(i5, vs9Var.getChildAt(i6).getRight());
                }
                setPivotX((width + i5) / 2.0f);
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
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    g4c[] g4cVarArr = (g4c[]) spanned.getSpans(0, spanned.length(), g4c.class);
                    if (g4cVarArr != null && g4cVarArr.length > 0) {
                        b46 b46Var = new b46(0);
                        this.c = b46Var;
                        b46Var.n = false;
                        for (int i3 = 0; i3 < g4cVarArr.length; i3++) {
                            int spanStart = spanned.getSpanStart(g4cVarArr[i3]);
                            int spanEnd = spanned.getSpanEnd(g4cVarArr[i3]);
                            ((b46) this.c).d(getLayout(), spanStart, 0.0f);
                            int i4 = getText() != null ? getPaint().baselineShift : 0;
                            b46 b46Var2 = (b46) this.c;
                            b46Var2.o = i4 != 0 ? gl.L(i4 > 0 ? 5.0f : -2.0f) + i4 : 0;
                            getLayout().getSelectionPath(spanStart, spanEnd, (b46) this.c);
                        }
                        ((b46) this.c).n = true;
                        break;
                    }
                }
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                i46 i46Var = (i46) this.e;
                Layout layout = getLayout();
                int x = (int) (motionEvent.getX() - 0.0f);
                int y = (int) (motionEvent.getY() - 0.0f);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y);
                    float f = x;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f && layout.getLineWidth(lineForVertical) + lineLeft >= f && y >= 0 && y <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            i46Var.e(true);
                            if (motionEvent.getAction() != 0) {
                                if (motionEvent.getAction() == 1) {
                                    m46 m46Var = (m46) this.d;
                                    if (m46Var != null) {
                                        CharacterStyle characterStyle = m46Var.i;
                                        ClickableSpan clickableSpan = clickableSpanArr[0];
                                        if (characterStyle == clickableSpan) {
                                            clickableSpan.onClick(this);
                                        }
                                    }
                                    this.d = null;
                                    break;
                                }
                            } else {
                                m46 m46Var2 = new m46(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = m46Var2;
                                m46Var2.d(771751935);
                                i46Var.a((m46) this.d, null);
                                int spanStart = spannable.getSpanStart(((m46) this.d).i);
                                int spanEnd = spannable.getSpanEnd(((m46) this.d).i);
                                b46 b = ((m46) this.d).b();
                                b.d(layout, spanStart, 0.0f);
                                layout.getSelectionPath(spanStart, spanEnd, b);
                                break;
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    i46Var.e(true);
                    this.d = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba1(Context context, Paint paint) {
        super(context);
        this.b = paint;
        this.e = new i46(this);
    }
}
