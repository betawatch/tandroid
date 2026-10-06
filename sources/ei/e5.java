package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.w61;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class e5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.g2 b;
    public e71 c;

    public e5(long j3) {
        super(null);
        this.a = j3;
    }

    public final void S(ArrayList arrayList, w61 w61Var) {
        yh.n e7 = yh.p.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e7.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = b4.a;
            h61 K = h61.K(b4.class);
            K.G = obj;
            K.r = false;
            arrayList.add(K);
        }
        if (e7.h) {
            arrayList.add(h61.p(29));
            arrayList.add(h61.p(29));
            arrayList.add(h61.p(29));
        }
    }

    public final void T(h61 h61Var) {
        Object obj = h61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            f4.L0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new u(this, 2));
        this.actionBar.setBackgroundColor(i6.w0(null, i6.d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = i6.G6;
        kVar2.A(i6.w0(null, i10, false), false);
        this.actionBar.A(i6.w0(null, i10, false), true);
        this.actionBar.z(i6.w0(null, i6.z8, false), false);
        this.actionBar.setTitleColor(i6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        mw0 mw0Var = new mw0(context, null);
        e71 e71Var = new e71(this, new bi.v(this, 18), new f(this, 1), null);
        this.c = e71Var;
        mw0Var.addView(e71Var, z5.e(-1, -1, 119));
        this.fragmentView = mw0Var;
        return mw0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (e71Var = this.c) != null && (e71Var.getAdapter() instanceof w61)) {
            ((w61) this.c.getAdapter()).N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = i6.w0(null, i6.d6, false);
            if (this.actionBar.s()) {
                w02 = i6.w0(null, i6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
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
