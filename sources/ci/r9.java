package ci;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class r9 extends y {
    public final /* synthetic */ z9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(Context context, z9 z9Var) {
        super(context);
        this.a = z9Var;
    }

    @Override // ci.y, android.view.View
    public final void invalidate() {
        super.invalidate();
        o4 o4Var = this.a.G0;
        if (o4Var != null) {
            o4Var.b();
        }
    }
}
