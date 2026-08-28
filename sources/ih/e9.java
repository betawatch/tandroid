package ih;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e9 extends x {
    public final /* synthetic */ m9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(Context context, m9 m9Var) {
        super(context);
        this.a = m9Var;
    }

    @Override // ih.x, android.view.View
    public final void invalidate() {
        super.invalidate();
        h4 h4Var = this.a.C0;
        if (h4Var != null) {
            h4Var.a();
        }
    }
}
