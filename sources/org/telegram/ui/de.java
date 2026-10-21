package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class de extends org.telegram.ui.Components.w81 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ ee f;

    public de(ee eeVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f = eeVar;
        this.a = context;
        this.b = i10;
        this.c = i11;
        this.d = d6Var;
        i();
    }

    @Override // org.telegram.ui.Components.w81
    public final View d(int i10) {
        return new ce(this.f, this.a, i10, this.b, this.c, new ah.g(this, i10, 21), this.d);
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.w81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON) : LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override // org.telegram.ui.Components.w81
    public final int h(int i10) {
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.h61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ee eeVar = this.f;
        if (!eeVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h61.C(1));
        }
        if (eeVar.n.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.h61.C(0));
    }

    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
    }
}
