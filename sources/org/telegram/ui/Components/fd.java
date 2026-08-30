package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class fd extends FrameLayout {
    public dg.u2 a;
    public dd b;
    public boolean c;

    public final void a(dd ddVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = ddVar;
            ddVar.setVisibility(8);
            addView(ddVar, layoutParams);
        }
    }

    public final void b(dg.u2 u2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = u2Var;
            addView(u2Var, layoutParams);
        }
    }

    public dd getEditView() {
        return this.b;
    }

    public View getReplyView() {
        return this.a;
    }

    public void setEditMode(boolean z4) {
        this.c = z4;
        this.a.setVisibility(z4 ? 8 : 0);
        this.b.setVisibility(z4 ? 0 : 8);
    }

    public void setEditSuggestionMode(boolean z4) {
        setEditMode(z4);
        if (z4) {
            this.a.setVisibility(0);
        }
        this.b.a[0].setOnlyIconMode(z4);
        this.b.a[1].setOnlyIconMode(z4);
    }
}
