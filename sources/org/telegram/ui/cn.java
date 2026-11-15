package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class cn extends FrameLayout {
    public final bn a;
    public final org.telegram.ui.ActionBar.o4 b;
    public View c;
    public int d;
    public boolean e;

    public cn(Context context, org.telegram.ui.ActionBar.o4 o4Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = o4Var;
        bn bnVar = new bn(this, bundle);
        this.a = bnVar;
        bnVar.lb = true;
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
            aj ajVar = bnVar.A0;
            if (ajVar != null && (i7 = this.d) != 0) {
                ajVar.setPadding(0, i7, 0, 0);
            }
            bnVar.Sa();
            addView(this.c, c8.ja.c(-1.0f, -1));
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

    public void b(boolean z10) {
    }
}
