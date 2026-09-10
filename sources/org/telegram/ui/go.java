package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class go extends FrameLayout {
    public final fo a;
    public final org.telegram.ui.ActionBar.f5 b;
    public View c;
    public int d;
    public boolean e;

    public go(Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = f5Var;
        fo foVar = new fo(this, bundle);
        this.a = foVar;
        foVar.Oa = true;
    }

    public void a() {
        int i10;
        fo foVar = this.a;
        if (foVar.onFragmentCreate()) {
            this.c = foVar.fragmentView;
            foVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = foVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    foVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            wj wjVar = foVar.x0;
            if (wjVar != null && (i10 = this.d) != 0) {
                wjVar.setPadding(0, i10, 0, 0);
            }
            foVar.pa();
            addView(this.c, w7.a6.c(-1.0f, -1));
            if (this.e) {
                foVar.onResume();
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
