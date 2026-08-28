package fh;

import android.content.Context;
import android.view.MotionEvent;
import gh.gb;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends gb {
    public final /* synthetic */ x i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.i0 = xVar;
    }

    @Override // gh.gb
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        x.T(this.i0);
        return true;
    }

    @Override // gh.gb, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // gh.gb
    public final void e(int i9) {
        x.S(this.i0, i9);
    }

    @Override // gh.gb
    public final void setValue(int i9) {
        super.setValue(i9);
        x.S(this.i0, i9);
    }
}
