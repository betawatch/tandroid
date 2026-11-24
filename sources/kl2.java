// default package

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kl2 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1;
    public final /* synthetic */ int N1;
    public final /* synthetic */ p O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl2(p pVar, Context context, int i, byte b) {
        super(context);
        this.M1 = b;
        this.O1 = pVar;
        this.N1 = i;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.M1) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = gl.L(40.0f) + rect.bottom;
                return globalVisibleRect;
            default:
                return super.getGlobalVisibleRect(rect, point);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.M1) {
            case 1:
                super.invalidate();
                this.O1.F[this.N1 - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 0:
                EditTextBoldCursor[] editTextBoldCursorArr = this.O1.F;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    int i = this.N1 + 1;
                    if (editTextBoldCursorArr[i].isFocused()) {
                        gl.F3(editTextBoldCursorArr[i]);
                    } else {
                        editTextBoldCursorArr[i].requestFocus();
                    }
                }
                return false;
            default:
                if (getAlpha() != 1.0f) {
                    return false;
                }
                if (isFocused()) {
                    gl.F3(this);
                    return super.onTouchEvent(motionEvent);
                }
                requestFocus();
                return false;
        }
    }
}
