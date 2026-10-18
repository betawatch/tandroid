package ci;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
