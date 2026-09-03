package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i7 extends org.telegram.ui.Components.c81 {
    public org.telegram.ui.ActionBar.p1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ w7 d;

    public i7(w7 w7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = w7Var;
        this.b = context;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) view;
        ArrayList arrayList = this.d.e;
        rl0Var.setAdapter(((v7) arrayList.get(i10)).c);
        if (((v7) arrayList.get(i10)).b == 1 || ((v7) arrayList.get(i10)).b == 4) {
            view.getContext();
            rl0Var.setLayoutManager(new f2.w(3));
        } else {
            view.getContext();
            rl0Var.setLayoutManager(new f2.i0());
        }
        rl0Var.setTag(Integer.valueOf(((v7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(this.b, null);
        f2.l lVar = (f2.l) rl0Var.getItemAnimator();
        lVar.C = false;
        lVar.m = false;
        rl0Var.setClipToPadding(false);
        rl0Var.setPadding(0, 0, 0, this.d.s);
        rl0Var.setOnItemClickListener(new h7(this, rl0Var));
        rl0Var.setOnItemLongClickListener(new f7(this, rl0Var, this.c, 0));
        return rl0Var;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.c81
    public final int f(int i10) {
        return ((v7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        return ((v7) this.d.e.get(i10)).a;
    }
}
