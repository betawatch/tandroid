package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.Components.m61 {
    public org.telegram.ui.ActionBar.g1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ oi.q c;
    public final /* synthetic */ y6 d;
    public final /* synthetic */ org.telegram.ui.Components.ht0 e;
    public final /* synthetic */ t7 f;

    public d7(t7 t7Var, Context context, oi.q qVar, y6 y6Var, org.telegram.ui.Components.ht0 ht0Var) {
        this.f = t7Var;
        this.b = context;
        this.c = qVar;
        this.d = y6Var;
        this.e = ht0Var;
    }

    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
        t7 t7Var = this.f;
        org.telegram.ui.Components.pj0 c10 = t7Var.c(view);
        ArrayList arrayList = t7Var.f;
        c10.setAdapter(((r7) arrayList.get(i7)).c);
        if (((r7) arrayList.get(i7)).b == 1 || ((r7) arrayList.get(i7)).b == 4) {
            view.getContext();
            c10.setLayoutManager(new v4.s(3));
        } else {
            view.getContext();
            c10.setLayoutManager(new v4.b0());
        }
        c10.setTag(Integer.valueOf(((r7) arrayList.get(i7)).b));
        view.setTag(Integer.valueOf(((r7) arrayList.get(i7)).b));
        if (this.e != null) {
            ((org.telegram.ui.Components.rj0) t7Var.n).L(view);
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        Context context = this.b;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        oi.q qVar = this.c;
        if (qVar != null) {
            qVar.b(pj0Var);
        }
        v4.k kVar = (v4.k) pj0Var.getItemAnimator();
        kVar.C = false;
        kVar.m = false;
        pj0Var.setClipToPadding(false);
        if (i7 != 1 && i7 != 4 && qVar != null) {
            pj0Var.setSections(false);
        }
        pj0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.f;
        if (i7 == 1) {
            pj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, t7Var.w);
        } else {
            pj0Var.setPadding(0, 0, 0, t7Var.w);
        }
        pj0Var.setOnItemClickListener(new c7(this, pj0Var));
        pj0Var.setOnItemLongClickListener(new a7(this, pj0Var, this.d, 0));
        return this.e == null ? pj0Var : new s7(context, pj0Var);
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        return this.f.f.size();
    }

    @Override // org.telegram.ui.Components.m61
    public final int f(int i7) {
        return ((r7) this.f.f.get(i7)).b;
    }

    @Override // org.telegram.ui.Components.m61
    public final CharSequence g(int i7) {
        return ((r7) this.f.f.get(i7)).a;
    }

    @Override // org.telegram.ui.Components.m61
    public final int h(int i7) {
        return ((r7) this.f.f.get(i7)).b;
    }
}
