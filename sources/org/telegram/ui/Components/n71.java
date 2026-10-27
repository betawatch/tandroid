package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class n71 extends org.telegram.ui.ActionBar.r2 {
    public m71 a;
    public jg.r1 b;
    public int c;
    public int d;

    public n71() {
        super(null);
        this.c = -1;
    }

    public abstract void V(ArrayList arrayList, k71 k71Var);

    public abstract CharSequence W();

    public abstract void X(u61 u61Var, View view);

    public abstract boolean Y(u61 u61Var, View view);

    @Override // org.telegram.ui.ActionBar.r2
    public View createView(Context context) {
        org.telegram.ui.ga gaVar = new org.telegram.ui.ga(this, 17);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
            this.simpleActionBar.setTitle(W());
            this.simpleActionBar.setActionBarMenuOnItemClick(gaVar);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(W());
            this.actionBar.setActionBarMenuOnItemClick(gaVar);
        }
        this.b = new jg.r1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, this.b, null);
        }
        m71 m71Var = new m71(this, this, new d(this, 22), new l71(this), new l71(this));
        this.a = m71Var;
        this.b.addView(m71Var, kb1.g(-1.0f, -1));
        jg.r1 r1Var = this.b;
        this.fragmentView = r1Var;
        return r1Var;
    }
}
