package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ lg0(qg0 qg0Var, int i7) {
        this.a = i7;
        this.b = qg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qg0 qg0Var = this.b;
                pg0 pg0Var = qg0Var.i2;
                HashSet hashSet = qg0Var.V1;
                if (hashSet.size() != 0 && pg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : qg0Var.a2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    pg0Var.a(arrayList);
                    qg0Var.dismiss();
                    break;
                }
                break;
            default:
                qg0 qg0Var2 = this.b;
                qg0Var2.V1.clear();
                qg0Var2.Q1.d.b(true);
                qg0Var2.g1(true, false);
                break;
        }
    }
}
