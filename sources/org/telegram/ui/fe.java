package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fe extends org.telegram.ui.Components.d81 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ ge f;

    public fe(ge geVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f = geVar;
        this.a = context;
        this.b = i10;
        this.c = i11;
        this.d = g6Var;
        i();
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        return new ee(this.f, this.a, i10, this.b, this.c, new af.b(this, i10, 16), this.d);
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.d81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON) : LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override // org.telegram.ui.Components.d81
    public final int h(int i10) {
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.h51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ge geVar = this.f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h51.C(1));
        }
        if (geVar.n.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.h51.C(0));
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
    }
}
