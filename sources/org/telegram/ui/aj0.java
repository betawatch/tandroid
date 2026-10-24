package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fj0 b;

    public /* synthetic */ aj0(fj0 fj0Var, int i10) {
        this.a = i10;
        this.b = fj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fj0 fj0Var = this.b;
                ej0 ej0Var = fj0Var.q0;
                HashSet hashSet = fj0Var.d0;
                if (hashSet.size() != 0 && ej0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : fj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    ej0Var.a(arrayList);
                    fj0Var.dismiss();
                    break;
                }
                break;
            default:
                fj0 fj0Var2 = this.b;
                fj0Var2.d0.clear();
                fj0Var2.Y.d.b(true);
                fj0Var2.U(true, false);
                break;
        }
    }
}
