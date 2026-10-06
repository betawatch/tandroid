package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oj0 b;

    public /* synthetic */ jj0(oj0 oj0Var, int i10) {
        this.a = i10;
        this.b = oj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                oj0 oj0Var = this.b;
                nj0 nj0Var = oj0Var.q0;
                HashSet hashSet = oj0Var.d0;
                if (hashSet.size() != 0 && nj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : oj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    nj0Var.a(arrayList);
                    oj0Var.dismiss();
                    break;
                }
                break;
            default:
                oj0 oj0Var2 = this.b;
                oj0Var2.d0.clear();
                oj0Var2.Y.d.b(true);
                oj0Var2.S(true, false);
                break;
        }
    }
}
