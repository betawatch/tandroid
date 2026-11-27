// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ii3 extends pg3 {
    public final /* synthetic */ uj3 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii3(uj3 uj3Var, Context context, uj3 uj3Var2, int i, int i2) {
        super(context, uj3Var2, i, i2);
        this.P0 = uj3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        aVar = ((e) this.P0).actionBar;
        return !aVar.z() && super.dispatchTouchEvent(motionEvent);
    }
}
