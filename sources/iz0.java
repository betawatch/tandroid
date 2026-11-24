// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iz0 extends a {
    public final /* synthetic */ ela G1;
    public final /* synthetic */ mz0 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(mz0 mz0Var, Context context, ela elaVar) {
        super(context, null);
        this.H1 = mz0Var;
        this.G1 = elaVar;
    }

    @Override // org.telegram.ui.ActionBar.a, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mz0 mz0Var = this.H1;
        if (mz0Var.F1 && mz0Var.G1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.G1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.H1.V0();
    }
}
