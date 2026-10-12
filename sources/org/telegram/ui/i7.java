package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i7 extends org.telegram.ui.Components.c91 {
    public org.telegram.ui.ActionBar.m1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 c;
    public final /* synthetic */ w7 d;

    public i7(w7 w7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = w7Var;
        this.b = context;
        this.c = m2Var;
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) view;
        ArrayList arrayList = this.d.e;
        mm0Var.setAdapter(((v7) arrayList.get(i10)).c);
        if (((v7) arrayList.get(i10)).b == 1 || ((v7) arrayList.get(i10)).b == 4) {
            view.getContext();
            mm0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            mm0Var.setLayoutManager(new s4.b0());
        }
        mm0Var.setTag(Integer.valueOf(((v7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(this.b, null);
        s4.k kVar = (s4.k) mm0Var.getItemAnimator();
        kVar.C = false;
        kVar.m = false;
        mm0Var.setClipToPadding(false);
        mm0Var.setPadding(0, 0, 0, this.d.s);
        mm0Var.setOnItemClickListener(new h7(this, mm0Var));
        mm0Var.setOnItemLongClickListener(new f7(this, mm0Var, this.c, 0));
        return mm0Var;
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.c91
    public final int f(int i10) {
        return ((v7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.c91
    public final CharSequence g(int i10) {
        return ((v7) this.d.e.get(i10)).a;
    }
}
