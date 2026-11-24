// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l2b extends tca {
    public final /* synthetic */ x2b U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2b(x2b x2bVar, Context context, String str, String str2, ylb ylbVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = x2bVar;
    }

    @Override // tca, my0
    public final void H() {
        super.H();
        d dVar = this.U2.F1;
        if (dVar instanceof yv1) {
            gm.V2(dVar.getParentActivity(), dVar.getClassGuid());
            if (((yv1) dVar).a0.getVisibility() == 0) {
                dVar.getFragmentView().requestLayout();
            }
        }
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            gm.d3(new v99(this, vh6Var, i, (byte) 17), 100L);
        }
    }
}
