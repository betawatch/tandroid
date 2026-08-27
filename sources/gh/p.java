package gh;

import android.content.Context;
import android.view.MotionEvent;
import hh.gb;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p extends gb {
    public final /* synthetic */ v i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.i0 = vVar;
    }

    @Override // hh.gb
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        v.U(this.i0);
        return true;
    }

    @Override // hh.gb, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // hh.gb
    public final void e(int i10) {
        v.T(this.i0, i10);
    }

    @Override // hh.gb
    public final void setValue(int i10) {
        super.setValue(i10);
        v.T(this.i0, i10);
    }
}
