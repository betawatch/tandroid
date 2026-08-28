package mh;

import android.content.Context;
import android.view.View;
import fh.w4;
import g7.e6;
import java.util.ArrayList;
import kh.b8;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r4 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.h2 b;
    public i51 c;

    public r4(long j10) {
        super(null);
        this.a = j10;
    }

    public final void T(ArrayList arrayList, z41 z41Var) {
        gh.a0 e10 = gh.c0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e10.e;
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            Object obj = arrayList2.get(i9);
            int i10 = q3.a;
            l41 J = l41.J(q3.class);
            J.G = obj;
            J.r = false;
            arrayList.add(J);
        }
        if (e10.h) {
            arrayList.add(l41.n(29));
            arrayList.add(l41.n(29));
            arrayList.add(l41.n(29));
        }
    }

    public final void U(l41 l41Var) {
        Object obj = l41Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            u3.F0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.b = h2Var;
        kVar.setBackButtonDrawable(h2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 5));
        this.actionBar.setBackgroundColor(f6.w0(null, f6.d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i9 = f6.G6;
        kVar2.C(f6.w0(null, i9, false), false);
        this.actionBar.C(f6.w0(null, i9, false), true);
        this.actionBar.A(f6.w0(null, f6.z8, false), false);
        this.actionBar.setTitleColor(f6.w0(null, i9, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        xu0 xu0Var = new xu0(context, null);
        i51 i51Var = new i51(this, new b8(this, 11), new kh.p(this, 9), null);
        this.c = i51Var;
        xu0Var.addView(i51Var, e6.e(-1, -1, 119));
        this.fragmentView = xu0Var;
        return xu0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        i51 i51Var;
        if (i9 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (i51Var = this.c) != null && (i51Var.getAdapter() instanceof z41)) {
            ((z41) this.c.getAdapter()).N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = f6.w0(null, f6.d6, false);
            if (this.actionBar.s()) {
                w02 = f6.w0(null, f6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        super.onFragmentDestroy();
    }
}
