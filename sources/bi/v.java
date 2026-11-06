package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v extends EditTextBoldCursor {
    public final /* synthetic */ int G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Context context, int i7) {
        super(context);
        this.G1 = i7;
    }

    @Override // org.telegram.ui.Components.ct, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 1:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ct, android.view.View
    public void onDetachedFromWindow() {
        switch (this.G1) {
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
        switch (this.G1) {
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
        switch (this.G1) {
            case 2:
                if (isEnabled()) {
                    break;
                }
                break;
            case 5:
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.g0.K3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 6:
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.g0.K3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
