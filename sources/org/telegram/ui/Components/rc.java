package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class rc extends FrameLayout {
    public jg.l0 a;
    public pc b;
    public boolean c;

    public final void a(pc pcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = pcVar;
            pcVar.setVisibility(8);
            addView(pcVar, layoutParams);
        }
    }

    public final void b(jg.l0 l0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = l0Var;
            addView(l0Var, layoutParams);
        }
    }

    public pc getEditView() {
        return this.b;
    }

    public View getReplyView() {
        return this.a;
    }

    public void setEditMode(boolean z10) {
        this.c = z10;
        this.a.setVisibility(z10 ? 8 : 0);
        this.b.setVisibility(z10 ? 0 : 8);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.a.setVisibility(0);
        }
        this.b.a[0].setOnlyIconMode(z10);
        this.b.a[1].setOnlyIconMode(z10);
    }
}
