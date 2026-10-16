package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
            addView(this.c, w7.z5.d(-1.0f, -1));
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
