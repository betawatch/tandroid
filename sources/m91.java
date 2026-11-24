// default package

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class m91 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ia1 b;

    public /* synthetic */ m91(ia1 ia1Var, byte b) {
        this.a = b;
        this.b = ia1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l = (Long) view.getTag();
                ia1 ia1Var = this.b;
                qd2 f1 = ia1Var.getMessagesController().f1(l.longValue(), false, null);
                TLRPC.Chat L0 = ia1Var.getMessagesController().L0(l);
                ia1Var.M = L0;
                if (f1 == null) {
                    ia1Var.N = l;
                    ia1Var.getMessagesController().a3(0, l.longValue(), true);
                    break;
                } else {
                    sic.l(L0, null, false, null, ia1Var.getParentActivity(), ia1Var, ia1Var.getAccountInstance());
                    break;
                }
            default:
                Bundle l2 = ts2.l("isCall", true);
                ia1 ia1Var2 = this.b;
                ia1Var2.presentFragment(new ca1(l2, ia1Var2.getCurrentAccount(), ia1Var2));
                break;
        }
    }
}
