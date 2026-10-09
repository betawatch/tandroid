package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.sw0;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class d5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.g2 b;
    public k71 c;

    public d5(long j3) {
        super(null);
        this.a = j3;
    }

    public final void U(ArrayList arrayList, c71 c71Var) {
        yh.m e7 = yh.o.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e7.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.a;
            p61 J = p61.J(a4.class);
            J.G = obj;
            J.r = false;
            arrayList.add(J);
        }
        if (e7.h) {
            arrayList.add(p61.n(29));
            arrayList.add(p61.n(29));
            arrayList.add(p61.n(29));
        }
    }

    public final void V(p61 p61Var) {
        Object obj = p61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.H0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(i6.x0(null, i6.d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = i6.G6;
        kVar2.D(i6.x0(null, i10, false), false);
        this.actionBar.D(i6.x0(null, i10, false), true);
        this.actionBar.C(i6.x0(null, i6.z8, false), false);
        this.actionBar.setTitleColor(i6.x0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        sw0 sw0Var = new sw0(context, null);
        k71 k71Var = new k71(this, new bi.v(this, 18), new c5(this, 0), null);
        this.c = k71Var;
        sw0Var.addView(k71Var, x5.e(-1, -1, 119));
        this.fragmentView = sw0Var;
        return sw0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (k71Var = this.c) != null && (k71Var.getAdapter() instanceof c71)) {
            ((c71) this.c.getAdapter()).N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = i6.x0(null, i6.d6, false);
            if (this.actionBar.t()) {
                x02 = i6.x0(null, i6.w8, false);
            }
            if (i0.a.f(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        super.onFragmentDestroy();
    }
}
