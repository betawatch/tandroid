package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class cd extends FrameLayout {
    public bi.e3 a;
    public ad b;
    public boolean c;

    public final void a(ad adVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = adVar;
            adVar.setVisibility(8);
            addView(adVar, layoutParams);
        }
    }

    public final void b(bi.e3 e3Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = e3Var;
            addView(e3Var, layoutParams);
        }
    }

    public ad getEditView() {
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
