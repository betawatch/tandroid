package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.Components.e71 {
    public org.telegram.ui.ActionBar.o1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ r7 d;

    public d7(r7 r7Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = r7Var;
        this.b = context;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) view;
        ArrayList arrayList = this.d.e;
        wk0Var.setAdapter(((q7) arrayList.get(i9)).c);
        if (((q7) arrayList.get(i9)).b == 1 || ((q7) arrayList.get(i9)).b == 4) {
            view.getContext();
            wk0Var.setLayoutManager(new f2.y(3));
        } else {
            view.getContext();
            wk0Var.setLayoutManager(new f2.m0());
        }
        wk0Var.setTag(Integer.valueOf(((q7) arrayList.get(i9)).b));
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(this.b, null);
        f2.n nVar = (f2.n) wk0Var.getItemAnimator();
        nVar.C = false;
        nVar.m = false;
        wk0Var.setClipToPadding(false);
        wk0Var.setPadding(0, 0, 0, this.d.s);
        wk0Var.setOnItemClickListener(new c7(this, wk0Var));
        wk0Var.setOnItemLongClickListener(new a7(this, wk0Var, this.c, 0));
        return wk0Var;
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.e71
    public final int f(int i9) {
        return ((q7) this.d.e.get(i9)).b;
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence g(int i9) {
        return ((q7) this.d.e.get(i9)).a;
    }
}
