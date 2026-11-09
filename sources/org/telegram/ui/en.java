package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class en extends FrameLayout {
    public final dn a;
    public final org.telegram.ui.ActionBar.q4 b;
    public View c;
    public int d;
    public boolean e;

    public en(Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = q4Var;
        dn dnVar = new dn(this, bundle);
        this.a = dnVar;
        dnVar.kb = true;
    }

    public void a() {
        int i7;
        dn dnVar = this.a;
        if (dnVar.onFragmentCreate()) {
            this.c = dnVar.fragmentView;
            dnVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = dnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    dnVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            cj cjVar = dnVar.z0;
            if (cjVar != null && (i7 = this.d) != 0) {
                cjVar.setPadding(0, i7, 0, 0);
            }
            dnVar.Ra();
            addView(this.c, c8.ha.c(-1.0f, -1));
            if (this.e) {
                dnVar.onResume();
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
