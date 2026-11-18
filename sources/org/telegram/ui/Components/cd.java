package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class cd extends FrameLayout {
    public bi.a3 a;
    public ad b;
    public boolean c;

    public final void a(ad adVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = adVar;
            adVar.setVisibility(8);
            addView(adVar, layoutParams);
        }
    }

    public final void b(bi.a3 a3Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = a3Var;
            addView(a3Var, layoutParams);
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
