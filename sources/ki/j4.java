package ki;

import android.content.Context;
import android.view.View;
import bi.x4;
import c8.ja;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class j4 extends org.telegram.ui.ActionBar.e2 implements is {
    public final long a;
    public org.telegram.ui.ActionBar.x1 b;
    public u41 c;

    public j4(long j3) {
        super(null);
        this.a = j3;
    }

    public final void Z(ArrayList arrayList, p41 p41Var) {
        di.c0 e10 = di.e0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e10.e;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            Object obj = arrayList2.get(i7);
            int i10 = j3.b;
            b41 K = b41.K(j3.class);
            K.G = obj;
            K.r = false;
            arrayList.add(K);
        }
        if (e10.h) {
            arrayList.add(b41.p(29));
            arrayList.add(b41.p(29));
            arrayList.add(b41.p(29));
        }
    }

    public final void a0(b41 b41Var) {
        Object obj = b41Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            n3.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.b = x1Var;
        kVar.setBackButtonDrawable(x1Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new x4(this, 14));
        q6.h(j6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i7 = j6.G6;
        q6.l(kVar2, 1, i7, null);
        q6.b(this.actionBar, i7, null, true);
        q6.l(this.actionBar, 3, j6.z8, null);
        q6.l(this.actionBar, 5, i7, null);
        this.actionBar.setTitle(hd.M0(2131752471, null));
        st0 st0Var = new st0(context, null);
        u41 u41Var = new u41(this, new q4(this, 22), new e(this, 2), null);
        this.c = u41Var;
        st0Var.addView(u41Var, ja.e(-1, -1, ns.E1));
        this.fragmentView = st0Var;
        return st0Var;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        u41 u41Var;
        if (i7 == ns.K3 && ((Long) objArr[0]).longValue() == this.a && (u41Var = this.c) != null && (u41Var.getAdapter() instanceof p41)) {
            ((p41) this.c.getAdapter()).O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = j6.x0(null, j6.d6, false);
            if (this.actionBar.x()) {
                x02 = j6.x0(null, j6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.K3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        ns.f(this.currentAccount).n(this, ns.K3);
        super.onFragmentDestroy();
    }
}
