// default package

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cv1 extends tca {
    public final /* synthetic */ k47 U2;
    public final /* synthetic */ iv1 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv1(iv1 iv1Var, Activity activity, yv1 yv1Var, ArrayList arrayList, boolean z, boolean z2, ylb ylbVar, boolean z3, k47 k47Var) {
        super(activity, yv1Var, arrayList, null, null, z, null, null, false, false, z2, null, ylbVar);
        this.V2 = iv1Var;
        this.U2 = k47Var;
        this.V1 = z3;
    }

    @Override // tca, my0
    public final void H() {
        int i;
        yv1 yv1Var = this.V2.a;
        Activity parentActivity = yv1Var.getParentActivity();
        i = ((d) yv1Var).classGuid;
        gm.V2(parentActivity, i);
        super.H();
        if (yv1Var.a0.getVisibility() == 0) {
            yv1Var.fragmentView.requestLayout();
        }
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        int i2;
        yv1 yv1Var = this.V2.a;
        int i3 = yv1.xd;
        yv1Var.i6();
        if (yv1Var.N3 == null || !z) {
            return;
        }
        if (vh6Var.m() != 1) {
            yv1Var.N3.k(0L, 53, Integer.valueOf(i), Integer.valueOf(vh6Var.m()), null, null);
            return;
        }
        if (((TLRPC.Dialog) vh6Var.n(0)).id == yv1Var.getUserConfig().e()) {
            i2 = i;
            if (c41.b0(yv1Var).h0(i2, ((TLRPC.Dialog) vh6Var.n(0)).id)) {
                return;
            }
        } else {
            i2 = i;
        }
        yv1Var.N3.k(((TLRPC.Dialog) vh6Var.n(0)).id, 53, Integer.valueOf(i2), tL_forumTopic, null, null);
    }

    @Override // tca
    public final void M0(View view) {
        yv1 yv1Var = this.V2.a;
        o9b b = view instanceof wca ? q9b.b((wca) view) : null;
        ArrayList arrayList = new ArrayList();
        k47 k47Var = this.U2;
        f47 f47Var = k47Var.c1() != 0 ? (f47) yv1Var.P6.f(k47Var.c1()) : null;
        if (f47Var != null) {
            arrayList.addAll(f47Var.d);
        } else {
            arrayList.add(k47Var);
        }
        v9b C = v9b.C(yv1Var.getParentActivity(), this.a);
        C.S = new xu1(this, C, view, (byte) 0);
        C.T(b, g6b.x(arrayList));
    }
}
