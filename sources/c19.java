// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c19 extends TextView {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c19(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                if (getPaddingLeft() > 0) {
                    canvas.drawCircle((getPaddingLeft() - hl.L(2.5f)) / 2.0f, hl.L(10.0f), hl.L(2.5f), getPaint());
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(hl.L(26.0f)), TLObject.FLAG_30));
                break;
            case 2:
            default:
                super.onMeasure(i, i2);
                break;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a.getCurrentActionBarHeight(), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 2:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 3:
            default:
                super.setText(charSequence, bufferType);
                break;
            case 4:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
        }
    }
}
