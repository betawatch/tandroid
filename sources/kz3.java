// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kz3 extends jz3 {
    public final /* synthetic */ lz3 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz3(lz3 lz3Var, Context context, int i) {
        super(lz3Var.s, context, i);
        this.P = lz3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
