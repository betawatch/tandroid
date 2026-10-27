package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class bd extends n91 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final long f;
    public pm0 g;
    public oi.q h;
    public final ArrayList i = new ArrayList();

    public bd(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = u6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        pm0 pm0Var = this.g;
        if (pm0Var != null) {
            pm0Var.L(view);
        }
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        ad adVar = new ad(this.a, this.c, this.f, i10, this.b, this.d, this.e);
        if (this.g != null) {
            adVar.setClipChildren(false);
            adVar.setClipToPadding(false);
            s71 s71Var = adVar.a;
            s71Var.setClipToPadding(false);
            s71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
            s71Var.g3.r = false;
            s71Var.setCaptureSectionsDecoratorAllowed(true);
            s71Var.setOverScrollMode(0);
            oi.q qVar = this.h;
            if (qVar != null) {
                qVar.b(s71Var);
            }
        }
        return adVar;
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((u61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j10 = this.f;
        int i10 = this.b;
        if (j10 == 0) {
            ca y3 = ca.y(i10, this.c);
            arrayList.add(u61.D(0));
            if (y3.O(1)) {
                arrayList.add(u61.D(1));
            }
            if (y3.O(2)) {
                arrayList.add(u61.D(2));
                return;
            }
            return;
        }
        m0 g7 = m0.g(i10);
        arrayList.add(u61.D(0));
        if (!g7.k(j10).a[1].isEmpty()) {
            arrayList.add(u61.D(1));
        }
        if (g7.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(u61.D(2));
    }
}
