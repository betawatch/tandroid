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
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class y9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.d6 M1;
    public final org.telegram.ui.Components.d6 N1;
    public float O1;
    public float P1;
    public final /* synthetic */ ca Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(ca caVar, Context context) {
        super(context);
        this.Q1 = caVar;
        this.M1 = new org.telegram.ui.Components.d6(this, 180L, nr.h);
        this.N1 = new org.telegram.ui.Components.d6(this, 320L, ca.T);
        this.O1 = 1.0f;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f10 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.O1) + f10);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.O1) + f10);
        int i7 = bounds.left;
        int width = bounds.width();
        if (this.P1 > 0.0f) {
            float f11 = i7;
            i7 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f11) * this.P1) + f11);
        }
        gradientDrawable.setBounds(i7, round, width + i7, round2);
        gradientDrawable.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float lineLeft;
        int size;
        Editable text = getText();
        int max = Math.max(TextUtils.indexOf((CharSequence) text, '.'), TextUtils.indexOf((CharSequence) text, ','));
        int i7 = 0;
        this.O1 = this.M1.e(false, (max < 0 || getSelectionStart() <= max) ? 1.0f : 0.6363636f);
        this.P1 = this.N1.d(length() == 0);
        super.onDraw(canvas);
        ca caVar = this.Q1;
        if (caVar.J >= 1.0f) {
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
            ArrayList arrayList = caVar.M;
            size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                aa aaVar = (aa) obj;
                paint.setTextSize(aaVar.b ? (28.0f * textSize) / 44.0f : textSize);
                aaVar.c.b(canvas, paint, aaVar.a, f10, baseline);
            }
            paint.setTextSize(textSize);
        }
        lineLeft = getScrollX() + caVar.O;
        compoundPaddingLeft += lineLeft;
        float f102 = compoundPaddingLeft;
        int baseline2 = getBaseline();
        ArrayList arrayList2 = caVar.M;
        size = arrayList2.size();
        while (i7 < size) {
        }
        paint.setTextSize(textSize);
    }

    @Override // org.telegram.ui.Components.rt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        if (i7 != i10) {
            this.Q1.b();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.Q1.b();
            this.N1.a(length() == 0);
        }
        return super.onTouchEvent(motionEvent);
    }
}
