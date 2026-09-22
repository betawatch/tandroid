package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ee extends org.telegram.ui.Components.a81 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ fe f;

    public ee(fe feVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f = feVar;
        this.a = context;
        this.b = i10;
        this.c = i11;
        this.d = e6Var;
        i();
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        return new de(this.f, this.a, i10, this.b, this.c, new ai.n8(this, i10, 18), this.d);
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.a81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON) : LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.i51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        fe feVar = this.f;
        if (!feVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.i51.C(1));
        }
        if (feVar.n.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.i51.C(0));
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
    }
}
