// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aj3 extends ih3 {
    public final /* synthetic */ nk3 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj3(nk3 nk3Var, Context context, nk3 nk3Var2, int i, int i2) {
        super(context, nk3Var2, i, i2);
        this.P0 = nk3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        aVar = ((d) this.P0).actionBar;
        return !aVar.y() && super.dispatchTouchEvent(motionEvent);
    }
}
