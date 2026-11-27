// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ki7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qi7 b;

    public /* synthetic */ ki7(qi7 qi7Var, byte b) {
        this.a = b;
        this.b = qi7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        qi7 qi7Var = this.b;
        switch (b) {
            case 0:
                pi7 pi7Var = qi7Var.l2;
                HashSet hashSet = qi7Var.Y1;
                if (hashSet.size() != 0 && pi7Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : qi7Var.d2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    pi7Var.a(arrayList);
                    qi7Var.dismiss();
                    break;
                }
                break;
            default:
                qi7Var.Y1.clear();
                qi7Var.T1.d.b(true);
                qi7Var.c1(true, false);
                break;
        }
    }
}
