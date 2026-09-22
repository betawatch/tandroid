package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.w51;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class e5 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.g2 b;
    public e61 c;

    public e5(long j3) {
        super(null);
        this.a = j3;
    }

    public final void U(ArrayList arrayList, w51 w51Var) {
        yh.m e = yh.o.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.a;
            i51 J = i51.J(a4.class);
            J.G = obj;
            J.r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
        }
    }

    public final void V(i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
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
        this.actionBar.setBackgroundColor(i6.w0(null, i6.d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = i6.G6;
        kVar2.B(i6.w0(null, i10, false), false);
        this.actionBar.B(i6.w0(null, i10, false), true);
        this.actionBar.A(i6.w0(null, i6.z8, false), false);
        this.actionBar.setTitleColor(i6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        pv0 pv0Var = new pv0(context, null);
        e61 e61Var = new e61(this, new bi.v(this, 18), new d5(this, 0), null);
        this.c = e61Var;
        pv0Var.addView(e61Var, x5.e(-1, -1, 119));
        this.fragmentView = pv0Var;
        return pv0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e61 e61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (e61Var = this.c) != null && (e61Var.getAdapter() instanceof w51)) {
            ((w51) this.c.getAdapter()).N(true);
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
