package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j80 extends org.telegram.ui.ActionBar.h5 {
    public final org.telegram.ui.ActionBar.b6 I0;
    public final i80 J0;
    public m80 K0;

    public j80(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.J0 = new i80(this);
        this.I0 = b6Var;
    }

    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.J0.f(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        i80 i80Var = this.J0;
        if (i80Var != null) {
            Layout layout = getLayout();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            Layout layout2 = getLayout();
            if (layout2 != null) {
                int layoutX = (int) (x10 - getLayoutX());
                int layoutY = (int) (y10 - getLayoutY());
                int lineForVertical = layout2.getLineForVertical(layoutY);
                float f10 = layoutX;
                int offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f10);
                float lineLeft = layout2.getLineLeft(lineForVertical);
                if (lineLeft <= f10 && layout2.getLineWidth(lineForVertical) + lineLeft >= f10 && layoutY >= 0 && layoutY <= layout2.getHeight()) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout2.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                        clickableSpan = clickableSpanArr[0];
                        if (clickableSpan == null && motionEvent.getAction() == 0) {
                            m80 m80Var = new m80(clickableSpan, this.I0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.K0 = m80Var;
                            i80Var.a(m80Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.K0.i);
                            int spanEnd = spannableString.getSpanEnd(this.K0.i);
                            f80 b10 = this.K0.b();
                            b10.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b10);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            i80Var.d(true);
                            m80 m80Var2 = this.K0;
                            if (m80Var2 != null && (characterStyle = m80Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.K0 = null;
                                return true;
                            }
                            this.K0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            i80Var.d(true);
                            this.K0 = null;
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
        return this.K0 != null || super.onTouchEvent(motionEvent);
    }
}
