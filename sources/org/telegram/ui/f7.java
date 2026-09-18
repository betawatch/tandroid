package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f7 extends org.telegram.ui.Components.b81 {
    public org.telegram.ui.ActionBar.o1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ki.i c;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 d;
    public final /* synthetic */ u7 e;

    public f7(u7 u7Var, Context context, ki.i iVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.e = u7Var;
        this.b = context;
        this.c = iVar;
        this.d = o2Var;
    }

    @Override // org.telegram.ui.Components.b81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) view;
        ArrayList arrayList = this.e.e;
        ml0Var.setAdapter(((t7) arrayList.get(i10)).c);
        if (((t7) arrayList.get(i10)).b == 1 || ((t7) arrayList.get(i10)).b == 4) {
            view.getContext();
            ml0Var.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            ml0Var.setLayoutManager(new s4.c0());
        }
        ml0Var.setTag(Integer.valueOf(((t7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.b81
    public final View d(int i10) {
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(this.b, null);
        ki.i iVar = this.c;
        if (iVar != null) {
            iVar.a(ml0Var);
        }
        s4.j jVar = (s4.j) ml0Var.getItemAnimator();
        jVar.C = false;
        jVar.m = false;
        ml0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && iVar != null) {
            ml0Var.setSections(false);
        }
        ml0Var.setCaptureSectionsDecoratorAllowed(true);
        u7 u7Var = this.e;
        if (i10 == 1) {
            ml0Var.setPadding(AndroidUtilities.dp(2.0f), u7Var.s, 0, u7Var.v);
        } else {
            ml0Var.setPadding(0, u7Var.s, 0, u7Var.v);
        }
        ml0Var.setOnItemClickListener(new e7(this, ml0Var));
        ml0Var.setOnItemLongClickListener(new c7(this, ml0Var, this.d, 0));
        return ml0Var;
    }

    @Override // org.telegram.ui.Components.b81
    public final int e() {
        return this.e.e.size();
    }

    @Override // org.telegram.ui.Components.b81
    public final int f(int i10) {
        return ((t7) this.e.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.b81
    public final CharSequence g(int i10) {
        return ((t7) this.e.e.get(i10)).a;
    }

    @Override // org.telegram.ui.Components.b81
    public final int h(int i10) {
        return ((t7) this.e.e.get(i10)).b;
    }
}
