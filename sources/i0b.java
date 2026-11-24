// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i0b extends taa {
    public final /* synthetic */ u0b U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0b(u0b u0bVar, Context context, String str, String str2, wjb wjbVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.U2 = u0bVar;
    }

    @Override // taa, fx0
    public final void I() {
        super.I();
        d dVar = this.U2.F1;
        if (dVar instanceof mu1) {
            gl.V2(dVar.getParentActivity(), dVar.getClassGuid());
            if (((mu1) dVar).a0.getVisibility() == 0) {
                dVar.getFragmentView().requestLayout();
            }
        }
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            gl.d3(new t79(this, vf6Var, i, (byte) 17), 100L);
        }
    }
}
