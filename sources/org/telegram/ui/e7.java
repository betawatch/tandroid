package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class e7 extends org.telegram.ui.Components.o81 {
    public org.telegram.ui.ActionBar.n1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ li.i c;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 d;
    public final /* synthetic */ t7 e;

    public e7(t7 t7Var, Context context, li.i iVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = t7Var;
        this.b = context;
        this.c = iVar;
        this.d = n2Var;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) view;
        ArrayList arrayList = this.e.e;
        wl0Var.setAdapter(((s7) arrayList.get(i10)).c);
        if (((s7) arrayList.get(i10)).b == 1 || ((s7) arrayList.get(i10)).b == 4) {
            view.getContext();
            wl0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            wl0Var.setLayoutManager(new s4.c0());
        }
        wl0Var.setTag(Integer.valueOf(((s7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(this.b, null);
        li.i iVar = this.c;
        if (iVar != null) {
            iVar.a(wl0Var);
        }
        s4.j jVar = (s4.j) wl0Var.getItemAnimator();
        jVar.C = false;
        jVar.m = false;
        wl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && iVar != null) {
            wl0Var.setSections(false);
        }
        wl0Var.setCaptureSectionsDecoratorAllowed(true);
        t7 t7Var = this.e;
        if (i10 == 1) {
            wl0Var.setPadding(AndroidUtilities.dp(2.0f), t7Var.s, 0, t7Var.v);
        } else {
            wl0Var.setPadding(0, t7Var.s, 0, t7Var.v);
        }
        wl0Var.setOnItemClickListener(new d7(this, wl0Var));
        wl0Var.setOnItemLongClickListener(new b7(this, wl0Var, this.d, 0));
        return wl0Var;
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return this.e.e.size();
    }

    @Override // org.telegram.ui.Components.o81
    public final int f(int i10) {
        return ((s7) this.e.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.o81
    public final CharSequence g(int i10) {
        return ((s7) this.e.e.get(i10)).a;
    }

    @Override // org.telegram.ui.Components.o81
    public final int h(int i10) {
        return ((s7) this.e.e.get(i10)).b;
    }
}
