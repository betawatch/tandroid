package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s extends EditTextBoldCursor {
    public final /* synthetic */ int H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Context context, int i3) {
        super(context);
        this.H1 = i3;
    }

    @Override // org.telegram.ui.Components.bt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H1) {
            case 1:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.view.View
    public void onDetachedFromWindow() {
        switch (this.H1) {
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
    public void onMeasure(int i3, int i10) {
        switch (this.H1) {
            case 4:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.H1) {
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
