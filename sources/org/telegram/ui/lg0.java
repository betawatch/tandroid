package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                pg0 pg0Var = qg0Var.m2;
                HashSet hashSet = qg0Var.Z1;
                if (hashSet.size() != 0 && pg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : qg0Var.e2.values()) {
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
                qg0Var2.Z1.clear();
                qg0Var2.U1.d.b(true);
                qg0Var2.g1(true, false);
                break;
        }
    }
}
