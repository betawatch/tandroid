// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a31 extends l66 {
    public final /* synthetic */ byte M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a31(Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.M = b;
    }

    @Override // l66
    public final int a() {
        switch (this.M) {
            case 5:
                return 3;
            default:
                return super.a();
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M) {
            case 3:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (getAlpha() < 0.9f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // l66, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.M) {
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // l66, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.M) {
            case 0:
                super.setText(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 1:
                super.setText(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 2:
                super.setText(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }
}
