package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e7 extends org.telegram.ui.Components.f61 {
    public org.telegram.ui.ActionBar.f1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ pi.q c;
    public final /* synthetic */ z6 d;
    public final /* synthetic */ org.telegram.ui.Components.gt0 e;
    public final /* synthetic */ u7 f;

    public e7(u7 u7Var, Context context, pi.q qVar, z6 z6Var, org.telegram.ui.Components.gt0 gt0Var) {
        this.f = u7Var;
        this.b = context;
        this.c = qVar;
        this.d = z6Var;
        this.e = gt0Var;
    }

    @Override // org.telegram.ui.Components.f61
    public final void b(View view, int i3, int i10) {
        u7 u7Var = this.f;
        org.telegram.ui.Components.tj0 c2 = u7Var.c(view);
        ArrayList arrayList = u7Var.f;
        c2.setAdapter(((s7) arrayList.get(i3)).c);
        if (((s7) arrayList.get(i3)).b == 1 || ((s7) arrayList.get(i3)).b == 4) {
            view.getContext();
            c2.setLayoutManager(new u4.s(3));
        } else {
            view.getContext();
            c2.setLayoutManager(new u4.b0());
        }
        c2.setTag(Integer.valueOf(((s7) arrayList.get(i3)).b));
        view.setTag(Integer.valueOf(((s7) arrayList.get(i3)).b));
        if (this.e != null) {
            ((org.telegram.ui.Components.vj0) u7Var.n).L(view);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final View d(int i3) {
        Context context = this.b;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        pi.q qVar = this.c;
        if (qVar != null) {
            qVar.b(tj0Var);
        }
        u4.k kVar = (u4.k) tj0Var.getItemAnimator();
        kVar.C = false;
        kVar.m = false;
        tj0Var.setClipToPadding(false);
        if (i3 != 1 && i3 != 4 && qVar != null) {
            tj0Var.setSections(false);
        }
        tj0Var.setCaptureSectionsDecoratorAllowed(true);
        u7 u7Var = this.f;
        if (i3 == 1) {
            tj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, 0, u7Var.w);
        } else {
            tj0Var.setPadding(0, 0, 0, u7Var.w);
        }
        tj0Var.setOnItemClickListener(new d7(this, tj0Var));
        tj0Var.setOnItemLongClickListener(new b7(this, tj0Var, this.d, 0));
        return this.e == null ? tj0Var : new t7(context, tj0Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final int e() {
        return this.f.f.size();
    }

    @Override // org.telegram.ui.Components.f61
    public final int f(int i3) {
        return ((s7) this.f.f.get(i3)).b;
    }

    @Override // org.telegram.ui.Components.f61
    public final CharSequence g(int i3) {
        return ((s7) this.f.f.get(i3)).a;
    }

    @Override // org.telegram.ui.Components.f61
    public final int h(int i3) {
        return ((s7) this.f.f.get(i3)).b;
    }
}
