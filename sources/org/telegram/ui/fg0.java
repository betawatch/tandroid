package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg0 b;

    public /* synthetic */ fg0(kg0 kg0Var, int i3) {
        this.a = i3;
        this.b = kg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kg0 kg0Var = this.b;
                jg0 jg0Var = kg0Var.j2;
                HashSet hashSet = kg0Var.W1;
                if (hashSet.size() != 0 && jg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : kg0Var.b2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    jg0Var.a(arrayList);
                    kg0Var.dismiss();
                    break;
                }
                break;
            default:
                kg0 kg0Var2 = this.b;
                kg0Var2.W1.clear();
                kg0Var2.R1.d.b(true);
                kg0Var2.g1(true, false);
                break;
        }
    }
}
