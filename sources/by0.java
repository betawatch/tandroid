// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class by0 extends a {
    public final /* synthetic */ cja G1;
    public final /* synthetic */ fy0 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(fy0 fy0Var, Context context, cja cjaVar) {
        super(context, null);
        this.H1 = fy0Var;
        this.G1 = cjaVar;
    }

    @Override // org.telegram.ui.ActionBar.a, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        fy0 fy0Var = this.H1;
        if (fy0Var.F1 && fy0Var.G1) {
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
