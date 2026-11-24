// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hg3 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ hg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = cj3Var.K2;
                if (cj3Var.getParentActivity() == null) {
                    break;
                } else {
                    boolean z = !arrayList.isEmpty();
                    boolean z2 = true;
                    for (int i = 0; i < arrayList.size(); i++) {
                        long longValue = ((Long) arrayList.get(i)).longValue();
                        if (z && longValue != cj3Var.getUserConfig().e()) {
                            z = false;
                        }
                        if (cf3.B(longValue)) {
                            z2 = false;
                        }
                        TLRPC.Chat K0 = cj3Var.getMessagesController().K0(Long.valueOf(-longValue));
                        if (K0 != null && !hc2.B(K0)) {
                            z2 = false;
                        }
                    }
                    boolean z3 = cj3Var.x3() && cj3Var.E2();
                    if (z3) {
                        ArrayList arrayList2 = cj3Var.F2;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                if (((jm6) obj).b()) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = cj3Var.F2;
                    boolean z4 = arrayList3 != null && arrayList3.size() > 1;
                    cs5 I = cs5.I(cj3Var, view);
                    I.k(R.drawable.msg_sendfile, k96.M0(z4 ? 2131745443 : 2131745444, null), new wf3(cj3Var, (byte) 13), z3);
                    I.b(R.drawable.input_notify_off, k96.M0(2131745391, null), new wf3(cj3Var, (byte) 14), false);
                    I.k(R.drawable.msg_calendar2, k96.M0(z ? 2131745322 : 2131745667, null), new x6c((byte) 15, cj3Var, z), z2);
                    I.a0();
                    break;
                }
                break;
            case 1:
                cj3 cj3Var2 = this.b;
                cj3Var2.G4(cj3Var2.K2, kk7.o1, true, true, null);
                break;
            case 2:
                cj3Var.A4(view);
                break;
            default:
                cj3Var.getContactsController().B();
                cj3Var.b5();
                break;
        }
        return true;
    }
}
