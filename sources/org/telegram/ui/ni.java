package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ni implements View.OnClickListener {
    public final /* synthetic */ rg0 a;
    public final /* synthetic */ org.telegram.ui.Components.tk0 b;
    public final /* synthetic */ LinearLayout c;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ un f;

    public ni(un unVar, rg0 rg0Var, org.telegram.ui.Components.tk0 tk0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f = unVar;
        this.a = rg0Var;
        this.b = tk0Var;
        this.c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rg0 rg0Var = this.a;
        ArrayList arrayList = rg0Var.b;
        ArrayList arrayList2 = rg0Var.c;
        un unVar = this.f;
        if (unVar.e9 == null || arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
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
            unVar.I7(true);
            return;
        }
        if (org.telegram.messenger.tz.c1 > 0 && unVar.l1.getKeyboardHeight() < org.telegram.messenger.i0.L(20.0f)) {
            org.telegram.ui.Components.wb t10 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.xa).t(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748503, null)), null);
            unVar.B1 = t10;
            t10.j = 4000;
            t10.j();
            org.telegram.messenger.tz.S(org.telegram.messenger.tz.c1 - 1);
        }
        org.telegram.ui.Components.tk0 tk0Var = this.b;
        tk0Var.requestLayout();
        this.c.requestLayout();
        tk0Var.getAdapter().f();
        this.d.getSwipeBack().e(this.e[0]);
    }
}
