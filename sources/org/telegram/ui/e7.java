package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class e7 extends org.telegram.ui.Components.n81 {
    public org.telegram.ui.ActionBar.m1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 c;
    public final /* synthetic */ s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = s7Var;
        this.b = context;
        this.c = m2Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) view;
        ArrayList arrayList = this.d.e;
        wl0Var.setAdapter(((r7) arrayList.get(i10)).c);
        if (((r7) arrayList.get(i10)).b == 1 || ((r7) arrayList.get(i10)).b == 4) {
            view.getContext();
            wl0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            wl0Var.setLayoutManager(new s4.c0());
        }
        wl0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(this.b, null);
        s4.j jVar = (s4.j) wl0Var.getItemAnimator();
        jVar.C = false;
        jVar.m = false;
        wl0Var.setClipToPadding(false);
        wl0Var.setPadding(0, 0, 0, this.d.s);
        wl0Var.setOnItemClickListener(new d7(this, wl0Var));
        wl0Var.setOnItemLongClickListener(new b7(this, wl0Var, this.c, 0));
        return wl0Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.n81
    public final int f(int i10) {
        return ((r7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        return ((r7) this.d.e.get(i10)).a;
    }
}
