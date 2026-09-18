package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public abstract class bo extends FrameLayout {
    public final ao a;
    public final org.telegram.ui.ActionBar.d5 b;
    public View c;
    public int d;
    public boolean e;

    public bo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = d5Var;
        ao aoVar = new ao(this, bundle);
        this.a = aoVar;
        aoVar.Oa = true;
    }

    public void a() {
        int i10;
        ao aoVar = this.a;
        if (aoVar.onFragmentCreate()) {
            this.c = aoVar.fragmentView;
            aoVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = aoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    aoVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            tj tjVar = aoVar.x0;
            if (tjVar != null && (i10 = this.d) != 0) {
                tjVar.setPadding(0, i10, 0, 0);
            }
            aoVar.pa();
            addView(this.c, w7.y5.c(-1.0f, -1));
            if (this.e) {
                aoVar.onResume();
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
