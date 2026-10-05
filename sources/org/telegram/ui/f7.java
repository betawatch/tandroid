package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class f7 extends org.telegram.ui.Components.y81 {
    public org.telegram.ui.ActionBar.n1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ li.p c;
    public final /* synthetic */ a7 d;
    public final /* synthetic */ org.telegram.ui.Components.bw0 e;
    public final /* synthetic */ v7 f;

    public f7(v7 v7Var, Context context, li.p pVar, a7 a7Var, org.telegram.ui.Components.bw0 bw0Var) {
        this.f = v7Var;
        this.b = context;
        this.c = pVar;
        this.d = a7Var;
        this.e = bw0Var;
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.zl0 c10 = v7.c(view);
        v7 v7Var = this.f;
        ArrayList arrayList = v7Var.e;
        c10.setAdapter(((t7) arrayList.get(i10)).c);
        if (((t7) arrayList.get(i10)).b == 1 || ((t7) arrayList.get(i10)).b == 4) {
            view.getContext();
            c10.setLayoutManager(new s4.s(3));
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.c0());
        }
        c10.setTag(Integer.valueOf(((t7) arrayList.get(i10)).b));
        view.setTag(Integer.valueOf(((t7) arrayList.get(i10)).b));
        if (this.e != null) {
            ((org.telegram.ui.Components.bm0) v7Var.h).L(view);
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        Context context = this.b;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        li.p pVar = this.c;
        if (pVar != null) {
            pVar.b(zl0Var);
        }
        s4.j jVar = (s4.j) zl0Var.getItemAnimator();
        jVar.C = false;
        jVar.m = false;
        zl0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && pVar != null) {
            zl0Var.setSections(false);
        }
        zl0Var.setCaptureSectionsDecoratorAllowed(true);
        v7 v7Var = this.f;
        if (i10 == 1) {
            zl0Var.setPadding(AndroidUtilities.dp(2.0f), 0, 0, v7Var.s);
        } else {
            zl0Var.setPadding(0, 0, 0, v7Var.s);
        }
        zl0Var.setOnItemClickListener(new e7(this, zl0Var));
        zl0Var.setOnItemLongClickListener(new c7(this, zl0Var, this.d, 0));
        return this.e == null ? zl0Var : new u7(context, zl0Var);
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return this.f.e.size();
    }

    @Override // org.telegram.ui.Components.y81
    public final int f(int i10) {
        return ((t7) this.f.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.y81
    public final CharSequence g(int i10) {
        return ((t7) this.f.e.get(i10)).a;
    }

    @Override // org.telegram.ui.Components.y81
    public final int h(int i10) {
        return ((t7) this.f.e.get(i10)).b;
    }
}
