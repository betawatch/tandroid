package ci;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class s9 extends y {
    public final /* synthetic */ aa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(Context context, aa aaVar) {
        super(context);
        this.a = aaVar;
    }

    @Override // ci.y, android.view.View
    public final void invalidate() {
        super.invalidate();
        p4 p4Var = this.a.G0;
        if (p4Var != null) {
            p4Var.b();
        }
    }
}
