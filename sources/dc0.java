// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dc0 extends lc0 {
    public final /* synthetic */ cc0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(mc0 mc0Var, Activity activity, cc0 cc0Var) {
        super(mc0Var, activity);
        this.H = cc0Var;
    }

    @Override // lc0, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
