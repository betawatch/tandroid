package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class vb extends c90 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.L = i10;
    }

    @Override // org.telegram.ui.Components.c90
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
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.c90, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.L) {
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c90, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.L) {
            case 0:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 1:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 2:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }
}
