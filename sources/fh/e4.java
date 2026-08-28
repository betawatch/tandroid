package fh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e4 extends l80 {
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.H = i9;
    }

    @Override // org.telegram.ui.Components.l80
    public int a() {
        switch (this.H) {
            case 5:
                return 3;
            default:
                return super.a();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 4:
                if (getAlpha() < 0.9f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.l80, android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.H) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l80, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.H) {
            case 1:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 2:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 3:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }
}
