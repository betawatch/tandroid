package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class eo extends FrameLayout {
    public final co a;
    public final org.telegram.ui.ActionBar.e5 b;
    public View c;
    public int d;
    public boolean e;

    public eo(Context context, org.telegram.ui.ActionBar.e5 e5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = e5Var;
        co coVar = new co(this, bundle);
        this.a = coVar;
        coVar.Oa = true;
    }

    public void a() {
        int i10;
        co coVar = this.a;
        if (coVar.onFragmentCreate()) {
            this.c = coVar.fragmentView;
            coVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = coVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    coVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            vj vjVar = coVar.x0;
            if (vjVar != null && (i10 = this.d) != 0) {
                vjVar.setPadding(0, i10, 0, 0);
            }
            coVar.pa();
            addView(this.c, w7.x5.c(-1.0f, -1));
            if (this.e) {
                coVar.onResume();
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
