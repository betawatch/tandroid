// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
