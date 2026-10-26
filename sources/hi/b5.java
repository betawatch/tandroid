package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vw0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b5 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.j2 b;
    public r71 c;

    public b5(long j10) {
        super(null);
        this.a = j10;
    }

    public final void V(ArrayList arrayList, j71 j71Var) {
        bi.k0 e = bi.m0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = z3.a;
            t61 K = t61.K(z3.class);
            K.G = obj;
            K.r = false;
            arrayList.add(K);
        }
        if (e.h) {
            arrayList.add(t61.p(29));
            arrayList.add(t61.p(29));
            arrayList.add(t61.p(29));
        }
    }

    public final void W(t61 t61Var) {
        Object obj = t61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            d4.F0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.b = j2Var;
        kVar.setBackButtonDrawable(j2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 4));
        f7.i(y6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = y6.G6;
        f7.m(kVar2, 1, i10, null);
        f7.b(this.actionBar, i10, null, true);
        f7.m(this.actionBar, 3, y6.z8, null);
        f7.m(this.actionBar, 5, i10, null);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        vw0 vw0Var = new vw0(context, null);
        r71 r71Var = new r71(this, new e2(this, 2), new e1.c(this, 17), null);
        this.c = r71Var;
        vw0Var.addView(r71Var, gb1.i(-1, -1, 119));
        this.fragmentView = vw0Var;
        return vw0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        r71 r71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (r71Var = this.c) != null && (r71Var.getAdapter() instanceof j71)) {
            ((j71) this.c.getAdapter()).O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = y6.x0(null, y6.d6, false);
            if (this.actionBar.q()) {
                x02 = y6.x0(null, y6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        super.onFragmentDestroy();
    }
}
