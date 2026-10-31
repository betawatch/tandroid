package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.Components.o71 {
    public org.telegram.ui.ActionBar.k1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ei.r c;
    public final /* synthetic */ y6 d;
    public final /* synthetic */ org.telegram.ui.Components.ku0 e;
    public final /* synthetic */ t7 f;

    public d7(t7 t7Var, Context context, ei.r rVar, y6 y6Var, org.telegram.ui.Components.ku0 ku0Var) {
        this.f = t7Var;
        this.b = context;
        this.c = rVar;
        this.d = y6Var;
        this.e = ku0Var;
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
        t7 t7Var = this.f;
        org.telegram.ui.Components.tk0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f;
        c10.setAdapter(((r7) arrayList.get(i10)).c);
        if (((r7) arrayList.get(i10)).b == 1 || ((r7) arrayList.get(i10)).b == 4) {
            view.getContext();
            c10.setLayoutManager(new s4.r(3));
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.a0());
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i10)).b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i10)).b));
        if (this.e != null) {
            ((org.telegram.ui.Components.vk0) t7Var.n).L(view);
        }
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        Context context = this.b;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        ei.r rVar = this.c;
        if (rVar != null) {
            rVar.b(tk0Var);
        }
        s4.j jVar = (s4.j) tk0Var.getItemAnimator();
        jVar.C = false;
        jVar.m = false;
        tk0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && rVar != null) {
            tk0Var.setSections(false);
        }
        tk0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f;
        if (i10 == 1) {
            tk0Var.setPadding(org.telegram.messenger.i0.L(2.0f), 0, 0, t7Var.w);
        } else {
            tk0Var.setPadding(0, 0, 0, t7Var.w);
        }
        tk0Var.setOnItemClickListener(new c7(this, tk0Var));
        tk0Var.setOnItemLongClickListener(new a7(this, tk0Var, this.d, 0));
        return this.e == null ? tk0Var : new s7(context, tk0Var);
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        return this.f.f.size();
    }

    @Override // org.telegram.ui.Components.o71
    public final int f(int i10) {
        return ((r7) this.f.f.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.o71
    public final CharSequence g(int i10) {
        return ((r7) this.f.f.get(i10)).a;
    }

    @Override // org.telegram.ui.Components.o71
    public final int h(int i10) {
        return ((r7) this.f.f.get(i10)).b;
    }
}
