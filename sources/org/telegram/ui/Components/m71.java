package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class m71 extends org.telegram.ui.ActionBar.r2 {
    public l71 a;
    public jg.r1 b;
    public int c;
    public int d;

    public m71() {
        super(null);
        this.c = -1;
    }

    public abstract void V(ArrayList arrayList, j71 j71Var);

    public abstract CharSequence W();

    public abstract void X(t61 t61Var, View view);

    public abstract boolean Y(t61 t61Var, View view);

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
        l71 l71Var = new l71(this, this, new d(this, 22), new k71(this), new k71(this));
        this.a = l71Var;
        this.b.addView(l71Var, gb1.g(-1.0f, -1));
        jg.r1 r1Var = this.b;
        this.fragmentView = r1Var;
        return r1Var;
    }
}
