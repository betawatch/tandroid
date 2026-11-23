package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.Components.b71 {
    public org.telegram.ui.ActionBar.g1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ri.q c;
    public final /* synthetic */ x6 d;
    public final /* synthetic */ org.telegram.ui.Components.tt0 e;
    public final /* synthetic */ s7 f;

    public c7(s7 s7Var, Context context, ri.q qVar, x6 x6Var, org.telegram.ui.Components.tt0 tt0Var) {
        this.f = s7Var;
        this.b = context;
        this.c = qVar;
        this.d = x6Var;
        this.e = tt0Var;
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(View view, int i7, int i10) {
        s7 s7Var = this.f;
        org.telegram.ui.Components.ek0 c10 = s7Var.c(view);
        ArrayList arrayList = s7Var.f;
        c10.setAdapter(((q7) arrayList.get(i7)).c);
        if (((q7) arrayList.get(i7)).b == 1 || ((q7) arrayList.get(i7)).b == 4) {
            view.getContext();
            c10.setLayoutManager(new v4.t(3));
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.c0());
        }
        c10.setTag(Integer.valueOf(((q7) arrayList.get(i7)).b));
        view.setTag(Integer.valueOf(((q7) arrayList.get(i7)).b));
        if (this.e != null) {
            ((org.telegram.ui.Components.gk0) s7Var.n).H(view);
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final View d(int i7) {
        Context context = this.b;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        ri.q qVar = this.c;
        if (qVar != null) {
            qVar.b(ek0Var);
        }
        v4.k kVar = (v4.k) ek0Var.getItemAnimator();
        kVar.C = false;
        kVar.m = false;
        ek0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            ek0Var.setSections(false);
        }
        ek0Var.setCaptureSectionsDecoratorAllowed(true);
        s7 s7Var = this.f;
        if (i7 == 1) {
            ek0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, s7Var.w);
        } else {
            ek0Var.setPadding(0, 0, 0, s7Var.w);
        }
        ek0Var.setOnItemClickListener(new b7(this, ek0Var));
        ek0Var.setOnItemLongClickListener(new z6(this, ek0Var, this.d, 0));
        return this.e == null ? ek0Var : new r7(context, ek0Var);
    }

    @Override // org.telegram.ui.Components.b71
    public final int e() {
        return this.f.f.size();
    }

    @Override // org.telegram.ui.Components.b71
    public final int f(int i7) {
        return ((q7) this.f.f.get(i7)).b;
    }

    @Override // org.telegram.ui.Components.b71
    public final CharSequence g(int i7) {
        return ((q7) this.f.f.get(i7)).a;
    }

    @Override // org.telegram.ui.Components.b71
    public final int h(int i7) {
        return ((q7) this.f.f.get(i7)).b;
    }
}
