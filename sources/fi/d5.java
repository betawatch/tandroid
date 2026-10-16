package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ow0;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class d5 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.f2 b;
    public i71 c;

    public d5(long j10) {
        super(null);
        this.a = j10;
    }

    public final void U(ArrayList arrayList, a71 a71Var) {
        zh.n e = zh.p.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = b4.a;
            m61 J = m61.J(b4.class);
            J.G = obj;
            J.r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(m61.n(29));
            arrayList.add(m61.n(29));
            arrayList.add(m61.n(29));
        }
    }

    public final void V(m61 m61Var) {
        Object obj = m61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            f4.H0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.b = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 3));
        this.actionBar.setBackgroundColor(g6.x0(null, g6.d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = g6.G6;
        kVar2.D(g6.x0(null, i10, false), false);
        this.actionBar.D(g6.x0(null, i10, false), true);
        this.actionBar.C(g6.x0(null, g6.z8, false), false);
        this.actionBar.setTitleColor(g6.x0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        ow0 ow0Var = new ow0(context, null);
        i71 i71Var = new i71(this, new ci.u(this, 18), new f1.a(this, 3), null);
        this.c = i71Var;
        ow0Var.addView(i71Var, z5.e(-1, -1, 119));
        this.fragmentView = ow0Var;
        return ow0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i71 i71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (i71Var = this.c) != null && (i71Var.getAdapter() instanceof a71)) {
            ((a71) this.c.getAdapter()).N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = g6.x0(null, g6.d6, false);
            if (this.actionBar.t()) {
                x02 = g6.x0(null, g6.w8, false);
            }
            if (i0.a.f(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        super.onFragmentDestroy();
    }
}
