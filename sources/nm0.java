// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nm0 implements ed, nw4, no7 {
    public final /* synthetic */ fx0 a;

    public /* synthetic */ nm0(fx0 fx0Var) {
        this.a = fx0Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        return this.a.Y(vxcVar);
    }

    @Override // nw4
    public final int i() {
        return bkb.v0(bkb.g5, this.a.J0);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        this.a.dismiss();
        xu4.f1(false, null);
    }
}
