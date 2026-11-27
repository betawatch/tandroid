// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class g4b extends kea {
    public final /* synthetic */ s4b U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4b(s4b s4bVar, Context context, String str, String str2, vnb vnbVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = s4bVar;
    }

    @Override // kea, nx0
    public final void H() {
        super.H();
        e eVar = this.U2.F1;
        if (eVar instanceof zu1) {
            hl.V2(eVar.getParentActivity(), eVar.getClassGuid());
            if (((zu1) eVar).a0.getVisibility() == 0) {
                eVar.getFragmentView().requestLayout();
            }
        }
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            hl.d3(new a39(this, zh6Var, i, (byte) 18), 100L);
        }
    }
}
