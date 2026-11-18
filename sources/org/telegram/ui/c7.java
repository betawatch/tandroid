package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.Components.y61 {
    public org.telegram.ui.ActionBar.h1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ri.q c;
    public final /* synthetic */ x6 d;
    public final /* synthetic */ org.telegram.ui.Components.qt0 e;
    public final /* synthetic */ s7 f;

    public c7(s7 s7Var, Context context, ri.q qVar, x6 x6Var, org.telegram.ui.Components.qt0 qt0Var) {
        this.f = s7Var;
        this.b = context;
        this.c = qVar;
        this.d = x6Var;
        this.e = qt0Var;
    }

    @Override // org.telegram.ui.Components.y61
    public final void b(View view, int i7, int i10) {
        s7 s7Var = this.f;
        org.telegram.ui.Components.ck0 c10 = s7Var.c(view);
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
            ((org.telegram.ui.Components.ek0) s7Var.n).H(view);
        }
    }

    @Override // org.telegram.ui.Components.y61
    public final View d(int i7) {
        Context context = this.b;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        ri.q qVar = this.c;
        if (qVar != null) {
            qVar.b(ck0Var);
        }
        v4.k kVar = (v4.k) ck0Var.getItemAnimator();
        kVar.C = false;
        kVar.m = false;
        ck0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            ck0Var.setSections(false);
        }
        ck0Var.setCaptureSectionsDecoratorAllowed(true);
        s7 s7Var = this.f;
        if (i7 == 1) {
            ck0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, s7Var.w);
        } else {
            ck0Var.setPadding(0, 0, 0, s7Var.w);
        }
        ck0Var.setOnItemClickListener(new b7(this, ck0Var));
        ck0Var.setOnItemLongClickListener(new z6(this, ck0Var, this.d, 0));
        return this.e == null ? ck0Var : new r7(context, ck0Var);
    }

    @Override // org.telegram.ui.Components.y61
    public final int e() {
        return this.f.f.size();
    }

    @Override // org.telegram.ui.Components.y61
    public final int f(int i7) {
        return ((q7) this.f.f.get(i7)).b;
    }

    @Override // org.telegram.ui.Components.y61
    public final CharSequence g(int i7) {
        return ((q7) this.f.f.get(i7)).a;
    }

    @Override // org.telegram.ui.Components.y61
    public final int h(int i7) {
        return ((q7) this.f.f.get(i7)).b;
    }
}
