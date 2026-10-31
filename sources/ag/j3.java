package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.messenger.k6;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.h4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j3 extends TextView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                if (getPaddingLeft() > 0) {
                    canvas.drawCircle((getPaddingLeft() - org.telegram.messenger.i0.L(2.5f)) / 2.0f, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.5f), getPaint());
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        switch (this.a) {
            case 1:
                return Button.class.getName();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return super.getAccessibilityClassName();
            case 11:
                return Button.class.getName();
            case 12:
                return Button.class.getName();
            case 13:
                return Button.class.getName();
            case 14:
                return Button.class.getName();
            case 15:
                return Button.class.getName();
            case 16:
                return Button.class.getName();
            case 17:
                return Button.class.getName();
            case 18:
                return Button.class.getName();
            case 19:
                return Button.class.getName();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, h4.s1);
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(220.0f)), View.MeasureSpec.getMode(i10)), i11);
                break;
            case 8:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout = getLayout();
                    int i12 = 0;
                    for (int i13 = 0; i13 < layout.getLineCount(); i13++) {
                        i12 = Math.max(i12, (int) Math.ceil(layout.getLineWidth(i13)));
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i12, TLObject.FLAG_30);
                }
                super.onMeasure(i10, i11);
                break;
            case 9:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout2 = getLayout();
                    int i14 = 0;
                    for (int i15 = 0; i15 < layout2.getLineCount(); i15++) {
                        i14 = Math.max(i14, (int) Math.ceil(layout2.getLineWidth(i15)));
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i14, TLObject.FLAG_30);
                }
                super.onMeasure(i10, i11);
                break;
            case 10:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout3 = getLayout();
                    int i16 = 0;
                    for (int i17 = 0; i17 < layout3.getLineCount(); i17++) {
                        i16 = Math.max(i16, (int) Math.ceil(layout3.getLineWidth(i17)));
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i16, TLObject.FLAG_30);
                }
                super.onMeasure(i10, i11);
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 23:
            default:
                super.onMeasure(i10, i11);
                break;
            case 21:
                super.onMeasure(i10, i11);
                try {
                    Layout layout4 = getLayout();
                    if (layout4.getLineCount() <= 1) {
                        break;
                    } else {
                        int i18 = 0;
                        for (int lineCount = layout4.getLineCount() - 1; lineCount >= 0; lineCount--) {
                            i18 = Math.max(i18, Math.round(layout4.getPaint().measureText(getText(), layout4.getLineStart(lineCount), layout4.getLineEnd(lineCount))));
                        }
                        super.onMeasure(Math.min(i18 + getPaddingLeft() + getPaddingRight(), getMeasuredWidth()) | TLObject.FLAG_30, 1073741824 | getMeasuredHeight());
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 22:
                super.onMeasure(i10, i11);
                break;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(8.0f)) / 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), TLObject.FLAG_30));
                break;
            case 25:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(8.0f)) / 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), TLObject.FLAG_30));
                break;
            case 26:
                if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                    i10 = z20.c(52.0f, View.MeasureSpec.getSize(i10), TLObject.FLAG_31);
                }
                super.onMeasure(i10, i11);
                break;
            case 27:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_31));
                break;
            case 28:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(100.0f)), TLObject.FLAG_31));
                break;
            case 29:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_31));
                break;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 3:
                super.setText(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 4:
                super.setText(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 5:
                super.setText(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 6:
                super.setText(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 20:
                super.setText(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }
}
