// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class n66 extends ema {
    public final vnb N0;
    public final m66 O0;
    public q66 P0;

    public n66(Context context, vnb vnbVar) {
        super(context);
        this.O0 = new m66(this);
        this.N0 = vnbVar;
    }

    @Override // ema, android.view.View
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
    @Override // ema, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        m66 m66Var = this.O0;
        if (m66Var != null) {
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
                    if (clickableSpanArr.length != 0 && !hl.A1()) {
                        clickableSpan = clickableSpanArr[0];
                        if (clickableSpan == null && motionEvent.getAction() == 0) {
                            q66 q66Var = new q66(clickableSpan, this.N0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.P0 = q66Var;
                            m66Var.a(q66Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.P0.i);
                            int spanEnd = spannableString.getSpanEnd(this.P0.i);
                            f66 b = this.P0.b();
                            b.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            m66Var.e(true);
                            q66 q66Var2 = this.P0;
                            if (q66Var2 != null && (characterStyle = q66Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.P0 = null;
                                return true;
                            }
                            this.P0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            m66Var.e(true);
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
