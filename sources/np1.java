// default package

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class np1 implements View.OnClickListener {
    public final /* synthetic */ a67 a;
    public final /* synthetic */ d79 b;
    public final /* synthetic */ LinearLayout c;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ zu1 f;

    public np1(zu1 zu1Var, a67 a67Var, d79 d79Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f = zu1Var;
        this.a = a67Var;
        this.b = d79Var;
        this.c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a67 a67Var = this.a;
        ArrayList arrayList = a67Var.b;
        ArrayList arrayList2 = a67Var.c;
        zu1 zu1Var = this.f;
        if (zu1Var.g9 == null || arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
            TLObject tLObject = (TLObject) arrayList2.get(0);
            if (tLObject != null) {
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                }
                zu1Var.presentFragment(new ProfileActivity(bundle, null));
                zu1Var.M5(true);
                return;
            }
            return;
        }
        if (xea.Y0 > 0 && zu1Var.m1.getKeyboardHeight() < hl.L(20.0f)) {
            v21 t = new d31(o11.a(zu1Var.getParentActivity()), zu1Var.Ba).t(hl.S2(ob6.M0(2131748242, null)), null);
            zu1Var.C1 = t;
            t.j = 4000;
            t.j();
            xea.P(xea.Y0 - 1);
        }
        d79 d79Var = this.b;
        d79Var.requestLayout();
        this.c.requestLayout();
        d79Var.getAdapter().f();
        this.d.getSwipeBack().e(this.e[0]);
    }
}
