package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class h7 extends org.telegram.ui.Components.u81 {
    public org.telegram.ui.ActionBar.m1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ v7 d;

    public h7(v7 v7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = v7Var;
        this.b = context;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.im0 im0Var = (org.telegram.ui.Components.im0) view;
        ArrayList arrayList = this.d.e;
        im0Var.setAdapter(((u7) arrayList.get(i10)).c);
        if (((u7) arrayList.get(i10)).b == 1 || ((u7) arrayList.get(i10)).b == 4) {
            view.getContext();
            im0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            im0Var.setLayoutManager(new s4.b0());
        }
        im0Var.setTag(Integer.valueOf(((u7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(this.b, null);
        s4.k kVar = (s4.k) im0Var.getItemAnimator();
        kVar.C = false;
        kVar.m = false;
        im0Var.setClipToPadding(false);
        im0Var.setPadding(0, 0, 0, this.d.s);
        im0Var.setOnItemClickListener(new g7(this, im0Var));
        im0Var.setOnItemLongClickListener(new e7(this, im0Var, this.c, 0));
        return im0Var;
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.u81
    public final int f(int i10) {
        return ((u7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.u81
    public final CharSequence g(int i10) {
        return ((u7) this.d.e.get(i10)).a;
    }
}
