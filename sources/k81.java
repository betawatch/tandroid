// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k81 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i91 b;

    public /* synthetic */ k81(i91 i91Var, byte b) {
        this.a = b;
        this.b = i91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l = (Long) view.getTag();
                i91 i91Var = this.b;
                vc2 g1 = i91Var.getMessagesController().g1(l.longValue(), false, null);
                TLRPC.Chat M0 = i91Var.getMessagesController().M0(l);
                i91Var.M = M0;
                if (g1 == null) {
                    i91Var.N = l;
                    i91Var.getMessagesController().e3(0, l.longValue(), true);
                    break;
                } else {
                    xkc.l(M0, null, false, null, i91Var.getParentActivity(), i91Var, i91Var.getAccountInstance());
                    break;
                }
            default:
                i91.j0(this.b);
                break;
        }
    }
}
