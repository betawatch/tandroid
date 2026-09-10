package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ge extends org.telegram.ui.Components.n81 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ he f;

    public ge(he heVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f = heVar;
        this.a = context;
        this.b = i10;
        this.c = i11;
        this.d = f6Var;
        i();
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        return new fe(this.f, this.a, i10, this.b, this.c, new bi.s(this, i10, 17), this.d);
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON) : LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.v51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        he heVar = this.f;
        if (!heVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.v51.C(1));
        }
        if (heVar.n.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.v51.C(0));
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
    }
}
