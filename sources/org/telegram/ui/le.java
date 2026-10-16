package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class le extends org.telegram.ui.Components.d91 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ me f;

    public le(me meVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f = meVar;
        this.a = context;
        this.b = i10;
        this.c = i11;
        this.d = c6Var;
        i();
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        return new ke(this.f, this.a, i10, this.b, this.c, new ah.g(this, i10, 19), this.d);
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON) : LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.m61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        me meVar = this.f;
        if (!meVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.m61.C(1));
        }
        if (meVar.n.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.m61.C(0));
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
    }
}
