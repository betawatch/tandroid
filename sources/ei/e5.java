package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x51;
import w7.y5;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class e5 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.f2 b;
    public t61 c;

    public e5(long j3) {
        super(null);
        this.a = j3;
    }

    public final void U(ArrayList arrayList, l61 l61Var) {
        yh.m e = yh.o.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a4.a;
            x51 J = x51.J(a4.class);
            J.G = obj;
            J.r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(x51.n(29));
            arrayList.add(x51.n(29));
            arrayList.add(x51.n(29));
        }
    }

    public final void V(x51 x51Var) {
        Object obj = x51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e4.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.b = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 2));
        this.actionBar.setBackgroundColor(h6.w0(null, h6.d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = h6.G6;
        kVar2.B(h6.w0(null, i10, false), false);
        this.actionBar.B(h6.w0(null, i10, false), true);
        this.actionBar.A(h6.w0(null, h6.z8, false), false);
        this.actionBar.setTitleColor(h6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        cw0 cw0Var = new cw0(context, null);
        t61 t61Var = new t61(this, new bi.v(this, 18), new d5(this, 0), null);
        this.c = t61Var;
        cw0Var.addView(t61Var, y5.e(-1, -1, 119));
        this.fragmentView = cw0Var;
        return cw0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t61 t61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (t61Var = this.c) != null && (t61Var.getAdapter() instanceof l61)) {
            ((l61) this.c.getAdapter()).N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = h6.w0(null, h6.d6, false);
            if (this.actionBar.s()) {
                w02 = h6.w0(null, h6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
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
