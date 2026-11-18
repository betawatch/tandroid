package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class dn extends FrameLayout {
    public final cn a;
    public final org.telegram.ui.ActionBar.s4 b;
    public View c;
    public int d;
    public boolean e;

    public dn(Context context, org.telegram.ui.ActionBar.s4 s4Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = s4Var;
        cn cnVar = new cn(this, bundle);
        this.a = cnVar;
        cnVar.mb = true;
    }

    public void a() {
        int i7;
        cn cnVar = this.a;
        if (cnVar.onFragmentCreate()) {
            this.c = cnVar.fragmentView;
            cnVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = cnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    cnVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            bj bjVar = cnVar.A0;
            if (bjVar != null && (i7 = this.d) != 0) {
                bjVar.setPadding(0, i7, 0, 0);
            }
            cnVar.Sa();
            addView(this.c, c8.ma.c(-1.0f, -1));
            if (this.e) {
                cnVar.onResume();
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

    public void setTopPadding(int i7) {
        this.d = i7;
    }

    public void b(boolean z10) {
    }
}
