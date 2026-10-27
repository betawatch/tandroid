package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fe extends org.telegram.ui.Components.n91 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ ge f;

    public fe(ge geVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f = geVar;
        this.a = context;
        this.b = i10;
        this.c = i11;
        this.d = u6Var;
        i();
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        this.f.b.L(view);
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        return new ee(this.f, this.a, i10, this.b, this.c, new ag.r0(this, i10, 21), this.d);
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON) : LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.u61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ge geVar = this.f;
        if (!geVar.n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.u61.D(1));
        }
        if (geVar.r.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.u61.D(0));
    }
}
