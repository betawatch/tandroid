package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ge extends org.telegram.ui.Components.o71 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ he f;

    public ge(he heVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f = heVar;
        this.a = context;
        this.b = i10;
        this.c = i11;
        this.d = p6Var;
        i();
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
        this.f.b.L(view);
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        return new fe(this.f, this.a, i10, this.b, this.c, new ag.d3(this, i10, 15), this.d);
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.o71
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? "" : org.telegram.messenger.cd.L0(2131748367, null) : org.telegram.messenger.cd.L0(2131748368, null);
    }

    @Override // org.telegram.ui.Components.o71
    public final int h(int i10) {
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.a51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        he heVar = this.f;
        if (!heVar.n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.a51.D(1));
        }
        if (heVar.r.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.a51.D(0));
    }
}
