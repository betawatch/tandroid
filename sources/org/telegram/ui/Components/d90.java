package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d90 extends org.telegram.ui.ActionBar.k5 {
    public final org.telegram.ui.ActionBar.f6 J0;
    public final c90 K0;
    public g90 L0;

    public d90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K0 = new c90(this);
        this.J0 = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.K0.f(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        c90 c90Var = this.K0;
        if (c90Var != null) {
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
                            g90 g90Var = new g90(clickableSpan, this.J0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.L0 = g90Var;
                            c90Var.a(g90Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.L0.i);
                            int spanEnd = spannableString.getSpanEnd(this.L0.i);
                            y80 b10 = this.L0.b();
                            b10.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b10);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            c90Var.d(true);
                            g90 g90Var2 = this.L0;
                            if (g90Var2 != null && (characterStyle = g90Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.L0 = null;
                                return true;
                            }
                            this.L0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            c90Var.d(true);
                            this.L0 = null;
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
        return this.L0 != null || super.onTouchEvent(motionEvent);
    }
}
