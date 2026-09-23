package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e7 extends org.telegram.ui.Components.z71 {
    public org.telegram.ui.ActionBar.n1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = s7Var;
        this.b = context;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.z71
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) view;
        ArrayList arrayList = this.d.e;
        ml0Var.setAdapter(((r7) arrayList.get(i10)).c);
        if (((r7) arrayList.get(i10)).b == 1 || ((r7) arrayList.get(i10)).b == 4) {
            view.getContext();
            ml0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            ml0Var.setLayoutManager(new s4.c0());
        }
        ml0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.z71
    public final View d(int i10) {
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(this.b, null);
        s4.j jVar = (s4.j) ml0Var.getItemAnimator();
        jVar.C = false;
        jVar.m = false;
        ml0Var.setClipToPadding(false);
        ml0Var.setPadding(0, 0, 0, this.d.s);
        ml0Var.setOnItemClickListener(new d7(this, ml0Var));
        ml0Var.setOnItemLongClickListener(new b7(this, ml0Var, this.c, 0));
        return ml0Var;
    }

    @Override // org.telegram.ui.Components.z71
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.z71
    public final int f(int i10) {
        return ((r7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.z71
    public final CharSequence g(int i10) {
        return ((r7) this.d.e.get(i10)).a;
    }
}
