// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dp1 implements f39 {
    public final /* synthetic */ mu1 a;

    public dp1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    @Override // f39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f, float f2, int i, View view) {
        boolean z;
        boolean z2;
        a aVar;
        View view2;
        boolean z3;
        mu1 mu1Var = this.a;
        bt1 bt1Var = mu1Var.u9;
        if ((bt1Var == null || !bt1Var.z) && !mu1Var.t7()) {
            z = ((d) mu1Var).inPreviewMode;
            if (!z && !mu1Var.mb) {
                mu1Var.R4 = true;
                if (view instanceof uk1) {
                    uk1 uk1Var = (uk1) view;
                    k27 messageObject = uk1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && uk1Var.getMessageObject().D != 21 && !uk1Var.getMessageObject().W4() && uk1Var.getMessageObject().D != 30) {
                            z2 = false;
                            aVar = ((d) mu1Var).actionBar;
                            if (!aVar.y() || (mu1Var.T7() && !z2)) {
                                view2 = view;
                                mu1Var.Ha(view2, f, f2, view2 instanceof gb2 ? !((gb2) view2).E2(f) : false);
                                z3 = true;
                            } else {
                                z3 = mu1Var.R5(view, false, true, f, f2, true, true, false);
                                view2 = view;
                            }
                            if (view2 instanceof gb2) {
                                gb2 gb2Var = (gb2) view2;
                                if (gb2Var.getMessageObject() != null && gb2Var.getMessageObject().D != 27) {
                                    mu1Var.tc(i);
                                    return true;
                                }
                            }
                            return z3;
                        }
                    }
                }
                z2 = true;
                aVar = ((d) mu1Var).actionBar;
                if (aVar.y()) {
                }
                view2 = view;
                mu1Var.Ha(view2, f, f2, view2 instanceof gb2 ? !((gb2) view2).E2(f) : false);
                z3 = true;
                if (view2 instanceof gb2) {
                }
                return z3;
            }
        }
        return false;
    }

    @Override // f39
    public final void f() {
    }

    @Override // f39
    public final void g(float f) {
    }
}
