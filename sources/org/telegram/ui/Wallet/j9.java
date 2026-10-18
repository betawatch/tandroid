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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class j9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.f6 b;
    public final org.telegram.ui.Components.f6 c;
    public float d;
    public float e;
    public final /* synthetic */ n9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(n9 n9Var, Context context) {
        super(context);
        this.f = n9Var;
        this.b = new org.telegram.ui.Components.f6(this, 180L, bs.h);
        this.c = new org.telegram.ui.Components.f6(this, 320L, n9.R);
        this.d = 1.0f;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void drawCursor(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(AndroidUtilities.dpf2(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f7 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.d) + f7);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.d) + f7);
        int i10 = bounds.left;
        int width = bounds.width();
        if (this.e > 0.0f) {
            float f10 = i10;
            i10 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f10) * this.e) + f10);
        }
        gradientDrawable.setBounds(i10, round, width + i10, round2);
        super.drawCursor(canvas, gradientDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float lineLeft;
        int size;
        Editable text = getText();
        int max = Math.max(TextUtils.indexOf((CharSequence) text, '.'), TextUtils.indexOf((CharSequence) text, ','));
        int i10 = 0;
        this.d = this.b.d((max < 0 || getSelectionStart() <= max) ? 1.0f : 0.6363636f, false);
        this.e = this.c.e(length() == 0);
        super.onDraw(canvas);
        n9 n9Var = this.f;
        if (n9Var.H >= 1.0f) {
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
            ArrayList arrayList = n9Var.K;
            size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                l9 l9Var = (l9) obj;
                paint.setTextSize(l9Var.b ? (28.0f * textSize) / 44.0f : textSize);
                l9Var.c.b(canvas, paint, l9Var.a, f7, baseline);
            }
            paint.setTextSize(textSize);
        }
        lineLeft = getScrollX() + n9Var.M;
        compoundPaddingLeft += lineLeft;
        float f72 = compoundPaddingLeft;
        int baseline2 = getBaseline();
        ArrayList arrayList2 = n9Var.K;
        size = arrayList2.size();
        while (i10 < size) {
        }
        paint.setTextSize(textSize);
    }

    @Override // org.telegram.ui.Components.ku, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (i10 != i11) {
            this.f.b();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f.b();
            this.c.a(length() == 0);
        }
        return super.onTouchEvent(motionEvent);
    }
}
