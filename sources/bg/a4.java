package bg;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a4 extends i1 {
    public final /* synthetic */ c4 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(c4 c4Var, Context context, float f9) {
        super(context, f9);
        this.p0 = c4Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.p0.d.invalidate();
        super.invalidate();
    }
}
