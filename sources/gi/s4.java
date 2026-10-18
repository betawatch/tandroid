package gi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.s61;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class s4 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.g2 b;
    public a71 c;

    public s4(long j10) {
        super(null);
        this.a = j10;
    }

    public final void U(ArrayList arrayList, s61 s61Var) {
        ai.i0 e = ai.k0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = q3.a;
            f61 J = f61.J(q3.class);
            J.G = obj;
            J.r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(f61.n(29));
            arrayList.add(f61.n(29));
            arrayList.add(f61.n(29));
        }
    }

    public final void V(f61 f61Var) {
        Object obj = f61Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            u3.H0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.b = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 4));
        this.actionBar.setBackgroundColor(h6.x0(null, h6.d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = h6.G6;
        kVar2.C(h6.x0(null, i10, false), false);
        this.actionBar.C(h6.x0(null, i10, false), true);
        this.actionBar.B(h6.x0(null, h6.z8, false), false);
        this.actionBar.setTitleColor(h6.x0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        jw0 jw0Var = new jw0(context, null);
        a71 a71Var = new a71(this, new ai.q(this, 29), new e1.c(this, 12), null);
        this.c = a71Var;
        jw0Var.addView(a71Var, z5.e(-1, -1, 119));
        this.fragmentView = jw0Var;
        return jw0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (a71Var = this.c) != null && (a71Var.getAdapter() instanceof s61)) {
            ((s61) this.c.getAdapter()).N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = h6.x0(null, h6.d6, false);
            if (this.actionBar.s()) {
                x02 = h6.x0(null, h6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
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
