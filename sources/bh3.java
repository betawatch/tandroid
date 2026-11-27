// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class bh3 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ bh3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = uj3Var.K2;
                if (uj3Var.getParentActivity() == null) {
                    break;
                } else {
                    boolean z = !arrayList.isEmpty();
                    boolean z2 = true;
                    for (int i = 0; i < arrayList.size(); i++) {
                        long longValue = ((Long) arrayList.get(i)).longValue();
                        if (z && longValue != uj3Var.getUserConfig().e()) {
                            z = false;
                        }
                        if (wf3.B(longValue)) {
                            z2 = false;
                        }
                        TLRPC.Chat M0 = uj3Var.getMessagesController().M0(Long.valueOf(-longValue));
                        if (M0 != null && !xc2.B(M0)) {
                            z2 = false;
                        }
                    }
                    boolean z3 = uj3Var.z3() && uj3Var.G2();
                    if (z3) {
                        ArrayList arrayList2 = uj3Var.F2;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                if (((no6) obj).b()) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = uj3Var.F2;
                    boolean z4 = arrayList3 != null && arrayList3.size() > 1;
                    fu5 I = fu5.I(uj3Var, view);
                    I.k(R.drawable.msg_sendfile, ob6.M0(z4 ? 2131745363 : 2131745364, null), new rg3(uj3Var, (byte) 22), z3);
                    I.b(R.drawable.input_notify_off, ob6.M0(2131745311, null), new rg3(uj3Var, (byte) 23), false);
                    I.k(R.drawable.msg_calendar2, ob6.M0(z ? 2131745242 : 2131745587, null), new xac((byte) 15, uj3Var, z), z2);
                    I.a0();
                    break;
                }
                break;
            case 1:
                uj3 uj3Var2 = this.b;
                uj3Var2.K4(uj3Var2.K2, jn7.o1, true, true, null);
                break;
            case 2:
                uj3Var.E4(view);
                break;
            default:
                uj3Var.getContactsController().B();
                uj3Var.f5();
                break;
        }
        return true;
    }
}
