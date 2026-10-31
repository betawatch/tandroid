package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gt0 implements View.OnClickListener {
    public final /* synthetic */ rg0 a;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.ui.Components.tk0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.z60 e;
    public final /* synthetic */ org.telegram.ui.Components.z60 f;
    public final /* synthetic */ kt0 h;

    public gt0(kt0 kt0Var, rg0 rg0Var, un unVar, org.telegram.ui.Components.tk0 tk0Var, LinearLayout linearLayout, org.telegram.ui.Components.z60 z60Var, org.telegram.ui.Components.z60 z60Var2) {
        this.h = kt0Var;
        this.a = rg0Var;
        this.b = unVar;
        this.c = tk0Var;
        this.d = linearLayout;
        this.e = z60Var;
        this.f = z60Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rg0 rg0Var = this.a;
        ArrayList arrayList = rg0Var.b;
        ArrayList arrayList2 = rg0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        kt0 kt0Var = this.h;
        un unVar = this.b;
        if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
            TLObject tLObject = (TLObject) arrayList2.get(0);
            if (tLObject == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            } else if (tLObject instanceof TLRPC.Chat) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            }
            unVar.presentFragment(new ProfileActivity(bundle, null));
            kt0Var.c(false);
            return;
        }
        if (org.telegram.messenger.tz.c1 > 0 && unVar.l1.getKeyboardHeight() < org.telegram.messenger.i0.L(20.0f)) {
            org.telegram.ui.Components.wb t10 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(kt0Var.getContext()), kt0Var.b).t(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748503, null)), null);
            unVar.B1 = t10;
            t10.j = 4000;
            t10.j();
            org.telegram.messenger.tz.S(org.telegram.messenger.tz.c1 - 1);
        }
        org.telegram.ui.Components.tk0 tk0Var = this.c;
        tk0Var.requestLayout();
        this.d.requestLayout();
        tk0Var.getAdapter().f();
        this.e.K(this.f);
    }
}
