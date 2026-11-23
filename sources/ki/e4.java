package ki;

import android.content.Context;
import android.view.View;
import c8.na;
import hi.y7;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e4 extends org.telegram.ui.ActionBar.g2 implements fs {
    public final long a;
    public org.telegram.ui.ActionBar.x1 b;
    public g51 c;

    public e4(long j3) {
        super(null);
        this.a = j3;
    }

    public final void Z(ArrayList arrayList, b51 b51Var) {
        di.c0 e10 = di.e0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e10.e;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            Object obj = arrayList2.get(i7);
            int i10 = e3.b;
            n41 K = n41.K(e3.class);
            K.H = obj;
            K.s = false;
            arrayList.add(K);
        }
        if (e10.h) {
            arrayList.add(n41.p(29));
            arrayList.add(n41.p(29));
            arrayList.add(n41.p(29));
        }
    }

    public final void a0(n41 n41Var) {
        Object obj = n41Var.H;
        if (obj instanceof TL_payments.starRefProgram) {
            i3.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.b = x1Var;
        kVar.setBackButtonDrawable(x1Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new bi.w1(this, 16));
        u6.h(n6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i7 = n6.G6;
        u6.l(kVar2, 1, i7, null);
        u6.b(this.actionBar, i7, null, true);
        u6.l(this.actionBar, 3, n6.z8, null);
        u6.l(this.actionBar, 5, i7, null);
        this.actionBar.setTitle(gd.N0(2131752459, null));
        cu0 cu0Var = new cu0(context, null);
        g51 g51Var = new g51(this, new y7(this, 22), new kg.f1(this, 6), null);
        this.c = g51Var;
        cu0Var.addView(g51Var, na.e(-1, -1, ks.E1));
        this.fragmentView = cu0Var;
        return cu0Var;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g51 g51Var;
        if (i7 == ks.N3 && ((Long) objArr[0]).longValue() == this.a && (g51Var = this.c) != null && (g51Var.getAdapter() instanceof b51)) {
            ((b51) this.c.getAdapter()).O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = n6.x0(null, n6.d6, false);
            if (this.actionBar.x()) {
                x02 = n6.x0(null, n6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.N3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        ks.f(this.currentAccount).n(this, ks.N3);
        super.onFragmentDestroy();
    }
}
