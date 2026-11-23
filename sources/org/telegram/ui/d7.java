package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.Components.c71 {
    public org.telegram.ui.ActionBar.g1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ri.q c;
    public final /* synthetic */ y6 d;
    public final /* synthetic */ org.telegram.ui.Components.st0 e;
    public final /* synthetic */ t7 f;

    public d7(t7 t7Var, Context context, ri.q qVar, y6 y6Var, org.telegram.ui.Components.st0 st0Var) {
        this.f = t7Var;
        this.b = context;
        this.c = qVar;
        this.d = y6Var;
        this.e = st0Var;
    }

    @Override // org.telegram.ui.Components.c71
    public final void b(View view, int i7, int i10) {
        t7 t7Var = this.f;
        org.telegram.ui.Components.ek0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f;
        c10.setAdapter(((r7) arrayList.get(i7)).c);
        if (((r7) arrayList.get(i7)).b == 1 || ((r7) arrayList.get(i7)).b == 4) {
            view.getContext();
            c10.setLayoutManager(new v4.t(3));
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.c0());
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i7)).b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i7)).b));
        if (this.e != null) {
            ((org.telegram.ui.Components.gk0) t7Var.n).J(view);
        }
    }

    @Override // org.telegram.ui.Components.c71
    public final View d(int i7) {
        Context context = this.b;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        ri.q qVar = this.c;
        if (qVar != null) {
            qVar.b(ek0Var);
        }
        v4.l lVar = (v4.l) ek0Var.getItemAnimator();
        lVar.C = false;
        lVar.m = false;
        ek0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            ek0Var.setSections(false);
        }
        ek0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f;
        if (i7 == 1) {
            ek0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, t7Var.w);
        } else {
            ek0Var.setPadding(0, 0, 0, t7Var.w);
        }
        ek0Var.setOnItemClickListener(new c7(this, ek0Var));
        ek0Var.setOnItemLongClickListener(new a7(this, ek0Var, this.d, 0));
        return this.e == null ? ek0Var : new s7(context, ek0Var);
    }

    @Override // org.telegram.ui.Components.c71
    public final int e() {
        return this.f.f.size();
    }

    @Override // org.telegram.ui.Components.c71
    public final int f(int i7) {
        return ((r7) this.f.f.get(i7)).b;
    }

    @Override // org.telegram.ui.Components.c71
    public final CharSequence g(int i7) {
        return ((r7) this.f.f.get(i7)).a;
    }

    @Override // org.telegram.ui.Components.c71
    public final int h(int i7) {
        return ((r7) this.f.f.get(i7)).b;
    }
}
