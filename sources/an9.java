// default package

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class an9 implements ed, no7 {
    public final /* synthetic */ on9 a;

    public /* synthetic */ an9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        io5 g = vxcVar.a.g(647);
        on9 on9Var = this.a;
        on9Var.R = g;
        on9Var.f.requestLayout();
        return vxc.b;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        this.a.dismiss();
        kk7.e().k(kk7.u2, new Object[0]);
    }
}
