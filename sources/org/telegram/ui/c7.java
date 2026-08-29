package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.Components.q71 {
    public org.telegram.ui.ActionBar.o1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ q7 d;

    public c7(q7 q7Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = q7Var;
        this.b = context;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) view;
        ArrayList arrayList = this.d.e;
        jl0Var.setAdapter(((p7) arrayList.get(i10)).c);
        if (((p7) arrayList.get(i10)).b == 1 || ((p7) arrayList.get(i10)).b == 4) {
            view.getContext();
            jl0Var.setLayoutManager(new f2.w(3));
        } else {
            view.getContext();
            jl0Var.setLayoutManager(new f2.j0());
        }
        jl0Var.setTag(Integer.valueOf(((p7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(this.b, null);
        f2.l lVar = (f2.l) jl0Var.getItemAnimator();
        lVar.C = false;
        lVar.m = false;
        jl0Var.setClipToPadding(false);
        jl0Var.setPadding(0, 0, 0, this.d.s);
        jl0Var.setOnItemClickListener(new b7(this, jl0Var));
        jl0Var.setOnItemLongClickListener(new z6(this, jl0Var, this.c, 0));
        return jl0Var;
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.q71
    public final int f(int i10) {
        return ((p7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.q71
    public final CharSequence g(int i10) {
        return ((p7) this.d.e.get(i10)).a;
    }
}
