package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg0 b;

    public /* synthetic */ og0(tg0 tg0Var, int i7) {
        this.a = i7;
        this.b = tg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                tg0 tg0Var = this.b;
                sg0 sg0Var = tg0Var.l2;
                HashSet hashSet = tg0Var.Y1;
                if (hashSet.size() != 0 && sg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : tg0Var.d2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    sg0Var.a(arrayList);
                    tg0Var.dismiss();
                    break;
                }
                break;
            default:
                tg0 tg0Var2 = this.b;
                tg0Var2.Y1.clear();
                tg0Var2.T1.d.b(true);
                tg0Var2.g1(true, false);
                break;
        }
    }
}
