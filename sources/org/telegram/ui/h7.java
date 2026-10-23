package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class h7 extends org.telegram.ui.Components.d91 {
    public org.telegram.ui.ActionBar.m1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ v7 d;

    public h7(v7 v7Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = v7Var;
        this.b = context;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) view;
        ArrayList arrayList = this.d.f;
        mm0Var.setAdapter(((u7) arrayList.get(i10)).c);
        if (((u7) arrayList.get(i10)).b == 1 || ((u7) arrayList.get(i10)).b == 4) {
            view.getContext();
            mm0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            mm0Var.setLayoutManager(new s4.b0());
        }
        mm0Var.setTag(Integer.valueOf(((u7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(this.b, null);
        s4.k kVar = (s4.k) mm0Var.getItemAnimator();
        kVar.C = false;
        kVar.m = false;
        mm0Var.setClipToPadding(false);
        mm0Var.setPadding(0, 0, 0, this.d.v);
        mm0Var.setOnItemClickListener(new g7(this, mm0Var));
        mm0Var.setOnItemLongClickListener(new e7(this, mm0Var, this.c, 0));
        return mm0Var;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.d.f.size();
    }

    @Override // org.telegram.ui.Components.d91
    public final int f(int i10) {
        return ((u7) this.d.f.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        return ((u7) this.d.f.get(i10)).a;
    }
}
