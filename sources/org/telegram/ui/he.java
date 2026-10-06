package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class he extends org.telegram.ui.Components.y81 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ ie f;

    public he(ie ieVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f = ieVar;
        this.a = context;
        this.b = i10;
        this.c = i11;
        this.d = d6Var;
        i();
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        this.f.b.L(view);
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        return new ge(this.f, this.a, i10, this.b, this.c, new ai.o8(this, i10, 18), this.d);
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.y81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON) : LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override // org.telegram.ui.Components.y81
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
        ie ieVar = this.f;
        if (!ieVar.n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h61.D(1));
        }
        if (ieVar.r.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.h61.D(0));
    }
}
