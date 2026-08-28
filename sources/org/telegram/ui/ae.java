package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ae extends org.telegram.ui.Components.e71 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ be f;

    public ae(be beVar, Context context, int i9, long j10, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f = beVar;
        this.a = context;
        this.b = i9;
        this.c = i10;
        this.d = b6Var;
        i();
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        return new zd(this.f, this.a, i9, this.b, this.c, new bg.c2(this, i9, 17), this.d);
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence g(int i9) {
        int h = h(i9);
        return h != 0 ? h != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON) : LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        if (i9 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i9 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.l41) arrayList.get(i9)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        be beVar = this.f;
        if (!beVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.l41.C(1));
        }
        if (beVar.n.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.l41.C(0));
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
    }
}
