// default package

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class em2 extends EditTextBoldCursor {
    public final /* synthetic */ byte N1;
    public final /* synthetic */ int O1;
    public final /* synthetic */ p P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em2(p pVar, Context context, int i, byte b) {
        super(context);
        this.N1 = b;
        this.P1 = pVar;
        this.O1 = i;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.N1) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = hl.L(40.0f) + rect.bottom;
                return globalVisibleRect;
            default:
                return super.getGlobalVisibleRect(rect, point);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.N1) {
            case 1:
                super.invalidate();
                this.P1.F[this.O1 - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.N1) {
            case 0:
                EditTextBoldCursor[] editTextBoldCursorArr = this.P1.F;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    int i = this.O1 + 1;
                    if (editTextBoldCursorArr[i].isFocused()) {
                        hl.E3(editTextBoldCursorArr[i]);
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
                    hl.E3(this);
                    return super.onTouchEvent(motionEvent);
                }
                requestFocus();
                return false;
        }
    }
}
