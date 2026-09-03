package kh;

import android.content.Context;
import android.view.MotionEvent;
import lh.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n extends bb {
    public final /* synthetic */ s j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, Context context, f6 f6Var) {
        super(context, f6Var);
        this.j0 = sVar;
    }

    @Override // lh.bb
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        s.U(this.j0);
        return true;
    }

    @Override // lh.bb, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // lh.bb
    public final void e(int i10) {
        s.T(this.j0, i10);
    }

    @Override // lh.bb
    public final void setValue(int i10) {
        super.setValue(i10);
        s.T(this.j0, i10);
    }
}
