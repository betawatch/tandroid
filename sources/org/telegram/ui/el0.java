package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class el0 extends TextView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                super.dispatchDraw(canvas);
                canvas.drawCircle(org.telegram.messenger.i0.L(3.5f), org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(2.5f), getPaint());
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_31));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(org.telegram.messenger.i0.L(26.0f)), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 5:
                super.setText(org.telegram.messenger.k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }
}
