package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class bd extends m91 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final long f;
    public om0 g;
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

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        om0 om0Var = this.g;
        if (om0Var != null) {
            om0Var.L(view);
        }
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        ad adVar = new ad(this.a, this.c, this.f, i10, this.b, this.d, this.e);
        if (this.g != null) {
            adVar.setClipChildren(false);
            adVar.setClipToPadding(false);
            r71 r71Var = adVar.a;
            r71Var.setClipToPadding(false);
            r71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
            r71Var.g3.r = false;
            r71Var.setCaptureSectionsDecoratorAllowed(true);
            r71Var.setOverScrollMode(0);
            oi.q qVar = this.h;
            if (qVar != null) {
                qVar.b(r71Var);
            }
        }
        return adVar;
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.m91
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((t61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j10 = this.f;
        int i10 = this.b;
        if (j10 == 0) {
            ca y3 = ca.y(i10, this.c);
            arrayList.add(t61.D(0));
            if (y3.O(1)) {
                arrayList.add(t61.D(1));
            }
            if (y3.O(2)) {
                arrayList.add(t61.D(2));
                return;
            }
            return;
        }
        m0 g7 = m0.g(i10);
        arrayList.add(t61.D(0));
        if (!g7.k(j10).a[1].isEmpty()) {
            arrayList.add(t61.D(1));
        }
        if (g7.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(t61.D(2));
    }
}
