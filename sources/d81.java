// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class d81 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ d81(z81 z81Var, byte b) {
        this.a = b;
        this.b = z81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l = (Long) view.getTag();
                z81 z81Var = this.b;
                fc2 e1 = z81Var.getMessagesController().e1(l.longValue(), false, null);
                TLRPC.Chat K0 = z81Var.getMessagesController().K0(l);
                z81Var.M = K0;
                if (e1 == null) {
                    z81Var.N = l;
                    z81Var.getMessagesController().Y2(0, l.longValue(), true);
                    break;
                } else {
                    rgc.l(K0, null, false, null, z81Var.getParentActivity(), z81Var, z81Var.getAccountInstance());
                    break;
                }
            default:
                z81.j0(this.b);
                break;
        }
    }
}
