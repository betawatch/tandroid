package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g7 extends org.telegram.ui.Components.e81 {
    public org.telegram.ui.ActionBar.p1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ u7 d;

    public g7(u7 u7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = u7Var;
        this.b = context;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.e81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.tl0 tl0Var = (org.telegram.ui.Components.tl0) view;
        ArrayList arrayList = this.d.e;
        tl0Var.setAdapter(((t7) arrayList.get(i10)).c);
        if (((t7) arrayList.get(i10)).b == 1 || ((t7) arrayList.get(i10)).b == 4) {
            view.getContext();
            tl0Var.setLayoutManager(new f2.w(3));
        } else {
            view.getContext();
            tl0Var.setLayoutManager(new f2.j0());
        }
        tl0Var.setTag(Integer.valueOf(((t7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.e81
    public final View d(int i10) {
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(this.b, null);
        f2.l lVar = (f2.l) tl0Var.getItemAnimator();
        lVar.C = false;
        lVar.m = false;
        tl0Var.setClipToPadding(false);
        tl0Var.setPadding(0, 0, 0, this.d.s);
        tl0Var.setOnItemClickListener(new f7(this, tl0Var));
        tl0Var.setOnItemLongClickListener(new d7(this, tl0Var, this.c, 0));
        return tl0Var;
    }

    @Override // org.telegram.ui.Components.e81
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.e81
    public final int f(int i10) {
        return ((t7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.e81
    public final CharSequence g(int i10) {
        return ((t7) this.d.e.get(i10)).a;
    }
}
