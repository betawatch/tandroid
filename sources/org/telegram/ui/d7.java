package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.Components.f91 {
    public org.telegram.ui.ActionBar.n1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ r7 d;

    public d7(r7 r7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = r7Var;
        this.b = context;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.f91
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.qm0 qm0Var = (org.telegram.ui.Components.qm0) view;
        ArrayList arrayList = this.d.e;
        qm0Var.setAdapter(((q7) arrayList.get(i10)).c);
        if (((q7) arrayList.get(i10)).b == 1 || ((q7) arrayList.get(i10)).b == 4) {
            view.getContext();
            qm0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            qm0Var.setLayoutManager(new s4.d0());
        }
        qm0Var.setTag(Integer.valueOf(((q7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.f91
    public final View d(int i10) {
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(this.b, null);
        s4.j jVar = (s4.j) qm0Var.getItemAnimator();
        jVar.C = false;
        jVar.m = false;
        qm0Var.setClipToPadding(false);
        qm0Var.setPadding(0, 0, 0, this.d.s);
        qm0Var.setOnItemClickListener(new c7(this, qm0Var));
        qm0Var.setOnItemLongClickListener(new a7(this, qm0Var, this.c, 0));
        return qm0Var;
    }

    @Override // org.telegram.ui.Components.f91
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.f91
    public final int f(int i10) {
        return ((q7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.f91
    public final CharSequence g(int i10) {
        return ((q7) this.d.e.get(i10)).a;
    }
}
