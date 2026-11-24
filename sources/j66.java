// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j66 extends lka {
    public final ylb N0;
    public final i66 O0;
    public m66 P0;

    public j66(Context context, ylb ylbVar) {
        super(context);
        this.O0 = new i66(this);
        this.N0 = ylbVar;
    }

    @Override // lka, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.O0.g(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    @Override // lka, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        i66 i66Var = this.O0;
        if (i66Var != null) {
            Layout layout = getLayout();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Layout layout2 = getLayout();
            if (layout2 != null) {
                int layoutX = (int) (x - getLayoutX());
                int layoutY = (int) (y - getLayoutY());
                int lineForVertical = layout2.getLineForVertical(layoutY);
                float f = layoutX;
                int offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f);
                float lineLeft = layout2.getLineLeft(lineForVertical);
                if (lineLeft <= f && layout2.getLineWidth(lineForVertical) + lineLeft >= f && layoutY >= 0 && layoutY <= layout2.getHeight()) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout2.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0 && !gm.A1()) {
                        clickableSpan = clickableSpanArr[0];
                        if (clickableSpan == null && motionEvent.getAction() == 0) {
                            m66 m66Var = new m66(clickableSpan, this.N0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.P0 = m66Var;
                            i66Var.a(m66Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.P0.i);
                            int spanEnd = spannableString.getSpanEnd(this.P0.i);
                            b66 b = this.P0.b();
                            b.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            i66Var.e(true);
                            m66 m66Var2 = this.P0;
                            if (m66Var2 != null && (characterStyle = m66Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.P0 = null;
                                return true;
                            }
                            this.P0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            i66Var.e(true);
                            this.P0 = null;
                        }
                    }
                }
            }
            clickableSpan = null;
            if (clickableSpan == null) {
            }
            if (motionEvent.getAction() == 1) {
            }
            if (motionEvent.getAction() == 3) {
            }
        }
        return this.P0 != null || super.onTouchEvent(motionEvent);
    }
}
