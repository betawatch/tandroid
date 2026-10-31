package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.t5 G1;
    public final org.telegram.ui.Components.t5 H1;
    public float I1;
    public float J1;
    public final /* synthetic */ q9 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(q9 q9Var, Context context) {
        super(context);
        this.K1 = q9Var;
        this.G1 = new org.telegram.ui.Components.t5(this, 180L, gr.h);
        this.H1 = new org.telegram.ui.Components.t5(this, 320L, q9.S);
        this.I1 = 1.0f;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f7 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.I1) + f7);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.I1) + f7);
        int i10 = bounds.left;
        int width = bounds.width();
        if (this.J1 > 0.0f) {
            float f10 = i10;
            i10 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f10) * this.J1) + f10);
        }
        gradientDrawable.setBounds(i10, round, width + i10, round2);
        gradientDrawable.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float lineLeft;
        int size;
        Editable text = getText();
        int max = Math.max(TextUtils.indexOf((CharSequence) text, '.'), TextUtils.indexOf((CharSequence) text, ','));
        int i10 = 0;
        this.I1 = this.G1.e(false, (max < 0 || getSelectionStart() <= max) ? 1.0f : 0.6363636f);
        this.J1 = this.H1.d(length() == 0);
        super.onDraw(canvas);
        q9 q9Var = this.K1;
        if (q9Var.I >= 1.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float textSize = paint.getTextSize();
        float compoundPaddingLeft = getCompoundPaddingLeft();
        if (length() != 0) {
            if (getLayout() != null) {
                lineLeft = getLayout().getLineLeft(0);
            }
            float f7 = compoundPaddingLeft;
            int baseline = getBaseline();
            ArrayList arrayList = q9Var.L;
            size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                o9 o9Var = (o9) obj;
                paint.setTextSize(o9Var.b ? (28.0f * textSize) / 44.0f : textSize);
                o9Var.c.b(canvas, paint, o9Var.a, f7, baseline);
            }
            paint.setTextSize(textSize);
        }
        lineLeft = getScrollX() + q9Var.N;
        compoundPaddingLeft += lineLeft;
        float f72 = compoundPaddingLeft;
        int baseline2 = getBaseline();
        ArrayList arrayList2 = q9Var.L;
        size = arrayList2.size();
        while (i10 < size) {
        }
        paint.setTextSize(textSize);
    }

    @Override // org.telegram.ui.Components.qt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (i10 != i11) {
            this.K1.b();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.K1.b();
            this.H1.a(length() == 0);
        }
        return super.onTouchEvent(motionEvent);
    }
}
