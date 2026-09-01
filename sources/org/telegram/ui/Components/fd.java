package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class fd extends FrameLayout {
    public eg.s2 a;
    public dd b;
    public boolean c;

    public final void a(dd ddVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = ddVar;
            ddVar.setVisibility(8);
            addView(ddVar, layoutParams);
        }
    }

    public final void b(eg.s2 s2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = s2Var;
            addView(s2Var, layoutParams);
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
