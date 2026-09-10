package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.Components.n81 {
    public org.telegram.ui.ActionBar.p1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ r7 d;

    public d7(r7 r7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = r7Var;
        this.b = context;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) view;
        ArrayList arrayList = this.d.e;
        vl0Var.setAdapter(((q7) arrayList.get(i10)).c);
        if (((q7) arrayList.get(i10)).b == 1 || ((q7) arrayList.get(i10)).b == 4) {
            view.getContext();
            vl0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            vl0Var.setLayoutManager(new s4.c0());
        }
        vl0Var.setTag(Integer.valueOf(((q7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(this.b, null);
        s4.j jVar = (s4.j) vl0Var.getItemAnimator();
        jVar.C = false;
        jVar.m = false;
        vl0Var.setClipToPadding(false);
        vl0Var.setPadding(0, 0, 0, this.d.s);
        vl0Var.setOnItemClickListener(new c7(this, vl0Var));
        vl0Var.setOnItemLongClickListener(new a7(this, vl0Var, this.c, 0));
        return vl0Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.n81
    public final int f(int i10) {
        return ((q7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        return ((q7) this.d.e.get(i10)).a;
    }
}
