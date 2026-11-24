// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oh3 extends vf3 {
    public final /* synthetic */ cj3 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh3(cj3 cj3Var, Context context, cj3 cj3Var2, int i, int i2) {
        super(context, cj3Var2, i, i2);
        this.P0 = cj3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        aVar = ((d) this.P0).actionBar;
        return !aVar.y() && super.dispatchTouchEvent(motionEvent);
    }
}
