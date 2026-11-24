// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class e8b extends sg5 {
    public final /* synthetic */ m8b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8b(m8b m8bVar, Context context) {
        super(context);
        this.a = m8bVar;
    }

    @Override // sg5, android.view.View
    public final void invalidate() {
        super.invalidate();
        c30 c30Var = this.a.G0;
        if (c30Var != null) {
            c30Var.m();
        }
    }
}
