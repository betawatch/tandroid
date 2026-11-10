package hi;

import android.content.Context;
import android.view.View;
import c8.ha;
import di.r4;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class p4 extends org.telegram.ui.ActionBar.f2 implements ls {
    public final long a;
    public org.telegram.ui.ActionBar.y1 b;
    public r41 c;

    public p4(long j3) {
        super(null);
        this.a = j3;
    }

    public final void Z(ArrayList arrayList, m41 m41Var) {
        bi.l0 e10 = bi.n0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e10.e;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            Object obj = arrayList2.get(i7);
            int i10 = m3.b;
            x31 K = x31.K(m3.class);
            K.G = obj;
            K.r = false;
            arrayList.add(K);
        }
        if (e10.h) {
            arrayList.add(x31.p(29));
            arrayList.add(x31.p(29));
            arrayList.add(x31.p(29));
        }
    }

    public final void a0(x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            q3.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.b = y1Var;
        lVar.setBackButtonDrawable(y1Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 4));
        t6.h(m6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i7 = m6.G6;
        t6.l(lVar2, 1, i7, null);
        t6.b(this.actionBar, i7, null, true);
        t6.l(this.actionBar, 3, m6.z8, null);
        t6.l(this.actionBar, 5, i7, null);
        this.actionBar.setTitle(id.M0(2131752471, null));
        st0 st0Var = new st0(context, null);
        r41 r41Var = new r41(this, new u1(this, 2), new r4(this, 22), null);
        this.c = r41Var;
        st0Var.addView(r41Var, ha.e(-1, -1, qs.E1));
        this.fragmentView = st0Var;
        return st0Var;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        r41 r41Var;
        if (i7 == qs.K3 && ((Long) objArr[0]).longValue() == this.a && (r41Var = this.c) != null && (r41Var.getAdapter() instanceof m41)) {
            ((m41) this.c.getAdapter()).O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().G0) {
            int x02 = m6.x0(null, m6.d6, false);
            if (this.actionBar.x()) {
                x02 = m6.x0(null, m6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.K3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        qs.f(this.currentAccount).n(this, qs.K3);
        super.onFragmentDestroy();
    }
}
