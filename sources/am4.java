// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class am4 extends ImageButton {
    public final /* synthetic */ fm4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am4(fm4 fm4Var, Context context) {
        super(context);
        this.a = fm4Var;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
