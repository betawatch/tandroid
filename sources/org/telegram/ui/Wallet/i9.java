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
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class i9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.w5 G1;
    public final org.telegram.ui.Components.w5 H1;
    public float I1;
    public float J1;
    public final /* synthetic */ m9 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(m9 m9Var, Context context) {
        super(context);
        this.K1 = m9Var;
        this.G1 = new org.telegram.ui.Components.w5(this, 180L, xq.h);
        this.H1 = new org.telegram.ui.Components.w5(this, 320L, m9.S);
        this.I1 = 1.0f;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f10 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.I1) + f10);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.I1) + f10);
        int i7 = bounds.left;
        int width = bounds.width();
        if (this.J1 > 0.0f) {
            float f11 = i7;
            i7 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f11) * this.J1) + f11);
        }
        gradientDrawable.setBounds(i7, round, width + i7, round2);
        gradientDrawable.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ct, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float lineLeft;
        int size;
        Editable text = getText();
        int max = Math.max(TextUtils.indexOf((CharSequence) text, '.'), TextUtils.indexOf((CharSequence) text, ','));
        int i7 = 0;
        this.I1 = this.G1.e(false, (max < 0 || getSelectionStart() <= max) ? 1.0f : 0.6363636f);
        this.J1 = this.H1.d(length() == 0);
        super.onDraw(canvas);
        m9 m9Var = this.K1;
        if (m9Var.I >= 1.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float textSize = paint.getTextSize();
        float compoundPaddingLeft = getCompoundPaddingLeft();
        if (length() != 0) {
            if (getLayout() != null) {
                lineLeft = getLayout().getLineLeft(0);
            }
            float f10 = compoundPaddingLeft;
            int baseline = getBaseline();
            ArrayList arrayList = m9Var.L;
            size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                k9 k9Var = (k9) obj;
                paint.setTextSize(k9Var.b ? (28.0f * textSize) / 44.0f : textSize);
                k9Var.c.b(canvas, paint, k9Var.a, f10, baseline);
            }
            paint.setTextSize(textSize);
        }
        lineLeft = getScrollX() + m9Var.N;
        compoundPaddingLeft += lineLeft;
        float f102 = compoundPaddingLeft;
        int baseline2 = getBaseline();
        ArrayList arrayList2 = m9Var.L;
        size = arrayList2.size();
        while (i7 < size) {
        }
        paint.setTextSize(textSize);
    }

    @Override // org.telegram.ui.Components.ct, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        if (i7 != i10) {
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
