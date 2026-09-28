package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class e7 extends org.telegram.ui.Components.p81 {
    public org.telegram.ui.ActionBar.m1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 c;
    public final /* synthetic */ s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = s7Var;
        this.b = context;
        this.c = m2Var;
    }

    @Override // org.telegram.ui.Components.p81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) view;
        ArrayList arrayList = this.d.e;
        yl0Var.setAdapter(((r7) arrayList.get(i10)).c);
        if (((r7) arrayList.get(i10)).b == 1 || ((r7) arrayList.get(i10)).b == 4) {
            view.getContext();
            yl0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            yl0Var.setLayoutManager(new s4.c0());
        }
        yl0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.p81
    public final View d(int i10) {
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(this.b, null);
        s4.j jVar = (s4.j) yl0Var.getItemAnimator();
        jVar.C = false;
        jVar.m = false;
        yl0Var.setClipToPadding(false);
        yl0Var.setPadding(0, 0, 0, this.d.s);
        yl0Var.setOnItemClickListener(new d7(this, yl0Var));
        yl0Var.setOnItemLongClickListener(new b7(this, yl0Var, this.c, 0));
        return yl0Var;
    }

    @Override // org.telegram.ui.Components.p81
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.p81
    public final int f(int i10) {
        return ((r7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.p81
    public final CharSequence g(int i10) {
        return ((r7) this.d.e.get(i10)).a;
    }
}
