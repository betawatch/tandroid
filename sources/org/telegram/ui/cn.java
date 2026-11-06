package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class cn extends FrameLayout {
    public final bn a;
    public final org.telegram.ui.ActionBar.q4 b;
    public View c;
    public int d;
    public boolean e;

    public cn(Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = q4Var;
        bn bnVar = new bn(this, bundle);
        this.a = bnVar;
        bnVar.ib = true;
    }

    public void a() {
        int i7;
        bn bnVar = this.a;
        if (bnVar.onFragmentCreate()) {
            this.c = bnVar.fragmentView;
            bnVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = bnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    bnVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            aj ajVar = bnVar.z0;
            if (ajVar != null && (i7 = this.d) != 0) {
                ajVar.setPadding(0, i7, 0, 0);
            }
            bnVar.Pa();
            addView(this.c, c8.ha.c(-1.0f, -1));
            if (this.e) {
                bnVar.onResume();
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

    public void b(boolean z9) {
    }
}
