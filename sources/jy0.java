// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jy0 extends a {
    public final /* synthetic */ wma G1;
    public final /* synthetic */ ny0 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(ny0 ny0Var, Context context, wma wmaVar) {
        super(context, null);
        this.H1 = ny0Var;
        this.G1 = wmaVar;
    }

    @Override // org.telegram.ui.ActionBar.a, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ny0 ny0Var = this.H1;
        if (ny0Var.F1 && ny0Var.G1) {
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
        this.H1.W0();
    }
}
