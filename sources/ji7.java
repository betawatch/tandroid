// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ji7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi7 b;

    public /* synthetic */ ji7(pi7 pi7Var, byte b) {
        this.a = b;
        this.b = pi7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        pi7 pi7Var = this.b;
        switch (b) {
            case 0:
                oi7 oi7Var = pi7Var.l2;
                HashSet hashSet = pi7Var.Y1;
                if (hashSet.size() != 0 && oi7Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : pi7Var.d2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    oi7Var.a(arrayList);
                    pi7Var.dismiss();
                    break;
                }
                break;
            default:
                pi7Var.Y1.clear();
                pi7Var.T1.d.b(true);
                pi7Var.c1(true, false);
                break;
        }
    }
}
