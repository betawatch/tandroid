package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj0 b;

    public /* synthetic */ mj0(sj0 sj0Var, int i10) {
        this.a = i10;
        this.b = sj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sj0 sj0Var = this.b;
                rj0 rj0Var = sj0Var.q0;
                HashSet hashSet = sj0Var.d0;
                if (hashSet.size() != 0 && rj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : sj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    rj0Var.a(arrayList);
                    sj0Var.dismiss();
                    break;
                }
                break;
            default:
                sj0 sj0Var2 = this.b;
                sj0Var2.d0.clear();
                sj0Var2.Y.d.b(true);
                sj0Var2.U(true, false);
                break;
        }
    }
}
