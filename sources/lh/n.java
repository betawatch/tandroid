package lh;

import android.content.Context;
import android.view.MotionEvent;
import mh.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class n extends bb {
    public final /* synthetic */ s j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, Context context, g6 g6Var) {
        super(context, g6Var);
        this.j0 = sVar;
    }

    @Override // mh.bb
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        s.U(this.j0);
        return true;
    }

    @Override // mh.bb, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // mh.bb
    public final void e(int i10) {
        s.T(this.j0, i10);
    }

    @Override // mh.bb
    public final void setValue(int i10) {
        super.setValue(i10);
        s.T(this.j0, i10);
    }
}
