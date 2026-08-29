package ih;

import android.content.Context;
import android.view.MotionEvent;
import jh.ab;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends ab {
    public final /* synthetic */ t i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.i0 = tVar;
    }

    @Override // jh.ab
    public final boolean d(float f9) {
        if (getProgress() <= 0.99d && f9 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        t.U(this.i0);
        return true;
    }

    @Override // jh.ab, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // jh.ab
    public final void e(int i10) {
        t.T(this.i0, i10);
    }

    @Override // jh.ab
    public final void setValue(int i10) {
        super.setValue(i10);
        t.T(this.i0, i10);
    }
}
