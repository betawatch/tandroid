package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e81 implements View.OnClickListener {
    public final /* synthetic */ mf0 a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ org.telegram.ui.Components.pj0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.k60 e;
    public final /* synthetic */ org.telegram.ui.Components.k60 f;
    public final /* synthetic */ i81 h;

    public e81(i81 i81Var, mf0 mf0Var, cn cnVar, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, org.telegram.ui.Components.k60 k60Var, org.telegram.ui.Components.k60 k60Var2) {
        this.h = i81Var;
        this.a = mf0Var;
        this.b = cnVar;
        this.c = pj0Var;
        this.d = linearLayout;
        this.e = k60Var;
        this.f = k60Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mf0 mf0Var = this.a;
        ArrayList arrayList = mf0Var.b;
        ArrayList arrayList2 = mf0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        i81 i81Var = this.h;
        cn cnVar = this.b;
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
            cnVar.presentFragment(new ProfileActivity(bundle, null));
            i81Var.c(false);
            return;
        }
        if (org.telegram.messenger.iz.c1 > 0 && cnVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.ui.Components.bc t6 = new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(i81Var.getContext()), i81Var.a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748488, null)), null);
            cnVar.B1 = t6;
            t6.j = 4000;
            t6.j();
            org.telegram.messenger.iz.S(org.telegram.messenger.iz.c1 - 1);
        }
        org.telegram.ui.Components.pj0 pj0Var = this.c;
        pj0Var.requestLayout();
        this.d.requestLayout();
        pj0Var.getAdapter().f();
        this.e.K(this.f);
    }
}
