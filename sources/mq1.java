// default package

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mq1 implements View.OnClickListener {
    public final /* synthetic */ t57 a;
    public final /* synthetic */ r59 b;
    public final /* synthetic */ LinearLayout c;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ yv1 f;

    public mq1(yv1 yv1Var, t57 t57Var, r59 r59Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f = yv1Var;
        this.a = t57Var;
        this.b = r59Var;
        this.c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t57 t57Var = this.a;
        ArrayList arrayList = t57Var.b;
        ArrayList arrayList2 = t57Var.c;
        yv1 yv1Var = this.f;
        if (yv1Var.g9 == null || arrayList2.isEmpty()) {
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
                yv1Var.presentFragment(new ProfileActivity(bundle, null));
                yv1Var.N5(true);
                return;
            }
            return;
        }
        if (gda.Y0 > 0 && yv1Var.m1.getKeyboardHeight() < gm.L(20.0f)) {
            u31 t = new c41(n21.a(yv1Var.getParentActivity()), yv1Var.Ba).t(gm.S2(jb6.M0(2131748245, null)), null);
            yv1Var.C1 = t;
            t.j = 4000;
            t.j();
            gda.P(gda.Y0 - 1);
        }
        r59 r59Var = this.b;
        r59Var.requestLayout();
        this.c.requestLayout();
        r59Var.getAdapter().f();
        this.d.getSwipeBack().e(this.e[0]);
    }
}
