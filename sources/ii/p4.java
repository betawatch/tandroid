package ii;

import ai.g5;
import android.content.Context;
import android.view.View;
import b8.mf;
import ei.y8;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p4 extends org.telegram.ui.ActionBar.d2 implements cs {
    public final long a;
    public org.telegram.ui.ActionBar.w1 b;
    public l41 c;

    public p4(long j10) {
        super(null);
        this.a = j10;
    }

    public final void Z(ArrayList arrayList, f41 f41Var) {
        ci.g0 e10 = ci.i0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e10.e;
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            Object obj = arrayList2.get(i3);
            int i10 = m3.b;
            r31 K = r31.K(m3.class);
            K.G = obj;
            K.r = false;
            arrayList.add(K);
        }
        if (e10.h) {
            arrayList.add(r31.p(29));
            arrayList.add(r31.p(29));
            arrayList.add(r31.p(29));
        }
    }

    public final void a0(r31 r31Var) {
        Object obj = r31Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            q3.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.b = w1Var;
        kVar.setBackButtonDrawable(w1Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new g5(this, 5));
        r6.i(k6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i3 = k6.G6;
        r6.m(kVar2, 1, i3, null);
        r6.b(this.actionBar, i3, null, true);
        r6.m(this.actionBar, 3, k6.z8, null);
        r6.m(this.actionBar, 5, i3, null);
        this.actionBar.setTitle(bd.M0(2131752471, null));
        qt0 qt0Var = new qt0(context, null);
        l41 l41Var = new l41(this, new gi.q4(this, 12), new y8(this, 16), null);
        this.c = l41Var;
        qt0Var.addView(l41Var, mf.e(-1, -1, hs.E1));
        this.fragmentView = qt0Var;
        return qt0Var;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        l41 l41Var;
        if (i3 == hs.K3 && ((Long) objArr[0]).longValue() == this.a && (l41Var = this.c) != null && (l41Var.getAdapter() instanceof f41)) {
            ((f41) this.c.getAdapter()).O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().I0) {
            int x02 = k6.x0(null, k6.d6, false);
            if (this.actionBar.v()) {
                x02 = k6.x0(null, k6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.K3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        hs.f(this.currentAccount).n(this, hs.K3);
        super.onFragmentDestroy();
    }
}
