// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ke4 implements fd, t69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nf4 b;

    public /* synthetic */ ke4(nf4 nf4Var, byte b) {
        this.a = b;
        this.b = nf4Var;
    }

    @Override // t69
    public final boolean e(int i, View view) {
        nf4 nf4Var = this.b;
        ef4 ef4Var = (ef4) nf4Var.Q.get(i);
        if (ef4Var == null || !(view instanceof vac)) {
            return false;
        }
        vac vacVar = (vac) view;
        nf4Var.B0(ef4Var, vacVar.getName(), vacVar.getCurrentObject(), ef4Var.g);
        return true;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        nf4 nf4Var = this.b;
        switch (b) {
            case 0:
                nf4Var.w0();
                break;
            case 1:
            default:
                nf4Var.finishFragment();
                break;
            case 2:
                id idVar2 = null;
                if (nf4Var.getParentActivity() != null) {
                    id idVar3 = new id(3, null, nf4Var.getParentActivity());
                    idVar3.j0 = false;
                    idVar3.show();
                    idVar2 = idVar3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = nf4Var.r.a;
                nf4Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new mw3(nf4Var, idVar2, (byte) 2));
                break;
            case 3:
                nf4Var.w0();
                break;
        }
    }
}
