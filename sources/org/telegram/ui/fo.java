package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class fo extends FrameLayout {
    public final eo a;
    public final org.telegram.ui.ActionBar.d5 b;
    public View c;
    public int d;
    public boolean e;

    public fo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = d5Var;
        eo eoVar = new eo(this, bundle);
        this.a = eoVar;
        eoVar.Oa = true;
    }

    public void a() {
        int i10;
        eo eoVar = this.a;
        if (eoVar.onFragmentCreate()) {
            this.c = eoVar.fragmentView;
            eoVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = eoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    eoVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            uj ujVar = eoVar.x0;
            if (ujVar != null && (i10 = this.d) != 0) {
                ujVar.setPadding(0, i10, 0, 0);
            }
            eoVar.pa();
            addView(this.c, w7.x5.c(-1.0f, -1));
            if (this.e) {
                eoVar.onResume();
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
