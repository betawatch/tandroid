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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.u5 H1;
    public final org.telegram.ui.Components.u5 I1;
    public float J1;
    public float K1;
    public final /* synthetic */ l9 L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(l9 l9Var, Context context) {
        super(context);
        this.L1 = l9Var;
        this.H1 = new org.telegram.ui.Components.u5(this, 180L, xq.h);
        this.I1 = new org.telegram.ui.Components.u5(this, 320L, l9.T);
        this.J1 = 1.0f;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f10 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.J1) + f10);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.J1) + f10);
        int i3 = bounds.left;
        int width = bounds.width();
        if (this.K1 > 0.0f) {
            float f11 = i3;
            i3 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f11) * this.K1) + f11);
        }
        gradientDrawable.setBounds(i3, round, width + i3, round2);
        gradientDrawable.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float lineLeft;
        int size;
        Editable text = getText();
        int max = Math.max(TextUtils.indexOf((CharSequence) text, '.'), TextUtils.indexOf((CharSequence) text, ','));
        int i3 = 0;
        this.J1 = this.H1.e(false, (max < 0 || getSelectionStart() <= max) ? 1.0f : 0.6363636f);
        this.K1 = this.I1.d(length() == 0);
        super.onDraw(canvas);
        l9 l9Var = this.L1;
        if (l9Var.J >= 1.0f) {
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
            ArrayList arrayList = l9Var.M;
            size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                j9 j9Var = (j9) obj;
                paint.setTextSize(j9Var.b ? (28.0f * textSize) / 44.0f : textSize);
                j9Var.c.b(canvas, paint, j9Var.a, f10, baseline);
            }
            paint.setTextSize(textSize);
        }
        lineLeft = getScrollX() + l9Var.O;
        compoundPaddingLeft += lineLeft;
        float f102 = compoundPaddingLeft;
        int baseline2 = getBaseline();
        ArrayList arrayList2 = l9Var.M;
        size = arrayList2.size();
        while (i3 < size) {
        }
        paint.setTextSize(textSize);
    }

    @Override // org.telegram.ui.Components.bt, android.widget.TextView
    public final void onSelectionChanged(int i3, int i10) {
        super.onSelectionChanged(i3, i10);
        if (i3 != i10) {
            this.L1.b();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.L1.b();
            this.I1.a(length() == 0);
        }
        return super.onTouchEvent(motionEvent);
    }
}
