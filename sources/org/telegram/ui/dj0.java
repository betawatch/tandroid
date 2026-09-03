package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ij0 b;

    public /* synthetic */ dj0(ij0 ij0Var, int i10) {
        this.a = i10;
        this.b = ij0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ij0 ij0Var = this.b;
                hj0 hj0Var = ij0Var.n0;
                HashSet hashSet = ij0Var.a0;
                if (hashSet.size() != 0 && hj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : ij0Var.f0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    hj0Var.a(arrayList);
                    ij0Var.dismiss();
                    break;
                }
                break;
            default:
                ij0 ij0Var2 = this.b;
                ij0Var2.a0.clear();
                ij0Var2.V.d.b(true);
                ij0Var2.U(true, false);
                break;
        }
    }
}
