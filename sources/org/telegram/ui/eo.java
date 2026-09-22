package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class eo extends FrameLayout {
    public final co a;
    public final org.telegram.ui.ActionBar.d5 b;
    public View c;
    public int d;
    public boolean e;

    public eo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = d5Var;
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
            uj ujVar = coVar.x0;
            if (ujVar != null && (i10 = this.d) != 0) {
                ujVar.setPadding(0, i10, 0, 0);
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
