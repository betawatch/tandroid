package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class ho extends FrameLayout {
    public final go a;
    public final org.telegram.ui.ActionBar.b5 b;
    public View c;
    public int d;
    public boolean e;

    public ho(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = b5Var;
        go goVar = new go(this, bundle);
        this.a = goVar;
        goVar.Pa = true;
    }

    public void a() {
        int i10;
        go goVar = this.a;
        if (goVar.onFragmentCreate()) {
            this.c = goVar.fragmentView;
            goVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = goVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    goVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            ak akVar = goVar.x0;
            if (akVar != null && (i10 = this.d) != 0) {
                akVar.setPadding(0, i10, 0, 0);
            }
            goVar.ua();
            addView(this.c, w7.a6.d(-1.0f, -1));
            if (this.e) {
                goVar.onResume();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setTopPadding(int i10) {
        this.d = i10;
    }

    public void b(boolean z10) {
    }
}
