// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class br0 extends fr0 {
    public final /* synthetic */ gr0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(gr0 gr0Var, Context context) {
        super(gr0Var, context);
        this.w = gr0Var;
    }

    @Override // fr0, w39
    public final void f() {
        super.f();
        gr0 gr0Var = this.w;
        if (gr0Var.r.getVisibility() == 0) {
            gr0Var.x.f();
        }
        zya zyaVar = gr0Var.E;
        if (zyaVar != null) {
            s1b s1bVar = this.e;
            zyaVar.e(s1bVar != null && s1bVar.C, true);
        }
    }
}
