package di;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q extends EditTextBoldCursor {
    public final /* synthetic */ int M1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Context context, int i7) {
        super(context);
        this.M1 = i7;
    }

    @Override // org.telegram.ui.Components.pt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 1:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.view.View
    public void onDetachedFromWindow() {
        switch (this.M1) {
            case 0:
                super.onDetachedFromWindow();
                org.telegram.messenger.g0.v1(this);
                break;
            case 3:
                super.onDetachedFromWindow();
                org.telegram.messenger.g0.v1(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.M1) {
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 2:
                if (isEnabled()) {
                    break;
                }
                break;
            case 5:
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.g0.I3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 6:
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.g0.I3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
