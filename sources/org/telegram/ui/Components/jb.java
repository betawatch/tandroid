package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class jb extends w70 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.L = i7;
    }

    @Override // org.telegram.ui.Components.w70
    public int a() {
        switch (this.L) {
            case 4:
                return 3;
            default:
                return super.a();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 3:
                if (getAlpha() < 0.9f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
            default:
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
        }
    }

    @Override // org.telegram.ui.Components.w70, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.L) {
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w70, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.L) {
            case 0:
                super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 1:
                super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 2:
                super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }
}
