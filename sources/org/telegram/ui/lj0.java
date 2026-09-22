package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj0 b;

    public /* synthetic */ lj0(rj0 rj0Var, int i10) {
        this.a = i10;
        this.b = rj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                rj0 rj0Var = this.b;
                qj0 qj0Var = rj0Var.q0;
                HashSet hashSet = rj0Var.d0;
                if (hashSet.size() != 0 && qj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : rj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    qj0Var.a(arrayList);
                    rj0Var.dismiss();
                    break;
                }
                break;
            default:
                rj0 rj0Var2 = this.b;
                rj0Var2.d0.clear();
                rj0Var2.Y.d.b(true);
                rj0Var2.U(true, false);
                break;
        }
    }
}
