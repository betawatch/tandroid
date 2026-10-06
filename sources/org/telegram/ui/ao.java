package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public abstract class ao extends FrameLayout {
    public final zn a;
    public final org.telegram.ui.ActionBar.c5 b;
    public View c;
    public int d;
    public boolean e;

    public ao(Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = c5Var;
        zn znVar = new zn(this, bundle);
        this.a = znVar;
        znVar.Ma = true;
    }

    public void a() {
        int i10;
        zn znVar = this.a;
        if (znVar.onFragmentCreate()) {
            this.c = znVar.fragmentView;
            znVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = znVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    znVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            sj sjVar = znVar.v0;
            if (sjVar != null && (i10 = this.d) != 0) {
                sjVar.setPadding(0, i10, 0, 0);
            }
            znVar.oa();
            addView(this.c, w7.z5.c(-1.0f, -1));
            if (this.e) {
                znVar.onResume();
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
