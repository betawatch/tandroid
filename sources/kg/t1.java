package kg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.k6;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t1 extends p80 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(int i10, Context context, p6 p6Var) {
        super(context, p6Var);
        this.L = i10;
    }

    @Override // org.telegram.ui.Components.p80
    public int a() {
        switch (this.L) {
            case 0:
                return 3;
            default:
                return super.a();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 4:
                if (getAlpha() < 0.9f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.p80, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.L) {
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p80, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.L) {
            case 1:
                super.setText(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 2:
                super.setText(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 3:
                super.setText(k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }
}
