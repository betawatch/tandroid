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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ja1 extends TextView {
    public final /* synthetic */ byte a = 0;
    public final Paint b;
    public Path c;
    public Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja1(ow9 ow9Var, Context context) {
        super(context);
        this.e = ow9Var;
        this.c = new Path();
        this.d = new RectF();
        this.b = new Paint();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int p1 = aob.p1(0.15f, aob.v0(aob.o6, ((ow9) this.e).c));
                Paint paint = this.b;
                paint.setColor(p1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.c;
                Paint paint2 = x49.S;
                x49.h(rectF, hl.P, path);
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
                f66 f66Var = (f66) this.c;
                if (f66Var != null) {
                    canvas.drawPath(f66Var, this.b);
                }
                if (((m66) this.e).g(canvas)) {
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
                ow9 ow9Var = (ow9) this.e;
                super.onLayout(z, i, i2, i3, i4);
                int width = getWidth();
                int i5 = 0;
                for (int i6 = 0; i6 < ow9Var.getChildCount(); i6++) {
                    width = Math.min(width, ow9Var.getChildAt(i6).getLeft());
                    i5 = Math.max(i5, ow9Var.getChildAt(i6).getRight());
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
                    f8c[] f8cVarArr = (f8c[]) spanned.getSpans(0, spanned.length(), f8c.class);
                    if (f8cVarArr != null && f8cVarArr.length > 0) {
                        f66 f66Var = new f66(0);
                        this.c = f66Var;
                        f66Var.n = false;
                        for (int i3 = 0; i3 < f8cVarArr.length; i3++) {
                            int spanStart = spanned.getSpanStart(f8cVarArr[i3]);
                            int spanEnd = spanned.getSpanEnd(f8cVarArr[i3]);
                            ((f66) this.c).d(getLayout(), spanStart, 0.0f);
                            int i4 = getText() != null ? getPaint().baselineShift : 0;
                            f66 f66Var2 = (f66) this.c;
                            f66Var2.o = i4 != 0 ? hl.L(i4 > 0 ? 5.0f : -2.0f) + i4 : 0;
                            getLayout().getSelectionPath(spanStart, spanEnd, (f66) this.c);
                        }
                        ((f66) this.c).n = true;
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
                m66 m66Var = (m66) this.e;
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
                            m66Var.e(true);
                            if (motionEvent.getAction() != 0) {
                                if (motionEvent.getAction() == 1) {
                                    q66 q66Var = (q66) this.d;
                                    if (q66Var != null) {
                                        CharacterStyle characterStyle = q66Var.i;
                                        ClickableSpan clickableSpan = clickableSpanArr[0];
                                        if (characterStyle == clickableSpan) {
                                            clickableSpan.onClick(this);
                                        }
                                    }
                                    this.d = null;
                                    break;
                                }
                            } else {
                                q66 q66Var2 = new q66(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = q66Var2;
                                q66Var2.d(771751935);
                                m66Var.a((q66) this.d, null);
                                int spanStart = spannable.getSpanStart(((q66) this.d).i);
                                int spanEnd = spannable.getSpanEnd(((q66) this.d).i);
                                f66 b = ((q66) this.d).b();
                                b.d(layout, spanStart, 0.0f);
                                layout.getSelectionPath(spanStart, spanEnd, b);
                                break;
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    m66Var.e(true);
                    this.d = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja1(Context context, Paint paint) {
        super(context);
        this.b = paint;
        this.e = new m66(this);
    }
}
