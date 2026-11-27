// default package

import android.app.Activity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fb0 extends nb0 {
    public final /* synthetic */ eb0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(ob0 ob0Var, Activity activity, eb0 eb0Var) {
        super(ob0Var, activity);
        this.H = eb0Var;
    }

    @Override // nb0, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
