// default package

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a30 extends dx9 {
    public final /* synthetic */ i30 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(i30 i30Var, Activity activity, ylb ylbVar) {
        super(ylbVar, activity, false);
        this.n0 = i30Var;
    }

    @Override // dx9
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.A2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
