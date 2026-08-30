package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g7 extends org.telegram.ui.Components.c81 {
    public org.telegram.ui.ActionBar.p1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ u7 d;

    public g7(u7 u7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = u7Var;
        this.b = context;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) view;
        ArrayList arrayList = this.d.e;
        sl0Var.setAdapter(((t7) arrayList.get(i10)).c);
        if (((t7) arrayList.get(i10)).b == 1 || ((t7) arrayList.get(i10)).b == 4) {
            view.getContext();
            sl0Var.setLayoutManager(new f2.w(3));
        } else {
            view.getContext();
            sl0Var.setLayoutManager(new f2.i0());
        }
        sl0Var.setTag(Integer.valueOf(((t7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(this.b, null);
        f2.l lVar = (f2.l) sl0Var.getItemAnimator();
        lVar.C = false;
        lVar.m = false;
        sl0Var.setClipToPadding(false);
        sl0Var.setPadding(0, 0, 0, this.d.s);
        sl0Var.setOnItemClickListener(new f7(this, sl0Var));
        sl0Var.setOnItemLongClickListener(new d7(this, sl0Var, this.c, 0));
        return sl0Var;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.c81
    public final int f(int i10) {
        return ((t7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        return ((t7) this.d.e.get(i10)).a;
    }
}
