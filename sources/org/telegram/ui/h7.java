package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h7 extends org.telegram.ui.Components.n91 {
    public org.telegram.ui.ActionBar.o1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ oi.q c;
    public final /* synthetic */ c7 d;
    public final /* synthetic */ org.telegram.ui.Components.mw0 e;
    public final /* synthetic */ x7 f;

    public h7(x7 x7Var, Context context, oi.q qVar, c7 c7Var, org.telegram.ui.Components.mw0 mw0Var) {
        this.f = x7Var;
        this.b = context;
        this.c = qVar;
        this.d = c7Var;
        this.e = mw0Var;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        x7 x7Var = this.f;
        org.telegram.ui.Components.nm0 c10 = x7Var.c(view);
        ArrayList arrayList = x7Var.f;
        c10.setAdapter(((v7) arrayList.get(i10)).c);
        if (((v7) arrayList.get(i10)).b == 1 || ((v7) arrayList.get(i10)).b == 4) {
            view.getContext();
            c10.setLayoutManager(new s4.t(3));
        } else {
            view.getContext();
            c10.setLayoutManager(new s4.c0());
        }
        c10.setTag(Integer.valueOf(((v7) arrayList.get(i10)).b));
        view.setTag(Integer.valueOf(((v7) arrayList.get(i10)).b));
        if (this.e != null) {
            ((org.telegram.ui.Components.pm0) x7Var.n).L(view);
        }
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        Context context = this.b;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        oi.q qVar = this.c;
        if (qVar != null) {
            qVar.b(nm0Var);
        }
        s4.l lVar = (s4.l) nm0Var.getItemAnimator();
        lVar.C = false;
        lVar.m = false;
        nm0Var.setClipToPadding(false);
        if (i10 != 1 && i10 != 4 && qVar != null) {
            nm0Var.setSections(false);
        }
        nm0Var.setCaptureSectionsDecoratorAllowed(true);
        x7 x7Var = this.f;
        if (i10 == 1) {
            nm0Var.setPadding(AndroidUtilities.dp(2.0f), 0, 0, x7Var.v);
        } else {
            nm0Var.setPadding(0, 0, 0, x7Var.v);
        }
        nm0Var.setOnItemClickListener(new g7(this, nm0Var));
        nm0Var.setOnItemLongClickListener(new e7(this, nm0Var, this.d, 0));
        return this.e == null ? nm0Var : new w7(context, nm0Var);
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.f.f.size();
    }

    @Override // org.telegram.ui.Components.n91
    public final int f(int i10) {
        return ((v7) this.f.f.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        return ((v7) this.f.f.get(i10)).a;
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        return ((v7) this.f.f.get(i10)).b;
    }
}
