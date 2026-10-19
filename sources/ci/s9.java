package ci;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
