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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class d9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.f6 b;
    public final org.telegram.ui.Components.f6 c;
    public float d;
    public float e;
    public final /* synthetic */ h9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(h9 h9Var, Context context) {
        super(context);
        this.f = h9Var;
        this.b = new org.telegram.ui.Components.f6(this, 180L, bs.h);
        this.c = new org.telegram.ui.Components.f6(this, 320L, h9.R);
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
        h9 h9Var = this.f;
        if (h9Var.H >= 1.0f) {
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
            ArrayList arrayList = h9Var.K;
            size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f9 f9Var = (f9) obj;
                paint.setTextSize(f9Var.b ? (28.0f * textSize) / 44.0f : textSize);
                f9Var.c.b(canvas, paint, f9Var.a, f7, baseline);
            }
            paint.setTextSize(textSize);
        }
        lineLeft = getScrollX() + h9Var.M;
        compoundPaddingLeft += lineLeft;
        float f72 = compoundPaddingLeft;
        int baseline2 = getBaseline();
        ArrayList arrayList2 = h9Var.K;
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
