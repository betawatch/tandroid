// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j46 extends jia {
    public final wjb N0;
    public final i46 O0;
    public m46 P0;

    public j46(Context context, wjb wjbVar) {
        super(context);
        this.O0 = new i46(this);
        this.N0 = wjbVar;
    }

    @Override // jia, android.view.View
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
    @Override // jia, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        i46 i46Var = this.O0;
        if (i46Var != null) {
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
                    if (clickableSpanArr.length != 0 && !gl.A1()) {
                        clickableSpan = clickableSpanArr[0];
                        if (clickableSpan == null && motionEvent.getAction() == 0) {
                            m46 m46Var = new m46(clickableSpan, this.N0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.P0 = m46Var;
                            i46Var.a(m46Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.P0.i);
                            int spanEnd = spannableString.getSpanEnd(this.P0.i);
                            b46 b = this.P0.b();
                            b.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            i46Var.e(true);
                            m46 m46Var2 = this.P0;
                            if (m46Var2 != null && (characterStyle = m46Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.P0 = null;
                                return true;
                            }
                            this.P0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            i46Var.e(true);
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
